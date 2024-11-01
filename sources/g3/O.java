package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class O implements z2.f {
    public static final Parcelable.Creator<O> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f32065a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32066b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32067c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32068d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32069e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32070f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32071g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32072h;

    /* renamed from: i, reason: collision with root package name */
    private final String f32073i;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new O(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O[] newArray(int i8) {
            return new O[i8];
        }
    }

    public O(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f32065a = str;
        this.f32066b = str2;
        this.f32067c = str3;
        this.f32068d = str4;
        this.f32069e = str5;
        this.f32070f = str6;
        this.f32071g = str7;
        this.f32072h = str8;
        this.f32073i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (AbstractC3292y.d(this.f32065a, o8.f32065a) && AbstractC3292y.d(this.f32066b, o8.f32066b) && AbstractC3292y.d(this.f32067c, o8.f32067c) && AbstractC3292y.d(this.f32068d, o8.f32068d) && AbstractC3292y.d(this.f32069e, o8.f32069e) && AbstractC3292y.d(this.f32070f, o8.f32070f) && AbstractC3292y.d(this.f32071g, o8.f32071g) && AbstractC3292y.d(this.f32072h, o8.f32072h) && AbstractC3292y.d(this.f32073i, o8.f32073i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.f32065a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f32066b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f32067c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f32068d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f32069e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f32070f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f32071g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f32072h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.f32073i;
        if (str9 != null) {
            i8 = str9.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "WeChat(statementDescriptor=" + this.f32065a + ", appId=" + this.f32066b + ", nonce=" + this.f32067c + ", packageValue=" + this.f32068d + ", partnerId=" + this.f32069e + ", prepayId=" + this.f32070f + ", sign=" + this.f32071g + ", timestamp=" + this.f32072h + ", qrCodeUrl=" + this.f32073i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32065a);
        out.writeString(this.f32066b);
        out.writeString(this.f32067c);
        out.writeString(this.f32068d);
        out.writeString(this.f32069e);
        out.writeString(this.f32070f);
        out.writeString(this.f32071g);
        out.writeString(this.f32072h);
        out.writeString(this.f32073i);
    }

    public /* synthetic */ O(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i8 & 256) != 0 ? null : str9);
    }
}
