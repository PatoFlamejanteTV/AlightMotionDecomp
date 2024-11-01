package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2486z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f18169a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f18170b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f18171c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f18172d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2465w4 f18173e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2486z4(C2465w4 c2465w4, Bundle bundle, C2472x4 c2472x4, C2472x4 c2472x42, long j8) {
        this.f18169a = bundle;
        this.f18170b = c2472x4;
        this.f18171c = c2472x42;
        this.f18172d = j8;
        this.f18173e = c2465w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2465w4.J(this.f18173e, this.f18169a, this.f18170b, this.f18171c, this.f18172d);
    }
}
