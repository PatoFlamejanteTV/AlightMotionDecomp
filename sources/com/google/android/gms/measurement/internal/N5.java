package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
abstract /* synthetic */ class N5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17487a;

    static {
        int[] iArr = new int[l0.p.values().length];
        f17487a = iArr;
        try {
            iArr[l0.p.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17487a[l0.p.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17487a[l0.p.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17487a[l0.p.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
