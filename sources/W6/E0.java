package W6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10803a = Runtime.getRuntime().maxMemory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8) {
        int i9 = 1;
        if (i8 > 127) {
            int i10 = 1;
            while (true) {
                i8 >>>= 8;
                if (i8 == 0) {
                    break;
                }
                i10++;
            }
            for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
                i9++;
            }
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8) {
        if (i8 >= 31) {
            if (i8 < 128) {
                return 2;
            }
            byte[] bArr = new byte[5];
            int i9 = 4;
            bArr[4] = (byte) (i8 & ModuleDescriptor.MODULE_VERSION);
            do {
                i8 >>= 7;
                i9--;
                bArr[i9] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
            } while (i8 > 127);
            return 6 - i9;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(InputStream inputStream) {
        long j8;
        if (inputStream instanceof C0) {
            return ((C0) inputStream).a();
        }
        if (inputStream instanceof C1484j) {
            return ((C1484j) inputStream).i();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                if (channel != null) {
                    j8 = channel.size();
                } else {
                    j8 = 2147483647L;
                }
                if (j8 < 2147483647L) {
                    return (int) j8;
                }
            } catch (IOException unused) {
            }
        }
        long j9 = f10803a;
        if (j9 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j9;
    }
}
