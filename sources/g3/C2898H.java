package g3;

import Q5.s;
import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g3.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2898H implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31982a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31983b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31984c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31985d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31986e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31987f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31988g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31989h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31990i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f31981j = new a(null);
    public static final Parcelable.Creator<C2898H> CREATOR = new b();

    /* renamed from: g3.H$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.H$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2898H createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2898H(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2898H[] newArray(int i8) {
            return new C2898H[i8];
        }
    }

    public C2898H(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i8, String str) {
        AbstractC3292y.i(sourceId, "sourceId");
        AbstractC3292y.i(sdkAppId, "sdkAppId");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(deviceData, "deviceData");
        AbstractC3292y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3292y.i(messageVersion, "messageVersion");
        this.f31982a = sourceId;
        this.f31983b = sdkAppId;
        this.f31984c = sdkReferenceNumber;
        this.f31985d = sdkTransactionId;
        this.f31986e = deviceData;
        this.f31987f = sdkEphemeralPublicKey;
        this.f31988g = messageVersion;
        this.f31989h = i8;
        this.f31990i = str;
    }

    private final JSONObject b() {
        Object b9;
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) AbstractC1435t.p("01", "02", "03", "04", "05"))));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Q5.s.g(b9)) {
            b9 = jSONObject;
        }
        return (JSONObject) b9;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map k8 = Q.k(Q5.x.a("source", this.f31982a), Q5.x.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, a().toString()));
        String str = this.f31990i;
        if (str != null) {
            map = Q.e(Q5.x.a("fallback_return_url", str));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }

    public final /* synthetic */ JSONObject a() {
        Object b9;
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b(new JSONObject().put("sdkAppID", this.f31983b).put("sdkTransID", this.f31985d).put("sdkEncData", this.f31986e).put("sdkEphemPubKey", new JSONObject(this.f31987f)).put("sdkMaxTimeout", l6.n.e0(String.valueOf(this.f31989h), 2, '0')).put("sdkReferenceNumber", this.f31984c).put("messageVersion", this.f31988g).put("deviceRenderOptions", b()));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Q5.s.g(b9)) {
            b9 = jSONObject;
        }
        return (JSONObject) b9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2898H)) {
            return false;
        }
        C2898H c2898h = (C2898H) obj;
        if (AbstractC3292y.d(this.f31982a, c2898h.f31982a) && AbstractC3292y.d(this.f31983b, c2898h.f31983b) && AbstractC3292y.d(this.f31984c, c2898h.f31984c) && AbstractC3292y.d(this.f31985d, c2898h.f31985d) && AbstractC3292y.d(this.f31986e, c2898h.f31986e) && AbstractC3292y.d(this.f31987f, c2898h.f31987f) && AbstractC3292y.d(this.f31988g, c2898h.f31988g) && this.f31989h == c2898h.f31989h && AbstractC3292y.d(this.f31990i, c2898h.f31990i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f31982a.hashCode() * 31) + this.f31983b.hashCode()) * 31) + this.f31984c.hashCode()) * 31) + this.f31985d.hashCode()) * 31) + this.f31986e.hashCode()) * 31) + this.f31987f.hashCode()) * 31) + this.f31988g.hashCode()) * 31) + this.f31989h) * 31;
        String str = this.f31990i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.f31982a + ", sdkAppId=" + this.f31983b + ", sdkReferenceNumber=" + this.f31984c + ", sdkTransactionId=" + this.f31985d + ", deviceData=" + this.f31986e + ", sdkEphemeralPublicKey=" + this.f31987f + ", messageVersion=" + this.f31988g + ", maxTimeout=" + this.f31989h + ", returnUrl=" + this.f31990i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31982a);
        out.writeString(this.f31983b);
        out.writeString(this.f31984c);
        out.writeString(this.f31985d);
        out.writeString(this.f31986e);
        out.writeString(this.f31987f);
        out.writeString(this.f31988g);
        out.writeInt(this.f31989h);
        out.writeString(this.f31990i);
    }
}
