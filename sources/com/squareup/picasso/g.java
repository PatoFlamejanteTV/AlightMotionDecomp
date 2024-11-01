package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import m2.InterfaceC3361a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final b f24496a;

    /* renamed from: b, reason: collision with root package name */
    final Context f24497b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f24498c;

    /* renamed from: d, reason: collision with root package name */
    final m2.c f24499d;

    /* renamed from: e, reason: collision with root package name */
    final Map f24500e;

    /* renamed from: f, reason: collision with root package name */
    final Map f24501f;

    /* renamed from: g, reason: collision with root package name */
    final Map f24502g;

    /* renamed from: h, reason: collision with root package name */
    final Set f24503h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f24504i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f24505j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC3361a f24506k;

    /* renamed from: l, reason: collision with root package name */
    final z f24507l;

    /* renamed from: m, reason: collision with root package name */
    final List f24508m;

    /* renamed from: n, reason: collision with root package name */
    final c f24509n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f24510o;

    /* renamed from: p, reason: collision with root package name */
    boolean f24511p;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final g f24512a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0443a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f24513a;

            RunnableC0443a(Message message) {
                this.f24513a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f24513a.what);
            }
        }

        a(Looper looper, g gVar) {
            super(looper);
            this.f24512a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z8 = false;
            switch (message.what) {
                case 1:
                    this.f24512a.v((AbstractC2596a) message.obj);
                    return;
                case 2:
                    this.f24512a.o((AbstractC2596a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    s.f24554o.post(new RunnableC0443a(message));
                    return;
                case 4:
                    this.f24512a.p((RunnableC2598c) message.obj);
                    return;
                case 5:
                    this.f24512a.u((RunnableC2598c) message.obj);
                    return;
                case 6:
                    this.f24512a.q((RunnableC2598c) message.obj, false);
                    return;
                case 7:
                    this.f24512a.n();
                    return;
                case 9:
                    this.f24512a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    g gVar = this.f24512a;
                    if (message.arg1 == 1) {
                        z8 = true;
                    }
                    gVar.m(z8);
                    return;
                case 11:
                    this.f24512a.s(message.obj);
                    return;
                case 12:
                    this.f24512a.t(message.obj);
                    return;
            }
        }
    }

    /* loaded from: classes4.dex */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* loaded from: classes4.dex */
    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final g f24515a;

        c(g gVar) {
            this.f24515a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f24515a.f24510o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f24515a.f24497b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra("state")) {
                    return;
                }
                this.f24515a.b(intent.getBooleanExtra("state", false));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f24515a.f(((ConnectivityManager) C.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, ExecutorService executorService, Handler handler, m2.c cVar, InterfaceC3361a interfaceC3361a, z zVar) {
        b bVar = new b();
        this.f24496a = bVar;
        bVar.start();
        C.i(bVar.getLooper());
        this.f24497b = context;
        this.f24498c = executorService;
        this.f24500e = new LinkedHashMap();
        this.f24501f = new WeakHashMap();
        this.f24502g = new WeakHashMap();
        this.f24503h = new LinkedHashSet();
        this.f24504i = new a(bVar.getLooper(), this);
        this.f24499d = cVar;
        this.f24505j = handler;
        this.f24506k = interfaceC3361a;
        this.f24507l = zVar;
        this.f24508m = new ArrayList(4);
        this.f24511p = C.q(context);
        this.f24510o = C.p(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar2 = new c(this);
        this.f24509n = cVar2;
        cVar2.a();
    }

    private void a(RunnableC2598c runnableC2598c) {
        if (runnableC2598c.u()) {
            return;
        }
        Bitmap bitmap = runnableC2598c.f24478m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f24508m.add(runnableC2598c);
        if (!this.f24504i.hasMessages(7)) {
            this.f24504i.sendEmptyMessageDelayed(7, 200L);
        }
    }

    private void i() {
        if (!this.f24501f.isEmpty()) {
            Iterator it = this.f24501f.values().iterator();
            while (it.hasNext()) {
                AbstractC2596a abstractC2596a = (AbstractC2596a) it.next();
                it.remove();
                if (abstractC2596a.g().f24568m) {
                    C.t("Dispatcher", "replaying", abstractC2596a.i().d());
                }
                w(abstractC2596a, false);
            }
        }
    }

    private void j(List list) {
        if (list != null && !list.isEmpty() && ((RunnableC2598c) list.get(0)).q().f24568m) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RunnableC2598c runnableC2598c = (RunnableC2598c) it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C.k(runnableC2598c));
            }
            C.t("Dispatcher", "delivered", sb.toString());
        }
    }

    private void k(AbstractC2596a abstractC2596a) {
        Object k8 = abstractC2596a.k();
        if (k8 != null) {
            abstractC2596a.f24455k = true;
            this.f24501f.put(k8, abstractC2596a);
        }
    }

    private void l(RunnableC2598c runnableC2598c) {
        AbstractC2596a h8 = runnableC2598c.h();
        if (h8 != null) {
            k(h8);
        }
        List i8 = runnableC2598c.i();
        if (i8 != null) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                k((AbstractC2596a) i8.get(i9));
            }
        }
    }

    void b(boolean z8) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(10, z8 ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AbstractC2596a abstractC2596a) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(2, abstractC2596a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RunnableC2598c runnableC2598c) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(4, runnableC2598c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RunnableC2598c runnableC2598c) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(6, runnableC2598c));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RunnableC2598c runnableC2598c) {
        Handler handler = this.f24504i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC2598c), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(AbstractC2596a abstractC2596a) {
        Handler handler = this.f24504i;
        handler.sendMessage(handler.obtainMessage(1, abstractC2596a));
    }

    void m(boolean z8) {
        this.f24511p = z8;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f24508m);
        this.f24508m.clear();
        Handler handler = this.f24505j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(AbstractC2596a abstractC2596a) {
        String d8 = abstractC2596a.d();
        RunnableC2598c runnableC2598c = (RunnableC2598c) this.f24500e.get(d8);
        if (runnableC2598c != null) {
            runnableC2598c.f(abstractC2596a);
            if (runnableC2598c.c()) {
                this.f24500e.remove(d8);
                if (abstractC2596a.g().f24568m) {
                    C.t("Dispatcher", "canceled", abstractC2596a.i().d());
                }
            }
        }
        if (this.f24503h.contains(abstractC2596a.j())) {
            this.f24502g.remove(abstractC2596a.k());
            if (abstractC2596a.g().f24568m) {
                C.u("Dispatcher", "canceled", abstractC2596a.i().d(), "because paused request got canceled");
            }
        }
        AbstractC2596a abstractC2596a2 = (AbstractC2596a) this.f24501f.remove(abstractC2596a.k());
        if (abstractC2596a2 != null && abstractC2596a2.g().f24568m) {
            C.u("Dispatcher", "canceled", abstractC2596a2.i().d(), "from replaying");
        }
    }

    void p(RunnableC2598c runnableC2598c) {
        if (o.b(runnableC2598c.p())) {
            this.f24506k.a(runnableC2598c.n(), runnableC2598c.s());
        }
        this.f24500e.remove(runnableC2598c.n());
        a(runnableC2598c);
        if (runnableC2598c.q().f24568m) {
            C.u("Dispatcher", "batched", C.k(runnableC2598c), "for completion");
        }
    }

    void q(RunnableC2598c runnableC2598c, boolean z8) {
        String str;
        if (runnableC2598c.q().f24568m) {
            String k8 = C.k(runnableC2598c);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z8) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            C.u("Dispatcher", "batched", k8, sb.toString());
        }
        this.f24500e.remove(runnableC2598c.n());
        a(runnableC2598c);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f24498c;
        if (executorService instanceof u) {
            ((u) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    void s(Object obj) {
        boolean z8;
        if (!this.f24503h.add(obj)) {
            return;
        }
        Iterator it = this.f24500e.values().iterator();
        while (it.hasNext()) {
            RunnableC2598c runnableC2598c = (RunnableC2598c) it.next();
            boolean z9 = runnableC2598c.q().f24568m;
            AbstractC2596a h8 = runnableC2598c.h();
            List i8 = runnableC2598c.i();
            if (i8 != null && !i8.isEmpty()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (h8 != null || z8) {
                if (h8 != null && h8.j().equals(obj)) {
                    runnableC2598c.f(h8);
                    this.f24502g.put(h8.k(), h8);
                    if (z9) {
                        C.u("Dispatcher", "paused", h8.f24446b.d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z8) {
                    for (int size = i8.size() - 1; size >= 0; size--) {
                        AbstractC2596a abstractC2596a = (AbstractC2596a) i8.get(size);
                        if (abstractC2596a.j().equals(obj)) {
                            runnableC2598c.f(abstractC2596a);
                            this.f24502g.put(abstractC2596a.k(), abstractC2596a);
                            if (z9) {
                                C.u("Dispatcher", "paused", abstractC2596a.f24446b.d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (runnableC2598c.c()) {
                    it.remove();
                    if (z9) {
                        C.u("Dispatcher", "canceled", C.k(runnableC2598c), "all actions paused");
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (!this.f24503h.remove(obj)) {
            return;
        }
        Iterator it = this.f24502g.values().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC2596a abstractC2596a = (AbstractC2596a) it.next();
            if (abstractC2596a.j().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractC2596a);
                it.remove();
            }
        }
        if (arrayList != null) {
            Handler handler = this.f24505j;
            handler.sendMessage(handler.obtainMessage(13, arrayList));
        }
    }

    void u(RunnableC2598c runnableC2598c) {
        NetworkInfo networkInfo;
        if (runnableC2598c.u()) {
            return;
        }
        boolean z8 = false;
        if (this.f24498c.isShutdown()) {
            q(runnableC2598c, false);
            return;
        }
        if (this.f24510o) {
            networkInfo = ((ConnectivityManager) C.o(this.f24497b, "connectivity")).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (runnableC2598c.w(this.f24511p, networkInfo)) {
            if (runnableC2598c.q().f24568m) {
                C.t("Dispatcher", "retrying", C.k(runnableC2598c));
            }
            if (runnableC2598c.k() instanceof q.a) {
                runnableC2598c.f24474i |= p.NO_CACHE.f24546a;
            }
            runnableC2598c.f24479n = this.f24498c.submit(runnableC2598c);
            return;
        }
        if (this.f24510o && runnableC2598c.x()) {
            z8 = true;
        }
        q(runnableC2598c, z8);
        if (z8) {
            l(runnableC2598c);
        }
    }

    void v(AbstractC2596a abstractC2596a) {
        w(abstractC2596a, true);
    }

    void w(AbstractC2596a abstractC2596a, boolean z8) {
        if (this.f24503h.contains(abstractC2596a.j())) {
            this.f24502g.put(abstractC2596a.k(), abstractC2596a);
            if (abstractC2596a.g().f24568m) {
                C.u("Dispatcher", "paused", abstractC2596a.f24446b.d(), "because tag '" + abstractC2596a.j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC2598c runnableC2598c = (RunnableC2598c) this.f24500e.get(abstractC2596a.d());
        if (runnableC2598c != null) {
            runnableC2598c.b(abstractC2596a);
            return;
        }
        if (this.f24498c.isShutdown()) {
            if (abstractC2596a.g().f24568m) {
                C.u("Dispatcher", "ignored", abstractC2596a.f24446b.d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC2598c g8 = RunnableC2598c.g(abstractC2596a.g(), this, this.f24506k, this.f24507l, abstractC2596a);
        g8.f24479n = this.f24498c.submit(g8);
        this.f24500e.put(abstractC2596a.d(), g8);
        if (z8) {
            this.f24501f.remove(abstractC2596a.k());
        }
        if (abstractC2596a.g().f24568m) {
            C.t("Dispatcher", "enqueued", abstractC2596a.f24446b.d());
        }
    }
}
