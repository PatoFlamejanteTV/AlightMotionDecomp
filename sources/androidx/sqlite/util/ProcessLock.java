package androidx.sqlite.util;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ProcessLock {
    private static final String TAG = "SupportSQLiteLock";
    private FileChannel lockChannel;
    private final File lockFile;
    private final boolean processLock;

    @SuppressLint({"SyntheticAccessor"})
    private final Lock threadLock;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Lock> threadLocksMap = new HashMap();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (ProcessLock.threadLocksMap) {
                try {
                    Map map = ProcessLock.threadLocksMap;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ProcessLock(String name, File lockDir, boolean z8) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(lockDir, "lockDir");
        this.processLock = z8;
        File file = new File(lockDir, name + ".lck");
        this.lockFile = file;
        Companion companion = Companion;
        String absolutePath = file.getAbsolutePath();
        AbstractC3292y.h(absolutePath, "lockFile.absolutePath");
        this.threadLock = companion.getThreadLock(absolutePath);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = processLock.processLock;
        }
        processLock.lock(z8);
    }

    public final void lock(boolean z8) {
        this.threadLock.lock();
        if (z8) {
            try {
                File parentFile = this.lockFile.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (IOException e8) {
                this.lockChannel = null;
                Log.w(TAG, "Unable to grab file lock.", e8);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }
}
