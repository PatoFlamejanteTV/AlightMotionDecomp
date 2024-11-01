package V6;

import R5.AbstractC1435t;
import U6.C1449e;
import U6.C1452h;
import U6.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C1452h f10668a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1452h f10669b;

    /* renamed from: c, reason: collision with root package name */
    private static final C1452h f10670c;

    /* renamed from: d, reason: collision with root package name */
    private static final C1452h f10671d;

    /* renamed from: e, reason: collision with root package name */
    private static final C1452h f10672e;

    static {
        C1452h.a aVar = C1452h.f10221d;
        f10668a = aVar.c("/");
        f10669b = aVar.c("\\");
        f10670c = aVar.c("/\\");
        f10671d = aVar.c(".");
        f10672e = aVar.c("..");
    }

    public static final Q j(Q q8, Q child, boolean z8) {
        AbstractC3292y.i(q8, "<this>");
        AbstractC3292y.i(child, "child");
        if (!child.e() && child.o() == null) {
            C1452h m8 = m(q8);
            if (m8 == null && (m8 = m(child)) == null) {
                m8 = s(Q.f10157c);
            }
            C1449e c1449e = new C1449e();
            c1449e.I(q8.b());
            if (c1449e.E() > 0) {
                c1449e.I(m8);
            }
            c1449e.I(child.b());
            return q(c1449e, z8);
        }
        return child;
    }

    public static final Q k(String str, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        return q(new C1449e().writeUtf8(str), z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Q q8) {
        int A8 = C1452h.A(q8.b(), f10668a, 0, 2, null);
        if (A8 != -1) {
            return A8;
        }
        return C1452h.A(q8.b(), f10669b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1452h m(Q q8) {
        C1452h b9 = q8.b();
        C1452h c1452h = f10668a;
        if (C1452h.q(b9, c1452h, 0, 2, null) == -1) {
            C1452h b10 = q8.b();
            C1452h c1452h2 = f10669b;
            if (C1452h.q(b10, c1452h2, 0, 2, null) == -1) {
                return null;
            }
            return c1452h2;
        }
        return c1452h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Q q8) {
        if (!q8.b().g(f10672e) || (q8.b().J() != 2 && !q8.b().D(q8.b().J() - 3, f10668a, 0, 1) && !q8.b().D(q8.b().J() - 3, f10669b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(Q q8) {
        if (q8.b().J() == 0) {
            return -1;
        }
        if (q8.b().h(0) == 47) {
            return 1;
        }
        if (q8.b().h(0) == 92) {
            if (q8.b().J() <= 2 || q8.b().h(1) != 92) {
                return 1;
            }
            int o8 = q8.b().o(f10669b, 2);
            if (o8 == -1) {
                return q8.b().J();
            }
            return o8;
        }
        if (q8.b().J() > 2 && q8.b().h(1) == 58 && q8.b().h(2) == 92) {
            char h8 = (char) q8.b().h(0);
            if ('a' > h8 || h8 >= '{') {
                if ('A' <= h8 && h8 < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(C1449e c1449e, C1452h c1452h) {
        if (!AbstractC3292y.d(c1452h, f10669b) || c1449e.E() < 2 || c1449e.k(1L) != 58) {
            return false;
        }
        char k8 = (char) c1449e.k(0L);
        if (('a' > k8 || k8 >= '{') && ('A' > k8 || k8 >= '[')) {
            return false;
        }
        return true;
    }

    public static final Q q(C1449e c1449e, boolean z8) {
        C1452h c1452h;
        boolean z9;
        boolean z10;
        C1452h readByteString;
        AbstractC3292y.i(c1449e, "<this>");
        C1449e c1449e2 = new C1449e();
        C1452h c1452h2 = null;
        int i8 = 0;
        while (true) {
            if (!c1449e.c(0L, f10668a)) {
                c1452h = f10669b;
                if (!c1449e.c(0L, c1452h)) {
                    break;
                }
            }
            byte readByte = c1449e.readByte();
            if (c1452h2 == null) {
                c1452h2 = r(readByte);
            }
            i8++;
        }
        if (i8 >= 2 && AbstractC3292y.d(c1452h2, c1452h)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            AbstractC3292y.f(c1452h2);
            c1449e2.I(c1452h2);
            c1449e2.I(c1452h2);
        } else if (i8 > 0) {
            AbstractC3292y.f(c1452h2);
            c1449e2.I(c1452h2);
        } else {
            long p8 = c1449e.p(f10670c);
            if (c1452h2 == null) {
                if (p8 == -1) {
                    c1452h2 = s(Q.f10157c);
                } else {
                    c1452h2 = r(c1449e.k(p8));
                }
            }
            if (p(c1449e, c1452h2)) {
                if (p8 == 2) {
                    c1449e2.f(c1449e, 3L);
                } else {
                    c1449e2.f(c1449e, 2L);
                }
            }
        }
        if (c1449e2.E() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!c1449e.exhausted()) {
            long p9 = c1449e.p(f10670c);
            if (p9 == -1) {
                readByteString = c1449e.t();
            } else {
                readByteString = c1449e.readByteString(p9);
                c1449e.readByte();
            }
            C1452h c1452h3 = f10672e;
            if (AbstractC3292y.d(readByteString, c1452h3)) {
                if (!z10 || !arrayList.isEmpty()) {
                    if (z8 && (z10 || (!arrayList.isEmpty() && !AbstractC3292y.d(AbstractC1435t.y0(arrayList), c1452h3)))) {
                        if (!z9 || arrayList.size() != 1) {
                            AbstractC1435t.Q(arrayList);
                        }
                    } else {
                        arrayList.add(readByteString);
                    }
                }
            } else if (!AbstractC3292y.d(readByteString, f10671d) && !AbstractC3292y.d(readByteString, C1452h.f10222e)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                c1449e2.I(c1452h2);
            }
            c1449e2.I((C1452h) arrayList.get(i9));
        }
        if (c1449e2.E() == 0) {
            c1449e2.I(f10671d);
        }
        return new Q(c1449e2.t());
    }

    private static final C1452h r(byte b9) {
        if (b9 != 47) {
            if (b9 == 92) {
                return f10669b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b9));
        }
        return f10668a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1452h s(String str) {
        if (AbstractC3292y.d(str, "/")) {
            return f10668a;
        }
        if (AbstractC3292y.d(str, "\\")) {
            return f10669b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
