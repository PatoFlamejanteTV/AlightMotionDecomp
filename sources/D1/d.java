package D1;

import I1.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1227a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f1228b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1229c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1230d;

    private d(boolean z8, Float f8, boolean z9, c cVar) {
        this.f1227a = z8;
        this.f1228b = f8;
        this.f1229c = z9;
        this.f1230d = cVar;
    }

    public static d b(boolean z8, c cVar) {
        g.d(cVar, "Position is null");
        return new d(false, null, z8, cVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f1227a);
            if (this.f1227a) {
                jSONObject.put("skipOffset", this.f1228b);
            }
            jSONObject.put("autoPlay", this.f1229c);
            jSONObject.put("position", this.f1230d);
        } catch (JSONException e8) {
            I1.d.b("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }
}
