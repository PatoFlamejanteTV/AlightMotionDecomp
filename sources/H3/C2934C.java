package h3;

import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2934C implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32561b = new a(null);

    /* renamed from: h3.C$a */
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
    public SourceTypeModel.a a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new SourceTypeModel.a(z2.e.l(json, "bank_code"), z2.e.l(json, "branch_code"), z2.e.l(json, "country"), z2.e.l(json, "fingerprint"), z2.e.l(json, "last4"), z2.e.l(json, "mandate_reference"), z2.e.l(json, "mandate_url"));
    }
}
