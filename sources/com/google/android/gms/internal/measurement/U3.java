package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class U3 extends R3 {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f16467d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U3(byte[] bArr) {
        super();
        bArr.getClass();
        this.f16467d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.J3
    public byte c(int i8) {
        return this.f16467d[i8];
    }

    @Override // com.google.android.gms.internal.measurement.J3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J3) || r() != ((J3) obj).r()) {
            return false;
        }
        if (r() == 0) {
            return true;
        }
        if (obj instanceof U3) {
            U3 u32 = (U3) obj;
            int d8 = d();
            int d9 = u32.d();
            if (d8 != 0 && d9 != 0 && d8 != d9) {
                return false;
            }
            return v(u32, 0, r());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.J3
    public final J3 j(int i8, int i9) {
        int g8 = J3.g(0, i9, r());
        if (g8 == 0) {
            return J3.f16332b;
        }
        return new N3(this.f16467d, y(), g8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.J3
    public final void o(K3 k32) {
        k32.a(this.f16467d, y(), r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.J3
    public byte q(int i8) {
        return this.f16467d[i8];
    }

    @Override // com.google.android.gms.internal.measurement.J3
    public int r() {
        return this.f16467d.length;
    }

    @Override // com.google.android.gms.internal.measurement.J3
    protected final int t(int i8, int i9, int i10) {
        return AbstractC2256t4.a(i8, this.f16467d, y(), i10);
    }

    @Override // com.google.android.gms.internal.measurement.R3
    final boolean v(J3 j32, int i8, int i9) {
        if (i9 <= j32.r()) {
            if (i9 <= j32.r()) {
                if (j32 instanceof U3) {
                    U3 u32 = (U3) j32;
                    byte[] bArr = this.f16467d;
                    byte[] bArr2 = u32.f16467d;
                    int y8 = y() + i9;
                    int y9 = y();
                    int y10 = u32.y();
                    while (y9 < y8) {
                        if (bArr[y9] != bArr2[y10]) {
                            return false;
                        }
                        y9++;
                        y10++;
                    }
                    return true;
                }
                return j32.j(0, i9).equals(j(0, i9));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i9 + ", " + j32.r());
        }
        throw new IllegalArgumentException("Length too large: " + i9 + r());
    }

    protected int y() {
        return 0;
    }
}
