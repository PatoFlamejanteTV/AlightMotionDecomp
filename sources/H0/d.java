package H0;

import G0.g;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements b, I0.b {

    /* renamed from: a, reason: collision with root package name */
    private I0.a f3177a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // I0.b
    public void a(I0.a aVar) {
        this.f3177a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // H0.b
    public void j(String str, Bundle bundle) {
        I0.a aVar = this.f3177a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
