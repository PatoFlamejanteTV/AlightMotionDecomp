package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.B2;

/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC2303z3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17095a;

    static {
        int[] iArr = new int[B2.a.values().length];
        f17095a = iArr;
        try {
            iArr[B2.a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17095a[B2.a.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17095a[B2.a.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17095a[B2.a.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17095a[B2.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
