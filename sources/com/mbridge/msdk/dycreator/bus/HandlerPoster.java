package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes4.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19896a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19897b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f19898c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19899d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerPoster(EventBus eventBus, Looper looper, int i8) {
        super(looper);
        this.f19898c = eventBus;
        this.f19897b = i8;
        this.f19896a = new PendingPostQueue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Subscription subscription, Object obj) {
        PendingPost a9 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f19896a.a(a9);
                if (!this.f19899d) {
                    this.f19899d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a9 = this.f19896a.a();
                if (a9 == null) {
                    synchronized (this) {
                        a9 = this.f19896a.a();
                        if (a9 == null) {
                            this.f19899d = false;
                            return;
                        }
                    }
                }
                this.f19898c.a(a9);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f19897b);
            if (sendMessage(obtainMessage())) {
                this.f19899d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f19899d = false;
            throw th;
        }
    }
}
