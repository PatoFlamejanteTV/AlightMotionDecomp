package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.AbstractC2596a;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import m2.InterfaceC3361a;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f24554o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile s f24555p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f24556a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24557b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24558c;

    /* renamed from: d, reason: collision with root package name */
    final Context f24559d;

    /* renamed from: e, reason: collision with root package name */
    final com.squareup.picasso.g f24560e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC3361a f24561f;

    /* renamed from: g, reason: collision with root package name */
    final z f24562g;

    /* renamed from: h, reason: collision with root package name */
    final Map f24563h;

    /* renamed from: i, reason: collision with root package name */
    final Map f24564i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f24565j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f24566k;

    /* renamed from: l, reason: collision with root package name */
    boolean f24567l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f24568m;

    /* renamed from: n, reason: collision with root package name */
    boolean f24569n;

    /* loaded from: classes4.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 3) {
                int i9 = 0;
                if (i8 != 8) {
                    if (i8 == 13) {
                        List list = (List) message.obj;
                        int size = list.size();
                        while (i9 < size) {
                            AbstractC2596a abstractC2596a = (AbstractC2596a) list.get(i9);
                            abstractC2596a.f24445a.n(abstractC2596a);
                            i9++;
                        }
                        return;
                    }
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i9 < size2) {
                    RunnableC2598c runnableC2598c = (RunnableC2598c) list2.get(i9);
                    runnableC2598c.f24467b.d(runnableC2598c);
                    i9++;
                }
                return;
            }
            AbstractC2596a abstractC2596a2 = (AbstractC2596a) message.obj;
            if (abstractC2596a2.g().f24568m) {
                C.u("Main", "canceled", abstractC2596a2.f24446b.d(), "target got garbage collected");
            }
            abstractC2596a2.f24445a.a(abstractC2596a2.k());
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f24570a;

        /* renamed from: b, reason: collision with root package name */
        private m2.c f24571b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f24572c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3361a f24573d;

        /* renamed from: e, reason: collision with root package name */
        private g f24574e;

        /* renamed from: f, reason: collision with root package name */
        private List f24575f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f24576g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24577h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24578i;

        public b(Context context) {
            if (context != null) {
                this.f24570a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s a() {
            Context context = this.f24570a;
            if (this.f24571b == null) {
                this.f24571b = new r(context);
            }
            if (this.f24573d == null) {
                this.f24573d = new l(context);
            }
            if (this.f24572c == null) {
                this.f24572c = new u();
            }
            if (this.f24574e == null) {
                this.f24574e = g.f24592a;
            }
            z zVar = new z(this.f24573d);
            return new s(context, new com.squareup.picasso.g(context, this.f24572c, s.f24554o, this.f24571b, this.f24573d, zVar), this.f24573d, null, this.f24574e, this.f24575f, zVar, this.f24576g, this.f24577h, this.f24578i);
        }
    }

    /* loaded from: classes4.dex */
    private static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f24579a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f24580b;

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f24581a;

            a(Exception exc) {
                this.f24581a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f24581a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f24579a = referenceQueue;
            this.f24580b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC2596a.C0441a c0441a = (AbstractC2596a.C0441a) this.f24579a.remove(1000L);
                    Message obtainMessage = this.f24580b.obtainMessage();
                    if (c0441a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0441a.f24457a;
                        this.f24580b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.f24580b.post(new a(e8));
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    /* loaded from: classes4.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);


        /* renamed from: a, reason: collision with root package name */
        final int f24587a;

        e(int i8) {
            this.f24587a = i8;
        }
    }

    /* loaded from: classes4.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes4.dex */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f24592a = new a();

        /* loaded from: classes4.dex */
        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.s.g
            public v a(v vVar) {
                return vVar;
            }
        }

        v a(v vVar);
    }

    s(Context context, com.squareup.picasso.g gVar, InterfaceC3361a interfaceC3361a, d dVar, g gVar2, List list, z zVar, Bitmap.Config config, boolean z8, boolean z9) {
        int i8;
        this.f24559d = context;
        this.f24560e = gVar;
        this.f24561f = interfaceC3361a;
        this.f24556a = gVar2;
        this.f24566k = config;
        if (list != null) {
            i8 = list.size();
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList(i8 + 7);
        arrayList.add(new y(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new n(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new C2597b(context));
        arrayList.add(new i(context));
        arrayList.add(new q(gVar.f24499d, zVar));
        this.f24558c = DesugarCollections.unmodifiableList(arrayList);
        this.f24562g = zVar;
        this.f24563h = new WeakHashMap();
        this.f24564i = new WeakHashMap();
        this.f24567l = z8;
        this.f24568m = z9;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f24565j = referenceQueue;
        c cVar = new c(referenceQueue, f24554o);
        this.f24557b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, AbstractC2596a abstractC2596a, Exception exc) {
        if (abstractC2596a.l()) {
            return;
        }
        if (!abstractC2596a.m()) {
            this.f24563h.remove(abstractC2596a.k());
        }
        if (bitmap != null) {
            if (eVar != null) {
                abstractC2596a.b(bitmap, eVar);
                if (this.f24568m) {
                    C.u("Main", "completed", abstractC2596a.f24446b.d(), "from " + eVar);
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC2596a.c(exc);
        if (this.f24568m) {
            C.u("Main", "errored", abstractC2596a.f24446b.d(), exc.getMessage());
        }
    }

    public static s h() {
        if (f24555p == null) {
            synchronized (s.class) {
                try {
                    if (f24555p == null) {
                        Context context = PicassoProvider.f24444a;
                        if (context != null) {
                            f24555p = new b(context).a();
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } finally {
                }
            }
        }
        return f24555p;
    }

    void a(Object obj) {
        C.c();
        AbstractC2596a abstractC2596a = (AbstractC2596a) this.f24563h.remove(obj);
        if (abstractC2596a != null) {
            abstractC2596a.a();
            this.f24560e.c(abstractC2596a);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) this.f24564i.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void c(A a9) {
        if (a9 != null) {
            a(a9);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    void d(RunnableC2598c runnableC2598c) {
        boolean z8;
        AbstractC2596a h8 = runnableC2598c.h();
        List i8 = runnableC2598c.i();
        if (i8 != null && !i8.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (h8 == null && !z8) {
            return;
        }
        Uri uri = runnableC2598c.j().f24606d;
        Exception k8 = runnableC2598c.k();
        Bitmap s8 = runnableC2598c.s();
        e o8 = runnableC2598c.o();
        if (h8 != null) {
            f(s8, o8, h8, k8);
        }
        if (z8) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                f(s8, o8, (AbstractC2596a) i8.get(i9), k8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ImageView imageView, com.squareup.picasso.f fVar) {
        if (this.f24564i.containsKey(imageView)) {
            a(imageView);
        }
        this.f24564i.put(imageView, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(AbstractC2596a abstractC2596a) {
        Object k8 = abstractC2596a.k();
        if (k8 != null && this.f24563h.get(k8) != abstractC2596a) {
            a(k8);
            this.f24563h.put(k8, abstractC2596a);
        }
        o(abstractC2596a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f24558c;
    }

    public w j(int i8) {
        if (i8 != 0) {
            return new w(this, null, i8);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public w k(Uri uri) {
        return new w(this, uri, 0);
    }

    public w l(String str) {
        if (str == null) {
            return new w(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap m(String str) {
        Bitmap bitmap = this.f24561f.get(str);
        if (bitmap != null) {
            this.f24562g.d();
        } else {
            this.f24562g.e();
        }
        return bitmap;
    }

    void n(AbstractC2596a abstractC2596a) {
        Bitmap bitmap;
        if (o.a(abstractC2596a.f24449e)) {
            bitmap = m(abstractC2596a.d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            e eVar = e.MEMORY;
            f(bitmap, eVar, abstractC2596a, null);
            if (this.f24568m) {
                C.u("Main", "completed", abstractC2596a.f24446b.d(), "from " + eVar);
                return;
            }
            return;
        }
        g(abstractC2596a);
        if (this.f24568m) {
            C.t("Main", "resumed", abstractC2596a.f24446b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AbstractC2596a abstractC2596a) {
        this.f24560e.h(abstractC2596a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v p(v vVar) {
        v a9 = this.f24556a.a(vVar);
        if (a9 != null) {
            return a9;
        }
        throw new IllegalStateException("Request transformer " + this.f24556a.getClass().getCanonicalName() + " returned null for " + vVar);
    }
}
