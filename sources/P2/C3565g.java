package p2;

import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import g3.C2902a;
import g3.C2904c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p2.AbstractC3564f;

/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3565g {

    /* renamed from: a, reason: collision with root package name */
    public static final C3565g f36133a = new C3565g();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f36134b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f36135c;

    static {
        C2904c c2904c = new C2904c("4000000000000000", "4999999999999999");
        C2902a.EnumC0740a enumC0740a = C2902a.EnumC0740a.f32085j;
        f36134b = Q.k(x.a("4000002500001001", AbstractC1435t.p(new C2902a(c2904c, 16, enumC0740a, null, 8, null), new C2902a(new C2904c("4000000000000000", "4999999999999999"), 16, C2902a.EnumC0740a.f32078c, null, 8, null))), x.a("5555552500001001", AbstractC1435t.p(new C2902a(new C2904c("5100000000000000", "5599999999999999"), 16, enumC0740a, null, 8, null), new C2902a(new C2904c("5100000000000000", "5599999999999999"), 16, C2902a.EnumC0740a.f32079d, null, 8, null))));
        f36135c = 8;
    }

    private C3565g() {
    }

    public final List a(AbstractC3564f.b cardNumber) {
        List list;
        AbstractC3292y.i(cardNumber, "cardNumber");
        Map map = f36134b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (l6.n.B(cardNumber.g(), (String) entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC1435t.L0(linkedHashMap.entrySet());
        if (entry2 != null) {
            list = (List) entry2.getValue();
        }
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }
}
