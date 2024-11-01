package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2160i0 extends AbstractC2229q0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16752a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC2252t0 f16753b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2244s0 f16754c;

    /* renamed from: d, reason: collision with root package name */
    private byte f16755d;

    @Override // com.google.android.gms.internal.measurement.AbstractC2229q0
    public final AbstractC2229q0 a(EnumC2244s0 enumC2244s0) {
        if (enumC2244s0 != null) {
            this.f16754c = enumC2244s0;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2229q0
    final AbstractC2229q0 b(EnumC2252t0 enumC2252t0) {
        if (enumC2252t0 != null) {
            this.f16753b = enumC2252t0;
            return this;
        }
        throw new NullPointerException("Null fileChecks");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2229q0
    public final AbstractC2229q0 c(boolean z8) {
        this.f16755d = (byte) (this.f16755d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2229q0
    public final AbstractC2236r0 d() {
        if (this.f16755d == 1 && this.f16752a != null && this.f16753b != null && this.f16754c != null) {
            return new C2169j0(this.f16752a, this.f16753b, this.f16754c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16752a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f16755d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f16753b == null) {
            sb.append(" fileChecks");
        }
        if (this.f16754c == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    public final AbstractC2229q0 e(String str) {
        this.f16752a = str;
        return this;
    }
}
