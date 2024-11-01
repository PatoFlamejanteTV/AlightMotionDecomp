package com.mbridge.msdk.e.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20039a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final p f20042a;

        /* renamed from: b, reason: collision with root package name */
        private final r f20043b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f20044c;

        public a(p pVar, r rVar, Runnable runnable) {
            this.f20042a = pVar;
            this.f20043b = rVar;
            this.f20044c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20042a.m()) {
                this.f20042a.c("canceled-at-delivery");
                return;
            }
            if (this.f20043b.a()) {
                this.f20042a.a((p) this.f20043b.f20093a);
            } else {
                this.f20042a.b(this.f20043b.f20095c);
            }
            if (!this.f20043b.f20096d) {
                this.f20042a.c("done");
            }
            Runnable runnable = this.f20044c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(final Handler handler) {
        this.f20039a = new Executor() { // from class: com.mbridge.msdk.e.a.h.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar) {
        a(pVar, rVar, null);
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar, Runnable runnable) {
        pVar.t();
        this.f20039a.execute(new a(pVar, rVar, runnable));
    }

    public h(Executor executor) {
        this.f20039a = executor;
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, z zVar) {
        this.f20039a.execute(new a(pVar, r.a(zVar), null));
    }
}
