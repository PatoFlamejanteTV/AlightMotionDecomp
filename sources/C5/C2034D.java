package c5;

import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2034D {

    /* renamed from: a, reason: collision with root package name */
    private long f15575a;

    /* renamed from: b, reason: collision with root package name */
    private String f15576b;

    /* renamed from: c, reason: collision with root package name */
    private String f15577c;

    /* renamed from: d, reason: collision with root package name */
    private String f15578d;

    /* renamed from: e, reason: collision with root package name */
    private String f15579e;

    /* renamed from: f, reason: collision with root package name */
    private String f15580f;

    /* renamed from: g, reason: collision with root package name */
    private String f15581g;

    /* renamed from: h, reason: collision with root package name */
    private String f15582h;

    /* renamed from: i, reason: collision with root package name */
    private String f15583i;

    /* renamed from: j, reason: collision with root package name */
    private long f15584j;

    /* renamed from: k, reason: collision with root package name */
    private C2043h f15585k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f15586l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f15587m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f15588n = new ArrayList();

    public final String a() {
        return this.f15583i;
    }

    public final ArrayList b() {
        return this.f15587m;
    }

    public final String c() {
        return this.f15581g;
    }

    public final String d() {
        if (this.f15581g != null) {
            return this.f15581g + UptodownApp.f29249C.r() + ":webp";
        }
        return null;
    }

    public final String e() {
        return this.f15582h;
    }

    public final ArrayList f() {
        return this.f15586l;
    }

    public final String g() {
        return this.f15579e;
    }

    public final C2043h h() {
        return this.f15585k;
    }

    public final ArrayList i() {
        return this.f15588n;
    }

    public final String j() {
        return this.f15576b;
    }

    public final String k() {
        return this.f15580f;
    }

    public final String l() {
        return this.f15578d;
    }

    public final String m() {
        return this.f15577c;
    }

    public final ArrayList n(JSONArray jsonArray) {
        AbstractC3292y.i(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            C2043h c2043h = new C2043h();
            JSONObject jSONObject = jsonArray.getJSONObject(i8);
            AbstractC3292y.f(jSONObject);
            c2043h.a(jSONObject);
            arrayList.add(c2043h);
        }
        return arrayList;
    }

    public final void o(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("info")) {
            JSONObject jSONObject = jsonObject.getJSONObject("info");
            if (!jSONObject.isNull("name")) {
                this.f15576b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("webpage")) {
                this.f15577c = jSONObject.getString("webpage");
            }
            if (!jSONObject.isNull("twitter")) {
                this.f15578d = jSONObject.getString("twitter");
            }
            if (!jSONObject.isNull("instagram")) {
                this.f15579e = jSONObject.getString("instagram");
            }
            if (!jSONObject.isNull("tiktok")) {
                this.f15580f = jSONObject.getString("tiktok");
            }
            if (!jSONObject.isNull("feature")) {
                this.f15581g = jSONObject.getString("feature");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f15582h = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("mainAppID")) {
                this.f15584j = jSONObject.getLong("mainAppID");
            }
            if (!jSONObject.isNull("organizationID")) {
                this.f15575a = jSONObject.getLong("organizationID");
            }
            if (!jSONObject.isNull("bio")) {
                this.f15583i = jSONObject.getString("bio");
            }
        }
        if (!jsonObject.isNull("mainApp")) {
            C2043h c2043h = new C2043h();
            JSONObject jSONObject2 = jsonObject.getJSONObject("mainApp");
            AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
            c2043h.a(jSONObject2);
            this.f15585k = c2043h;
        }
        if (!jsonObject.isNull("importantApps")) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jsonObject.optJSONArray("importantApps");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    C2043h c2043h2 = new C2043h();
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i8);
                    AbstractC3292y.f(jSONObject3);
                    c2043h2.a(jSONObject3);
                    arrayList.add(c2043h2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f15586l = arrayList;
            }
        }
        if (!jsonObject.isNull("carouselApps")) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("carouselApps");
            int length2 = jSONArray.length();
            for (int i9 = 0; i9 < length2; i9++) {
                C2043h c2043h3 = new C2043h();
                JSONObject jSONObject4 = jSONArray.getJSONObject(i9);
                AbstractC3292y.f(jSONObject4);
                c2043h3.a(jSONObject4);
                arrayList2.add(c2043h3);
            }
            if (!arrayList2.isEmpty()) {
                this.f15587m = arrayList2;
            }
        }
        if (!jsonObject.isNull("apps")) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray2 = jsonObject.getJSONArray("apps");
            int length3 = jSONArray2.length();
            for (int i10 = 0; i10 < length3; i10++) {
                C2043h c2043h4 = new C2043h();
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i10);
                AbstractC3292y.f(jSONObject5);
                c2043h4.a(jSONObject5);
                arrayList3.add(c2043h4);
            }
            if (!arrayList3.isEmpty()) {
                this.f15588n = arrayList3;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f15588n = arrayList;
    }
}
