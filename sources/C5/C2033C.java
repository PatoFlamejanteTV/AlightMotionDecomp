package c5;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2033C implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15568a;

    /* renamed from: b, reason: collision with root package name */
    private long f15569b;

    /* renamed from: c, reason: collision with root package name */
    private String f15570c;

    /* renamed from: d, reason: collision with root package name */
    private long f15571d;

    /* renamed from: e, reason: collision with root package name */
    private String f15572e;

    /* renamed from: f, reason: collision with root package name */
    private String f15573f;

    /* renamed from: g, reason: collision with root package name */
    private String f15574g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f15567h = new b(null);
    public static Parcelable.Creator<C2033C> CREATOR = new a();

    /* renamed from: c5.C$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2033C createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new C2033C(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2033C[] newArray(int i8) {
            return new C2033C[i8];
        }
    }

    /* renamed from: c5.C$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String sJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3292y.i(sJson, "sJson");
            ArrayList arrayList = null;
            try {
                JSONObject jSONObject = new JSONObject(sJson);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.optInt("success", 0);
                } else {
                    i8 = 1;
                }
                if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONArray = null;
                }
                if (i8 != 1 || jSONArray == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                try {
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        C2033C c2033c = new C2033C();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        if (!jSONObject2.isNull("fileID")) {
                            c2033c.s(jSONObject2.getString("fileID"));
                        }
                        if (!jSONObject2.isNull("version")) {
                            c2033c.z(jSONObject2.getString("version"));
                        }
                        if (!jSONObject2.isNull("versionCode")) {
                            c2033c.y(jSONObject2.getLong("versionCode"));
                        }
                        if (!jSONObject2.isNull("sizeInBytes")) {
                            c2033c.x(jSONObject2.getLong("sizeInBytes"));
                        }
                        if (!jSONObject2.isNull("minSDKVersion")) {
                            c2033c.w(jSONObject2.getString("minSDKVersion"));
                        }
                        if (!jSONObject2.isNull("lastUpdate")) {
                            c2033c.v(jSONObject2.getString("lastUpdate"));
                        }
                        if (!jSONObject2.isNull("fileType")) {
                            c2033c.u(jSONObject2.getString("fileType"));
                        }
                        arrayList2.add(c2033c);
                    }
                    return arrayList2;
                } catch (Exception e8) {
                    arrayList = arrayList2;
                    e = e8;
                    e.printStackTrace();
                    return arrayList;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2033C() {
        this.f15569b = -1L;
        this.f15571d = -1L;
    }

    public final String a() {
        return this.f15574g;
    }

    public final String b() {
        return this.f15573f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String f() {
        return this.f15570c;
    }

    public final String h() {
        return this.f15572e;
    }

    public final long i() {
        return this.f15569b;
    }

    public final long l() {
        return this.f15571d;
    }

    public final String p() {
        return this.f15568a;
    }

    public final void s(String str) {
        this.f15574g = str;
    }

    public final void u(String str) {
        this.f15573f = str;
    }

    public final void v(String str) {
        this.f15570c = str;
    }

    public final void w(String str) {
        this.f15572e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15568a);
        parcel.writeString(this.f15570c);
        parcel.writeLong(this.f15571d);
        parcel.writeString(this.f15572e);
        parcel.writeString(this.f15573f);
        parcel.writeString(this.f15574g);
        parcel.writeLong(this.f15569b);
    }

    public final void x(long j8) {
        this.f15569b = j8;
    }

    public final void y(long j8) {
        this.f15571d = j8;
    }

    public final void z(String str) {
        this.f15568a = str;
    }

    public C2033C(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15569b = -1L;
        this.f15571d = -1L;
        this.f15568a = source.readString();
        this.f15570c = source.readString();
        this.f15571d = source.readLong();
        this.f15572e = source.readString();
        this.f15573f = source.readString();
        this.f15574g = source.readString();
        this.f15569b = source.readLong();
    }
}
