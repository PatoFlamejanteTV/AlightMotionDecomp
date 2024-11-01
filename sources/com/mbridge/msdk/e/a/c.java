package com.mbridge.msdk.e.a;

import android.os.Process;
import com.mbridge.msdk.e.a.b;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f20027a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<p<?>> f20028b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20029c;

    /* renamed from: d, reason: collision with root package name */
    private final t f20030d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f20031e = false;

    /* renamed from: f, reason: collision with root package name */
    private final ab f20032f;

    public c(BlockingQueue<p<?>> blockingQueue, BlockingQueue<p<?>> blockingQueue2, b bVar, t tVar) {
        this.f20027a = blockingQueue;
        this.f20028b = blockingQueue2;
        this.f20029c = bVar;
        this.f20030d = tVar;
        this.f20032f = new ab(this, blockingQueue2, tVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f20029c.a();
        while (true) {
            try {
                final p<?> take = this.f20027a.take();
                take.b(1);
                try {
                    if (take.m()) {
                        take.c("cache-discard-canceled");
                    } else {
                        b.a a9 = this.f20029c.a(take.j());
                        if (a9 == null) {
                            if (!this.f20032f.b(take)) {
                                this.f20028b.put(take);
                            }
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (a9.a(currentTimeMillis)) {
                                take.a(a9);
                                if (!this.f20032f.b(take)) {
                                    this.f20028b.put(take);
                                }
                            } else {
                                r<?> a10 = take.a(new m(200, a9.f20019a, false, 0L, a9.f20026h));
                                s k8 = take.k();
                                if (k8 != null && !k8.a(a10, take)) {
                                    this.f20029c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f20032f.b(take)) {
                                        this.f20028b.put(take);
                                    }
                                }
                                if (!a10.a()) {
                                    this.f20029c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f20032f.b(take)) {
                                        this.f20028b.put(take);
                                    }
                                } else if (a9.f20024f < currentTimeMillis) {
                                    take.a(a9);
                                    a10.f20096d = true;
                                    if (!this.f20032f.b(take)) {
                                        this.f20030d.a(take, a10, new Runnable() { // from class: com.mbridge.msdk.e.a.c.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                try {
                                                    c.this.f20028b.put(take);
                                                } catch (InterruptedException unused) {
                                                    Thread.currentThread().interrupt();
                                                }
                                            }
                                        });
                                    } else {
                                        this.f20030d.a(take, a10);
                                    }
                                } else {
                                    this.f20030d.a(take, a10);
                                }
                            }
                        }
                    }
                    take.b(2);
                } catch (Throwable th) {
                    take.b(2);
                    throw th;
                    break;
                }
            } catch (InterruptedException unused) {
                if (this.f20031e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void a() {
        this.f20031e = true;
        interrupt();
    }
}
