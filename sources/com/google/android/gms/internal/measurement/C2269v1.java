package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2269v1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f17033e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Q0 f17034f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f17035g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269v1(C2125e1 c2125e1, String str, Q0 q02) {
        super(c2125e1);
        this.f17033e = str;
        this.f17034f = q02;
        this.f17035g = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f17035g.f16701i;
        ((P0) AbstractC1396p.l(p02)).getMaxUserProperties(this.f17033e, this.f17034f);
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    protected final void b() {
        this.f17034f.f(null);
    }
}
