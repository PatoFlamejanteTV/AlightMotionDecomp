package c5;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2040e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15756d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f15757a;

    /* renamed from: b, reason: collision with root package name */
    private String f15758b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f15759c;

    /* renamed from: c5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final ArrayList a() {
        return this.f15759c;
    }

    public final String b() {
        return this.f15758b;
    }

    public final String c() {
        return this.f15757a;
    }

    public final void d(JSONObject jsonData) {
        AbstractC3292y.i(jsonData, "jsonData");
        if (!jsonData.isNull(CampaignEx.JSON_KEY_TITLE)) {
            this.f15757a = jsonData.getString(CampaignEx.JSON_KEY_TITLE);
        }
        if (!jsonData.isNull("description")) {
            this.f15758b = jsonData.getString("description");
        }
        if (!jsonData.isNull("apps")) {
            JSONArray jSONArray = jsonData.getJSONArray("apps");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C2043h c2043h = new C2043h();
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                AbstractC3292y.f(jSONObject);
                c2043h.a(jSONObject);
                arrayList.add(c2043h);
            }
            this.f15759c = arrayList;
        }
    }
}
