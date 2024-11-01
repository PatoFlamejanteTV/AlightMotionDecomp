package kotlin.jvm.internal;

import j6.InterfaceC3214c;
import j6.InterfaceC3215d;
import j6.InterfaceC3216e;
import j6.InterfaceC3218g;
import j6.InterfaceC3219h;

/* loaded from: classes5.dex */
public class V {
    public InterfaceC3214c b(Class cls) {
        return new C3282n(cls);
    }

    public InterfaceC3215d c(Class cls, String str) {
        return new G(cls, str);
    }

    public String i(InterfaceC3287t interfaceC3287t) {
        String obj = interfaceC3287t.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String j(AbstractC3293z abstractC3293z) {
        return i(abstractC3293z);
    }

    public InterfaceC3216e a(AbstractC3288u abstractC3288u) {
        return abstractC3288u;
    }

    public InterfaceC3218g d(B b9) {
        return b9;
    }

    public InterfaceC3219h e(D d8) {
        return d8;
    }

    public j6.j f(H h8) {
        return h8;
    }

    public j6.k g(J j8) {
        return j8;
    }

    public j6.l h(L l8) {
        return l8;
    }
}
