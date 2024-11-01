package D5;

import R5.AbstractC1428l;
import b.AbstractC1948c;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public Vector f1407A;

    /* renamed from: B, reason: collision with root package name */
    public Vector f1408B;

    /* renamed from: C, reason: collision with root package name */
    public Vector f1409C;

    /* renamed from: D, reason: collision with root package name */
    public Vector f1410D;

    /* renamed from: E, reason: collision with root package name */
    public Vector f1411E;

    /* renamed from: F, reason: collision with root package name */
    public Vector f1412F;

    /* renamed from: G, reason: collision with root package name */
    public j f1413G;

    /* renamed from: b, reason: collision with root package name */
    public long f1415b;

    /* renamed from: c, reason: collision with root package name */
    public long f1416c;

    /* renamed from: d, reason: collision with root package name */
    public ZonedDateTime f1417d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1419f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1420g;

    /* renamed from: j, reason: collision with root package name */
    public int f1423j;

    /* renamed from: o, reason: collision with root package name */
    public int f1428o;

    /* renamed from: p, reason: collision with root package name */
    public int f1429p;

    /* renamed from: z, reason: collision with root package name */
    public Vector f1439z;

    /* renamed from: a, reason: collision with root package name */
    public G6.e f1414a = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1418e = true;

    /* renamed from: h, reason: collision with root package name */
    public String f1421h = "AA";

    /* renamed from: i, reason: collision with root package name */
    public int f1422i = 2;

    /* renamed from: k, reason: collision with root package name */
    public int f1424k = 2;

    /* renamed from: l, reason: collision with root package name */
    public String f1425l = "EN";

    /* renamed from: m, reason: collision with root package name */
    public int f1426m = 10;

    /* renamed from: n, reason: collision with root package name */
    public int f1427n = 2021;

    /* renamed from: q, reason: collision with root package name */
    public Vector f1430q = new Vector(null, 1, null);

    /* renamed from: r, reason: collision with root package name */
    public Vector f1431r = new Vector(null, 1, null);

    /* renamed from: s, reason: collision with root package name */
    public Vector f1432s = new Vector(null, 1, null);

    /* renamed from: t, reason: collision with root package name */
    public Vector f1433t = new Vector(null, 1, null);

    /* renamed from: u, reason: collision with root package name */
    public Vector f1434u = new Vector(null, 1, null);

    /* renamed from: v, reason: collision with root package name */
    public Vector f1435v = new Vector(null, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public Vector f1436w = new Vector(null, 1, null);

    /* renamed from: x, reason: collision with root package name */
    public Vector f1437x = new Vector(null, 1, null);

    /* renamed from: y, reason: collision with root package name */
    public Vector f1438y = new Vector(null, 1, null);

    public s(G6.e eVar) {
        new LinkedHashSet();
        this.f1439z = new Vector(null, 1, null);
        this.f1407A = new Vector(null, 1, null);
        this.f1408B = new Vector(null, 1, null);
        this.f1409C = new Vector(null, 1, null);
        this.f1410D = new Vector(null, 1, null);
        this.f1411E = new Vector(null, 1, null);
        this.f1412F = new Vector(null, 1, null);
        this.f1413G = new j(this.f1414a, null, null, null, 14);
    }

    public static final boolean c(s sVar, G6.l lVar) {
        sVar.getClass();
        List list = Y7.d.f13152a.j().f4497b.f4464j;
        Set set = lVar.f3131e;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1948c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(s sVar, G6.l lVar) {
        sVar.getClass();
        List list = Y7.d.f13152a.j().f4497b.f4462h;
        Set set = lVar.f3130d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1948c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(s sVar, G6.l lVar) {
        sVar.getClass();
        List list = Y7.d.f13152a.j().f4497b.f4466l;
        Set set = lVar.f3133g;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1948c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a() {
        return this.f1426m;
    }

    public final void b(String value) {
        String str;
        AbstractC3292y.i(value, "value");
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3292y.h(iSOCountries, "getISOCountries()");
        Locale locale = Locale.getDefault();
        AbstractC3292y.h(locale, "getDefault()");
        String upperCase = value.toUpperCase(locale);
        AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (AbstractC1428l.W(iSOCountries, upperCase)) {
            Locale locale2 = Locale.getDefault();
            AbstractC3292y.h(locale2, "getDefault()");
            String upperCase2 = value.toUpperCase(locale2);
            AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            this.f1421h = upperCase2;
            return;
        }
        u uVar = new u("publisherCountryCode", value, "");
        A5.b bVar = A5.b.f238a;
        ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
        AbstractC3292y.h("f.s", "TAG");
        String message = uVar.getMessage();
        if (message == null) {
            str = "";
        } else {
            str = message;
        }
        bVar.b(choiceError, "f.s", str, A5.c.CONSOLE_AND_CALLBACK, uVar);
    }

    public final int d() {
        return this.f1427n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3292y.d(this.f1414a, ((s) obj).f1414a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        Integer num;
        G6.e eVar = this.f1414a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f3113c;
        }
        if (num == null) {
            return this.f1424k;
        }
        return num.intValue();
    }

    public final Vector h() {
        return this.f1435v;
    }

    public int hashCode() {
        G6.e eVar = this.f1414a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String i() {
        return this.f1421h;
    }

    public final Vector j() {
        return this.f1437x;
    }

    public final Vector k() {
        return this.f1438y;
    }

    public final Vector l() {
        return this.f1436w;
    }

    public final j m() {
        return this.f1413G;
    }

    public final Vector n() {
        return this.f1431r;
    }

    public final Vector o() {
        return this.f1432s;
    }

    public final boolean p() {
        return this.f1420g;
    }

    public final Vector q() {
        return this.f1430q;
    }

    public final boolean r() {
        return this.f1419f;
    }

    public final Vector s() {
        return this.f1439z;
    }

    public final Vector t() {
        return this.f1409C;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TCModel(gvl=");
        a9.append(this.f1414a);
        a9.append(')');
        return a9.toString();
    }

    public final Vector u() {
        return this.f1412F;
    }

    public final Vector v() {
        return this.f1411E;
    }

    public final boolean w() {
        return this.f1418e;
    }

    public final void x() {
        this.f1408B.setAllOwnedItems();
        this.f1439z.forEach(new o(this));
        this.f1431r.setAllOwnedItems();
        this.f1432s.setAllOwnedItems();
        this.f1430q.setAllOwnedItems();
        this.f1409C.forEach(new p(this));
        this.f1407A.forEach(new n(this));
        this.f1410D.setAllOwnedItems();
    }
}
