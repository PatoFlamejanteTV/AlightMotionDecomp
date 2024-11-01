package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.i;
import j6.k;

/* loaded from: classes5.dex */
public abstract class J extends N implements j6.k {
    public J(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.g(this);
    }

    @Override // j6.k
    public Object getDelegate(Object obj) {
        return ((j6.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5558getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // j6.k
    /* renamed from: getGetter */
    public k.a mo5558getGetter() {
        ((j6.k) getReflected()).mo5558getGetter();
        return null;
    }
}
