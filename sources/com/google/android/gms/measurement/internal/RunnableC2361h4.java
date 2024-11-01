package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2361h4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17841a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17842b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2361h4(F3 f32, AtomicReference atomicReference) {
        this.f17841a = atomicReference;
        this.f17842b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17841a) {
            try {
                try {
                    this.f17841a.set(Integer.valueOf(this.f17842b.b().t(this.f17842b.m().F(), G.f17262Q)));
                } finally {
                    this.f17841a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
