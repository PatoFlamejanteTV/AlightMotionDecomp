package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S3 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2092a4 f16436a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16437b;

    public final J3 a() {
        this.f16436a.E();
        return new U3(this.f16437b);
    }

    public final AbstractC2092a4 b() {
        return this.f16436a;
    }

    private S3(int i8) {
        byte[] bArr = new byte[i8];
        this.f16437b = bArr;
        this.f16436a = AbstractC2092a4.D(bArr);
    }
}
