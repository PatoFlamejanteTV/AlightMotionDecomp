package c5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class J implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f15620a;

    /* renamed from: b, reason: collision with root package name */
    private int f15621b;

    /* renamed from: c, reason: collision with root package name */
    private int f15622c;

    /* renamed from: d, reason: collision with root package name */
    private String f15623d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f15624e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public J createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new J(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public J[] newArray(int i8) {
            return new J[i8];
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public J() {
    }

    public final void a(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("sha256")) {
            this.f15620a = jsonObject.getString("sha256");
        }
        if (!jsonObject.isNull("scans")) {
            this.f15621b = jsonObject.getInt("scans");
        }
        if (!jsonObject.isNull("positives")) {
            this.f15622c = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("lastAnalysis")) {
            this.f15623d = jsonObject.getString("lastAnalysis");
        }
        if (!jsonObject.isNull("infections")) {
            this.f15624e = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("infections");
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C2056v c2056v = new C2056v();
                c2056v.a(jSONArray.getJSONObject(i8));
                ArrayList arrayList = this.f15624e;
                AbstractC3292y.f(arrayList);
                arrayList.add(c2056v);
            }
        }
    }

    public final ArrayList b() {
        return this.f15624e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String f() {
        return this.f15623d;
    }

    public final int h() {
        return this.f15622c;
    }

    public final int i() {
        return this.f15621b;
    }

    public final String l() {
        return this.f15620a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15620a);
        parcel.writeInt(this.f15621b);
        parcel.writeInt(this.f15622c);
        parcel.writeString(this.f15623d);
        parcel.writeList(this.f15624e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(Parcel parcel) {
        this();
        AbstractC3292y.i(parcel, "parcel");
        this.f15620a = parcel.readString();
        this.f15621b = parcel.readInt();
        this.f15622c = parcel.readInt();
        this.f15623d = parcel.readString();
        ArrayList arrayList = this.f15624e;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f15624e = arrayList2;
            AbstractC3292y.f(arrayList2);
            parcel.readList(arrayList2, C2056v.class.getClassLoader());
        }
    }
}
