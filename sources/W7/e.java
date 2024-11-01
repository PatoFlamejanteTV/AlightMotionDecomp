package W7;

import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f10901a;

    @Override // W7.j
    public Object a(String jsonString) {
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            this.f10901a = new JSONObject(jsonString);
            return new S7.d(b());
        } catch (JSONException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new S7.d(null, 1);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f10901a;
        if (jSONObject == null) {
            AbstractC3292y.y("json");
            jSONObject = null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("disclosures");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONObject disclosure = jSONArray.getJSONObject(i8);
            String optString = disclosure.optString("identifier");
            String a9 = d.a(optString, "disclosure.optString(\"identifier\")", disclosure, "type", "disclosure.optString(\"type\")");
            int optInt = disclosure.optInt("maxAgeSeconds");
            String optString2 = disclosure.optString("domain");
            AbstractC3292y.h(optString2, "disclosure.optString(\"domain\")");
            AbstractC3292y.h(disclosure, "disclosure");
            arrayList.add(new S7.f(optString, a9, optInt, optString2, i.a(disclosure, "purposes")));
            i8 = i9;
        }
        return arrayList;
    }
}
