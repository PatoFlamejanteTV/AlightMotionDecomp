package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Process;
import androidx.work.WorkRequest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f17575a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f17576b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17577c = false;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ P2 f17578d;

    public T2(P2 p22, String str, BlockingQueue blockingQueue) {
        this.f17578d = p22;
        AbstractC1396p.l(str);
        AbstractC1396p.l(blockingQueue);
        this.f17575a = new Object();
        this.f17576b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f17578d.a().L().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        T2 t22;
        T2 t23;
        obj = this.f17578d.f17507i;
        synchronized (obj) {
            try {
                if (!this.f17577c) {
                    semaphore = this.f17578d.f17508j;
                    semaphore.release();
                    obj2 = this.f17578d.f17507i;
                    obj2.notifyAll();
                    t22 = this.f17578d.f17501c;
                    if (this == t22) {
                        this.f17578d.f17501c = null;
                    } else {
                        t23 = this.f17578d.f17502d;
                        if (this == t23) {
                            this.f17578d.f17502d = null;
                        } else {
                            this.f17578d.a().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f17577c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f17575a) {
            this.f17575a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i8;
        Object obj;
        boolean z8;
        boolean z9 = false;
        while (!z9) {
            try {
                semaphore = this.f17578d.f17508j;
                semaphore.acquire();
                z9 = true;
            } catch (InterruptedException e8) {
                b(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                Q2 q22 = (Q2) this.f17576b.poll();
                if (q22 != null) {
                    if (q22.f17519b) {
                        i8 = threadPriority;
                    } else {
                        i8 = 10;
                    }
                    Process.setThreadPriority(i8);
                    q22.run();
                } else {
                    synchronized (this.f17575a) {
                        if (this.f17576b.peek() == null) {
                            z8 = this.f17578d.f17509k;
                            if (!z8) {
                                try {
                                    this.f17575a.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                                } catch (InterruptedException e9) {
                                    b(e9);
                                }
                            }
                        }
                    }
                    obj = this.f17578d.f17507i;
                    synchronized (obj) {
                        if (this.f17576b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
