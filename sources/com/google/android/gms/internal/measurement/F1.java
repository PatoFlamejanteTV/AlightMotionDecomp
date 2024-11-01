package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2125e1;

/* loaded from: classes3.dex */
final class F1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16293e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Q0 f16294f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C2125e1.c f16295g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(C2125e1.c cVar, Activity activity, Q0 q02) {
        super(C2125e1.this);
        this.f16293e = activity;
        this.f16294f = q02;
        this.f16295g = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = C2125e1.this.f16701i;
        ((P0) AbstractC1396p.l(p02)).onActivitySaveInstanceState(Y.b.s0(this.f16293e), this.f16294f, this.f16703b);
    }
}
