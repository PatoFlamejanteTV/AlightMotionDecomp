package c3;

import Q5.r;
import Q5.x;
import R5.Q;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.w;
import java.util.LinkedHashMap;
import java.util.Map;
import n4.AbstractC3413a;
import r4.G;
import r4.P;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2023c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2023c f15459a = new C2023c();

    private C2023c() {
    }

    public final Map a(w.c cVar, p pVar, q qVar) {
        Map h8;
        Map h9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        w.a a9;
        w.a a10;
        w.a a11;
        w.a a12;
        w.a a13;
        w.a a14;
        if (pVar == null || (h8 = AbstractC3413a.c(pVar.B())) == null) {
            h8 = Q.h();
        }
        if (qVar != null) {
            Map c8 = AbstractC3413a.c(qVar.B());
            h9 = new LinkedHashMap(Q.d(c8.size()));
            for (Map.Entry entry : c8.entrySet()) {
                h9.put(G.g0((G) entry.getKey(), null, false, P.b.f38108a, 3, null), entry.getValue());
            }
        } else {
            h9 = Q.h();
        }
        G.b bVar = G.Companion;
        G r8 = bVar.r();
        String str9 = null;
        if (cVar != null) {
            str = cVar.f();
        } else {
            str = null;
        }
        r a15 = x.a(r8, str);
        G n8 = bVar.n();
        if (cVar != null) {
            str2 = cVar.b();
        } else {
            str2 = null;
        }
        r a16 = x.a(n8, str2);
        G t8 = bVar.t();
        if (cVar != null) {
            str3 = cVar.h();
        } else {
            str3 = null;
        }
        r a17 = x.a(t8, str3);
        G p8 = bVar.p();
        if (cVar != null && (a14 = cVar.a()) != null) {
            str4 = a14.f();
        } else {
            str4 = null;
        }
        r a18 = x.a(p8, str4);
        G q8 = bVar.q();
        if (cVar != null && (a13 = cVar.a()) != null) {
            str5 = a13.h();
        } else {
            str5 = null;
        }
        r a19 = x.a(q8, str5);
        G k8 = bVar.k();
        if (cVar != null && (a12 = cVar.a()) != null) {
            str6 = a12.a();
        } else {
            str6 = null;
        }
        r a20 = x.a(k8, str6);
        G z8 = bVar.z();
        if (cVar != null && (a11 = cVar.a()) != null) {
            str7 = a11.l();
        } else {
            str7 = null;
        }
        r a21 = x.a(z8, str7);
        G l8 = bVar.l();
        if (cVar != null && (a10 = cVar.a()) != null) {
            str8 = a10.b();
        } else {
            str8 = null;
        }
        r a22 = x.a(l8, str8);
        G u8 = bVar.u();
        if (cVar != null && (a9 = cVar.a()) != null) {
            str9 = a9.i();
        }
        return Q.q(Q.q(Q.k(a15, a16, a17, a18, a19, a20, a21, a22, x.a(u8, str9)), h8), h9);
    }
}
