package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19873a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f19874b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f19875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundPoster(EventBus eventBus) {
        this.f19875c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a9 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f19873a.a(a9);
                if (!this.f19874b) {
                    this.f19874b = true;
                    EventBus.f19876a.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    PendingPost a9 = this.f19873a.a(1000);
                    if (a9 == null) {
                        synchronized (this) {
                            a9 = this.f19873a.a();
                            if (a9 == null) {
                                this.f19874b = false;
                                this.f19874b = false;
                                return;
                            }
                        }
                    }
                    this.f19875c.a(a9);
                } catch (InterruptedException e8) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e8);
                    this.f19874b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f19874b = false;
                throw th;
            }
        }
    }
}
