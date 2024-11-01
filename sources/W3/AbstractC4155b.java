package w3;

import Q5.r;
import Q5.x;
import R5.Q;
import com.stripe.android.model.a;
import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.w;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4155b {
    public static final b.d a(C4154a c4154a) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC3292y.i(c4154a, "<this>");
        String b9 = c4154a.b();
        if (b9 == null) {
            b9 = "";
        }
        String str6 = b9;
        a.C0496a c0496a = new a.C0496a();
        w.a a9 = c4154a.a();
        String str7 = null;
        if (a9 != null) {
            str = a9.f();
        } else {
            str = null;
        }
        a.C0496a e8 = c0496a.e(str);
        w.a a10 = c4154a.a();
        if (a10 != null) {
            str2 = a10.h();
        } else {
            str2 = null;
        }
        a.C0496a f8 = e8.f(str2);
        w.a a11 = c4154a.a();
        if (a11 != null) {
            str3 = a11.a();
        } else {
            str3 = null;
        }
        a.C0496a b10 = f8.b(str3);
        w.a a12 = c4154a.a();
        if (a12 != null) {
            str4 = a12.l();
        } else {
            str4 = null;
        }
        a.C0496a h8 = b10.h(str4);
        w.a a13 = c4154a.a();
        if (a13 != null) {
            str5 = a13.b();
        } else {
            str5 = null;
        }
        a.C0496a c8 = h8.c(str5);
        w.a a14 = c4154a.a();
        if (a14 != null) {
            str7 = a14.i();
        }
        return new b.d(c8.g(str7).a(), str6, null, c4154a.f(), null, 20, null);
    }

    public static final Map b(C4154a c4154a, w.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC3292y.i(c4154a, "<this>");
        if (cVar != null && cVar.i()) {
            return Q.h();
        }
        G.b bVar = G.Companion;
        r a9 = x.a(bVar.r(), c4154a.b());
        G p8 = bVar.p();
        w.a a10 = c4154a.a();
        Map map = null;
        if (a10 != null) {
            str = a10.f();
        } else {
            str = null;
        }
        r a11 = x.a(p8, str);
        G q8 = bVar.q();
        w.a a12 = c4154a.a();
        if (a12 != null) {
            str2 = a12.h();
        } else {
            str2 = null;
        }
        r a13 = x.a(q8, str2);
        G k8 = bVar.k();
        w.a a14 = c4154a.a();
        if (a14 != null) {
            str3 = a14.a();
        } else {
            str3 = null;
        }
        r a15 = x.a(k8, str3);
        G z8 = bVar.z();
        w.a a16 = c4154a.a();
        if (a16 != null) {
            str4 = a16.l();
        } else {
            str4 = null;
        }
        r a17 = x.a(z8, str4);
        G u8 = bVar.u();
        w.a a18 = c4154a.a();
        if (a18 != null) {
            str5 = a18.i();
        } else {
            str5 = null;
        }
        r a19 = x.a(u8, str5);
        G l8 = bVar.l();
        w.a a20 = c4154a.a();
        if (a20 != null) {
            str6 = a20.b();
        } else {
            str6 = null;
        }
        Map k9 = Q.k(a9, a11, a13, a15, a17, a19, x.a(l8, str6), x.a(bVar.t(), c4154a.f()));
        G w8 = bVar.w();
        Boolean h8 = c4154a.h();
        if (h8 != null) {
            str7 = h8.toString();
        } else {
            str7 = null;
        }
        Map e8 = Q.e(x.a(w8, str7));
        if (c4154a.h() != null) {
            map = e8;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k9, map);
    }

    public static /* synthetic */ Map c(C4154a c4154a, w.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = null;
        }
        return b(c4154a, cVar);
    }
}
