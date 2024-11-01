package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y3 extends V3 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f16488c;

    /* renamed from: d, reason: collision with root package name */
    private int f16489d;

    /* renamed from: e, reason: collision with root package name */
    private int f16490e;

    /* renamed from: f, reason: collision with root package name */
    private int f16491f;

    /* renamed from: g, reason: collision with root package name */
    private int f16492g;

    /* renamed from: h, reason: collision with root package name */
    private int f16493h;

    private final void f() {
        int i8 = this.f16489d + this.f16490e;
        this.f16489d = i8;
        int i9 = i8 - this.f16492g;
        int i10 = this.f16493h;
        if (i9 > i10) {
            int i11 = i9 - i10;
            this.f16490e = i11;
            this.f16489d = i8 - i11;
            return;
        }
        this.f16490e = 0;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public final int d(int i8) {
        if (i8 >= 0) {
            int e8 = i8 + e();
            if (e8 >= 0) {
                int i9 = this.f16493h;
                if (e8 <= i9) {
                    this.f16493h = e8;
                    f();
                    return i9;
                }
                throw A4.g();
            }
            throw A4.e();
        }
        throw A4.d();
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public final int e() {
        return this.f16491f - this.f16492g;
    }

    private Y3(byte[] bArr, int i8, int i9, boolean z8) {
        super();
        this.f16493h = Integer.MAX_VALUE;
        this.f16488c = bArr;
        this.f16489d = i9 + i8;
        this.f16491f = i8;
        this.f16492g = i8;
    }
}
