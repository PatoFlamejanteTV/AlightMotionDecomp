package h3;

import g3.C2901K;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2936E implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32566b = new a(null);

    /* renamed from: h3.E$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: h3.E$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32567a;

        static {
            int[] iArr = new int[C2901K.c.values().length];
            try {
                iArr[C2901K.c.f32038c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2901K.c.f32039d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32567a = iArr;
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2901K a(JSONObject json) {
        C2901K c2901k;
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "id");
        z2.e eVar = z2.e.f41477a;
        Long j8 = eVar.j(json, "created");
        C2901K.c a9 = C2901K.c.f32037b.a(z2.e.l(json, "type"));
        if (a9 == null || l8 == null || j8 == null) {
            return null;
        }
        boolean f8 = eVar.f(json, "used");
        boolean f9 = eVar.f(json, "livemode");
        Date date = new Date(TimeUnit.SECONDS.toMillis(j8.longValue()));
        int i8 = b.f32567a[a9.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                c2901k = new C2901K(l8, a9, date, f9, f8, null, null, 96, null);
            } else {
                C2901K.c cVar = C2901K.c.f32039d;
                JSONObject optJSONObject = json.optJSONObject(cVar.b());
                if (optJSONObject == null) {
                    return null;
                }
                c2901k = new C2901K(l8, cVar, date, f9, f8, new C2941c().a(optJSONObject), null, 64, null);
            }
        } else {
            C2901K.c cVar2 = C2901K.c.f32038c;
            JSONObject optJSONObject2 = json.optJSONObject(cVar2.b());
            if (optJSONObject2 == null) {
                return null;
            }
            c2901k = new C2901K(l8, cVar2, date, f9, f8, null, new C2942d().a(optJSONObject2), 32, null);
        }
        return c2901k;
    }
}
