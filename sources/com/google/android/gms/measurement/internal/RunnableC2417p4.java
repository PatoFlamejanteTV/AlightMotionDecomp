package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2417p4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A3 f18007a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f18008b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f18009c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ A3 f18010d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F3 f18011e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2417p4(F3 f32, A3 a32, long j8, boolean z8, A3 a33) {
        this.f18007a = a32;
        this.f18008b = j8;
        this.f18009c = z8;
        this.f18010d = a33;
        this.f18011e = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18011e.R(this.f18007a);
        F3.V(this.f18011e, this.f18007a, this.f18008b, false, this.f18009c);
        F3.W(this.f18011e, this.f18007a, this.f18010d);
    }
}
