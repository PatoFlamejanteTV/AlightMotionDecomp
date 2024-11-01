package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f16136a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f16137b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(n nVar, int i8) {
        this.f16137b = nVar;
        this.f16136a = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16137b.l(this.f16136a);
    }
}
