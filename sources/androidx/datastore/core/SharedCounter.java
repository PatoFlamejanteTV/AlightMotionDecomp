package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SharedCounter {
    public static final Factory Factory = new Factory(null);
    private static final NativeSharedCounter nativeSharedCounter = new NativeSharedCounter();
    private final long mappedAddress;

    /* loaded from: classes3.dex */
    public static final class Factory {
        private Factory() {
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) {
            int fd = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) == 0) {
                long nativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
                if (nativeCreateSharedCounter >= 0) {
                    return new SharedCounter(nativeCreateSharedCounter, null);
                }
                throw new IOException("Failed to mmap counter file");
            }
            throw new IOException("Failed to truncate counter file");
        }

        public final SharedCounter create$datastore_core_release(Function0 produceFile) {
            ParcelFileDescriptor parcelFileDescriptor;
            AbstractC3292y.i(produceFile, "produceFile");
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptor = null;
            }
            try {
                SharedCounter createCounterFromFd = createCounterFromFd(parcelFileDescriptor);
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return createCounterFromFd;
            } catch (Throwable th2) {
                th = th2;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                throw th;
            }
        }

        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }

        public /* synthetic */ Factory(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ SharedCounter(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    private SharedCounter(long j8) {
        this.mappedAddress = j8;
    }
}
