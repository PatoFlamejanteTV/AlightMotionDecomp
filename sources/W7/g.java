package W7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class g implements j {
    @Override // W7.j
    public Object a(String jsonString) {
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("country");
            AbstractC3292y.h(optString, "json.optString(\"country\")");
            String optString2 = jSONObject.optString(TtmlNode.TAG_REGION);
            AbstractC3292y.h(optString2, "json.optString(\"region\")");
            String optString3 = jSONObject.optString("city");
            AbstractC3292y.h(optString3, "json.optString(\"city\")");
            return new O5.b(optString, optString2, optString3);
        } catch (JSONException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new O5.b(null, null, null, 7);
        }
    }
}
