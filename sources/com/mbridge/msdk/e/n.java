package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.z;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private q f20159a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20160b;

    /* renamed from: c, reason: collision with root package name */
    private final o f20161c;

    /* renamed from: d, reason: collision with root package name */
    private final v f20162d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20163e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.e.a.q f20164f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f20165g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f20167a;

        /* renamed from: b, reason: collision with root package name */
        private final s f20168b;

        public a(q qVar, s sVar) {
            this.f20167a = qVar;
            this.f20168b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.a
        public final void a(z zVar) {
            if (y.b(this.f20167a)) {
                try {
                    this.f20167a.a(this.f20168b, 0, zVar.getMessage());
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19988a) {
                        Log.e("TrackManager", "onErrorResponse error", e8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements r.b {

        /* renamed from: a, reason: collision with root package name */
        private final q f20169a;

        /* renamed from: b, reason: collision with root package name */
        private final s f20170b;

        public b(q qVar, s sVar) {
            this.f20169a = qVar;
            this.f20170b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.b
        public final void a(Object obj) {
            if (y.b(this.f20169a)) {
                try {
                    this.f20169a.a(this.f20170b);
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19988a) {
                        Log.e("TrackManager", "onResponse error", e8);
                    }
                }
            }
        }
    }

    public n(int i8, o oVar, v vVar, int i9) {
        this.f20160b = i8;
        this.f20161c = oVar;
        this.f20162d = vVar;
        this.f20163e = i9;
        this.f20165g = new ThreadPoolExecutor(1, i8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.f20159a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z8) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.f20159a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19988a) {
                        Log.e("TrackManager", "send error", e8);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f20164f)) {
                com.mbridge.msdk.e.a.q a9 = com.mbridge.msdk.e.a.a.l.a(new com.mbridge.msdk.e.a.a.b(this.f20161c.c()), new com.mbridge.msdk.e.a.h(this.f20165g), this.f20160b, null);
                this.f20164f = a9;
                a9.a();
            }
            if (this.f20163e == 1) {
                uVar = new u(this.f20161c.b(), 1, this.f20161c.a());
            } else {
                uVar = new u(this.f20161c.b(), 1);
            }
            uVar.a(map);
            uVar.a(false);
            uVar.b(true);
            uVar.c(true);
            uVar.a(this.f20162d);
            uVar.a(z8 ? p.b.HIGH : p.b.NORMAL);
            uVar.a((r.b) new b(this.f20159a, sVar));
            uVar.a((r.a) new a(this.f20159a, sVar));
            this.f20164f.a(uVar);
        } catch (Exception e9) {
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", "send error", e9);
            }
            if (y.b(this.f20159a)) {
                this.f20159a.a(sVar, 0, e9.getMessage());
            }
        }
    }
}
