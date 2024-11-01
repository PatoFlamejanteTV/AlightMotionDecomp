package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2285x1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2125e1.b f17073e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f17074f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2285x1(C2125e1 c2125e1, C2125e1.b bVar) {
        super(c2125e1);
        this.f17073e = bVar;
        this.f17074f = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f17074f.f16701i;
        ((P0) AbstractC1396p.l(p02)).registerOnMeasurementEventListener(this.f17073e);
    }
}
