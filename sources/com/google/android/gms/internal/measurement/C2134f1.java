package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2134f1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f16719e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16720f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2134f1(C2125e1 c2125e1, Bundle bundle) {
        super(c2125e1);
        this.f16719e = bundle;
        this.f16720f = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16720f.f16701i;
        ((P0) AbstractC1396p.l(p02)).setConditionalUserProperty(this.f16719e, this.f16702a);
    }
}
