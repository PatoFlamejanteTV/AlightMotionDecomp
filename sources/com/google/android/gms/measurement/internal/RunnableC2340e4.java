package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2340e4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17792a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17793b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17794c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17795d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F3 f17796e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2340e4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f17792a = atomicReference;
        this.f17794c = str2;
        this.f17795d = str3;
        this.f17796e = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17796e.f18099a.J().Q(this.f17792a, null, this.f17794c, this.f17795d);
    }
}
