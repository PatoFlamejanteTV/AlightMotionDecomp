package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2152h1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16737e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16738f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f16739g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f16740h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16741i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2152h1(C2125e1 c2125e1, String str, String str2, Object obj, boolean z8) {
        super(c2125e1);
        this.f16737e = str;
        this.f16738f = str2;
        this.f16739g = obj;
        this.f16740h = z8;
        this.f16741i = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16741i.f16701i;
        ((P0) AbstractC1396p.l(p02)).setUserProperty(this.f16737e, this.f16738f, Y.b.s0(this.f16739g), this.f16740h, this.f16702a);
    }
}
