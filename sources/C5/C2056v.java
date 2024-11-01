package c5;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: c5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2056v implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f15955a;

    /* renamed from: b, reason: collision with root package name */
    private String f15956b;

    /* renamed from: c5.v$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2056v createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2056v(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2056v[] newArray(int i8) {
            return new C2056v[i8];
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2056v() {
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!jSONObject.isNull("antivirusName")) {
                this.f15955a = jSONObject.getString("antivirusName");
            }
            if (!jSONObject.isNull("virusName")) {
                this.f15956b = jSONObject.getString("virusName");
            }
        }
    }

    public final String b() {
        return this.f15955a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String f() {
        return this.f15956b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15955a);
        parcel.writeString(this.f15956b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2056v(Parcel parcel) {
        this();
        AbstractC3292y.i(parcel, "parcel");
        this.f15955a = parcel.readString();
        this.f15956b = parcel.readString();
    }
}
