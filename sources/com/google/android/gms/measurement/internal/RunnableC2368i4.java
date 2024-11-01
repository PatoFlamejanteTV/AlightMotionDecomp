package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2368i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17853a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17854b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2368i4(F3 f32, AtomicReference atomicReference) {
        this.f17853a = atomicReference;
        this.f17854b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17853a) {
            try {
                try {
                    this.f17853a.set(Long.valueOf(this.f17854b.b().A(this.f17854b.m().F(), G.f17260P)));
                } finally {
                    this.f17853a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
