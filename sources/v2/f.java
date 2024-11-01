package v2;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f implements z2.f, Serializable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f40448a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40449b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40450c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40451d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40452e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40453f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40454g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f40455h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new f(readString, readString2, readString3, readString4, readString5, readString6, readString7, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.f40448a = str;
        this.f40449b = str2;
        this.f40450c = str3;
        this.f40451d = str4;
        this.f40452e = str5;
        this.f40453f = str6;
        this.f40454g = str7;
        this.f40455h = map;
    }

    public static /* synthetic */ f b(f fVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i8, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Map map2;
        if ((i8 & 1) != 0) {
            str8 = fVar.f40448a;
        } else {
            str8 = str;
        }
        if ((i8 & 2) != 0) {
            str9 = fVar.f40449b;
        } else {
            str9 = str2;
        }
        if ((i8 & 4) != 0) {
            str10 = fVar.f40450c;
        } else {
            str10 = str3;
        }
        if ((i8 & 8) != 0) {
            str11 = fVar.f40451d;
        } else {
            str11 = str4;
        }
        if ((i8 & 16) != 0) {
            str12 = fVar.f40452e;
        } else {
            str12 = str5;
        }
        if ((i8 & 32) != 0) {
            str13 = fVar.f40453f;
        } else {
            str13 = str6;
        }
        if ((i8 & 64) != 0) {
            str14 = fVar.f40454g;
        } else {
            str14 = str7;
        }
        if ((i8 & 128) != 0) {
            map2 = fVar.f40455h;
        } else {
            map2 = map;
        }
        return fVar.a(str8, str9, str10, str11, str12, str13, str14, map2);
    }

    public final f a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        return new f(str, str2, str3, str4, str5, str6, str7, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f40448a, fVar.f40448a) && AbstractC3292y.d(this.f40449b, fVar.f40449b) && AbstractC3292y.d(this.f40450c, fVar.f40450c) && AbstractC3292y.d(this.f40451d, fVar.f40451d) && AbstractC3292y.d(this.f40452e, fVar.f40452e) && AbstractC3292y.d(this.f40453f, fVar.f40453f) && AbstractC3292y.d(this.f40454g, fVar.f40454g) && AbstractC3292y.d(this.f40455h, fVar.f40455h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f40453f;
    }

    public final String getType() {
        return this.f40448a;
    }

    public final String h() {
        return this.f40452e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f40448a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f40449b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f40450c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f40451d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f40452e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f40453f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f40454g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Map map = this.f40455h;
        if (map != null) {
            i8 = map.hashCode();
        }
        return i15 + i8;
    }

    public final String i() {
        return this.f40449b;
    }

    public final String o() {
        return this.f40450c;
    }

    public final String p() {
        return this.f40451d;
    }

    public String toString() {
        return "StripeError(type=" + this.f40448a + ", message=" + this.f40449b + ", code=" + this.f40450c + ", param=" + this.f40451d + ", declineCode=" + this.f40452e + ", charge=" + this.f40453f + ", docUrl=" + this.f40454g + ", extraFields=" + this.f40455h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f40448a);
        out.writeString(this.f40449b);
        out.writeString(this.f40450c);
        out.writeString(this.f40451d);
        out.writeString(this.f40452e);
        out.writeString(this.f40453f);
        out.writeString(this.f40454g);
        Map map = this.f40455h;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7, (i8 & 128) == 0 ? map : null);
    }
}
