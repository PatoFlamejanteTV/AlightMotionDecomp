package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.M1;

/* loaded from: classes3.dex */
abstract /* synthetic */ class k6 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17915a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f17916b;

    static {
        int[] iArr = new int[K1.b.values().length];
        f17916b = iArr;
        try {
            iArr[K1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17916b[K1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17916b[K1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17916b[K1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[M1.b.values().length];
        f17915a = iArr2;
        try {
            iArr2[M1.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17915a[M1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17915a[M1.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17915a[M1.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17915a[M1.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f17915a[M1.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
