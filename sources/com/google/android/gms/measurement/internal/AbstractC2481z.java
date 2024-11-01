package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC2481z {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f18138a;

    static {
        int[] iArr = new int[l0.p.values().length];
        f18138a = iArr;
        try {
            iArr[l0.p.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18138a[l0.p.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18138a[l0.p.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18138a[l0.p.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
