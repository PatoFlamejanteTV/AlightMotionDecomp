package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2125e1;

/* loaded from: classes3.dex */
final class D1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16269e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2125e1.c f16270f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(C2125e1.c cVar, Activity activity) {
        super(C2125e1.this);
        this.f16269e = activity;
        this.f16270f = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = C2125e1.this.f16701i;
        ((P0) AbstractC1396p.l(p02)).onActivityPaused(Y.b.s0(this.f16269e), this.f16703b);
    }
}
