package com.mbridge.msdk.e.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    private final b f20087e;

    /* renamed from: f, reason: collision with root package name */
    private final j f20088f;

    /* renamed from: g, reason: collision with root package name */
    private final t f20089g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f20090h;

    /* renamed from: i, reason: collision with root package name */
    private c f20091i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f20083a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final Set<p<?>> f20084b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f20085c = new PriorityBlockingQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f20086d = new PriorityBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    private final List<a> f20092j = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(p<?> pVar, int i8);
    }

    public q(j jVar, t tVar, int i8, b bVar) {
        this.f20087e = bVar;
        this.f20088f = jVar;
        this.f20090h = new k[i8];
        this.f20089g = tVar;
    }

    public final <T> p<T> a(p<T> pVar) {
        pVar.a(this);
        synchronized (this.f20084b) {
            this.f20084b.add(pVar);
        }
        pVar.c(this.f20083a.incrementAndGet());
        a(pVar, 0);
        if (!pVar.p()) {
            c(pVar);
        } else {
            this.f20085c.add(pVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void b(p<T> pVar) {
        synchronized (this.f20084b) {
            this.f20084b.remove(pVar);
        }
        a(pVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void c(p<T> pVar) {
        this.f20086d.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p<?> pVar, int i8) {
        synchronized (this.f20092j) {
            try {
                Iterator<a> it = this.f20092j.iterator();
                while (it.hasNext()) {
                    it.next().a(pVar, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        c cVar = this.f20091i;
        if (cVar != null) {
            cVar.a();
        }
        for (k kVar : this.f20090h) {
            if (kVar != null) {
                kVar.a();
            }
        }
        c cVar2 = new c(this.f20085c, this.f20086d, this.f20087e, this.f20089g);
        this.f20091i = cVar2;
        cVar2.start();
        for (int i8 = 0; i8 < this.f20090h.length; i8++) {
            k kVar2 = new k(this.f20086d, this.f20088f, this.f20087e, this.f20089g);
            this.f20090h[i8] = kVar2;
            kVar2.start();
        }
    }
}
