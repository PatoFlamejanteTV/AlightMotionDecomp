package h3;

import R5.AbstractC1435t;
import R5.N;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import g3.C2897G;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2933B implements A2.a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f32557c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final b f32558b = new b();

    /* renamed from: h3.B$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: h3.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32559b = new a(null);

        /* renamed from: h3.B$b$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2897G.b a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            C2897G.b.EnumC0738b a9 = C2897G.b.EnumC0738b.f31969b.a(z2.e.l(json, "type"));
            if (a9 != null) {
                z2.e eVar = z2.e.f41477a;
                return new C2897G.b(a9, eVar.i(json, RewardPlus.AMOUNT), z2.e.l(json, "currency"), z2.e.l(json, "description"), eVar.i(json, "quantity"));
            }
            return null;
        }
    }

    /* renamed from: h3.B$c */
    /* loaded from: classes4.dex */
    public static final class c implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32560b = new a(null);

        /* renamed from: h3.B$c$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2897G.c a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3292y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C2940b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new C2897G.c(aVar, z2.e.l(json, "carrier"), z2.e.l(json, "name"), z2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE), z2.e.l(json, "tracking_number"));
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2897G a(JSONObject json) {
        C2897G.c cVar;
        AbstractC3292y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("items");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        i6.i s8 = i6.m.s(0, optJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((N) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : arrayList) {
            b bVar = this.f32558b;
            AbstractC3292y.f(jSONObject);
            C2897G.b a9 = bVar.a(jSONObject);
            if (a9 != null) {
                arrayList2.add(a9);
            }
        }
        Integer i8 = z2.e.f41477a.i(json, RewardPlus.AMOUNT);
        String l8 = z2.e.l(json, "currency");
        String l9 = z2.e.l(json, NotificationCompat.CATEGORY_EMAIL);
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            cVar = new c().a(optJSONObject);
        } else {
            cVar = null;
        }
        return new C2897G(i8, l8, l9, arrayList2, cVar);
    }
}
