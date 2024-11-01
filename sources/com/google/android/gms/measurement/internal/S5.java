package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S5 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H5 f17574a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S5(H5 h52) {
        this.f17574a = h52;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void b(String str, String str2, Bundle bundle) {
        S2 s22;
        S2 s23;
        if (TextUtils.isEmpty(str)) {
            s22 = this.f17574a.f17374l;
            if (s22 != null) {
                s23 = this.f17574a.f17374l;
                s23.a().G().b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.f17574a.f().D(new U5(this, str, str2, bundle));
    }
}
