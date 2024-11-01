package h3;

import g3.C2905d;
import g3.EnumC2906e;
import g3.EnumC2907f;
import g3.M;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2942d implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32574b = new a(null);

    /* renamed from: h3.d$a */
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
    public C2905d a(JSONObject json) {
        int i8;
        Integer num;
        Integer num2;
        AbstractC3292y.i(json, "json");
        if (!AbstractC3292y.d("card", json.optString("object"))) {
            return null;
        }
        z2.e eVar = z2.e.f41477a;
        Integer i9 = eVar.i(json, "exp_month");
        int i10 = -1;
        if (i9 != null) {
            i8 = i9.intValue();
        } else {
            i8 = -1;
        }
        Integer valueOf = Integer.valueOf(i8);
        int intValue = valueOf.intValue();
        if (intValue >= 1 && intValue <= 12) {
            num = valueOf;
        } else {
            num = null;
        }
        Integer i11 = eVar.i(json, "exp_year");
        if (i11 != null) {
            i10 = i11.intValue();
        }
        Integer valueOf2 = Integer.valueOf(i10);
        if (valueOf2.intValue() < 0) {
            num2 = null;
        } else {
            num2 = valueOf2;
        }
        String l8 = z2.e.l(json, "address_city");
        String l9 = z2.e.l(json, "address_line1");
        String l10 = z2.e.l(json, "address_line1_check");
        String l11 = z2.e.l(json, "address_line2");
        String l12 = z2.e.l(json, "address_country");
        String l13 = z2.e.l(json, "address_state");
        String l14 = z2.e.l(json, "address_zip");
        String l15 = z2.e.l(json, "address_zip_check");
        EnumC2906e a9 = C2905d.f32093v.a(z2.e.l(json, "brand"));
        String g8 = eVar.g(json, "country");
        String l16 = z2.e.l(json, "customer");
        String h8 = z2.e.h(json, "currency");
        String l17 = z2.e.l(json, "cvc_check");
        return new C2905d(num, num2, z2.e.l(json, "name"), l9, l10, l11, l8, l13, l14, l15, l12, z2.e.l(json, "last4"), a9, EnumC2907f.f32140b.a(z2.e.l(json, "funding")), z2.e.l(json, "fingerprint"), g8, h8, l16, l17, z2.e.l(json, "id"), M.f32049b.a(z2.e.l(json, "tokenization_method")));
    }
}
