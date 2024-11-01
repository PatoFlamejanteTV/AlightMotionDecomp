package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2333d4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17762a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17763b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17764c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17765d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f17766e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F3 f17767f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2333d4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        this.f17762a = atomicReference;
        this.f17764c = str2;
        this.f17765d = str3;
        this.f17766e = z8;
        this.f17767f = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17767f.f18099a.J().R(this.f17762a, null, this.f17764c, this.f17765d, this.f17766e);
    }
}
