package q6;

import n6.InterfaceC3488x0;
import p6.EnumC3588a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x implements InterfaceC3802A, InterfaceC3821f, r6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3488x0 f37591a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3802A f37592b;

    public x(InterfaceC3802A interfaceC3802A, InterfaceC3488x0 interfaceC3488x0) {
        this.f37591a = interfaceC3488x0;
        this.f37592b = interfaceC3802A;
    }

    @Override // r6.p
    public InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return AbstractC3804C.e(this, gVar, i8, enumC3588a);
    }

    @Override // q6.InterfaceC3802A, q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        return this.f37592b.collect(interfaceC3822g, dVar);
    }
}
