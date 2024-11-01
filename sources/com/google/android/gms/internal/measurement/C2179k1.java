package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2179k1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f16794e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16795f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f16796g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16797h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2179k1(C2125e1 c2125e1, Activity activity, String str, String str2) {
        super(c2125e1);
        this.f16794e = activity;
        this.f16795f = str;
        this.f16796g = str2;
        this.f16797h = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f16797h.f16701i;
        ((P0) AbstractC1396p.l(p02)).setCurrentScreen(Y.b.s0(this.f16794e), this.f16795f, this.f16796g, this.f16702a);
    }
}
