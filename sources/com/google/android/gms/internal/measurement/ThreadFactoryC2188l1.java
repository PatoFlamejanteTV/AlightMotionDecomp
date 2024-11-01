package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC2188l1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f16810a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC2188l1(C2125e1 c2125e1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f16810a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
