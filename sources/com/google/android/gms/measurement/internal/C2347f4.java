package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2347f4 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ F3 f17806a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2347f4(F3 f32) {
        this.f17806a = f32;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f17806a.g0("auto", str2, bundle, str);
        } else {
            this.f17806a.T0("auto", str2, bundle);
        }
    }
}
