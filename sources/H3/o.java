package h3;

import R5.AbstractC1435t;
import R5.N;
import R5.Q;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import g3.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o implements A2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b f32595e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f32596f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final v f32597g = new v();

    /* renamed from: b, reason: collision with root package name */
    private final g3.v f32598b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32599c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f32600d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32601a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public o(g3.v params, String apiKey, Function0 timeProvider) {
        AbstractC3292y.i(params, "params");
        AbstractC3292y.i(apiKey, "apiKey");
        AbstractC3292y.i(timeProvider, "timeProvider");
        this.f32598b = params;
        this.f32599c = apiKey;
        this.f32600d = timeProvider;
    }

    private final j.a c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("card_brand_choice");
        if (optJSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = optJSONObject.optJSONArray("preferred_networks");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                String optString = optJSONArray.optString(i8);
                if (optString != null) {
                    AbstractC3292y.f(optString);
                    arrayList.add(optString);
                }
            }
        }
        return new j.a(optJSONObject.optBoolean("eligible", false), AbstractC1435t.W0(arrayList));
    }

    private final j.d.a d(JSONObject jSONObject) {
        j.d.a.c j8;
        j.d.a.b g8;
        if (jSONObject == null || (j8 = j(jSONObject.optJSONObject("mobile_payment_element"))) == null || (g8 = g(jSONObject.optJSONObject("customer_sheet"))) == null) {
            return null;
        }
        return new j.d.a(j8, g8);
    }

    private final j.d e(JSONObject jSONObject) {
        List m8;
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("payment_methods");
        if (optJSONArray != null) {
            i6.i s8 = i6.m.s(0, optJSONArray.length());
            m8 = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f32597g;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3292y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a9 = vVar.a(optJSONObject);
                if (a9 != null) {
                    m8.add(a9);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        j.d.c f8 = f(jSONObject.optJSONObject("customer_session"));
        if (f8 == null) {
            return null;
        }
        String optString = jSONObject.optString("default_payment_method");
        AbstractC3292y.f(optString);
        if (!l6.n.T(optString)) {
            str = optString;
        }
        return new j.d(m8, str, f8);
    }

    private final j.d.c f(JSONObject jSONObject) {
        String optString;
        j.d.a d8;
        if (jSONObject == null || (optString = jSONObject.optString("id")) == null) {
            return null;
        }
        boolean optBoolean = jSONObject.optBoolean("livemode");
        String optString2 = jSONObject.optString("api_key");
        if (optString2 == null) {
            return null;
        }
        int optInt = jSONObject.optInt("api_key_expiry");
        String optString3 = jSONObject.optString("customer");
        if (optString3 == null || (d8 = d(jSONObject.optJSONObject("components"))) == null) {
            return null;
        }
        return new j.d.c(optString, optBoolean, optString2, optInt, optString3, d8);
    }

    private final j.d.a.b g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.optBoolean("enabled")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            if (optJSONObject == null) {
                return null;
            }
            return new j.d.a.b.C0505b(AbstractC3292y.d(optJSONObject.optString("payment_method_remove"), "enabled"));
        }
        return j.d.a.b.C0503a.f25509a;
    }

    private final Map h(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3292y.h(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                AbstractC3292y.f(next);
                linkedHashMap.put(next, obj);
            }
        }
        return Q.w(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final j.e i(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z8;
        boolean z9;
        Map h8;
        String optString;
        if (jSONObject != null) {
            z8 = jSONObject.optBoolean("link_mobile_disable_signup");
        } else {
            z8 = false;
        }
        if (jSONObject != null) {
            z9 = jSONObject.optBoolean("link_passthrough_mode_enabled");
        } else {
            z9 = false;
        }
        g3.y yVar = null;
        if (jSONObject != null && (optString = jSONObject.optString("link_mode")) != null) {
            Iterator<E> it = g3.y.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3292y.d(((g3.y) next).c(), optString)) {
                    yVar = next;
                    break;
                }
            }
            yVar = yVar;
        }
        g3.y yVar2 = yVar;
        if (jSONObject == null || (h8 = h(jSONObject)) == null) {
            h8 = Q.h();
        }
        return new j.e(A2.a.f148a.a(jSONArray), z9, yVar2, h8, z8);
    }

    private final j.d.a.c j(JSONObject jSONObject) {
        Object obj = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.optBoolean("enabled")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            if (optJSONObject == null) {
                return null;
            }
            String optString = optJSONObject.optString("payment_method_save");
            String optString2 = optJSONObject.optString("payment_method_remove");
            String optString3 = optJSONObject.optString("payment_method_save_allow_redisplay_override");
            Iterator<E> it = o.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3292y.d(((o.b) next).f(), optString3)) {
                    obj = next;
                    break;
                }
            }
            return new j.d.a.c.b(AbstractC3292y.d(optString, "enabled"), AbstractC3292y.d(optString2, "enabled"), (o.b) obj);
        }
        return j.d.a.c.C0507a.f25511a;
    }

    private final StripeIntent k(String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, String str2) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject(this.f32598b.getType());
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONArray != null) {
            jSONObject2.put("payment_method_types", jSONArray);
        }
        jSONObject2.put("unactivated_payment_method_types", jSONArray2);
        jSONObject2.put("link_funding_sources", jSONArray3);
        jSONObject2.put("country_code", str2);
        g3.v vVar = this.f32598b;
        if (vVar instanceof v.b) {
            return new u().a(jSONObject2);
        }
        if (vVar instanceof v.c) {
            return new x().a(jSONObject2);
        }
        if (vVar instanceof v.a) {
            i.b a9 = ((v.a) vVar).a().a();
            if (a9 instanceof i.b.a) {
                return new m(str, (i.b.a) ((v.a) this.f32598b).a().a(), this.f32599c, this.f32600d).a(jSONObject2);
            }
            if (a9 instanceof i.b.C0500b) {
                return new n(str, (i.b.C0500b) ((v.a) this.f32598b).a().a(), this.f32599c, this.f32600d).a(jSONObject2);
            }
            throw new Q5.p();
        }
        throw new Q5.p();
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.j a(JSONObject json) {
        String str;
        String str2;
        JSONArray jSONArray;
        AbstractC3292y.i(json, "json");
        z2.e eVar = z2.e.f41477a;
        JSONObject d8 = eVar.d(eVar.k(json, "payment_method_preference"));
        String l8 = z2.e.l(d8, "object");
        if (d8 == null || !AbstractC3292y.d("payment_method_preference", l8)) {
            return null;
        }
        String optString = d8.optString("country_code");
        JSONArray optJSONArray = json.optJSONArray("unactivated_payment_method_types");
        JSONArray optJSONArray2 = json.optJSONArray("payment_method_specs");
        if (optJSONArray2 != null) {
            str = optJSONArray2.toString();
        } else {
            str = null;
        }
        JSONArray optJSONArray3 = json.optJSONArray("external_payment_method_data");
        if (optJSONArray3 != null) {
            str2 = optJSONArray3.toString();
        } else {
            str2 = null;
        }
        JSONArray optJSONArray4 = d8.optJSONArray("ordered_payment_method_types");
        String optString2 = json.optString("session_id");
        j.d e8 = e(json.optJSONObject("customer"));
        JSONObject optJSONObject = json.optJSONObject("link_settings");
        if (optJSONObject != null) {
            jSONArray = optJSONObject.optJSONArray("link_funding_sources");
        } else {
            jSONArray = null;
        }
        AbstractC3292y.f(optString);
        StripeIntent k8 = k(optString2, d8, optJSONArray4, optJSONArray, jSONArray, optString);
        String optString3 = json.optString("merchant_country");
        j.a c8 = c(json);
        String optString4 = json.optString("google_pay_preference");
        if (k8 == null) {
            return null;
        }
        return new com.stripe.android.model.j(i(optJSONObject, jSONArray), str, str2, k8, e8, optString3, c8, !AbstractC3292y.d(optString4, "disabled"), null, 256, null);
    }

    public /* synthetic */ o(g3.v vVar, String str, Function0 function0, int i8, AbstractC3284p abstractC3284p) {
        this(vVar, str, (i8 & 4) != 0 ? a.f32601a : function0);
    }
}
