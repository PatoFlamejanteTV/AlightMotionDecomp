package com.google.android.gms.common.api.internal;

import N.C1339b;
import N.C1341d;
import N.C1344g;
import O.a;
import O.f;
import P.C1378b;
import Q.AbstractC1394n;
import Q.AbstractC1396p;
import Q.G;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import q0.C3626l;

/* loaded from: classes3.dex */
public final class n implements f.a, f.b {

    /* renamed from: b */
    private final a.f f16141b;

    /* renamed from: k */
    private final C1378b f16142k;

    /* renamed from: l */
    private final g f16143l;

    /* renamed from: o */
    private final int f16146o;

    /* renamed from: p */
    private final P.y f16147p;

    /* renamed from: q */
    private boolean f16148q;

    /* renamed from: u */
    final /* synthetic */ C2085c f16152u;

    /* renamed from: a */
    private final Queue f16140a = new LinkedList();

    /* renamed from: m */
    private final Set f16144m = new HashSet();

    /* renamed from: n */
    private final Map f16145n = new HashMap();

    /* renamed from: r */
    private final List f16149r = new ArrayList();

    /* renamed from: s */
    private C1339b f16150s = null;

    /* renamed from: t */
    private int f16151t = 0;

    public n(C2085c c2085c, O.e eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f16152u = c2085c;
        handler = c2085c.f16117n;
        a.f o8 = eVar.o(handler.getLooper(), this);
        this.f16141b = o8;
        this.f16142k = eVar.i();
        this.f16143l = new g();
        this.f16146o = eVar.n();
        if (o8.o()) {
            context = c2085c.f16108e;
            handler2 = c2085c.f16117n;
            this.f16147p = eVar.p(context, handler2);
            return;
        }
        this.f16147p = null;
    }

