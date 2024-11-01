package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class t implements z2.f {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f32239a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32240b;

    /* renamed from: c, reason: collision with root package name */
    private final C2895E f32241c;

    /* renamed from: d, reason: collision with root package name */
    private final List f32242d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32243e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f32244f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32245g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32246h;

    /* renamed from: i, reason: collision with root package name */
    private final String f32247i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f32248j;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            C2895E createFromParcel;
            boolean z8;
            boolean z9;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2895E.CREATOR.createFromParcel(parcel);
            }
            C2895E c2895e = createFromParcel;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(t.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new t(readString, readString2, c2895e, arrayList, z8, num2, readString3, readString4, readString5, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    public t(String str, String str2, C2895E c2895e, List sources, boolean z8, Integer num, String str3, String str4, String str5, boolean z9) {
        AbstractC3292y.i(sources, "sources");
        this.f32239a = str;
        this.f32240b = str2;
        this.f32241c = c2895e;
        this.f32242d = sources;
        this.f32243e = z8;
        this.f32244f = num;
        this.f32245g = str3;
        this.f32246h = str4;
        this.f32247i = str5;
        this.f32248j = z9;
    }

    public final String a() {
        return this.f32247i;
    }

    public final C2895E b() {
        return this.f32241c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3292y.d(this.f32239a, tVar.f32239a) && AbstractC3292y.d(this.f32240b, tVar.f32240b) && AbstractC3292y.d(this.f32241c, tVar.f32241c) && AbstractC3292y.d(this.f32242d, tVar.f32242d) && this.f32243e == tVar.f32243e && AbstractC3292y.d(this.f32244f, tVar.f32244f) && AbstractC3292y.d(this.f32245g, tVar.f32245g) && AbstractC3292y.d(this.f32246h, tVar.f32246h) && AbstractC3292y.d(this.f32247i, tVar.f32247i) && this.f32248j == tVar.f32248j) {
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
        String str = this.f32239a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f32240b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C2895E c2895e = this.f32241c;
        if (c2895e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2895e.hashCode();
        }
        int hashCode7 = (((((i10 + hashCode3) * 31) + this.f32242d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32243e)) * 31;
        Integer num = this.f32244f;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i11 = (hashCode7 + hashCode4) * 31;
        String str3 = this.f32245g;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str4 = this.f32246h;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str5 = this.f32247i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return ((i13 + i8) * 31) + androidx.compose.foundation.a.a(this.f32248j);
    }

    public String toString() {
        return "Customer(id=" + this.f32239a + ", defaultSource=" + this.f32240b + ", shippingInformation=" + this.f32241c + ", sources=" + this.f32242d + ", hasMore=" + this.f32243e + ", totalCount=" + this.f32244f + ", url=" + this.f32245g + ", description=" + this.f32246h + ", email=" + this.f32247i + ", liveMode=" + this.f32248j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32239a);
        out.writeString(this.f32240b);
        C2895E c2895e = this.f32241c;
        if (c2895e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2895e.writeToParcel(out, i8);
        }
        List list = this.f32242d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        out.writeInt(this.f32243e ? 1 : 0);
        Integer num = this.f32244f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f32245g);
        out.writeString(this.f32246h);
        out.writeString(this.f32247i);
        out.writeInt(this.f32248j ? 1 : 0);
    }
}
