package h3;

import R5.AbstractC1435t;
import R5.N;
import g3.C2916o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2946h implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32579b = new a(null);

    /* renamed from: h3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private final C2916o.d c(JSONObject jSONObject) {
        C2916o.d.e.a aVar = C2916o.d.e.f32201b;
        String string = jSONObject.getString("type");
        AbstractC3292y.h(string, "getString(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        C2916o.d.e a9 = aVar.a(lowerCase);
        C2916o.d.EnumC0743d.a aVar2 = C2916o.d.EnumC0743d.f32191b;
        String string2 = jSONObject.getString("state");
        AbstractC3292y.h(string2, "getString(...)");
        String lowerCase2 = string2.toLowerCase(locale);
        AbstractC3292y.h(lowerCase2, "toLowerCase(...)");
        return new C2916o.d(a9, aVar2.a(lowerCase2));
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2916o a(JSONObject json) {
        List m8;
        AbstractC3292y.i(json, "json");
        JSONObject optJSONObject = json.optJSONObject("consumer_session");
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("verification_sessions");
        if (optJSONArray != null) {
            i6.i s8 = i6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            m8 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                AbstractC3292y.f(jSONObject);
                C2916o.d c8 = c(jSONObject);
                if (c8 != null) {
                    m8.add(c8);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        List list = m8;
        String string = optJSONObject.getString("client_secret");
        AbstractC3292y.h(string, "getString(...)");
        String string2 = optJSONObject.getString("email_address");
        AbstractC3292y.h(string2, "getString(...)");
        String string3 = optJSONObject.getString("redacted_formatted_phone_number");
        AbstractC3292y.h(string3, "getString(...)");
        String string4 = optJSONObject.getString("redacted_phone_number");
        AbstractC3292y.h(string4, "getString(...)");
        return new C2916o(string, string2, string3, string4, list);
    }
}
