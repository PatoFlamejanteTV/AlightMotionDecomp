package com.google.android.gms.common.api.internal;

import N.C1339b;
import N.C1344g;
import P.C1378b;
import Q.AbstractC1396p;
import android.app.Activity;
import androidx.collection.ArraySet;

/* loaded from: classes3.dex */
public final class h extends C {

    /* renamed from: f, reason: collision with root package name */
    private final ArraySet f16132f;

    /* renamed from: g, reason: collision with root package name */
    private final C2085c f16133g;

    h(P.e eVar, C2085c c2085c, C1344g c1344g) {
        super(eVar, c1344g);
        this.f16132f = new ArraySet();
        this.f16133g = c2085c;
        this.f16092a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C2085c c2085c, C1378b c1378b) {
        P.e d8 = LifecycleCallback.d(activity);
        h hVar = (h) d8.c("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(d8, c2085c, C1344g.n());
        }
        AbstractC1396p.m(c1378b, "ApiKey cannot be null");
        hVar.f16132f.add(c1378b);
        c2085c.b(hVar);
    }

    private final void v() {
        if (!this.f16132f.isEmpty()) {
            this.f16133g.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f16133g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void m(C1339b c1339b, int i8) {
        this.f16133g.D(c1339b, i8);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void n() {
        this.f16133g.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArraySet t() {
        return this.f16132f;
    }
}
