package h3;

import A2.a;
import R5.AbstractC1435t;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m implements A2.a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f32584f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f32585b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.a f32586c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32587d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f32588e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32589a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.f25586c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.f25587d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.f25588e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32589a = iArr;
        }
    }

    public m(String str, i.b.a paymentMode, String apiKey, Function0 timeProvider) {
        AbstractC3292y.i(paymentMode, "paymentMode");
        AbstractC3292y.i(apiKey, "apiKey");
        AbstractC3292y.i(timeProvider, "timeProvider");
        this.f32585b = str;
        this.f32586c = paymentMode;
        this.f32587d = apiKey;
        this.f32588e = timeProvider;
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n a(JSONObject json) {
        n.b bVar;
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
        String l8 = z2.e.l(json, "country_code");
        int i8 = b.f32589a[this.f32586c.b().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    bVar = n.b.f25588e;
                } else {
                    throw new Q5.p();
                }
            } else {
                bVar = n.b.f25587d;
            }
        } else {
            bVar = n.b.f25586c;
        }
        n.b bVar2 = bVar;
        String str = this.f32585b;
        boolean z8 = !l6.n.G(this.f32587d, "test", false, 2, null);
        return new com.stripe.android.model.n(str, a9, Long.valueOf(this.f32586c.a()), 0L, null, bVar2, null, null, l8, ((Number) this.f32588e.invoke()).longValue(), this.f32586c.L(), null, z8, null, null, null, null, this.f32586c.G(), null, null, arrayList, arrayList2, null, null, 13494424, null);
    }
}
