package com.google.firebase.analytics.connector.internal;

import B0.a;
import android.os.Bundle;
import k0.C3223a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements C3223a.InterfaceC0783a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ f f18414a;

    public e(f fVar) {
        this.f18414a = fVar;
    }

    @Override // l0.t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        a.b bVar;
        if (str != null && a.f(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j8);
            bundle2.putBundle("params", bundle);
            bVar = this.f18414a.f18415a;
            bVar.a(3, bundle2);
        }
    }
}
