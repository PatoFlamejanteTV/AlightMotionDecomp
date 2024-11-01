package a8;

import D5.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class e implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f14164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14166c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14167d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14168e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            AbstractC3292y.i(parcel, "parcel");
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                str = "";
            } else {
                str = readString;
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                str2 = "";
            } else {
                str2 = readString2;
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                str3 = "";
            } else {
                str3 = readString3;
            }
            String readString4 = parcel.readString();
            if (readString4 == null) {
                str4 = "";
            } else {
                str4 = readString4;
            }
            String readString5 = parcel.readString();
            if (readString5 == null) {
                str5 = "";
            } else {
                str5 = readString5;
            }
            return new e(str, str2, str3, str4, str5);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String type, String maxAge, String domain, String purposes) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(maxAge, "maxAge");
        AbstractC3292y.i(domain, "domain");
        AbstractC3292y.i(purposes, "purposes");
        this.f14164a = name;
        this.f14165b = type;
        this.f14166c = maxAge;
        this.f14167d = domain;
        this.f14168e = purposes;
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
        if (AbstractC3292y.d(this.f14164a, eVar.f14164a) && AbstractC3292y.d(this.f14165b, eVar.f14165b) && AbstractC3292y.d(this.f14166c, eVar.f14166c) && AbstractC3292y.d(this.f14167d, eVar.f14167d) && AbstractC3292y.d(this.f14168e, eVar.f14168e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14168e.hashCode() + t.a(this.f14167d, t.a(this.f14166c, t.a(this.f14165b, this.f14164a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("DisclosureInfo(name=");
        a9.append(this.f14164a);
        a9.append(", type=");
        a9.append(this.f14165b);
        a9.append(", maxAge=");
        a9.append(this.f14166c);
        a9.append(", domain=");
        a9.append(this.f14167d);
        a9.append(", purposes=");
        a9.append(this.f14168e);
        a9.append(')');
        return a9.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f14164a);
        parcel.writeString(this.f14165b);
        parcel.writeString(this.f14166c);
        parcel.writeString(this.f14167d);
        parcel.writeString(this.f14168e);
    }
}
