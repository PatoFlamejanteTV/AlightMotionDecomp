package U6;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final byte[] a(String str) {
        AbstractC3292y.i(str, "<this>");
        byte[] bytes = str.getBytes(C3338d.f34755b);
        AbstractC3292y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        AbstractC3292y.i(bArr, "<this>");
        return new String(bArr, C3338d.f34755b);
    }
}
