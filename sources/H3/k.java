package h3;

import R5.AbstractC1435t;
import R5.N;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import g3.C2895E;
import g3.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements A2.a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f32582c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final l f32583b = new l();

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
    public g3.t a(JSONObject json) {
        C2895E c2895e;
        List m8;
        Integer num;
        String str;
        boolean z8;
        AbstractC3292y.i(json, "json");
        if (!AbstractC3292y.d("customer", z2.e.l(json, "object"))) {
            return null;
        }
        String l8 = z2.e.l(json, "id");
        String l9 = z2.e.l(json, "default_source");
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            c2895e = new y().a(optJSONObject);
        } else {
            c2895e = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject("sources");
        if (optJSONObject2 != null && AbstractC3292y.d("list", z2.e.l(optJSONObject2, "object"))) {
            z2.e eVar = z2.e.f41477a;
            boolean f8 = eVar.f(optJSONObject2, "has_more");
            Integer i8 = eVar.i(optJSONObject2, "total_count");
            String l10 = z2.e.l(optJSONObject2, "url");
            JSONArray optJSONArray = optJSONObject2.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            i6.i s8 = i6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                l lVar = this.f32583b;
                AbstractC3292y.f(jSONObject);
                com.stripe.android.model.g a9 = lVar.a(jSONObject);
                if (a9 != null) {
                    arrayList2.add(a9);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((com.stripe.android.model.g) obj).a() != M.f32050c) {
                    arrayList3.add(obj);
                }
            }
            num = i8;
            str = l10;
            m8 = arrayList3;
            z8 = f8;
        } else {
            m8 = AbstractC1435t.m();
            num = null;
            str = null;
            z8 = false;
        }
        return new g3.t(l8, l9, c2895e, m8, z8, num, str, z2.e.l(json, "description"), z2.e.l(json, NotificationCompat.CATEGORY_EMAIL), json.optBoolean("livemode", false));
    }
}
