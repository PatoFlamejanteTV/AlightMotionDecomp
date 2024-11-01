package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2169j0 extends AbstractC2236r0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f16775c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16776d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC2252t0 f16777e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC2244s0 f16778f;

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final InterfaceC2151h0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final InterfaceC2142g0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final EnumC2252t0 c() {
        return this.f16777e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final EnumC2244s0 d() {
        return this.f16778f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final String e() {
        return this.f16775c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2236r0) {
            AbstractC2236r0 abstractC2236r0 = (AbstractC2236r0) obj;
            if (this.f16775c.equals(abstractC2236r0.e()) && this.f16776d == abstractC2236r0.f() && this.f16777e.equals(abstractC2236r0.c())) {
                abstractC2236r0.a();
                abstractC2236r0.b();
                if (this.f16778f.equals(abstractC2236r0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2236r0
    public final boolean f() {
        return this.f16776d;
    }

    public final int hashCode() {
        int i8;
        int hashCode = (this.f16775c.hashCode() ^ 1000003) * 1000003;
        if (this.f16776d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((hashCode ^ i8) * 1000003) ^ this.f16777e.hashCode()) * 583896283) ^ this.f16778f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f16775c + ", hasDifferentDmaOwner=" + this.f16776d + ", fileChecks=" + String.valueOf(this.f16777e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f16778f) + "}";
    }

    private C2169j0(String str, boolean z8, EnumC2252t0 enumC2252t0, InterfaceC2151h0 interfaceC2151h0, InterfaceC2142g0 interfaceC2142g0, EnumC2244s0 enumC2244s0) {
        this.f16775c = str;
        this.f16776d = z8;
        this.f16777e = enumC2252t0;
        this.f16778f = enumC2244s0;
    }
}
