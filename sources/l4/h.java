package l4;

import R5.AbstractC1435t;
import R5.a0;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stripe.android.model.a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import l4.g;
import l6.n;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f34722a = a0.i("BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE");

    public static final C3327a a(C3327a c3327a) {
        String g8;
        AbstractC3292y.i(c3327a, "<this>");
        C3327a b9 = C3327a.b(c3327a, null, null, null, null, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
        if (c3327a.g() != null) {
            if (c3327a.d() != null) {
                g8 = c3327a.d() + ", " + c3327a.g();
            } else {
                g8 = c3327a.g();
            }
            b9.k(g8);
        }
        return b9;
    }

    public static final String b(Context context, c addressLine1, C3327a address) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(addressLine1, "addressLine1");
        AbstractC3292y.i(address, "address");
        String b9 = addressLine1.b();
        if (b9 == null) {
            b9 = "";
        }
        String a9 = addressLine1.a();
        if (a9 == null) {
            a9 = "";
        }
        String h8 = address.h();
        String f8 = address.f();
        if (AbstractC3292y.d(f8, "JP")) {
            return c(context, addressLine1, h8, address.d());
        }
        if (!(!n.T(b9)) && !(!n.T(a9))) {
            return "";
        }
        if (AbstractC1435t.d0(f34722a, f8)) {
            return n.M0(a9 + " " + b9).toString();
        }
        return n.M0(b9 + " " + a9).toString();
    }

    public static final String c(Context context, c addressLine1, String str, String str2) {
        boolean z8;
        Locale locale;
        LocaleList locales;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(addressLine1, "addressLine1");
        if (addressLine1.c() != null && addressLine1.d() != null && addressLine1.e() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String d8 = addressLine1.d();
        String e8 = addressLine1.e();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String c8 = addressLine1.c();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        if (AbstractC3292y.d(locale, Locale.JAPANESE)) {
            if (z8) {
                str3 = d8 + e8 + "-" + str2;
            }
            return str + c8 + str3;
        }
        if (z8) {
            str3 = d8 + "-" + e8 + "-" + str2;
        }
        return str3 + " " + c8 + " " + str;
    }

    public static final b d(g gVar, g.c type) {
        AbstractC3292y.i(gVar, "<this>");
        AbstractC3292y.i(type, "type");
        List b9 = gVar.b();
        Object obj = null;
        if (b9 == null) {
            return null;
        }
        Iterator it = b9.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((b) next).d().contains(type.b())) {
                obj = next;
                break;
            }
        }
        return (b) obj;
    }

    public static final C3327a e(C3327a c3327a, g place) {
        String str;
        String str2;
        AbstractC3292y.i(c3327a, "<this>");
        AbstractC3292y.i(place, "place");
        b d8 = d(place, g.c.f34703c);
        if (d8 != null) {
            str = d8.c();
        } else {
            str = null;
        }
        b d9 = d(place, g.c.f34702b);
        if (d9 != null) {
            str2 = d9.b();
        } else {
            str2 = null;
        }
        C3327a b9 = C3327a.b(c3327a, null, null, null, null, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
        String f8 = c3327a.f();
        if (f8 != null) {
            int hashCode = f8.hashCode();
            if (hashCode != 2128) {
                if (hashCode != 2222) {
                    if (hashCode != 2332) {
                        if (hashCode != 2347) {
                            if (hashCode != 2374) {
                                if (hashCode != 2552) {
                                    if (hashCode != 2686) {
                                        if (hashCode != 2855) {
                                            if (hashCode != 2475) {
                                                if (hashCode != 2476 || !f8.equals("MY")) {
                                                    return b9;
                                                }
                                            } else if (!f8.equals("MX")) {
                                                return b9;
                                            }
                                        } else if (!f8.equals("ZA")) {
                                            return b9;
                                        }
                                    } else if (!f8.equals("TR")) {
                                        return b9;
                                    }
                                } else if (!f8.equals("PH")) {
                                    return b9;
                                }
                                return a(b9);
                            }
                            if (f8.equals("JP")) {
                                b9.k(null);
                                return b9;
                            }
                            return b9;
                        }
                        if (!f8.equals("IT")) {
                            return b9;
                        }
                    } else {
                        if (f8.equals("IE") && str2 != null) {
                            b9.l(str2);
                            return a(b9);
                        }
                        return b9;
                    }
                } else if (!f8.equals("ES")) {
                    return b9;
                }
                if (str != null) {
                    b9.l(str);
                    return b9;
                }
                return b9;
            }
            if (!f8.equals("BR")) {
                return b9;
            }
            if (c3327a.h() == null && str != null) {
                b9.o(str);
            }
            return a(b9);
        }
        return b9;
    }

    public static final com.stripe.android.model.a f(g gVar, Context context) {
        boolean d8;
        AbstractC3292y.i(gVar, "<this>");
        AbstractC3292y.i(context, "context");
        C3327a c3327a = new C3327a(null, null, null, null, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
        c cVar = new c(null, null, null, null, null, 31, null);
        List<b> b9 = gVar.b();
        if (b9 != null) {
            for (b bVar : b9) {
                String str = (String) bVar.d().get(0);
                if (AbstractC3292y.d(str, g.c.f34713m.b())) {
                    cVar.g(bVar.b());
                } else if (AbstractC3292y.d(str, g.c.f34712l.b())) {
                    cVar.f(bVar.b());
                } else if (AbstractC3292y.d(str, g.c.f34711k.b())) {
                    c3327a.k(bVar.b());
                } else {
                    boolean z8 = true;
                    if (AbstractC3292y.d(str, g.c.f34707g.b())) {
                        d8 = true;
                    } else {
                        d8 = AbstractC3292y.d(str, g.c.f34714n.b());
                    }
                    if (!d8) {
                        z8 = AbstractC3292y.d(str, g.c.f34709i.b());
                    }
                    if (z8) {
                        c3327a.o(bVar.b());
                    } else if (AbstractC3292y.d(str, g.c.f34702b.b())) {
                        c3327a.l(bVar.c());
                    } else if (AbstractC3292y.d(str, g.c.f34704d.b())) {
                        if (c3327a.h() == null) {
                            c3327a.o(bVar.b());
                        }
                    } else if (AbstractC3292y.d(str, g.c.f34703c.b())) {
                        if (c3327a.e() == null && c3327a.g() == null) {
                            c3327a.n(bVar.b());
                        } else {
                            c3327a.l(bVar.c());
                        }
                    } else if (AbstractC3292y.d(str, g.c.f34708h.b())) {
                        if (c3327a.h() == null) {
                            c3327a.o(bVar.b());
                        } else {
                            c3327a.n(bVar.b());
                        }
                    } else if (AbstractC3292y.d(str, g.c.f34710j.b())) {
                        c3327a.p(bVar.b());
                    } else if (AbstractC3292y.d(str, g.c.f34706f.b())) {
                        c3327a.m(bVar.c());
                    } else if (AbstractC3292y.d(str, g.c.f34715o.b())) {
                        if (c3327a.h() == null) {
                            c3327a.n(bVar.b());
                        } else {
                            c3327a.o(bVar.b());
                        }
                    } else if (AbstractC3292y.d(str, g.c.f34716p.b())) {
                        cVar.h(bVar.b());
                    } else if (AbstractC3292y.d(str, g.c.f34717q.b())) {
                        cVar.i(bVar.b());
                    } else if (AbstractC3292y.d(str, g.c.f34718r.b())) {
                        cVar.j(bVar.b());
                    }
                }
            }
        }
        c3327a.j(b(context, cVar, c3327a));
        C3327a e8 = e(c3327a, gVar);
        return new a.C0496a().e(e8.c()).f(e8.d()).b(e8.h()).h(e8.e()).c(e8.f()).g(e8.i()).a();
    }
}
