package h3;

import R5.AbstractC1435t;
import R5.N;
import g3.C2912k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2944f implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2944f f32577b = new C2944f();

    private C2944f() {
    }

    private final C2912k.e c(JSONObject jSONObject) {
        String l8 = z2.e.l(jSONObject, "type");
        if (l8 == null) {
            return null;
        }
        String lowerCase = l8.toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        if (AbstractC3292y.d(lowerCase, "card")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("card_details");
            String string = jSONObject.getString("id");
            AbstractC3292y.h(string, "getString(...)");
            String string2 = jSONObject2.getString("last4");
            AbstractC3292y.h(string2, "getString(...)");
            return new C2912k.b(string, string2);
        }
        if (!AbstractC3292y.d(lowerCase, "bank_account")) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bank_account_details");
        String string3 = jSONObject.getString("id");
        AbstractC3292y.h(string3, "getString(...)");
        String string4 = jSONObject3.getString("last4");
        AbstractC3292y.h(string4, "getString(...)");
        return new C2912k.a(string3, string4, z2.e.l(jSONObject3, "bank_name"));
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2912k a(JSONObject json) {
        List m8;
        C2912k.e c8;
        AbstractC3292y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("redacted_payment_details");
        if (optJSONArray != null) {
            i6.i s8 = i6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            m8 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                C2944f c2944f = f32577b;
                AbstractC3292y.f(jSONObject);
                C2912k.e c9 = c2944f.c(jSONObject);
                if (c9 != null) {
                    m8.add(c9);
                }
            }
        } else {
            JSONObject optJSONObject = json.optJSONObject("redacted_payment_details");
            if (optJSONObject != null && (c8 = f32577b.c(optJSONObject)) != null) {
                m8 = AbstractC1435t.e(c8);
            } else {
                m8 = AbstractC1435t.m();
            }
        }
        return new C2912k(m8);
    }
}
