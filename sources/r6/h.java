package r6;

import Q5.I;
import kotlin.jvm.internal.AbstractC3284p;
import p6.EnumC3588a;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC3821f interfaceC3821f, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, AbstractC3284p abstractC3284p) {
        this(interfaceC3821f, (i9 & 2) != 0 ? U5.h.f10149a : gVar, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? EnumC3588a.SUSPEND : enumC3588a);
    }

    @Override // r6.e
    protected e i(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return new h(this.f38803d, gVar, i8, enumC3588a);
    }

    @Override // r6.e
    public InterfaceC3821f j() {
        return this.f38803d;
    }

    @Override // r6.g
    protected Object q(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        Object collect = this.f38803d.collect(interfaceC3822g, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    public h(InterfaceC3821f interfaceC3821f, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(interfaceC3821f, gVar, i8, enumC3588a);
    }
}
