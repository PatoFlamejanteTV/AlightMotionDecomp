package h3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2940b implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32572b = new a(null);

    /* renamed from: h3.b$a */
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
    public com.stripe.android.model.a a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new com.stripe.android.model.a(z2.e.l(json, "city"), z2.e.l(json, "country"), z2.e.l(json, "line1"), z2.e.l(json, "line2"), z2.e.l(json, "postal_code"), z2.e.l(json, "state"));
    }
}
