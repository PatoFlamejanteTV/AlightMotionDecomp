package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2192l5 implements W4 {

    /* renamed from: a, reason: collision with root package name */
    private final Y4 f16865a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16866b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f16867c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16868d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2192l5(Y4 y42, String str, Object[] objArr) {
        this.f16865a = y42;
        this.f16866b = str;
        this.f16867c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16868d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i8 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            } else {
                this.f16868d = i8 | (charAt2 << i9);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f16866b;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final boolean b() {
        if ((this.f16868d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] c() {
        return this.f16867c;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final Y4 w() {
        return this.f16865a;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final EnumC2156h5 x() {
        int i8 = this.f16868d;
        if ((i8 & 1) != 0) {
            return EnumC2156h5.PROTO2;
        }
        if ((i8 & 4) == 4) {
            return EnumC2156h5.EDITIONS;
        }
        return EnumC2156h5.PROTO3;
    }
}
