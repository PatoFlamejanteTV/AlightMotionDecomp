package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class p extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f18469a;

    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.setException(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.set(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* loaded from: classes3.dex */
    interface c {
        ScheduledFuture a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c cVar) {
        this.f18469a = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected void afterDone() {
        this.f18469a.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f18469a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f18469a.getDelay(timeUnit);
    }
}
