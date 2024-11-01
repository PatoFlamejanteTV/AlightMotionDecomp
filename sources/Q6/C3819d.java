package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import p6.EnumC3588a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3819d extends r6.e {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2072n f37408d;

    public /* synthetic */ C3819d(InterfaceC2072n interfaceC2072n, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, AbstractC3284p abstractC3284p) {
        this(interfaceC2072n, (i9 & 2) != 0 ? U5.h.f10149a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3588a.SUSPEND : enumC3588a);
    }

    static /* synthetic */ Object n(C3819d c3819d, p6.s sVar, U5.d dVar) {
        Object invoke = c3819d.f37408d.invoke(sVar, dVar);
        if (invoke == V5.b.e()) {
            return invoke;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r6.e
    public Object h(p6.s sVar, U5.d dVar) {
        return n(this, sVar, dVar);
    }

    @Override // r6.e
    protected r6.e i(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return new C3819d(this.f37408d, gVar, i8, enumC3588a);
    }

    @Override // r6.e
    public String toString() {
        return "block[" + this.f37408d + "] -> " + super.toString();
    }

    public C3819d(InterfaceC2072n interfaceC2072n, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(gVar, i8, enumC3588a);
        this.f37408d = interfaceC2072n;
    }
}
