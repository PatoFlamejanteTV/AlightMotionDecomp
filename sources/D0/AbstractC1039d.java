package D0;

import c1.InterfaceC2008a;
import c1.InterfaceC2009b;
import java.util.Set;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1039d {
    public static Object a(InterfaceC1040e interfaceC1040e, F f8) {
        InterfaceC2009b f9 = interfaceC1040e.f(f8);
        if (f9 == null) {
            return null;
        }
        return f9.get();
    }

    public static Object b(InterfaceC1040e interfaceC1040e, Class cls) {
        return interfaceC1040e.b(F.b(cls));
    }

    public static InterfaceC2008a c(InterfaceC1040e interfaceC1040e, Class cls) {
        return interfaceC1040e.d(F.b(cls));
    }

    public static InterfaceC2009b d(InterfaceC1040e interfaceC1040e, Class cls) {
        return interfaceC1040e.f(F.b(cls));
    }

    public static Set e(InterfaceC1040e interfaceC1040e, F f8) {
        return (Set) interfaceC1040e.g(f8).get();
    }

    public static Set f(InterfaceC1040e interfaceC1040e, Class cls) {
        return interfaceC1040e.h(F.b(cls));
    }
}
