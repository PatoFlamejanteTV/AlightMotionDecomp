package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.i;
import j6.j;

/* loaded from: classes5.dex */
public abstract class H extends N implements j6.j {
    public H(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.f(this);
    }

    @Override // j6.j
    public Object getDelegate() {
        return ((j6.j) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5560getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // j6.j
    /* renamed from: getGetter, reason: collision with other method in class */
    public j.a mo5560getGetter() {
        ((j6.j) getReflected()).mo5560getGetter();
        return null;
    }
}
