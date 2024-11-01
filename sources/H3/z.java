package h3;

import com.stripe.android.model.SourceTypeModel;
import g3.C2905d;
import g3.EnumC2906e;
import g3.EnumC2907f;
import g3.M;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32642b = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SourceTypeModel.Card a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "address_line1_check");
        String l9 = z2.e.l(json, "address_zip_check");
        EnumC2906e a9 = C2905d.f32093v.a(z2.e.l(json, "brand"));
        String l10 = z2.e.l(json, "country");
        String l11 = z2.e.l(json, "cvc_check");
        String l12 = z2.e.l(json, "dynamic_last4");
        z2.e eVar = z2.e.f41477a;
        return new SourceTypeModel.Card(l8, l9, a9, l10, l11, l12, eVar.i(json, "exp_month"), eVar.i(json, "exp_year"), EnumC2907f.f32140b.a(z2.e.l(json, "funding")), z2.e.l(json, "last4"), SourceTypeModel.Card.ThreeDSecureStatus.f25335b.a(z2.e.l(json, "three_d_secure")), M.f32049b.a(z2.e.l(json, "tokenization_method")));
    }
}
