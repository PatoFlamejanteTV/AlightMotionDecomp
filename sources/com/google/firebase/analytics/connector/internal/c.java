package com.google.firebase.analytics.connector.internal;

import B0.a;
import android.os.Bundle;
import k0.C3223a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements C3223a.InterfaceC0783a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f18409a;

    public c(d dVar) {
        this.f18409a = dVar;
    }

    @Override // l0.t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        a.b bVar;
        if (!this.f18409a.f18410a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", a.a(str2));
        bVar = this.f18409a.f18411b;
        bVar.a(2, bundle2);
    }
}
