package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2245s1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16983e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16984f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f16985g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Q0 f16986h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16987i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245s1(C2125e1 c2125e1, String str, String str2, boolean z8, Q0 q02) {
        super(c2125e1);
        this.f16983e = str;
        this.f16984f = str2;
        this.f16985g = z8;
        this.f16986h = q02;
        this.f16987i = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16987i.f16701i;
        ((P0) AbstractC1396p.l(p02)).getUserProperties(this.f16983e, this.f16984f, this.f16985g, this.f16986h);
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    protected final void b() {
        this.f16986h.f(null);
    }
}
