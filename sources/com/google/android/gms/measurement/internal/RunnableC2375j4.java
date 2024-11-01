package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2375j4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Boolean f17875a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2375j4(F3 f32, Boolean bool) {
        this.f17875a = bool;
        this.f17876b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17876b.a0(this.f17875a, true);
    }
}
