package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17606a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17607b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f17608c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f17609d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F3 f17610e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(F3 f32, String str, String str2, Object obj, long j8) {
        this.f17606a = str;
        this.f17607b = str2;
        this.f17608c = obj;
        this.f17609d = j8;
        this.f17610e = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17610e.i0(this.f17606a, this.f17607b, this.f17608c, this.f17609d);
    }
}
