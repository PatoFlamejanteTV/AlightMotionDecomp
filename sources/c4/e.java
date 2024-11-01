package c4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f15481a;

    /* renamed from: b, reason: collision with root package name */
    private String f15482b;

    /* renamed from: c, reason: collision with root package name */
    private String f15483c;

    /* renamed from: d, reason: collision with root package name */
    private String f15484d;

    /* renamed from: e, reason: collision with root package name */
    private String f15485e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String str, String str2, String str3, String str4, String str5) {
        this.f15481a = str;
        this.f15482b = str2;
        this.f15483c = str3;
        this.f15484d = str4;
        this.f15485e = str5;
    }

    public final String a() {
        return this.f15484d;
    }

    public final String b() {
        return this.f15482b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f15481a, eVar.f15481a) && AbstractC3292y.d(this.f15482b, eVar.f15482b) && AbstractC3292y.d(this.f15483c, eVar.f15483c) && AbstractC3292y.d(this.f15484d, eVar.f15484d) && AbstractC3292y.d(this.f15485e, eVar.f15485e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f15481a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f15481a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f15482b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f15483c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f15484d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f15485e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.f15481a + ", acsTransactionId=" + this.f15482b + ", acsRefNumber=" + this.f15483c + ", acsSignedContent=" + this.f15484d + ", threeDSRequestorAppURL=" + this.f15485e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f15481a);
        out.writeString(this.f15482b);
        out.writeString(this.f15483c);
        out.writeString(this.f15484d);
        out.writeString(this.f15485e);
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
