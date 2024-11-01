package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.P1;

/* loaded from: classes3.dex */
abstract /* synthetic */ class O2 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17488a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f17489b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f17490c;

    static {
        int[] iArr = new int[P1.d.values().length];
        f17490c = iArr;
        try {
            iArr[P1.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17490c[P1.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[P1.e.values().length];
        f17489b = iArr2;
        try {
            iArr2[P1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17489b[P1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17489b[P1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17489b[P1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[F7.values().length];
        f17488a = iArr3;
        try {
            iArr3[F7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17488a[F7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17488a[F7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f17488a[F7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
