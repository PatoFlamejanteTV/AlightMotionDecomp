package h3;

import g3.C2915n;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2945g implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2945g f32578b = new C2945g();

    private C2945g() {
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2915n a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "payment_method");
        if (l8 == null) {
            return null;
        }
        return new C2915n(l8);
    }
}
