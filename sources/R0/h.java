package R0;

import J0.C;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final C f9141a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(C c8) {
        this.f9141a = c8;
    }

    private static i a(int i8) {
        if (i8 != 3) {
            G0.g.f().d("Could not determine SettingsJsonTransform for settings version " + i8 + ". Using default settings values.");
            return new b();
        }
        return new m();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f9141a, jSONObject);
    }
}
