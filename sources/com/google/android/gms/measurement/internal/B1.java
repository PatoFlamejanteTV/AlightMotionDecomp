package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes3.dex */
final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private final l0.p f17148a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(l0.p pVar) {
        this.f17148a = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static B1 a(String str) {
        l0.p pVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            pVar = A3.i(str.charAt(0));
        } else {
            pVar = l0.p.UNINITIALIZED;
        }
        return new B1(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l0.p b() {
        return this.f17148a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return String.valueOf(A3.a(this.f17148a));
    }
}
