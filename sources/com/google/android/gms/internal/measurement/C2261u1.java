package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2261u1 extends C2125e1.a {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f17019f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f17020g;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f17023j;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f17018e = 5;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Object f17021h = null;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Object f17022i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261u1(C2125e1 c2125e1, boolean z8, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f17019f = str;
        this.f17020g = obj;
        this.f17023j = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    final void a() {
        P0 p02;
        p02 = this.f17023j.f16701i;
        ((P0) AbstractC1396p.l(p02)).logHealthData(this.f17018e, this.f17019f, Y.b.s0(this.f17020g), Y.b.s0(null), Y.b.s0(null));
    }
}
