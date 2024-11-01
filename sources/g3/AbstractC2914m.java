package g3;

import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2914m {
    public static final Q5.r a(Map cardPaymentMethodCreateParams) {
        Map map;
        Object obj;
        Map map2;
        AbstractC3292y.i(cardPaymentMethodCreateParams, "cardPaymentMethodCreateParams");
        Object obj2 = cardPaymentMethodCreateParams.get("billing_details");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("address");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 == null) {
            return null;
        }
        return Q5.x.a("billing_address", Q.k(Q5.x.a("country_code", map2.get("country")), Q5.x.a("postal_code", map2.get("postal_code"))));
    }
}
