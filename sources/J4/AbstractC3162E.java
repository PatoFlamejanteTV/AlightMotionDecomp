package j4;

import r4.AbstractC3919s;
import w4.C4156a;

/* renamed from: j4.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3162E {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C4156a c(C4156a c4156a) {
        String c8 = c4156a.c();
        int i8 = -1;
        if (c8 != null) {
            String a9 = AbstractC3919s.a(c8);
            if (a9.length() == 4) {
                Integer i9 = l6.n.i(l6.n.U0(a9, 2));
                if (i9 != null) {
                    i8 = i9.intValue();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C4156a.b(c4156a, l6.n.e0(String.valueOf(i8), 2, '0'), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4156a d(C4156a c4156a) {
        String c8 = c4156a.c();
        int i8 = -1;
        if (c8 != null) {
            String a9 = AbstractC3919s.a(c8);
            if (a9.length() == 4) {
                Integer i9 = l6.n.i(l6.n.V0(a9, 2));
                if (i9 != null) {
                    i8 = i9.intValue() + 2000;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C4156a.b(c4156a, String.valueOf(i8), false, 2, null);
    }
}
