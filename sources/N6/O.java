package n6;

import c6.InterfaceC2072n;
import t6.AbstractC4063a;
import t6.AbstractC4064b;

/* loaded from: classes5.dex */
public enum O {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35672a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35672a = iArr;
        }
    }

    public final void b(InterfaceC2072n interfaceC2072n, Object obj, U5.d dVar) {
        int i8 = a.f35672a[ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new Q5.p();
                    }
                    return;
                } else {
                    AbstractC4064b.a(interfaceC2072n, obj, dVar);
                    return;
                }
            }
            U5.f.b(interfaceC2072n, obj, dVar);
            return;
        }
        AbstractC4063a.d(interfaceC2072n, obj, dVar, null, 4, null);
    }

    public final boolean c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
