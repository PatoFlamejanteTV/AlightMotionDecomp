package c5;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c5.N;
import c5.V;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2043h implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private long f15797A;

    /* renamed from: A0, reason: collision with root package name */
    private int f15798A0;

    /* renamed from: B, reason: collision with root package name */
    private long f15799B;

    /* renamed from: B0, reason: collision with root package name */
    private int f15800B0;

    /* renamed from: C, reason: collision with root package name */
    private int f15801C;

    /* renamed from: C0, reason: collision with root package name */
    private int f15802C0;

    /* renamed from: D, reason: collision with root package name */
    private String f15803D;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f15804D0;

    /* renamed from: E, reason: collision with root package name */
    private String f15805E;

    /* renamed from: E0, reason: collision with root package name */
    private transient ArrayList f15806E0;

    /* renamed from: F, reason: collision with root package name */
    private String f15807F;

    /* renamed from: G, reason: collision with root package name */
    private String f15808G;

    /* renamed from: H, reason: collision with root package name */
    private String f15809H;

    /* renamed from: I, reason: collision with root package name */
    private String f15810I;

    /* renamed from: J, reason: collision with root package name */
    private int f15811J;

    /* renamed from: K, reason: collision with root package name */
    private ArrayList f15812K;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f15813L;

    /* renamed from: M, reason: collision with root package name */
    private String f15814M;

    /* renamed from: N, reason: collision with root package name */
    private String f15815N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f15816O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f15817P;

    /* renamed from: Q, reason: collision with root package name */
    private J f15818Q;

    /* renamed from: R, reason: collision with root package name */
    private String f15819R;

    /* renamed from: S, reason: collision with root package name */
    private String f15820S;

    /* renamed from: T, reason: collision with root package name */
    private String f15821T;

    /* renamed from: U, reason: collision with root package name */
    private int f15822U;

    /* renamed from: V, reason: collision with root package name */
    private String f15823V;

    /* renamed from: W, reason: collision with root package name */
    private String f15824W;

    /* renamed from: X, reason: collision with root package name */
    private String f15825X;

    /* renamed from: Y, reason: collision with root package name */
    private String f15826Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f15827Z;

    /* renamed from: a, reason: collision with root package name */
    private long f15828a;

    /* renamed from: b, reason: collision with root package name */
    private String f15829b;

    /* renamed from: c, reason: collision with root package name */
    private String f15830c;

    /* renamed from: d, reason: collision with root package name */
    private long f15831d;

    /* renamed from: e, reason: collision with root package name */
    private String f15832e;

    /* renamed from: f, reason: collision with root package name */
    private String f15833f;

    /* renamed from: g, reason: collision with root package name */
    private String f15834g;

    /* renamed from: h, reason: collision with root package name */
    private String f15835h;

    /* renamed from: i, reason: collision with root package name */
    private int f15836i;

    /* renamed from: j, reason: collision with root package name */
    private int f15837j;

    /* renamed from: k, reason: collision with root package name */
    private String f15838k;

    /* renamed from: l, reason: collision with root package name */
    private String f15839l;

    /* renamed from: m, reason: collision with root package name */
    private String f15840m;

    /* renamed from: n, reason: collision with root package name */
    private String f15841n;

    /* renamed from: o, reason: collision with root package name */
    private String f15842o;

    /* renamed from: p, reason: collision with root package name */
    private int f15843p;

    /* renamed from: p0, reason: collision with root package name */
    private String f15844p0;

    /* renamed from: q, reason: collision with root package name */
    private int f15845q;

    /* renamed from: q0, reason: collision with root package name */
    private long f15846q0;

    /* renamed from: r, reason: collision with root package name */
    private int f15847r;

    /* renamed from: r0, reason: collision with root package name */
    private String f15848r0;

    /* renamed from: s, reason: collision with root package name */
    private int f15849s;

    /* renamed from: s0, reason: collision with root package name */
    private String f15850s0;

    /* renamed from: t, reason: collision with root package name */
    private int f15851t;

    /* renamed from: t0, reason: collision with root package name */
    private String f15852t0;

    /* renamed from: u, reason: collision with root package name */
    private int f15853u;

    /* renamed from: u0, reason: collision with root package name */
    private int f15854u0;

    /* renamed from: v, reason: collision with root package name */
    private int f15855v;

    /* renamed from: v0, reason: collision with root package name */
    private String f15856v0;

    /* renamed from: w, reason: collision with root package name */
    private String f15857w;

    /* renamed from: w0, reason: collision with root package name */
    private int f15858w0;

    /* renamed from: x, reason: collision with root package name */
    private C2046k f15859x;

    /* renamed from: x0, reason: collision with root package name */
    private String f15860x0;

    /* renamed from: y, reason: collision with root package name */
    private int f15861y;

    /* renamed from: y0, reason: collision with root package name */
    private c f15862y0;

    /* renamed from: z, reason: collision with root package name */
    private String f15863z;

    /* renamed from: z0, reason: collision with root package name */
    private HashMap f15864z0;

    /* renamed from: F0, reason: collision with root package name */
    public static final b f15796F0 = new b(null);
    public static Parcelable.Creator<C2043h> CREATOR = new a();

    /* renamed from: c5.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2043h createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new C2043h(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2043h[] newArray(int i8) {
            return new C2043h[i8];
        }
    }

    /* renamed from: c5.h$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C2043h a(JSONObject jsonObjectData) {
            AbstractC3292y.i(jsonObjectData, "jsonObjectData");
            C2043h c2043h = new C2043h();
            c2043h.a(jsonObjectData);
            return c2043h;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: c5.h$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15865a = new c("UPDATE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f15866b = new c("PROMOTED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f15867c = new c("LATEST", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f15868d = new c("EDITOR_CHOICE", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final c f15869e = new c("TRENDING", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final c f15870f = new c("NONE", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ c[] f15871g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ W5.a f15872h;

        static {
            c[] a9 = a();
            f15871g = a9;
            f15872h = W5.b.a(a9);
        }

        private c(String str, int i8) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f15865a, f15866b, f15867c, f15868d, f15869e, f15870f};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f15871g.clone();
        }
    }

    public C2043h() {
        this.f15831d = -1L;
        this.f15797A = -1L;
        this.f15799B = -1L;
        this.f15862y0 = c.f15870f;
        this.f15864z0 = new HashMap();
    }

    private final void l1(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f15828a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f15829b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("license")) {
            this.f15835h = jSONObject.getString("license");
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.f15831d = jSONObject.getLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.f15833f = jSONObject.getString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f15839l = jSONObject.getString("iconURL");
        } else if (!jSONObject.isNull(RewardPlus.ICON)) {
            this.f15839l = jSONObject.getString(RewardPlus.ICON);
        }
        if (!jSONObject.isNull("feature")) {
            this.f15840m = jSONObject.getString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.f15840m = jSONObject.getString("imageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.f15841n = jSONObject.getString("author");
        }
        if (!jSONObject.isNull("size")) {
            this.f15834g = jSONObject.getString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.f15836i = jSONObject.getInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.f15837j = jSONObject.getInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.f15838k = jSONObject.getString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.f15832e = jSONObject.getString("urlShare");
        }
        if (!jSONObject.isNull("description")) {
            String string = jSONObject.getString("description");
            AbstractC3292y.h(string, "getString(...)");
            this.f15842o = l6.n.z(string, "\n", "<br />", false, 4, null);
        }
        if (!jSONObject.isNull(CampaignEx.JSON_KEY_STAR)) {
            this.f15843p = jSONObject.getInt(CampaignEx.JSON_KEY_STAR);
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.f15845q = jSONObject.getInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.f15847r = jSONObject.getInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.f15849s = jSONObject.getInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.f15851t = jSONObject.getInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.f15853u = jSONObject.getInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.f15855v = jSONObject.getInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.f15857w = jSONObject.getString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.f15857w = jSONObject.getString("packageName");
        }
        if (!jSONObject.isNull("categoryData")) {
            C2046k c2046k = new C2046k(0, null, null, 7, null);
            this.f15859x = c2046k;
            AbstractC3292y.f(c2046k);
            JSONObject jSONObject2 = jSONObject.getJSONObject("categoryData");
            AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
            c2046k.v(jSONObject2);
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.f15861y = jSONObject.getInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.f15803D = jSONObject.getString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.f15801C = jSONObject.getInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.f15807F = jSONObject.getString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.f15809H = jSONObject.getString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.f15810I = jSONObject.getString("versionRequired");
        }
        if (!jSONObject.isNull("fromUnity")) {
            this.f15811J = jSONObject.getInt("fromUnity");
        }
        if (!jSONObject.isNull("compatibleFile")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("compatibleFile");
            if (!jSONObject3.isNull("densities")) {
                JSONArray jSONArray = jSONObject3.getJSONArray("densities");
                this.f15812K = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    ArrayList arrayList = this.f15812K;
                    if (arrayList != null) {
                        arrayList.add(jSONArray.getString(i8));
                    }
                }
            }
            if (!jSONObject3.isNull("abis")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("abis");
                this.f15813L = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    ArrayList arrayList2 = this.f15813L;
                    if (arrayList2 != null) {
                        arrayList2.add(jSONArray2.getString(i9));
                    }
                }
            }
            if (!jSONObject3.isNull("fileID")) {
                this.f15797A = jSONObject3.getLong("fileID");
            }
            if (!jSONObject3.isNull("minSDK")) {
                this.f15863z = jSONObject3.getString("minSDK");
            }
            if (!jSONObject3.isNull("version")) {
                this.f15830c = jSONObject3.getString("version");
            }
            if (!jSONObject3.isNull("sha256")) {
                this.f15808G = jSONObject3.getString("sha256");
            }
            if (!jSONObject3.isNull("url_apk")) {
                this.f15805E = jSONObject3.getString("url_apk");
            }
        }
        if (!jSONObject.isNull("website")) {
            this.f15814M = jSONObject.getString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String string2 = jSONObject.getString("downloadStatus");
            this.f15815N = string2;
            if (l6.n.t(string2, "PreRegister", false, 2, null)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("preRegister");
                if (!jSONObject4.isNull("date")) {
                    this.f15819R = jSONObject4.getString("date");
                }
                if (!jSONObject4.isNull("countPreRegistered")) {
                    this.f15820S = jSONObject4.getString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.f15821T = jSONObject.getString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.f15822U = jSONObject.getInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilities")) {
            this.f15823V = jSONObject.getString("responsibilities");
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f15824W = jSONObject.getString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.f15825X = jSONObject.getString("deviceType");
        }
        if (!jSONObject.isNull("translations")) {
            this.f15864z0 = new HashMap();
            if (jSONObject.getJSONObject("translations") != null) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("translations");
                if (!jSONObject5.isNull("try")) {
                    HashMap hashMap = this.f15864z0;
                    AbstractC3292y.f(hashMap);
                    hashMap.put("try", jSONObject5.getString("try"));
                }
                if (!jSONObject5.isNull("supportedDevice")) {
                    HashMap hashMap2 = this.f15864z0;
                    AbstractC3292y.f(hashMap2);
                    hashMap2.put("supportedDevice", jSONObject5.getString("supportedDevice"));
                }
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.f15826Y = jSONObject.getString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.f15827Z = jSONObject.getString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.f15844p0 = jSONObject.getString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.f15846q0 = jSONObject.getLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.f15848r0 = jSONObject.getString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.f15850s0 = jSONObject.getString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.f15858w0 = jSONObject.getInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.f15852t0 = jSONObject.getString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.f15854u0 = jSONObject.getInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.f15856v0 = jSONObject.getString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int i10 = jSONObject.getInt("tagID");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    this.f15862y0 = c.f15868d;
                                }
                            } else {
                                this.f15862y0 = c.f15866b;
                            }
                        } else {
                            this.f15862y0 = c.f15865a;
                        }
                    } else {
                        this.f15862y0 = c.f15867c;
                    }
                } else {
                    this.f15862y0 = c.f15869e;
                }
            } else {
                this.f15862y0 = c.f15870f;
            }
            if (!jSONObject.isNull("tag")) {
                this.f15860x0 = jSONObject.getString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.f15798A0 = jSONObject.getInt("promoted");
        }
        if (!jSONObject.isNull("containsAds")) {
            this.f15800B0 = jSONObject.getInt("containsAds");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.getBoolean("hasAlternatives")) {
                this.f15802C0 = 1;
            } else {
                this.f15802C0 = 0;
            }
        }
    }

    public final String A0() {
        return this.f15820S;
    }

    public final int B0() {
        return this.f15843p;
    }

    public final int C0() {
        return this.f15845q;
    }

    public final int D0() {
        return this.f15847r;
    }

    public final int E0() {
        return this.f15849s;
    }

    public final int F0() {
        return this.f15851t;
    }

    public final int G0() {
        return this.f15853u;
    }

    public final int H0() {
        return this.f15855v;
    }

    public final int I() {
        return this.f15836i;
    }

    public final String I0() {
        return this.f15826Y;
    }

    public final J J0() {
        return this.f15818Q;
    }

    public final String K0() {
        return this.f15823V;
    }

    public final ArrayList L0() {
        return this.f15816O;
    }

    public final String M0() {
        return this.f15808G;
    }

    public final String N0() {
        return this.f15833f;
    }

    public final int O0() {
        return this.f15858w0;
    }

    public final String P0() {
        return this.f15834g;
    }

    public final String Q() {
        return this.f15850s0;
    }

    public final ArrayList Q0() {
        return this.f15813L;
    }

    public final ArrayList R0() {
        return this.f15812K;
    }

    public final String S0() {
        return this.f15860x0;
    }

    public final c T0() {
        return this.f15862y0;
    }

    public final String U() {
        return this.f15852t0;
    }

    public final String U0() {
        return this.f15809H;
    }

    public final int V0() {
        return this.f15854u0;
    }

    public final String W() {
        return this.f15848r0;
    }

    public final String W0(String key) {
        AbstractC3292y.i(key, "key");
        HashMap hashMap = this.f15864z0;
        if (hashMap != null) {
            return (String) hashMap.get(key);
        }
        return null;
    }

    public final String X() {
        return this.f15844p0;
    }

    public final String X0() {
        return this.f15832e;
    }

    public final String Y() {
        return this.f15827Z;
    }

    public final long Y0() {
        return this.f15799B;
    }

    public final String Z() {
        return this.f15840m;
    }

    public final String Z0() {
        return this.f15830c;
    }

    public final void a(JSONObject jsonObjectData) {
        AbstractC3292y.i(jsonObjectData, "jsonObjectData");
        if (jsonObjectData.has(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
            JSONObject jSONObject = jsonObjectData.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            AbstractC3292y.h(jSONObject, "getJSONObject(...)");
            l1(jSONObject);
        } else {
            l1(jsonObjectData);
        }
        if (jsonObjectData.has("videos")) {
            JSONArray jSONArray = jsonObjectData.getJSONArray("videos");
            this.f15817P = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                V.b bVar = V.f15704c;
                Object obj = jSONArray.get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type org.json.JSONObject");
                V a9 = bVar.a((JSONObject) obj);
                ArrayList arrayList = this.f15817P;
                AbstractC3292y.f(arrayList);
                arrayList.add(a9);
            }
        }
        if (jsonObjectData.has("screenshots")) {
            JSONArray jSONArray2 = jsonObjectData.getJSONArray("screenshots");
            this.f15816O = new ArrayList();
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                N.b bVar2 = N.f15658e;
                Object obj2 = jSONArray2.get(i9);
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                N b9 = bVar2.b((JSONObject) obj2);
                ArrayList arrayList2 = this.f15816O;
                if (arrayList2 != null) {
                    arrayList2.add(b9);
                }
            }
        }
    }

    public final String a0() {
        if (this.f15840m != null) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.A() > 0) {
                return this.f15840m + ':' + aVar.A() + ":webp";
            }
            return c0();
        }
        return null;
    }

    public final String a1() {
        return this.f15810I;
    }

    public final boolean b() {
        if (!k1() && !h1() && e1()) {
            return true;
        }
        return false;
    }

    public final String b0() {
        if (this.f15840m != null) {
            return this.f15840m + UptodownApp.f29249C.q() + ":webp";
        }
        return null;
    }

    public final ArrayList b1() {
        return this.f15817P;
    }

    public final String c0() {
        if (this.f15840m != null) {
            return this.f15840m + UptodownApp.f29249C.r() + ":webp";
        }
        return null;
    }

    public final String c1() {
        return this.f15814M;
    }

    public final long d0() {
        return this.f15797A;
    }

    public final boolean d1() {
        if (this.f15797A >= 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final int e0() {
        return this.f15811J;
    }

    public final boolean e1() {
        if (this.f15854u0 > 1) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f15801C;
    }

    public final int f0() {
        return this.f15802C0;
    }

    public final boolean f1() {
        return AbstractC3292y.d(this.f15815N, "Discontinued");
    }

    public final String g0() {
        if (this.f15840m != null) {
            return this.f15840m + UptodownApp.f29249C.s() + ":webp";
        }
        return null;
    }

    public final boolean g1() {
        if (this.f15815N != null && !i1() && !f1() && !h1() && !k1()) {
            return true;
        }
        return false;
    }

    public final long h() {
        return this.f15828a;
    }

    public final String h0() {
        return this.f15839l;
    }

    public final boolean h1() {
        return AbstractC3292y.d(this.f15815N, "ExternalDownload");
    }

    public final long i(K responseJson) {
        int i8;
        JSONObject jSONObject;
        AbstractC3292y.i(responseJson, "responseJson");
        try {
            if (!responseJson.b() && responseJson.d() != null) {
                String d8 = responseJson.d();
                AbstractC3292y.f(d8);
                JSONObject jSONObject2 = new JSONObject(d8);
                if (!jSONObject2.isNull("success")) {
                    i8 = jSONObject2.getInt("success");
                } else {
                    i8 = 0;
                }
                if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONObject = null;
                }
                if (i8 == 1 && jSONObject != null && !jSONObject.isNull("appID")) {
                    return jSONObject.getLong("appID");
                }
            }
            return 0L;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public final String i0(int i8) {
        if (this.f15839l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(i8);
            return this.f15839l + sb.toString() + ":webp";
        }
        return null;
    }

    public final boolean i1() {
        return AbstractC3292y.d(this.f15815N, "PreRegister");
    }

    public final String j0() {
        if (this.f15839l != null) {
            return this.f15839l + UptodownApp.f29249C.t() + ":webp";
        }
        return null;
    }

    public final boolean j1() {
        if (this.f15798A0 == 1) {
            return true;
        }
        return false;
    }

    public final String k0() {
        if (this.f15839l != null) {
            return this.f15839l + UptodownApp.f29249C.u() + ":webp";
        }
        return null;
    }

    public final boolean k1() {
        return AbstractC3292y.d(this.f15815N, "ReadingMode");
    }

    public final String l() {
        return this.f15841n;
    }

    public final String l0() {
        return this.f15838k;
    }

    public final long m0() {
        return this.f15831d;
    }

    public final void m1(long j8) {
        this.f15828a = j8;
    }

    public final String n0() {
        return this.f15835h;
    }

    public final void n1(String str) {
        this.f15840m = str;
    }

    public final String o0() {
        return this.f15803D;
    }

    public final void o1(boolean z8) {
        this.f15804D0 = z8;
    }

    public final C2046k p() {
        return this.f15859x;
    }

    public final String p0() {
        return this.f15863z;
    }

    public final void p1(ArrayList arrayList) {
        this.f15806E0 = arrayList;
    }

    public final String q0() {
        return this.f15829b;
    }

    public final void q1(J j8) {
        this.f15818Q = j8;
    }

    public final String r0() {
        return this.f15821T;
    }

    public final void r1(ArrayList arrayList) {
        this.f15816O = arrayList;
    }

    public final int s() {
        return this.f15800B0;
    }

    public final boolean s0() {
        return this.f15804D0;
    }

    public final void s1(ArrayList arrayList) {
        this.f15817P = arrayList;
    }

    public final ArrayList t0() {
        return this.f15806E0;
    }

    public String toString() {
        return "AppInfo(appID=" + this.f15828a + ", name=" + this.f15829b + ", versionName=" + this.f15830c + ", lastVersionCode=" + this.f15831d + ", urlShare=" + this.f15832e + ", shortDescription=" + this.f15833f + ", size=" + this.f15834g + ", license=" + this.f15835h + ", downloads=" + this.f15836i + ", weeklyDownloads=" + this.f15837j + ", lastUpdate=" + this.f15838k + ", icon=" + this.f15839l + ", feature=" + this.f15840m + ", author=" + this.f15841n + ", description=" + this.f15842o + ", rating=" + this.f15843p + ", ratingCount=" + this.f15845q + ", ratingCount1=" + this.f15847r + ", ratingCount2=" + this.f15849s + ", ratingCount3=" + this.f15851t + ", ratingCount4=" + this.f15853u + ", ratingCount5=" + this.f15855v + ", packagename=" + this.f15857w + ", screenShots=" + this.f15816O + ", category=" + this.f15859x + ", permissionCount=" + this.f15861y + ", minsdk=" + this.f15863z + ", md5signature=" + this.f15803D + ", downloadUrl=" + this.f15805E + ", fileID=" + this.f15797A + ", oldVersions=" + this.f15806E0 + ", activeADEX=" + this.f15801C + ", sha256=" + this.f15808G + ", technicalData=" + this.f15809H + ", versionRequired=" + this.f15810I + ", fromUnity=" + this.f15811J + ", webAuthor=" + this.f15814M + ", downloadStatus=" + this.f15815N + ", devOnBoard=" + this.f15822U + ", responsibilities=" + this.f15823V + ", phase=" + this.f15824W + ", readingModeText=" + this.f15826Y + ", externalDownloadUrl=" + this.f15827Z + ", externalDownloadText=" + this.f15844p0 + ", organizationID=" + this.f15846q0 + ", editorName=" + this.f15848r0 + ", totalVersions=" + this.f15854u0 + ", disclaimerText=" + this.f15856v0 + ')';
    }

    public final String u() {
        return this.f15842o;
    }

    public final long u0() {
        return this.f15846q0;
    }

    public final int v() {
        return this.f15822U;
    }

    public final String v0() {
        return this.f15857w;
    }

    public final String w() {
        return this.f15825X;
    }

    public final String w0() {
        return this.f15807F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeLong(this.f15828a);
        parcel.writeString(this.f15829b);
        parcel.writeString(this.f15830c);
        parcel.writeLong(this.f15831d);
        parcel.writeString(this.f15832e);
        parcel.writeString(this.f15833f);
        parcel.writeString(this.f15834g);
        parcel.writeString(this.f15835h);
        parcel.writeInt(this.f15836i);
        parcel.writeInt(this.f15837j);
        parcel.writeString(this.f15838k);
        parcel.writeString(this.f15839l);
        parcel.writeString(this.f15840m);
        parcel.writeString(this.f15841n);
        parcel.writeString(this.f15842o);
        parcel.writeInt(this.f15843p);
        parcel.writeInt(this.f15845q);
        parcel.writeInt(this.f15847r);
        parcel.writeInt(this.f15849s);
        parcel.writeInt(this.f15851t);
        parcel.writeInt(this.f15853u);
        parcel.writeInt(this.f15855v);
        parcel.writeString(this.f15857w);
        parcel.writeParcelable(this.f15859x, i8);
        parcel.writeInt(this.f15861y);
        parcel.writeString(this.f15863z);
        parcel.writeString(this.f15803D);
        parcel.writeString(this.f15805E);
        parcel.writeLong(this.f15797A);
        parcel.writeInt(this.f15801C);
        parcel.writeString(this.f15808G);
        parcel.writeString(this.f15809H);
        parcel.writeString(this.f15810I);
        parcel.writeInt(this.f15811J);
        parcel.writeStringList(this.f15812K);
        parcel.writeStringList(this.f15813L);
        parcel.writeString(this.f15814M);
        parcel.writeString(this.f15815N);
        parcel.writeString(this.f15807F);
        parcel.writeInt(this.f15822U);
        parcel.writeString(this.f15825X);
        parcel.writeMap(this.f15864z0);
        parcel.writeString(this.f15826Y);
        parcel.writeString(this.f15827Z);
        parcel.writeString(this.f15844p0);
        parcel.writeLong(this.f15846q0);
        parcel.writeString(this.f15848r0);
        parcel.writeInt(this.f15854u0);
        parcel.writeString(this.f15823V);
        parcel.writeString(this.f15821T);
        parcel.writeString(this.f15819R);
        parcel.writeString(this.f15820S);
        parcel.writeString(this.f15850s0);
        parcel.writeString(this.f15852t0);
        parcel.writeString(this.f15856v0);
        parcel.writeInt(this.f15858w0);
        parcel.writeInt(this.f15800B0);
        parcel.writeInt(this.f15802C0);
    }

    public final String x() {
        return this.f15856v0;
    }

    public final int x0() {
        return this.f15861y;
    }

    public final String y() {
        return this.f15815N;
    }

    public final String y0() {
        return this.f15824W;
    }

    public final String z() {
        return this.f15805E;
    }

    public final String z0() {
        return this.f15819R;
    }

    public C2043h(Parcel source) {
        Object readParcelable;
        AbstractC3292y.i(source, "source");
        this.f15831d = -1L;
        this.f15797A = -1L;
        this.f15799B = -1L;
        this.f15862y0 = c.f15870f;
        this.f15864z0 = new HashMap();
        this.f15828a = source.readLong();
        this.f15829b = source.readString();
        this.f15830c = source.readString();
        this.f15831d = source.readLong();
        this.f15832e = source.readString();
        this.f15833f = source.readString();
        this.f15834g = source.readString();
        this.f15835h = source.readString();
        this.f15836i = source.readInt();
        this.f15837j = source.readInt();
        this.f15838k = source.readString();
        this.f15839l = source.readString();
        this.f15840m = source.readString();
        this.f15841n = source.readString();
        this.f15842o = source.readString();
        this.f15843p = source.readInt();
        this.f15845q = source.readInt();
        this.f15847r = source.readInt();
        this.f15849s = source.readInt();
        this.f15851t = source.readInt();
        this.f15853u = source.readInt();
        this.f15855v = source.readInt();
        this.f15857w = source.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = source.readParcelable(C2046k.class.getClassLoader(), C2046k.class);
            this.f15859x = (C2046k) readParcelable;
        } else {
            this.f15859x = (C2046k) source.readParcelable(C2046k.class.getClassLoader());
        }
        this.f15861y = source.readInt();
        this.f15863z = source.readString();
        this.f15803D = source.readString();
        this.f15805E = source.readString();
        this.f15797A = source.readLong();
        this.f15801C = source.readInt();
        this.f15808G = source.readString();
        this.f15809H = source.readString();
        this.f15810I = source.readString();
        this.f15811J = source.readInt();
        this.f15812K = source.createStringArrayList();
        this.f15813L = source.createStringArrayList();
        this.f15814M = source.readString();
        this.f15815N = source.readString();
        this.f15807F = source.readString();
        this.f15822U = source.readInt();
        this.f15825X = source.readString();
        HashMap readHashMap = source.readHashMap(ClassLoader.getSystemClassLoader());
        AbstractC3292y.g(readHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        this.f15864z0 = readHashMap;
        this.f15826Y = source.readString();
        this.f15827Z = source.readString();
        this.f15844p0 = source.readString();
        this.f15846q0 = source.readLong();
        this.f15848r0 = source.readString();
        this.f15854u0 = source.readInt();
        this.f15823V = source.readString();
        this.f15821T = source.readString();
        this.f15819R = source.readString();
        this.f15820S = source.readString();
        this.f15850s0 = source.readString();
        this.f15852t0 = source.readString();
        this.f15856v0 = source.readString();
        this.f15858w0 = source.readInt();
        this.f15800B0 = source.readInt();
        this.f15802C0 = source.readInt();
    }
}
