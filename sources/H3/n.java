package h3;

import A2.a;
import R5.AbstractC1435t;
import com.stripe.android.model.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n implements A2.a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f32590f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f32591b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.C0500b f32592c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32593d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f32594e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public n(String str, i.b.C0500b setupMode, String apiKey, Function0 timeProvider) {
        AbstractC3292y.i(setupMode, "setupMode");
        AbstractC3292y.i(apiKey, "apiKey");
        AbstractC3292y.i(timeProvider, "timeProvider");
        this.f32591b = str;
        this.f32592c = setupMode;
        this.f32593d = apiKey;
        this.f32594e = timeProvider;
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        a.C0000a c0000a = A2.a.f148a;
        List a9 = c0000a.a(json.optJSONArray("payment_method_types"));
        List a10 = c0000a.a(json.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(a10, 10));
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        List a11 = A2.a.f148a.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(a11, 10));
        Iterator it2 = a11.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase2, "toLowerCase(...)");
            arrayList2.add(lowerCase2);
        }
        return new com.stripe.android.model.u(this.f32591b, null, ((Number) this.f32594e.invoke()).longValue(), z2.e.l(json, "country_code"), null, null, !l6.n.G(this.f32593d, "test", false, 2, null), null, null, a9, null, this.f32592c.G(), null, arrayList, arrayList2, null, null, 69760, null);
    }
}
