package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2161i1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16756e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16757f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Q0 f16758g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16759h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2161i1(C2125e1 c2125e1, String str, String str2, Q0 q02) {
        super(c2125e1);
        this.f16756e = str;
        this.f16757f = str2;
        this.f16758g = q02;
        this.f16759h = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16759h.f16701i;
        ((P0) AbstractC1396p.l(p02)).getConditionalUserProperties(this.f16756e, this.f16757f, this.f16758g);
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    protected final void b() {
        this.f16758g.f(null);
    }
}
