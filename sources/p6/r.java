package p6;

import Q5.I;
import n6.K;
import p6.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r extends e implements s {
    public r(U5.g gVar, d dVar) {
        super(gVar, dVar, true, true);
    }

    @Override // n6.AbstractC3442a
    protected void K0(Throwable th, boolean z8) {
        if (!O0().d(th) && !z8) {
            K.a(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n6.AbstractC3442a
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void L0(I i8) {
        v.a.a(O0(), null, 1, null);
    }

    @Override // p6.s
    public /* bridge */ /* synthetic */ v i() {
        return N0();
    }

    @Override // n6.AbstractC3442a, n6.F0, n6.InterfaceC3488x0
    public boolean isActive() {
        return super.isActive();
    }
}
