package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17510a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17511b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P3(F3 f32, AtomicReference atomicReference) {
        this.f17510a = atomicReference;
        this.f17511b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17510a) {
            try {
                try {
                    this.f17510a.set(Boolean.valueOf(this.f17511b.b().M(this.f17511b.m().F())));
                } finally {
                    this.f17510a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
