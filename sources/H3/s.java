package h3;

import g3.C2892B;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32606b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2892B a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new C2892B(new C2892B.a(json.getJSONObject("card_brand_choice").getBoolean("eligible")));
    }
}
