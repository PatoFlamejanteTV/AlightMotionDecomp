package androidx.datastore.core;

import Q5.I;
import android.os.FileObserver;
import androidx.annotation.CheckResult;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.MulticastFileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3449d0;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class MulticastFileObserver extends FileObserver {
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<Function1> delegates;
    private final String path;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, Function1 observer) {
            AbstractC3292y.i(observer, "$observer");
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Companion companion = MulticastFileObserver.Companion;
                    MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core_release().get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.delegates.remove(observer);
                        if (multicastFileObserver.delegates.isEmpty()) {
                            companion.getFileObservers$datastore_core_release().remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        @CheckResult
        public final InterfaceC3821f observe(File file) {
            AbstractC3292y.i(file, "file");
            return AbstractC3823h.h(new MulticastFileObserver$Companion$observe$1(file, null));
        }

        @VisibleForTesting
        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.Companion.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.Companion.getFileObservers$datastore_core_release().clear();
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public final InterfaceC3449d0 observe(File file, final Function1 function1) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.Companion.getFileObservers$datastore_core_release();
                    AbstractC3292y.h(key, "key");
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(key);
                    if (multicastFileObserver == null) {
                        multicastFileObserver = new MulticastFileObserver(key, null);
                        fileObservers$datastore_core_release.put(key, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(function1);
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new InterfaceC3449d0() { // from class: androidx.datastore.core.a
                @Override // n6.InterfaceC3449d0
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$4(key, function1);
                }
            };
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, AbstractC3284p abstractC3284p) {
        this(str);
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i8, String str) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }
}
