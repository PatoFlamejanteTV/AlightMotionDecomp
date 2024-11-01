package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2170j1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16779e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16780f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Bundle f16781g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16782h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170j1(C2125e1 c2125e1, String str, String str2, Bundle bundle) {
        super(c2125e1);
        this.f16779e = str;
        this.f16780f = str2;
        this.f16781g = bundle;
        this.f16782h = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16782h.f16701i;
        ((P0) AbstractC1396p.l(p02)).clearConditionalUserProperty(this.f16779e, this.f16780f, this.f16781g);
    }
}
