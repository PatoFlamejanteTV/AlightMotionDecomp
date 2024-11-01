package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2382k4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17910a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17911b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2382k4(F3 f32, AtomicReference atomicReference) {
        this.f17910a = atomicReference;
        this.f17911b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17910a) {
            try {
                try {
                    this.f17910a.set(Double.valueOf(this.f17911b.b().l(this.f17911b.m().F(), G.f17264R)));
                } finally {
                    this.f17910a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
