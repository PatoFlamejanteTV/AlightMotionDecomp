package s6;

import c6.InterfaceC2072n;

/* renamed from: s6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC3984d {

    /* renamed from: a */
    private static final C3980F f39189a = new C3980F("CLOSED");

    public static final AbstractC3985e b(AbstractC3985e abstractC3985e) {
        while (true) {
            Object f8 = abstractC3985e.f();
            if (f8 == f39189a) {
                return abstractC3985e;
            }
            AbstractC3985e abstractC3985e2 = (AbstractC3985e) f8;
            if (abstractC3985e2 == null) {
                if (abstractC3985e.j()) {
                    return abstractC3985e;
                }
            } else {
                abstractC3985e = abstractC3985e2;
            }
        }
    }

    public static final Object c(AbstractC3977C abstractC3977C, long j8, InterfaceC2072n interfaceC2072n) {
        while (true) {
            if (abstractC3977C.f39163c < j8 || abstractC3977C.h()) {
                Object f8 = abstractC3977C.f();
                if (f8 == f39189a) {
                    return AbstractC3978D.a(f39189a);
                }
                AbstractC3977C abstractC3977C2 = (AbstractC3977C) ((AbstractC3985e) f8);
                if (abstractC3977C2 == null) {
                    abstractC3977C2 = (AbstractC3977C) interfaceC2072n.invoke(Long.valueOf(abstractC3977C.f39163c + 1), abstractC3977C);
                    if (abstractC3977C.l(abstractC3977C2)) {
                        if (abstractC3977C.h()) {
                            abstractC3977C.k();
                        }
                    }
                }
                abstractC3977C = abstractC3977C2;
            } else {
                return AbstractC3978D.a(abstractC3977C);
            }
        }
    }
}
