package n6;

/* renamed from: n6.z */
/* loaded from: classes5.dex */
public abstract class AbstractC3491z {
    public static final InterfaceC3487x a(InterfaceC3488x0 interfaceC3488x0) {
        return new C3489y(interfaceC3488x0);
    }

    public static /* synthetic */ InterfaceC3487x b(InterfaceC3488x0 interfaceC3488x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3488x0 = null;
        }
        return a(interfaceC3488x0);
    }

    public static final boolean c(InterfaceC3487x interfaceC3487x, Object obj) {
        Throwable e8 = Q5.s.e(obj);
        if (e8 == null) {
            return interfaceC3487x.v(obj);
        }
        return interfaceC3487x.a(e8);
    }
}
