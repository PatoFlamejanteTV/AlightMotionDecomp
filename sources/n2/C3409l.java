package n2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import v2.C4120a;

/* renamed from: n2.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3409l {

    /* renamed from: d, reason: collision with root package name */
    private static final a f35350d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f35351a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35352b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35353c;

    /* renamed from: n2.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3409l(String publishableKey, String str) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        this.f35351a = str;
        this.f35352b = C4120a.f40423a.a().b(publishableKey);
        this.f35353c = "20.51.0";
    }

    private final String a() {
        String str = this.f35351a;
        if (str != null) {
            String str2 = this.f35352b + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.f35352b;
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.f35353c).put("stripe:publishableKey", a()));
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3409l(Context context) {
        this(r.f35413c.a(context));
        AbstractC3292y.i(context, "context");
    }

    private C3409l(r rVar) {
        this(rVar.f(), rVar.h());
    }
}
