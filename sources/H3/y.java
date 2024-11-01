package h3;

import androidx.autofill.HintConstants;
import g3.C2895E;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class y implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32641b = new a(null);

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
    public C2895E a(JSONObject json) {
        com.stripe.android.model.a aVar;
        AbstractC3292y.i(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        if (optJSONObject != null) {
            aVar = new C2940b().a(optJSONObject);
        } else {
            aVar = null;
        }
        return new C2895E(aVar, z2.e.l(json, "name"), z2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
    }
}
