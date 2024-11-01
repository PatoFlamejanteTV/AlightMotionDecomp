package q6;

import n6.InterfaceC3488x0;
import p6.EnumC3588a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y implements InterfaceC3813L, InterfaceC3821f, r6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3488x0 f37593a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3813L f37594b;

    public y(InterfaceC3813L interfaceC3813L, InterfaceC3488x0 interfaceC3488x0) {
        this.f37593a = interfaceC3488x0;
        this.f37594b = interfaceC3813L;
    }

    @Override // r6.p
    public InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return AbstractC3815N.d(this, gVar, i8, enumC3588a);
    }

    @Override // q6.InterfaceC3802A, q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        return this.f37594b.collect(interfaceC3822g, dVar);
    }

    @Override // q6.InterfaceC3813L
    public Object getValue() {
        return this.f37594b.getValue();
    }
}
