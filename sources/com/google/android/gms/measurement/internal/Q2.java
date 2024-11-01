package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q2 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f17518a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f17519b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17520c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ P2 f17521d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(P2 p22, Runnable runnable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().b(runnable), null);
        AtomicLong atomicLong;
        this.f17521d = p22;
        AbstractC1396p.l(str);
        atomicLong = P2.f17500l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f17518a = andIncrement;
        this.f17520c = str;
        this.f17519b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            p22.a().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        Q2 q22 = (Q2) obj;
        boolean z8 = this.f17519b;
        if (z8 != q22.f17519b) {
            if (!z8) {
                return 1;
            }
            return -1;
        }
        long j8 = this.f17518a;
        long j9 = q22.f17518a;
        if (j8 < j9) {
            return -1;
        }
        if (j8 > j9) {
            return 1;
        }
        this.f17521d.a().I().b("Two tasks share the same index. index", Long.valueOf(this.f17518a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f17521d.a().G().b(this.f17520c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(P2 p22, Callable callable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().a(callable));
        AtomicLong atomicLong;
        this.f17521d = p22;
        AbstractC1396p.l(str);
        atomicLong = P2.f17500l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f17518a = andIncrement;
        this.f17520c = str;
        this.f17519b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            p22.a().G().a("Tasks index overflow");
        }
    }
}
