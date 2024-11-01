package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2301z1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f17092e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Activity f17093f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C2125e1.c f17094g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301z1(C2125e1.c cVar, Bundle bundle, Activity activity) {
        super(C2125e1.this);
        this.f17092e = bundle;
        this.f17093f = activity;
        this.f17094g = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        Bundle bundle;
        P0 p02;
        if (this.f17092e != null) {
            bundle = new Bundle();
            if (this.f17092e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f17092e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        p02 = C2125e1.this.f16701i;
        ((P0) AbstractC1396p.l(p02)).onActivityCreated(Y.b.s0(this.f17093f), bundle, this.f16703b);
    }
}
