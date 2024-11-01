package com.mbridge.msdk.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final c f20175a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20176b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20177c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20178d;

    /* renamed from: e, reason: collision with root package name */
    private final k f20179e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f20183i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f20180f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f20181g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f20182h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f20184j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f20185k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f20186l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f20187m = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final r f20190a;

        public b(Looper looper, r rVar) {
            super(looper);
            this.f20190a = rVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f20190a.f20179e.c() + " " + str + this.f20190a.f20181g.addAndGet(0) + " 数据库记录数：" + this.f20190a.f20175a.a());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e8) {
                if (com.mbridge.msdk.e.a.f19988a) {
                    Log.e("TrackManager", this.f20190a.f20179e.c() + " removeMessages failed ", e8);
                }
            }
            if (!this.f20190a.f()) {
                try {
                    sendMessageDelayed(Message.obtain(this, 1), y.a(this.f20190a.f20180f.get(), this.f20190a.f20185k, this.f20190a.f20177c));
                } catch (Exception e9) {
                    if (com.mbridge.msdk.e.a.f19988a) {
                        Log.e("TrackManager", this.f20190a.f20179e.c() + " sendMessageDelayed failed ", e9);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            e eVar;
            super.dispatchMessage(message);
            int i8 = message.what;
            if (i8 != 2 && i8 != 3) {
                if (i8 != 5) {
                    if (i8 != 6) {
                        if (i8 != 7) {
                            b();
                            if (com.mbridge.msdk.e.a.f19988a) {
                                a("触发上报（timer）当前 Event 数量：");
                            }
                            a();
                            return;
                        }
                        this.f20190a.c();
                        b();
                        if (com.mbridge.msdk.e.a.f19988a) {
                            a("触发上报（flush）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    Object obj = message.obj;
                    if (obj instanceof e) {
                        eVar = (e) obj;
                    } else {
                        eVar = null;
                    }
                    if (com.mbridge.msdk.e.a.f19988a && !y.a(eVar)) {
                        a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.a()));
                    }
                    if ((y.b(eVar) && eVar.c() == 1) || this.f20190a.e()) {
                        b();
                        if (com.mbridge.msdk.e.a.f19988a) {
                            a("触发上报（notice check）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.e.a.f19988a) {
                    a("触发删除 当前 Event 数量：");
                }
                r.a(this.f20190a);
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            b();
            if (com.mbridge.msdk.e.a.f19988a) {
                a("触发上报（report result）当前 Event 数量：");
            }
            a();
        }

        private synchronized void a() {
            try {
                r.e(this.f20190a);
            } catch (Exception e8) {
                if (com.mbridge.msdk.e.a.f19988a) {
                    Log.e("TrackManager", this.f20190a.f20179e.c() + " report failed ", e8);
                }
            }
        }
    }

    public r(k kVar) {
        this.f20175a = kVar.g();
        this.f20176b = kVar.l();
        this.f20177c = kVar.m();
        this.f20178d = kVar.n();
        this.f20179e = kVar;
    }

    static /* synthetic */ void i(r rVar) {
        rVar.f20180f.set(0);
    }

    static /* synthetic */ int j(r rVar) {
        return rVar.f20180f.getAndIncrement();
    }

    protected final boolean e() {
        return this.f20181g.addAndGet(0) >= this.f20176b;
    }

    static /* synthetic */ void e(r rVar) {
        List<i> a9 = rVar.f20175a.a(rVar.f20176b);
        if (y.a((List<?>) a9)) {
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.d("TrackManager", rVar.f20179e.c() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        rVar.f20175a.a(a9);
        int size = a9.size();
        rVar.f20181g.addAndGet(-size);
        boolean z8 = false;
        if (com.mbridge.msdk.e.a.f19988a) {
            Log.d("TrackManager", rVar.f20179e.c() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + rVar.f20181g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f20175a.a());
        }
        try {
            z8 = rVar.f20179e.p();
        } catch (IllegalStateException e8) {
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", rVar.f20179e.c() + " report environment check failed ", e8);
            }
        }
        if (!z8) {
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", rVar.f20179e.c() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        n q8 = rVar.f20179e.q();
        q8.a(new a(rVar.f20183i, rVar));
        Map<String, String> hashMap = new HashMap<>();
        try {
            hashMap = rVar.f20179e.j().a(rVar.f20179e.k(), a9, rVar.f20179e.f());
        } catch (Exception e9) {
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", rVar.f20179e.c() + " report decorate request params failed ", e9);
            }
        }
        q8.a(new s(a9), hashMap, y.b(a9));
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f20183i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f20183i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f20177c);
        this.f20184j = false;
    }

    public final void b() {
        this.f20183i.removeMessages(1);
        Handler handler = this.f20183i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public final void c() {
        synchronized (this.f20182h) {
            try {
                if (!this.f20186l) {
                    this.f20186l = true;
                    this.f20175a.c();
                }
                if (!this.f20187m) {
                    this.f20187m = true;
                    this.f20181g.addAndGet(this.f20175a.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f20181g.incrementAndGet();
    }

    final boolean f() {
        return this.f20184j;
    }

    static /* synthetic */ void b(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!y.a(iVar)) {
                boolean z8 = !iVar.b() && iVar.d() >= rVar.f20178d;
                boolean z9 = !iVar.a() && iVar.g() < System.currentTimeMillis();
                if (!z8 && !z9) {
                    iVar.a(iVar.d() + (y.a(rVar.f20179e.e()) ? 1 : 0));
                    iVar.b(3);
                    i8++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        rVar.f20175a.c((List<i>) list);
        rVar.f20181g.addAndGet(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f20188a;

        /* renamed from: b, reason: collision with root package name */
        private final r f20189b;

        public a(Handler handler, r rVar) {
            this.f20188a = handler;
            this.f20189b = rVar;
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar) {
            r.a(this.f20189b, sVar.a());
            r.i(this.f20189b);
            this.f20189b.f20185k = 0L;
            if (this.f20189b.e()) {
                Handler handler = this.f20188a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.d("TrackManager", this.f20189b.f20179e.c() + " report success " + sVar.a().size() + " 剩余事件数：" + this.f20189b.f20181g.addAndGet(0) + " 个，数据库记录数：" + this.f20189b.f20175a.a() + " 个");
            }
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar, int i8, String str) {
            r.b(this.f20189b, sVar.a());
            this.f20189b.f20185k = System.currentTimeMillis();
            int j8 = r.j(this.f20189b);
            if (j8 <= 10) {
                Handler handler = this.f20188a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), j8 * 1000);
            }
            if (com.mbridge.msdk.e.a.f19988a) {
                Log.d("TrackManager", this.f20189b.f20179e.c() + " report failed " + sVar.a().size() + " 剩余事件数：" + this.f20189b.f20181g.addAndGet(0) + " 个，数据库记录数：" + this.f20189b.f20175a.a() + " 个 连续失败次数： " + j8);
            }
        }
    }

    public final void a(e eVar) {
        Handler handler = this.f20183i;
        handler.sendMessage(Message.obtain(handler, 6, eVar));
    }

    static /* synthetic */ void a(r rVar) {
        if (com.mbridge.msdk.e.a.f19988a && com.mbridge.msdk.f.e.f20235b) {
            return;
        }
        int b9 = rVar.f20175a.b();
        if (com.mbridge.msdk.e.a.f19988a) {
            Log.d("TrackManager", rVar.f20179e.c() + " 删除无效数据的数量 = " + b9 + " 当前剩余事件数 = " + rVar.f20181g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f20175a.a());
        }
    }

    static /* synthetic */ void a(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        rVar.f20175a.b((List<i>) list);
    }
}
