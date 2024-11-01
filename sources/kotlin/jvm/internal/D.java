package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.InterfaceC3217f;
import j6.InterfaceC3219h;
import j6.i;
import j6.k;

/* loaded from: classes5.dex */
public abstract class D extends F implements InterfaceC3219h {
    public D(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.e(this);
    }

    @Override // j6.k
    public Object getDelegate(Object obj) {
        return ((InterfaceC3219h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5558getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC3217f getSetter() {
        mo5559getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // j6.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public k.a mo5558getGetter() {
        ((InterfaceC3219h) getReflected()).mo5558getGetter();
        return null;
    }

    @Override // j6.InterfaceC3219h
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC3219h.a mo5559getSetter() {
        ((InterfaceC3219h) getReflected()).mo5559getSetter();
        return null;
    }
}
