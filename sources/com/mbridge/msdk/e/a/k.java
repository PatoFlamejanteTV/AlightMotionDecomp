package com.mbridge.msdk.e.a;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f20047a;

    /* renamed from: b, reason: collision with root package name */
    private final j f20048b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20049c;

    /* renamed from: d, reason: collision with root package name */
    private final t f20050d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f20051e = false;

    public k(BlockingQueue<p<?>> blockingQueue, j jVar, b bVar, t tVar) {
        this.f20047a = blockingQueue;
        this.f20048b = jVar;
        this.f20049c = bVar;
        this.f20050d = tVar;
    }

    public final void a() {
        this.f20051e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                p<?> take = this.f20047a.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                take.b(3);
                try {
                    try {
                        if (take.m()) {
                            take.c("network-discard-cancelled");
                            take.v();
                        } else {
                            TrafficStats.setThreadStatsTag(take.h());
                            m a9 = this.f20048b.a(take);
                            if (a9.f20056e && take.u()) {
                                take.c("not-modified");
                                take.v();
                            } else {
                                r<?> a10 = take.a(a9);
                                if (take.p() && a10.f20094b != null) {
                                    this.f20049c.a(take.j(), a10.f20094b);
                                }
                                take.t();
                                this.f20050d.a(take, a10);
                                take.a(a10);
                            }
                        }
                    } catch (z e8) {
                        e8.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f20050d.a(take, e8);
                        take.v();
                    } catch (Exception e9) {
                        aa.a(e9, "Unhandled exception %s", e9.toString());
                        y yVar = new y(e9);
                        yVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f20050d.a(take, yVar);
                        take.v();
                    }
                    take.b(4);
                } catch (Throwable th) {
                    take.b(4);
                    throw th;
                    break;
                }
            } catch (InterruptedException unused) {
                if (this.f20051e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
