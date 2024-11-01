package R0;

import J0.C;
import R0.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class m implements i {
    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(C c8, long j8, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return c8.a() + (j8 * 1000);
    }

    @Override // R0.i
    public d a(C c8, JSONObject jSONObject) {
        d.b c9;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            c9 = c(jSONObject.getJSONObject("session"));
        } else {
            c9 = c(new JSONObject());
        }
        return new d(d(c8, optInt2, jSONObject), c9, b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
