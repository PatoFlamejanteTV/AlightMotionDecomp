package n6;

/* renamed from: n6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3483v extends AbstractC3492z0 implements InterfaceC3481u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3485w f35753e;

    public C3483v(InterfaceC3485w interfaceC3485w) {
        this.f35753e = interfaceC3485w;
    }

    @Override // n6.InterfaceC3481u
    public boolean b(Throwable th) {
        return s().Q(th);
    }

    @Override // n6.InterfaceC3481u
    public InterfaceC3488x0 getParent() {
        return s();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Q5.I.f8786a;
    }

    @Override // n6.AbstractC3439E
    public void r(Throwable th) {
        this.f35753e.r(s());
    }
}
