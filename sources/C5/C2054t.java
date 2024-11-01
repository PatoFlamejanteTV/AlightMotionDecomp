package c5;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2054t implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15949a;

    /* renamed from: b, reason: collision with root package name */
    private String f15950b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f15948c = new b(null);
    public static Parcelable.Creator<C2054t> CREATOR = new a();

    /* renamed from: c5.t$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2054t createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new C2054t(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2054t[] newArray(int i8) {
            return new C2054t[i8];
        }
    }

    /* renamed from: c5.t$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String faqsJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3292y.i(faqsJson, "faqsJson");
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(faqsJson);
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
                if (i8 == 1 && jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        C2054t c2054t = new C2054t();
                        AbstractC3292y.f(jSONObject2);
                        c2054t.f(jSONObject2);
                        arrayList.add(c2054t);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2054t() {
    }

    public final String a() {
        return this.f15950b;
    }

    public final String b() {
        return this.f15949a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void f(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        try {
            if (!jsonObject.isNull("question")) {
                this.f15949a = jsonObject.getString("question");
            }
            if (!jsonObject.isNull("answer")) {
                this.f15950b = jsonObject.getString("answer");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15949a);
        parcel.writeString(this.f15950b);
    }

    public C2054t(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15949a = source.readString();
        this.f15950b = source.readString();
    }
}
