package J1;

import C1.n;
import G1.a;
import I1.f;
import I1.h;
import J1.b;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements a.InterfaceC0041a {

    /* renamed from: i, reason: collision with root package name */
    private static a f4008i = new a();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f4009j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f4010k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f4011l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f4012m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f4014b;

    /* renamed from: h, reason: collision with root package name */
    private long f4020h;

    /* renamed from: a, reason: collision with root package name */
    private List f4013a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f4015c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f4016d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private J1.b f4018f = new J1.b();

    /* renamed from: e, reason: collision with root package name */
    private G1.b f4017e = new G1.b();

    /* renamed from: g, reason: collision with root package name */
    private J1.c f4019g = new J1.c(new K1.c());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0071a implements Runnable {
        RunnableC0071a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f4019g.c();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.p().u();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f4010k != null) {
                a.f4010k.post(a.f4011l);
                a.f4010k.postDelayed(a.f4012m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j8) {
        if (this.f4013a.size() > 0) {
            Iterator it = this.f4013a.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j8);
                throw null;
            }
        }
    }

    private void e(View view, G1.a aVar, JSONObject jSONObject, d dVar, boolean z8) {
        boolean z9;
        if (dVar == d.PARENT_VIEW) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(view, jSONObject, this, z9, z8);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        G1.a b9 = this.f4017e.b();
        String g8 = this.f4018f.g(str);
        if (g8 != null) {
            JSONObject a9 = b9.a(view);
            I1.c.h(a9, str);
            I1.c.n(a9, g8);
            I1.c.j(jSONObject, a9);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        b.a i8 = this.f4018f.i(view);
        if (i8 != null) {
            I1.c.f(jSONObject, i8);
            return true;
        }
        return false;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String k8 = this.f4018f.k(view);
        if (k8 != null) {
            I1.c.h(jSONObject, k8);
            I1.c.g(jSONObject, Boolean.valueOf(this.f4018f.o(view)));
            this.f4018f.l();
            return true;
        }
        return false;
    }

    private void l() {
        d(f.b() - this.f4020h);
    }

    private void m() {
        this.f4014b = 0;
        this.f4016d.clear();
        this.f4015c = false;
        Iterator it = F1.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((n) it.next()).s()) {
                this.f4015c = true;
                break;
            }
        }
        this.f4020h = f.b();
    }

    public static a p() {
        return f4008i;
    }

    private void r() {
        if (f4010k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f4010k = handler;
            handler.post(f4011l);
            f4010k.postDelayed(f4012m, 200L);
        }
    }

    private void t() {
        Handler handler = f4010k;
        if (handler != null) {
            handler.removeCallbacks(f4012m);
            f4010k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
    }

    @Override // G1.a.InterfaceC0041a
    public void a(View view, G1.a aVar, JSONObject jSONObject, boolean z8) {
        d m8;
        boolean z9;
        if (!h.d(view) || (m8 = this.f4018f.m(view)) == d.UNDERLYING_VIEW) {
            return;
        }
        JSONObject a9 = aVar.a(view);
        I1.c.j(jSONObject, a9);
        if (!j(view, a9)) {
            boolean g8 = g(view, a9);
            if (!z8 && !g8) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (this.f4015c && m8 == d.OBSTRUCTION_VIEW && !z9) {
                this.f4016d.add(new L1.a(view));
            }
            e(view, aVar, a9, m8, z9);
        }
        this.f4014b++;
    }

    void n() {
        this.f4018f.n();
        long b9 = f.b();
        G1.a a9 = this.f4017e.a();
        if (this.f4018f.h().size() > 0) {
            Iterator it = this.f4018f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a10 = a9.a(null);
                f(str, this.f4018f.a(str), a10);
                I1.c.m(a10);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f4019g.b(a10, hashSet, b9);
            }
        }
        if (this.f4018f.j().size() > 0) {
            JSONObject a11 = a9.a(null);
            e(null, a9, a11, d.PARENT_VIEW, false);
            I1.c.m(a11);
            this.f4019g.d(a11, this.f4018f.j(), b9);
            if (this.f4015c) {
                Iterator it2 = F1.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((n) it2.next()).k(this.f4016d);
                }
            }
        } else {
            this.f4019g.c();
        }
        this.f4018f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f4013a.clear();
        f4009j.post(new RunnableC0071a());
    }
}
