package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17594a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17595b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(F3 f32, long j8) {
        this.f17594a = j8;
        this.f17595b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17595b.e().f18154m.b(this.f17594a);
        this.f17595b.a().F().b("Session timeout duration set", Long.valueOf(this.f17594a));
    }
}
