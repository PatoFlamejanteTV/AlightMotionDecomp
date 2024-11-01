package R0;

import J0.C;
import R0.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(C c8) {
        return new d(c8.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // R0.i
    public d a(C c8, JSONObject jSONObject) {
        return b(c8);
    }
}
