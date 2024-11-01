package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2293y1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Long f17079e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f17080f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f17081g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f17082h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f17083i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f17084j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f17085k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293y1(C2125e1 c2125e1, Long l8, String str, String str2, Bundle bundle, boolean z8, boolean z9) {
        super(c2125e1);
        this.f17079e = l8;
        this.f17080f = str;
        this.f17081g = str2;
        this.f17082h = bundle;
        this.f17083i = z8;
        this.f17084j = z9;
        this.f17085k = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        long longValue;
        P0 p02;
        Long l8 = this.f17079e;
        if (l8 == null) {
            longValue = this.f16702a;
        } else {
            longValue = l8.longValue();
        }
        long j8 = longValue;
        p02 = this.f17085k.f16701i;
        ((P0) AbstractC1396p.l(p02)).logEvent(this.f17080f, this.f17081g, this.f17082h, this.f17083i, this.f17084j, j8);
    }
}
