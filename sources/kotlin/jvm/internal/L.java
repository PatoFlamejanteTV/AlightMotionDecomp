package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.l;

/* loaded from: classes5.dex */
public abstract class L extends N implements j6.l {
    public L(Class cls, String str, String str2, int i8) {
        super(AbstractC3279k.NO_RECEIVER, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.h(this);
    }

    @Override // j6.l
    public l.a getGetter() {
        ((j6.l) getReflected()).getGetter();
        return null;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return h(obj, obj2);
    }
}
