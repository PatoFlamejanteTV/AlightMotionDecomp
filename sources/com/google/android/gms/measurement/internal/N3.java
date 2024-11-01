package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ F3 f17484a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(F3 f32) {
        this.f17484a = f32;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17484a.f().D(runnable);
    }
}
