package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2148g6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2389l4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A3 f17929a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17930b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f17931c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17932d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f17933e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F3 f17934f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2389l4(F3 f32, A3 a32, long j8, long j9, boolean z8, A3 a33) {
        this.f17929a = a32;
        this.f17930b = j8;
        this.f17931c = j9;
        this.f17932d = z8;
        this.f17933e = a33;
        this.f17934f = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17934f.R(this.f17929a);
        if (!C2148g6.a() || !this.f17934f.b().q(G.f17279Y0)) {
            this.f17934f.J(this.f17930b, false);
        }
        F3.V(this.f17934f, this.f17929a, this.f17931c, true, this.f17932d);
        F3.W(this.f17934f, this.f17929a, this.f17933e);
    }
}
