package com.google.android.gms.common.api.internal;

import N.C1339b;
import N.C1344g;
import P.C1378b;
import Q.AbstractC1388h;
import Q.AbstractC1400u;
import Q.C1393m;
import Q.C1397q;
import Q.C1399t;
import Q.G;
import Q.InterfaceC1401v;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d0.HandlerC2742i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q0.C3626l;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2085c implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f16100p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f16101q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f16102r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C2085c f16103s;

    /* renamed from: c, reason: collision with root package name */
    private C1399t f16106c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1401v f16107d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f16108e;

    /* renamed from: f, reason: collision with root package name */
    private final C1344g f16109f;

    /* renamed from: g, reason: collision with root package name */
    private final G f16110g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f16117n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f16118o;

    /* renamed from: a, reason: collision with root package name */
    private long f16104a = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16105b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f16111h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f16112i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f16113j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private h f16114k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f16115l = new ArraySet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f16116m = new ArraySet();

    private C2085c(Context context, Looper looper, C1344g c1344g) {
        this.f16118o = true;
        this.f16108e = context;
        HandlerC2742i handlerC2742i = new HandlerC2742i(looper, this);
        this.f16117n = handlerC2742i;
        this.f16109f = c1344g;
        this.f16110g = new G(c1344g);
        if (V.h.a(context)) {
            this.f16118o = false;
        }
        handlerC2742i.sendMessage(handlerC2742i.obtainMessage(6));
    }

    public static void a() {
        synchronized (f16102r) {
            try {
                C2085c c2085c = f16103s;
                if (c2085c != null) {
                    c2085c.f16112i.incrementAndGet();
                    Handler handler = c2085c.f16117n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C1378b c1378b, C1339b c1339b) {
        return new Status(c1339b, "API: " + c1378b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c1339b));
    }

    private final n h(O.e eVar) {
        Map map = this.f16113j;
        C1378b i8 = eVar.i();
        n nVar = (n) map.get(i8);
        if (nVar == null) {
            nVar = new n(this, eVar);
            this.f16113j.put(i8, nVar);
        }
        if (nVar.a()) {
            this.f16116m.add(i8);
        }
        nVar.E();
        return nVar;
    }

    private final InterfaceC1401v i() {
        if (this.f16107d == null) {
            this.f16107d = AbstractC1400u.a(this.f16108e);
        }
        return this.f16107d;
    }

    private final void j() {
        C1399t c1399t = this.f16106c;
        if (c1399t != null) {
            if (c1399t.s() > 0 || e()) {
                i().a(c1399t);
            }
            this.f16106c = null;
        }
    }

    private final void k(C3626l c3626l, int i8, O.e eVar) {
        r b9;
        if (i8 != 0 && (b9 = r.b(this, i8, eVar.i())) != null) {
            Task a9 = c3626l.a();
            final Handler handler = this.f16117n;
            handler.getClass();
            a9.b(new Executor() { // from class: P.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b9);
        }
    }

    public static C2085c u(Context context) {
        C2085c c2085c;
        synchronized (f16102r) {
            try {
                if (f16103s == null) {
                    f16103s = new C2085c(context.getApplicationContext(), AbstractC1388h.b().getLooper(), C1344g.n());
                }
                c2085c = f16103s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2085c;
    }

    public final void A(O.e eVar, int i8, AbstractC2084b abstractC2084b) {
        this.f16117n.sendMessage(this.f16117n.obtainMessage(4, new P.u(new v(i8, abstractC2084b), this.f16112i.get(), eVar)));
    }

    public final void B(O.e eVar, int i8, AbstractC2086d abstractC2086d, C3626l c3626l, P.k kVar) {
        k(c3626l, abstractC2086d.d(), eVar);
        this.f16117n.sendMessage(this.f16117n.obtainMessage(4, new P.u(new w(i8, abstractC2086d, c3626l, kVar), this.f16112i.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(C1393m c1393m, int i8, long j8, int i9) {
        this.f16117n.sendMessage(this.f16117n.obtainMessage(18, new s(c1393m, i8, j8, i9)));
    }

    public final void D(C1339b c1339b, int i8) {
        if (!f(c1339b, i8)) {
            Handler handler = this.f16117n;
            handler.sendMessage(handler.obtainMessage(5, i8, 0, c1339b));
        }
    }

    public final void E() {
        Handler handler = this.f16117n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(O.e eVar) {
        Handler handler = this.f16117n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(h hVar) {
        synchronized (f16102r) {
            try {
                if (this.f16114k != hVar) {
                    this.f16114k = hVar;
                    this.f16115l.clear();
                }
                this.f16115l.addAll(hVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(h hVar) {
        synchronized (f16102r) {
            try {
                if (this.f16114k == hVar) {
                    this.f16114k = null;
                    this.f16115l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f16105b) {
            return false;
        }
        Q.r a9 = C1397q.b().a();
        if (a9 != null && !a9.v()) {
            return false;
        }
        int a10 = this.f16110g.a(this.f16108e, 203400000);
        if (a10 != -1 && a10 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(C1339b c1339b, int i8) {
        return this.f16109f.x(this.f16108e, c1339b, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1378b c1378b;
        C1378b c1378b2;
        C1378b c1378b3;
        C1378b c1378b4;
        int i8 = message.what;
        long j8 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        n nVar = null;
        switch (i8) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j8 = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.f16104a = j8;
                this.f16117n.removeMessages(12);
                for (C1378b c1378b5 : this.f16113j.keySet()) {
                    Handler handler = this.f16117n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1378b5), this.f16104a);
                }
                return true;
            case 2:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 3:
                for (n nVar2 : this.f16113j.values()) {
                    nVar2.D();
                    nVar2.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                P.u uVar = (P.u) message.obj;
                n nVar3 = (n) this.f16113j.get(uVar.f7967c.i());
                if (nVar3 == null) {
                    nVar3 = h(uVar.f7967c);
                }
                if (nVar3.a() && this.f16112i.get() != uVar.f7966b) {
                    uVar.f7965a.a(f16100p);
                    nVar3.K();
                } else {
                    nVar3.F(uVar.f7965a);
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C1339b c1339b = (C1339b) message.obj;
                Iterator it = this.f16113j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n nVar4 = (n) it.next();
                        if (nVar4.s() == i9) {
                            nVar = nVar4;
                        }
                    }
                }
                if (nVar != null) {
                    if (c1339b.s() == 13) {
                        n.y(nVar, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f16109f.e(c1339b.s()) + ": " + c1339b.u()));
                    } else {
                        n.y(nVar, g(n.w(nVar), c1339b));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f16108e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2083a.c((Application) this.f16108e.getApplicationContext());
                    ComponentCallbacks2C2083a.b().a(new i(this));
                    if (!ComponentCallbacks2C2083a.b().e(true)) {
                        this.f16104a = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                    }
                }
                return true;
            case 7:
                h((O.e) message.obj);
                return true;
            case 9:
                if (this.f16113j.containsKey(message.obj)) {
                    ((n) this.f16113j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f16116m.iterator();
                while (it2.hasNext()) {
                    n nVar5 = (n) this.f16113j.remove((C1378b) it2.next());
                    if (nVar5 != null) {
                        nVar5.K();
                    }
                }
                this.f16116m.clear();
                return true;
            case 11:
                if (this.f16113j.containsKey(message.obj)) {
                    ((n) this.f16113j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f16113j.containsKey(message.obj)) {
                    ((n) this.f16113j.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 15:
                o oVar = (o) message.obj;
                Map map = this.f16113j;
                c1378b = oVar.f16153a;
                if (map.containsKey(c1378b)) {
                    Map map2 = this.f16113j;
                    c1378b2 = oVar.f16153a;
                    n.B((n) map2.get(c1378b2), oVar);
                }
                return true;
            case 16:
                o oVar2 = (o) message.obj;
                Map map3 = this.f16113j;
                c1378b3 = oVar2.f16153a;
                if (map3.containsKey(c1378b3)) {
                    Map map4 = this.f16113j;
                    c1378b4 = oVar2.f16153a;
                    n.C((n) map4.get(c1378b4), oVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f16170c == 0) {
                    i().a(new C1399t(sVar.f16169b, Arrays.asList(sVar.f16168a)));
                } else {
                    C1399t c1399t = this.f16106c;
                    if (c1399t != null) {
                        List u8 = c1399t.u();
                        if (c1399t.s() == sVar.f16169b && (u8 == null || u8.size() < sVar.f16171d)) {
                            this.f16106c.v(sVar.f16168a);
                        } else {
                            this.f16117n.removeMessages(17);
                            j();
                        }
                    }
                    if (this.f16106c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sVar.f16168a);
                        this.f16106c = new C1399t(sVar.f16169b, arrayList);
                        Handler handler2 = this.f16117n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), sVar.f16170c);
                    }
                }
                return true;
            case 19:
                this.f16105b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i8);
                return false;
        }
    }

    public final int l() {
        return this.f16111h.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n t(C1378b c1378b) {
        return (n) this.f16113j.get(c1378b);
    }
}
