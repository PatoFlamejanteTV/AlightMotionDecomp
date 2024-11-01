package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.InterfaceC3218g;
import j6.j;

/* loaded from: classes5.dex */
public abstract class B extends F implements InterfaceC3218g {
    public B(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.d(this);
    }

    @Override // j6.j
    public Object getDelegate() {
        return ((InterfaceC3218g) getReflected()).getDelegate();
    }

    @Override // j6.j
    /* renamed from: getGetter */
    public j.a mo5560getGetter() {
        ((InterfaceC3218g) getReflected()).mo5560getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
