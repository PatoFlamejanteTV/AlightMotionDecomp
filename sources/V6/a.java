package V6;

import U6.C1449e;
import U6.c0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10666a = c0.a("0123456789abcdef");

    public static final byte[] a() {
        return f10666a;
    }

    public static final String b(C1449e c1449e, long j8) {
        AbstractC3292y.i(c1449e, "<this>");
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (c1449e.k(j9) == 13) {
                String readUtf8 = c1449e.readUtf8(j9);
                c1449e.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = c1449e.readUtf8(j8);
        c1449e.skip(1L);
        return readUtf82;
    }
}
