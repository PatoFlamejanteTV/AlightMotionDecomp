package kotlin.jvm.internal;

import j6.InterfaceC3214c;
import j6.InterfaceC3215d;
import j6.InterfaceC3216e;
import j6.InterfaceC3218g;
import j6.InterfaceC3219h;

/* loaded from: classes5.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final V f34574a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC3214c[] f34575b;

    static {
        V v8 = null;
        try {
            v8 = (V) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (v8 == null) {
            v8 = new V();
        }
        f34574a = v8;
        f34575b = new InterfaceC3214c[0];
    }

    public static InterfaceC3216e a(AbstractC3288u abstractC3288u) {
        return f34574a.a(abstractC3288u);
    }

    public static InterfaceC3214c b(Class cls) {
        return f34574a.b(cls);
    }

    public static InterfaceC3215d c(Class cls) {
        return f34574a.c(cls, "");
    }

    public static InterfaceC3218g d(B b9) {
        return f34574a.d(b9);
    }

    public static InterfaceC3219h e(D d8) {
        return f34574a.e(d8);
    }

    public static j6.j f(H h8) {
        return f34574a.f(h8);
    }

    public static j6.k g(J j8) {
        return f34574a.g(j8);
    }

    public static j6.l h(L l8) {
        return f34574a.h(l8);
    }

    public static String i(InterfaceC3287t interfaceC3287t) {
        return f34574a.i(interfaceC3287t);
    }

    public static String j(AbstractC3293z abstractC3293z) {
        return f34574a.j(abstractC3293z);
    }
}
