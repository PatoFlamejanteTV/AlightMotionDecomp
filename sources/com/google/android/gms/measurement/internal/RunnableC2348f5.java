package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2348f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ComponentName f17807a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2334d5 f17808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2348f5(ServiceConnectionC2334d5 serviceConnectionC2334d5, ComponentName componentName) {
        this.f17807a = componentName;
        this.f17808b = serviceConnectionC2334d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.K(this.f17808b.f17770c, this.f17807a);
    }
}
