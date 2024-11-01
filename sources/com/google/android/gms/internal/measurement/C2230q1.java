package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2230q1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Q0 f16936e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16937f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2230q1(C2125e1 c2125e1, Q0 q02) {
        super(c2125e1);
        this.f16936e = q02;
        this.f16937f = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16937f.f16701i;
        ((P0) AbstractC1396p.l(p02)).getCurrentScreenName(this.f16936e);
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    protected final void b() {
        this.f16936e.f(null);
    }
}
