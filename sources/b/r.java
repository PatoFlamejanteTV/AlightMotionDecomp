package B;

import C.AbstractC0967k;
import C.InterfaceC0959c;
import C.InterfaceC0960d;
import D.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import s.C3936c;
import v.AbstractC4110f;
import v.AbstractC4111g;
import v.InterfaceC4109e;
import v.InterfaceC4117m;
import x.C4167a;
import x.C4169c;
import y.AbstractC4233a;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f340a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4109e f341b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0960d f342c;

    /* renamed from: d, reason: collision with root package name */
    private final x f343d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f344e;

    /* renamed from: f, reason: collision with root package name */
    private final D.b f345f;

    /* renamed from: g, reason: collision with root package name */
    private final E.a f346g;

    /* renamed from: h, reason: collision with root package name */
    private final E.a f347h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC0959c f348i;

    public r(Context context, InterfaceC4109e interfaceC4109e, InterfaceC0960d interfaceC0960d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC0959c interfaceC0959c) {
        this.f340a = context;
        this.f341b = interfaceC4109e;
        this.f342c = interfaceC0960d;
        this.f343d = xVar;
        this.f344e = executor;
        this.f345f = bVar;
        this.f346g = aVar;
        this.f347h = aVar2;
        this.f348i = interfaceC0959c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(u.p pVar) {
        return Boolean.valueOf(this.f342c.w(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(u.p pVar) {
        return this.f342c.n(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, u.p pVar, long j8) {
        this.f342c.D(iterable);
        this.f342c.s(pVar, this.f346g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f342c.e(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f348i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f348i.a(((Integer) r0.getValue()).intValue(), C4169c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(u.p pVar, long j8) {
        this.f342c.s(pVar, this.f346g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(u.p pVar, int i8) {
        this.f343d.b(pVar, i8 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final u.p pVar, final int i8, Runnable runnable) {
        try {
            try {
                D.b bVar = this.f345f;
                final InterfaceC0960d interfaceC0960d = this.f342c;
                Objects.requireNonNull(interfaceC0960d);
                bVar.g(new b.a() { // from class: B.i
                    @Override // D.b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC0960d.this.d());
                    }
                });
                if (!k()) {
                    this.f345f.g(new b.a() { // from class: B.j
                        @Override // D.b.a
                        public final Object execute() {
                            Object s8;
                            s8 = r.this.s(pVar, i8);
                            return s8;
                        }
                    });
                } else {
                    u(pVar, i8);
                }
            } catch (D.a unused) {
                this.f343d.b(pVar, i8 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public u.i j(InterfaceC4117m interfaceC4117m) {
        D.b bVar = this.f345f;
        final InterfaceC0959c interfaceC0959c = this.f348i;
        Objects.requireNonNull(interfaceC0959c);
        return interfaceC4117m.a(u.i.a().i(this.f346g.a()).o(this.f347h.a()).n("GDT_CLIENT_METRICS").h(new u.h(C3936c.b("proto"), ((C4167a) bVar.g(new b.a() { // from class: B.h
            @Override // D.b.a
            public final Object execute() {
                return InterfaceC0959c.this.h();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f340a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public AbstractC4111g u(final u.p pVar, int i8) {
        AbstractC4111g b9;
        InterfaceC4117m interfaceC4117m = this.f341b.get(pVar.b());
        long j8 = 0;
        AbstractC4111g e8 = AbstractC4111g.e(0L);
        while (true) {
            final long j9 = j8;
            while (((Boolean) this.f345f.g(new b.a() { // from class: B.k
                @Override // D.b.a
                public final Object execute() {
                    Boolean l8;
                    l8 = r.this.l(pVar);
                    return l8;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f345f.g(new b.a() { // from class: B.l
                    @Override // D.b.a
                    public final Object execute() {
                        Iterable m8;
                        m8 = r.this.m(pVar);
                        return m8;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e8;
                }
                if (interfaceC4117m == null) {
                    AbstractC4233a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b9 = AbstractC4111g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC0967k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(interfaceC4117m));
                    }
                    b9 = interfaceC4117m.b(AbstractC4110f.a().b(arrayList).c(pVar.c()).a());
                }
                e8 = b9;
                if (e8.c() == AbstractC4111g.a.TRANSIENT_ERROR) {
                    this.f345f.g(new b.a() { // from class: B.m
                        @Override // D.b.a
                        public final Object execute() {
                            Object n8;
                            n8 = r.this.n(iterable, pVar, j9);
                            return n8;
                        }
                    });
                    this.f343d.a(pVar, i8 + 1, true);
                    return e8;
                }
                this.f345f.g(new b.a() { // from class: B.n
                    @Override // D.b.a
                    public final Object execute() {
                        Object o8;
                        o8 = r.this.o(iterable);
                        return o8;
                    }
                });
                if (e8.c() == AbstractC4111g.a.OK) {
                    j8 = Math.max(j9, e8.b());
                    if (pVar.e()) {
                        this.f345f.g(new b.a() { // from class: B.o
                            @Override // D.b.a
                            public final Object execute() {
                                Object p8;
                                p8 = r.this.p();
                                return p8;
                            }
                        });
                    }
                } else if (e8.c() == AbstractC4111g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String n8 = ((AbstractC0967k) it2.next()).b().n();
                        if (!hashMap.containsKey(n8)) {
                            hashMap.put(n8, 1);
                        } else {
                            hashMap.put(n8, Integer.valueOf(((Integer) hashMap.get(n8)).intValue() + 1));
                        }
                    }
                    this.f345f.g(new b.a() { // from class: B.p
                        @Override // D.b.a
                        public final Object execute() {
                            Object q8;
                            q8 = r.this.q(hashMap);
                            return q8;
                        }
                    });
                }
            }
            this.f345f.g(new b.a() { // from class: B.q
                @Override // D.b.a
                public final Object execute() {
                    Object r8;
                    r8 = r.this.r(pVar, j9);
                    return r8;
                }
            });
            return e8;
        }
    }

    public void v(final u.p pVar, final int i8, final Runnable runnable) {
        this.f344e.execute(new Runnable() { // from class: B.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(pVar, i8, runnable);
            }
        });
    }
}
