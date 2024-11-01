package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17641a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17642b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y3(F3 f32, AtomicReference atomicReference) {
        this.f17641a = atomicReference;
        this.f17642b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17641a) {
            try {
                try {
                    this.f17641a.set(this.f17642b.b().G(this.f17642b.m().F()));
                } finally {
                    this.f17641a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
