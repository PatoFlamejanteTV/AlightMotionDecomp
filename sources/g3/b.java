package G3;

import Q5.x;
import R5.Q;
import com.stripe.android.financialconnections.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.AbstractC3258j;
import l6.l;
import n2.z;

/* loaded from: classes4.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2829a = a.f2830a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f2830a = new a();

        private a() {
        }

        public final int a(String str) {
            Integer num;
            if (str == null) {
                return R.drawable.stripe_ic_bank;
            }
            l lVar = l.f34786c;
            Map k8 = Q.k(x.a(new l6.j("Bank of America", lVar), Integer.valueOf(z.f35493h)), x.a(new l6.j("Capital One", lVar), Integer.valueOf(z.f35495j)), x.a(new l6.j("Citibank", lVar), Integer.valueOf(z.f35497l)), x.a(new l6.j("BBVA|COMPASS", lVar), Integer.valueOf(z.f35498m)), x.a(new l6.j("MORGAN CHASE|JP MORGAN|Chase", lVar), Integer.valueOf(z.f35506u)), x.a(new l6.j("NAVY FEDERAL CREDIT UNION", lVar), Integer.valueOf(z.f35508w)), x.a(new l6.j("PNC\\s?BANK|PNC Bank", lVar), Integer.valueOf(z.f35510y)), x.a(new l6.j("SUNTRUST|SunTrust Bank", lVar), Integer.valueOf(z.f35469E)), x.a(new l6.j("Silicon Valley Bank", lVar), Integer.valueOf(z.f35470F)), x.a(new l6.j("Stripe|TestInstitution", lVar), Integer.valueOf(z.f35468D)), x.a(new l6.j("TD Bank", lVar), Integer.valueOf(z.f35471G)), x.a(new l6.j("USAA FEDERAL SAVINGS BANK|USAA Bank", lVar), Integer.valueOf(z.f35473I)), x.a(new l6.j("U\\.?S\\. BANK|US Bank", lVar), Integer.valueOf(z.f35474J)), x.a(new l6.j("Wells Fargo", lVar), Integer.valueOf(z.f35475K)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = k8.entrySet().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (AbstractC3258j.l(l6.j.d((l6.j) entry.getKey(), str, 0, 2, null))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Integer num2 = (Integer) ((Map.Entry) it2.next()).getValue();
                if (num2 != null) {
                    num = num2;
                    break;
                }
            }
            if (num != null) {
                return num.intValue();
            }
            return R.drawable.stripe_ic_bank;
        }
    }
}
