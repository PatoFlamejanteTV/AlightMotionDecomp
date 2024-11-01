package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class N3 extends U3 {

    /* renamed from: e, reason: collision with root package name */
    private final int f16406e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16407f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(byte[] bArr, int i8, int i9) {
        super(bArr);
        J3.g(i8, i8 + i9, bArr.length);
        this.f16406e = i8;
        this.f16407f = i9;
    }

    @Override // com.google.android.gms.internal.measurement.U3, com.google.android.gms.internal.measurement.J3
    public final byte c(int i8) {
        int r8 = r();
        if (((r8 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + r8);
        }
        return this.f16467d[this.f16406e + i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.U3, com.google.android.gms.internal.measurement.J3
    public final byte q(int i8) {
        return this.f16467d[this.f16406e + i8];
    }

    @Override // com.google.android.gms.internal.measurement.U3, com.google.android.gms.internal.measurement.J3
    public final int r() {
        return this.f16407f;
    }

    @Override // com.google.android.gms.internal.measurement.U3
    protected final int y() {
        return this.f16406e;
    }
}
