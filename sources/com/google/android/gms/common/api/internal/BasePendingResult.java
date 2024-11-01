package com.google.android.gms.common.api.internal;

import O.g;
import O.j;
import Q.AbstractC1396p;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d0.HandlerC2742i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends O.j> extends O.g {

    /* renamed from: m, reason: collision with root package name */
    static final ThreadLocal f16075m = new D();

    /* renamed from: b, reason: collision with root package name */
    protected final a f16077b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f16078c;

    /* renamed from: g, reason: collision with root package name */
    private O.j f16082g;

    /* renamed from: h, reason: collision with root package name */
    private Status f16083h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f16084i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16085j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16086k;

    /* renamed from: a, reason: collision with root package name */
    private final Object f16076a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f16079d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f16080e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f16081f = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private boolean f16087l = false;

    /* loaded from: classes3.dex */
    public static class a extends HandlerC2742i {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + i8, new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).d(Status.f16063i);
                return;
            }
            Pair pair = (Pair) message.obj;
            android.support.v4.media.a.a(pair.first);
            O.j jVar = (O.j) pair.second;
            try {
                throw null;
            } catch (RuntimeException e8) {
                BasePendingResult.j(jVar);
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(O.f fVar) {
        Looper mainLooper;
        if (fVar != null) {
            mainLooper = fVar.c();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f16077b = new a(mainLooper);
        this.f16078c = new WeakReference(fVar);
    }

    private final O.j g() {
        O.j jVar;
        synchronized (this.f16076a) {
            AbstractC1396p.p(!this.f16084i, "Result has already been consumed.");
            AbstractC1396p.p(e(), "Result is not ready.");
            jVar = this.f16082g;
            this.f16082g = null;
            this.f16084i = true;
        }
        android.support.v4.media.a.a(this.f16081f.getAndSet(null));
        return (O.j) AbstractC1396p.l(jVar);
    }

    private final void h(O.j jVar) {
        this.f16082g = jVar;
        this.f16083h = jVar.getStatus();
        this.f16079d.countDown();
        ArrayList arrayList = this.f16080e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((g.a) arrayList.get(i8)).a(this.f16083h);
        }
        this.f16080e.clear();
    }

    @Override // O.g
    public final void a(g.a aVar) {
        boolean z8;
        if (aVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1396p.b(z8, "Callback cannot be null.");
        synchronized (this.f16076a) {
            try {
                if (e()) {
                    aVar.a(this.f16083h);
                } else {
                    this.f16080e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O.g
    public final O.j b(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            AbstractC1396p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC1396p.p(!this.f16084i, "Result has already been consumed.");
        AbstractC1396p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f16079d.await(j8, timeUnit)) {
                d(Status.f16063i);
            }
        } catch (InterruptedException unused) {
            d(Status.f16061g);
        }
        AbstractC1396p.p(e(), "Result is not ready.");
        return g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract O.j c(Status status);

    public final void d(Status status) {
        synchronized (this.f16076a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f16086k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        if (this.f16079d.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void f(O.j jVar) {
        synchronized (this.f16076a) {
            try {
                if (!this.f16086k && !this.f16085j) {
                    e();
                    AbstractC1396p.p(!e(), "Results have already been set");
                    AbstractC1396p.p(!this.f16084i, "Result has already been consumed");
                    h(jVar);
                    return;
                }
                j(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        boolean z8 = true;
        if (!this.f16087l && !((Boolean) f16075m.get()).booleanValue()) {
            z8 = false;
        }
        this.f16087l = z8;
    }

    public static void j(O.j jVar) {
    }
}
