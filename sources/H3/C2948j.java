package h3;

import g3.C2916o;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2948j implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2948j f32581b = new C2948j();

    private C2948j() {
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g3.q a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        C2916o a9 = new C2946h().a(json);
        String l8 = z2.e.l(json, "publishable_key");
        if (a9 != null) {
            return new g3.q(a9, l8);
        }
        return null;
    }
}
