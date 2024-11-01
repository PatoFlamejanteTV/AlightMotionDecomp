package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f21336a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f21337b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f21336a == null) {
                this.f21336a = a(runnable);
                q.a().execute(this.f21336a);
            } else if (this.f21337b == null) {
                this.f21337b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.s.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("LimitExecutor", e8.getMessage());
                        }
                    }
                } finally {
                    s.this.a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f21337b;
        this.f21336a = runnable;
        this.f21337b = null;
        if (runnable != null) {
            q.a().execute(this.f21336a);
        }
    }
}
