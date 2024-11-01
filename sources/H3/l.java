package h3;

import com.stripe.android.model.Source;
import g3.C2905d;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l implements A2.a {
    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.g a(JSONObject json) {
        Source a9;
        C2905d a10;
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "object");
        if (l8 == null) {
            return null;
        }
        int hashCode = l8.hashCode();
        if (hashCode != -1825227990) {
            if (hashCode != -896505829) {
                if (hashCode != 3046160 || !l8.equals("card") || (a10 = new C2942d().a(json)) == null) {
                    return null;
                }
                return new com.stripe.android.model.f(a10);
            }
            if (!l8.equals("source") || (a9 = new C2932A().a(json)) == null) {
                return null;
            }
            return new com.stripe.android.model.h(a9);
        }
        if (!l8.equals("bank_account")) {
            return null;
        }
        return new com.stripe.android.model.e(new C2941c().a(json));
    }
}