    public static /* bridge */ /* synthetic */ void B(n nVar, o oVar) {
        if (nVar.f16149r.contains(oVar) && !nVar.f16148q) {
            if (!nVar.f16141b.h()) {
                nVar.E();
            } else {
                nVar.g();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(n nVar, o oVar) {
        Handler handler;
        Handler handler2;
        C1341d c1341d;
        C1341d[] g8;
        if (nVar.f16149r.remove(oVar)) {
            handler = nVar.f16152u.f16117n;
            handler.removeMessages(15, oVar);
            handler2 = nVar.f16152u.f16117n;
            handler2.removeMessages(16, oVar);
            c1341d = oVar.f16154b;
            ArrayList arrayList = new ArrayList(nVar.f16140a.size());
            for (y yVar : nVar.f16140a) {
                if ((yVar instanceof P.t) && (g8 = ((P.t) yVar).g(nVar)) != null && V.b.b(g8, c1341d)) {
                    arrayList.add(yVar);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                y yVar2 = (y) arrayList.get(i8);
                nVar.f16140a.remove(yVar2);
                yVar2.b(new O.k(c1341d));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C1341d c(C1341d[] c1341dArr) {
        if (c1341dArr != null && c1341dArr.length != 0) {
            C1341d[] l8 = this.f16141b.l();
            if (l8 == null) {
                l8 = new C1341d[0];
            }
            ArrayMap arrayMap = new ArrayMap(l8.length);
            for (C1341d c1341d : l8) {
                arrayMap.put(c1341d.s(), Long.valueOf(c1341d.u()));
            }
            for (C1341d c1341d2 : c1341dArr) {
                Long l9 = (Long) arrayMap.get(c1341d2.s());
                if (l9 == null || l9.longValue() < c1341d2.u()) {
                    return c1341d2;
                }
            }
        }
        return null;
    }

    private final void d(C1339b c1339b) {
        Iterator it = this.f16144m.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            if (AbstractC1394n.a(c1339b, C1339b.f6350e)) {
                this.f16141b.g();
            }
            throw null;
        }
        this.f16144m.clear();
    }

    public final void e(Status status) {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z8) {
        Handler handler;
        boolean z9;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        boolean z10 = true;
        if (status != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (exc != null) {
            z10 = false;
        }
        if (z9 != z10) {
            Iterator it = this.f16140a.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (!z8 || yVar.f16178a == 2) {
                    if (status != null) {
                        yVar.a(status);
                    } else {
                        yVar.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f16140a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            y yVar = (y) arrayList.get(i8);
            if (this.f16141b.h()) {
                if (p(yVar)) {
                    this.f16140a.remove(yVar);
                }
            } else {
                return;
            }
        }
    }

    public final void j() {
        D();
        d(C1339b.f6350e);
        o();
        Iterator it = this.f16145n.values().iterator();
        if (!it.hasNext()) {
            g();
            m();
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public final void l(int i8) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        G g8;
        D();
        this.f16148q = true;
        this.f16143l.e(i8, this.f16141b.n());
        C1378b c1378b = this.f16142k;
        C2085c c2085c = this.f16152u;
        handler = c2085c.f16117n;
        handler2 = c2085c.f16117n;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, c1378b), 5000L);
        C1378b c1378b2 = this.f16142k;
        C2085c c2085c2 = this.f16152u;
        handler3 = c2085c2.f16117n;
        handler4 = c2085c2.f16117n;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, c1378b2), 120000L);
        g8 = this.f16152u.f16110g;
        g8.c();
        Iterator it = this.f16145n.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    private final void m() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j8;
        C1378b c1378b = this.f16142k;
        handler = this.f16152u.f16117n;
        handler.removeMessages(12, c1378b);
        C1378b c1378b2 = this.f16142k;
        C2085c c2085c = this.f16152u;
        handler2 = c2085c.f16117n;
        handler3 = c2085c.f16117n;
        Message obtainMessage = handler3.obtainMessage(12, c1378b2);
        j8 = this.f16152u.f16104a;
        handler2.sendMessageDelayed(obtainMessage, j8);
    }

    private final void n(y yVar) {
        yVar.d(this.f16143l, a());
        try {
            yVar.c(this);
        } catch (DeadObjectException unused) {
            h(1);
            this.f16141b.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        Handler handler;
        Handler handler2;
        if (this.f16148q) {
            C2085c c2085c = this.f16152u;
            C1378b c1378b = this.f16142k;
            handler = c2085c.f16117n;
            handler.removeMessages(11, c1378b);
            C2085c c2085c2 = this.f16152u;
            C1378b c1378b2 = this.f16142k;
            handler2 = c2085c2.f16117n;
            handler2.removeMessages(9, c1378b2);
            this.f16148q = false;
        }
    }

    private final boolean p(y yVar) {
        boolean z8;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        if (!(yVar instanceof P.t)) {
            n(yVar);
            return true;
        }
        P.t tVar = (P.t) yVar;
        C1341d c8 = c(tVar.g(this));
        if (c8 == null) {
            n(yVar);
            return true;
        }
        Log.w("GoogleApiManager", this.f16141b.getClass().getName() + " could not execute call because it requires feature (" + c8.s() + ", " + c8.u() + ").");
        z8 = this.f16152u.f16118o;
        if (z8 && tVar.f(this)) {
            o oVar = new o(this.f16142k, c8, null);
            int indexOf = this.f16149r.indexOf(oVar);
            if (indexOf >= 0) {
                o oVar2 = (o) this.f16149r.get(indexOf);
                handler5 = this.f16152u.f16117n;
                handler5.removeMessages(15, oVar2);
                C2085c c2085c = this.f16152u;
                handler6 = c2085c.f16117n;
                handler7 = c2085c.f16117n;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, oVar2), 5000L);
                return false;
            }
            this.f16149r.add(oVar);
            C2085c c2085c2 = this.f16152u;
            handler = c2085c2.f16117n;
            handler2 = c2085c2.f16117n;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, oVar), 5000L);
            C2085c c2085c3 = this.f16152u;
            handler3 = c2085c3.f16117n;
            handler4 = c2085c3.f16117n;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, oVar), 120000L);
            C1339b c1339b = new C1339b(2, null);
            if (!q(c1339b)) {
                this.f16152u.f(c1339b, this.f16146o);
                return false;
            }
            return false;
        }
        tVar.b(new O.k(c8));
        return true;
    }

    private final boolean q(C1339b c1339b) {
        Object obj;
        h hVar;
        Set set;
        h hVar2;
        obj = C2085c.f16102r;
        synchronized (obj) {
            try {
                C2085c c2085c = this.f16152u;
                hVar = c2085c.f16114k;
                if (hVar != null) {
                    set = c2085c.f16115l;
                    if (set.contains(this.f16142k)) {
                        hVar2 = this.f16152u.f16114k;
                        hVar2.s(c1339b, this.f16146o);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean r(boolean z8) {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        if (this.f16141b.h() && this.f16145n.isEmpty()) {
            if (this.f16143l.g()) {
                if (z8) {
                    m();
                    return false;
                }
                return false;
            }
            this.f16141b.d("Timing out service connection.");
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ C1378b w(n nVar) {
        return nVar.f16142k;
    }

    public static /* bridge */ /* synthetic */ void y(n nVar, Status status) {
        nVar.e(status);
    }

    public final void D() {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        this.f16150s = null;
    }

    public final void E() {
        Handler handler;
        G g8;
        Context context;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        if (!this.f16141b.h() && !this.f16141b.f()) {
            try {
                C2085c c2085c = this.f16152u;
                g8 = c2085c.f16110g;
                context = c2085c.f16108e;
                int b9 = g8.b(context, this.f16141b);
                if (b9 != 0) {
                    C1339b c1339b = new C1339b(b9, null);
                    Log.w("GoogleApiManager", "The service for " + this.f16141b.getClass().getName() + " is not available: " + c1339b.toString());
                    H(c1339b, null);
                    return;
                }
                C2085c c2085c2 = this.f16152u;
                a.f fVar = this.f16141b;
                q qVar = new q(c2085c2, fVar, this.f16142k);
                if (fVar.o()) {
                    ((P.y) AbstractC1396p.l(this.f16147p)).v0(qVar);
                }
                try {
                    this.f16141b.j(qVar);
                } catch (SecurityException e8) {
                    H(new C1339b(10), e8);
                }
            } catch (IllegalStateException e9) {
                H(new C1339b(10), e9);
            }
        }
    }

    public final void F(y yVar) {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        if (this.f16141b.h()) {
            if (p(yVar)) {
                m();
                return;
            } else {
                this.f16140a.add(yVar);
                return;
            }
        }
        this.f16140a.add(yVar);
        C1339b c1339b = this.f16150s;
        if (c1339b != null && c1339b.y()) {
            H(this.f16150s, null);
        } else {
            E();
        }
    }

    public final void G() {
        this.f16151t++;
    }

    public final void H(C1339b c1339b, Exception exc) {
        Handler handler;
        G g8;
        boolean z8;
        Status g9;
        Status g10;
        Status g11;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        P.y yVar = this.f16147p;
        if (yVar != null) {
            yVar.w0();
        }
        D();
        g8 = this.f16152u.f16110g;
        g8.c();
        d(c1339b);
        if ((this.f16141b instanceof S.e) && c1339b.s() != 24) {
            this.f16152u.f16105b = true;
            C2085c c2085c = this.f16152u;
            handler5 = c2085c.f16117n;
            handler6 = c2085c.f16117n;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c1339b.s() == 4) {
            status = C2085c.f16101q;
            e(status);
            return;
        }
        if (this.f16140a.isEmpty()) {
            this.f16150s = c1339b;
            return;
        }
        if (exc != null) {
            handler4 = this.f16152u.f16117n;
            AbstractC1396p.d(handler4);
            f(null, exc, false);
            return;
        }
        z8 = this.f16152u.f16118o;
        if (z8) {
            g10 = C2085c.g(this.f16142k, c1339b);
            f(g10, null, true);
            if (!this.f16140a.isEmpty() && !q(c1339b) && !this.f16152u.f(c1339b, this.f16146o)) {
                if (c1339b.s() == 18) {
                    this.f16148q = true;
                }
                if (!this.f16148q) {
                    g11 = C2085c.g(this.f16142k, c1339b);
                    e(g11);
                    return;
                }
                C2085c c2085c2 = this.f16152u;
                C1378b c1378b = this.f16142k;
                handler2 = c2085c2.f16117n;
                handler3 = c2085c2.f16117n;
                handler2.sendMessageDelayed(Message.obtain(handler3, 9, c1378b), 5000L);
                return;
            }
            return;
        }
        g9 = C2085c.g(this.f16142k, c1339b);
        e(g9);
    }

    public final void I(C1339b c1339b) {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        a.f fVar = this.f16141b;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1339b));
        H(c1339b, null);
    }

    public final void J() {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        if (this.f16148q) {
            E();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        e(C2085c.f16100p);
        this.f16143l.f();
        for (P.f fVar : (P.f[]) this.f16145n.keySet().toArray(new P.f[0])) {
            F(new x(null, new C3626l()));
        }
        d(new C1339b(4));
        if (this.f16141b.h()) {
            this.f16141b.e(new m(this));
        }
    }

    public final void L() {
        Handler handler;
        C1344g c1344g;
        Context context;
        Status status;
        handler = this.f16152u.f16117n;
        AbstractC1396p.d(handler);
        if (this.f16148q) {
            o();
            C2085c c2085c = this.f16152u;
            c1344g = c2085c.f16109f;
            context = c2085c.f16108e;
            if (c1344g.g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            e(status);
            this.f16141b.d("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f16141b.o();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // P.InterfaceC1379c
    public final void h(int i8) {
        Handler handler;
        Handler handler2;
        C2085c c2085c = this.f16152u;
        Looper myLooper = Looper.myLooper();
        handler = c2085c.f16117n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f16152u.f16117n;
            handler2.post(new k(this, i8));
        } else {
            l(i8);
        }
    }

    @Override // P.h
    public final void i(C1339b c1339b) {
        H(c1339b, null);
    }

    @Override // P.InterfaceC1379c
    public final void k(Bundle bundle) {
        Handler handler;
        Handler handler2;
        C2085c c2085c = this.f16152u;
        Looper myLooper = Looper.myLooper();
        handler = c2085c.f16117n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f16152u.f16117n;
            handler2.post(new j(this));
        } else {
            j();
        }
    }

    public final int s() {
        return this.f16146o;
    }

    public final int t() {
        return this.f16151t;
    }

    public final a.f v() {
        return this.f16141b;
    }

    public final Map x() {
        return this.f16145n;
    }
}
