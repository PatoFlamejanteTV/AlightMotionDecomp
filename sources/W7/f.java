package W7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f10902a;

    @Override // W7.j
    public Object a(String jsonString) {
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f10902a = jSONObject;
            return new L5.c(jSONObject.optString("language"), a(), b());
        } catch (JSONException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new L5.c(null, null, null, 7);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f10902a;
        if (jSONObject == null) {
            AbstractC3292y.y("json");
            jSONObject = null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("purposes");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                Integer valueOf = Integer.valueOf(jSONObject2.optInt("id"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("banner");
                AbstractC3292y.h(jSONObject3, "gbcPurpose.getJSONObject(\"banner\")");
                String optString = jSONObject3.optString(CampaignEx.JSON_KEY_TITLE);
                AbstractC3292y.h(optString, "jsonObject.optString(\"title\")");
                arrayList.add(new L5.b(valueOf, new L5.a(optString, null, null, null, 14)));
                i8 = i9;
            }
        }
        return arrayList;
    }

    public final L5.a a() {
        JSONObject jSONObject = this.f10902a;
        if (jSONObject == null) {
            AbstractC3292y.y("json");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("banner");
        String optString = jSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
        String a9 = d.a(optString, "bannerDetails.optString(\"title\")", jSONObject2, "sectionTitle", "bannerDetails.optString(\"sectionTitle\")");
        String optString2 = jSONObject2.optString("description");
        return new L5.a(optString, a9, optString2, d.a(optString2, "bannerDetails.optString(\"description\")", jSONObject2, "confirm", "bannerDetails.optString(\"confirm\")"));
    }
}
