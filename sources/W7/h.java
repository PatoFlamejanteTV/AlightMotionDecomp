package W7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONArray f10903a;

    @Override // W7.j
    public Object a(String jsonString) {
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            this.f10903a = new JSONArray(jsonString);
            return new D5.e(b());
        } catch (JSONException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new D5.e(null, 1);
        }
    }

    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f10903a;
        if (jSONArray == null) {
            AbstractC3292y.y("googleVendorsJson");
            jSONArray = null;
        }
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONArray jSONArray2 = this.f10903a;
            if (jSONArray2 == null) {
                AbstractC3292y.y("googleVendorsJson");
                jSONArray2 = null;
            }
            String string = jSONArray2.getString(i8);
            if (string == null) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            JSONArray jSONArray3 = this.f10903a;
            if (jSONArray3 == null) {
                AbstractC3292y.y("googleVendorsJson");
                jSONArray3 = null;
            }
            JSONObject jSONObject = jSONArray3.getJSONObject(i8);
            String string2 = jSONObject.getString("provider_id");
            AbstractC3292y.h(string2, "googleVendor.getString(\"provider_id\")");
            int parseInt = Integer.parseInt(string2);
            String string3 = jSONObject.getString("provider_name");
            AbstractC3292y.h(string3, "googleVendor.getString(\"provider_name\")");
            String string4 = jSONObject.getString("policy_url");
            AbstractC3292y.h(string4, "googleVendor.getString(\"policy_url\")");
            String string5 = jSONObject.getString("domains");
            AbstractC3292y.h(string5, "googleVendor.getString(\"domains\")");
            linkedHashMap.put(string, new D5.f(parseInt, string3, string4, string5));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
