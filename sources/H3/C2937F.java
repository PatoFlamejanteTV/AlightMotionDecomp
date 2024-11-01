package h3;

import androidx.core.app.NotificationCompat;
import i3.AbstractC2970a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2937F implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32568b = new a(null);

    /* renamed from: h3.F$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: h3.F$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32569a;

        static {
            int[] iArr = new int[AbstractC2970a.g.values().length];
            try {
                iArr[AbstractC2970a.g.f32738c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2970a.g.f32739d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2970a.g.f32742g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2970a.g.f32740e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2970a.g.f32741f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2970a.g.f32743h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2970a.g.f32744i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f32569a = iArr;
        }
    }

    private final AbstractC2970a.e c(JSONObject jSONObject) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C2940b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = z2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = z2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C2940b().a(optJSONObject2);
        }
        return new AbstractC2970a.e(aVar, l8, l9, aVar2);
    }

    private final AbstractC2970a.h d(JSONObject jSONObject, String str) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C2940b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = z2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = z2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C2940b().a(optJSONObject2);
        }
        return new AbstractC2970a.h(aVar, l8, l9, aVar2, str);
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2970a a(JSONObject json) {
        JSONObject optJSONObject;
        AbstractC3292y.i(json, "json");
        AbstractC2970a.g a9 = AbstractC2970a.g.f32737b.a(z2.e.l(json, "type"));
        if (a9 == null || (optJSONObject = json.optJSONObject(a9.b())) == null) {
            return null;
        }
        String l8 = z2.e.l(json, "dynamic_last4");
        switch (b.f32569a[a9.ordinal()]) {
            case 1:
                return new AbstractC2970a.C0760a(l8);
            case 2:
                return new AbstractC2970a.b(l8);
            case 3:
                return new AbstractC2970a.f(l8);
            case 4:
                return new AbstractC2970a.c(l8);
            case 5:
                return c(optJSONObject);
            case 6:
                return d(optJSONObject, l8);
            case 7:
                return new AbstractC2970a.d(l8);
            default:
                throw new Q5.p();
        }
    }
}
