package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f17526a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ P2 f17527b;

    public R2(P2 p22, String str) {
        this.f17527b = p22;
        AbstractC1396p.l(str);
        this.f17526a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f17527b.a().G().b(this.f17526a, th);
    }
}
