package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20989a = "j";

    /* renamed from: b, reason: collision with root package name */
    private final Context f20990b;

    /* renamed from: d, reason: collision with root package name */
    private final c f20992d;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f20994f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.stack.b f20995g;

    /* renamed from: c, reason: collision with root package name */
    private final Set<i> f20991c = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f20993e = new AtomicInteger();

    public j(Context context) {
        a();
        this.f20990b = context.getApplicationContext();
        this.f20992d = new d(new Handler(Looper.getMainLooper()));
    }

    private void a() {
        af a9 = af.a();
        if (a9.a("c_v_r_q_t", true)) {
            try {
                this.f20994f = new ThreadPoolExecutor(a9.a("v_r_q_c_s", 10), a9.a("v_r_q_m_s", 25), a9.a("v_r_q_c_t", 15), TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            } catch (Exception unused) {
                this.f20994f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            }
        }
        this.f20994f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(i iVar) {
        synchronized (this) {
            this.f20991c.remove(iVar);
        }
    }

    public j(Context context, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        this.f20995g = bVar;
        a();
        this.f20990b = context.getApplicationContext();
        this.f20992d = new d(new Handler(Looper.getMainLooper()));
    }

    public final void a(final i iVar) {
        iVar.a(this);
        synchronized (this) {
            this.f20991c.add(iVar);
        }
        iVar.b(this.f20993e.incrementAndGet());
        ad.c(f20989a, "add-to-queue request=" + iVar.s());
        this.f20994f.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.this.f20995g == null) {
                    new h(j.this.f20992d).a(iVar);
                } else {
                    new h(j.this.f20992d, j.this.f20995g).a(iVar);
                }
            }
        });
    }
}
