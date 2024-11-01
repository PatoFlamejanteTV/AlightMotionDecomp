package z2;

import R5.AbstractC1435t;
import R5.a0;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import l6.j;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Locale f41475d;

    /* renamed from: a, reason: collision with root package name */
    public static final d f41472a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f41473b = a0.i("AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW");

    /* renamed from: c, reason: collision with root package name */
    private static final Set f41474c = a0.i("US", "GB", "CA");

    /* renamed from: e, reason: collision with root package name */
    private static volatile List f41476e = AbstractC1435t.m();

    /* loaded from: classes4.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            d dVar = d.f41472a;
            return T5.a.a(dVar.c(((C4266a) obj).f()), dVar.c(((C4266a) obj2).f()));
        }
    }

    private d() {
    }

    private final List g(Locale locale) {
        Object obj;
        if (AbstractC3292y.d(locale, f41475d)) {
            return f41476e;
        }
        f41475d = locale;
        List i8 = i(locale);
        Iterator it = i8.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C4266a) obj).b(), c.a(locale))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        List q8 = AbstractC1435t.q(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : i8) {
            if (!AbstractC3292y.d(((C4266a) obj2).b(), c.a(locale))) {
                arrayList.add(obj2);
            }
        }
        f41476e = AbstractC1435t.G0(q8, AbstractC1435t.P0(arrayList, new a()));
        return f41476e;
    }

    private final List i(Locale locale) {
        Set<String> set = f41473b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
        for (String str : set) {
            b a9 = b.Companion.a(str);
            String displayCountry = new Locale("", str).getDisplayCountry(locale);
            AbstractC3292y.h(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new C4266a(a9, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ boolean a(String countryCode) {
        AbstractC3292y.i(countryCode, "countryCode");
        Set set = f41474c;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final /* synthetic */ boolean b(b countryCode) {
        AbstractC3292y.i(countryCode, "countryCode");
        return f41474c.contains(countryCode.b());
    }

    public final String c(String name) {
        AbstractC3292y.i(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        AbstractC3292y.h(normalize, "normalize(...)");
        return new j("[^\\p{ASCII}]").f(new j("[^A-Za-z ]").f(new j("\\p{Mn}+").f(normalize, ""), ""), "");
    }

    public final /* synthetic */ C4266a d(b bVar, Locale currentLocale) {
        Object obj;
        AbstractC3292y.i(currentLocale, "currentLocale");
        Iterator it = g(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C4266a) obj).b(), bVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C4266a) obj;
    }

    public final /* synthetic */ b e(String countryName, Locale currentLocale) {
        Object obj;
        AbstractC3292y.i(countryName, "countryName");
        AbstractC3292y.i(currentLocale, "currentLocale");
        Iterator it = g(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C4266a) obj).f(), countryName)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C4266a c4266a = (C4266a) obj;
        if (c4266a == null) {
            return null;
        }
        return c4266a.b();
    }

    public final /* synthetic */ List f(Locale currentLocale) {
        AbstractC3292y.i(currentLocale, "currentLocale");
        return g(currentLocale);
    }

    public final Set h() {
        return f41473b;
    }
}
