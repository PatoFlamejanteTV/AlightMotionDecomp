package P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final int f8014i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f8015a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8016b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8017c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8018d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f8019e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8020f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f8021g;

    /* renamed from: h, reason: collision with root package name */
    private final a f8022h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0157a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f8023a;

        /* renamed from: b, reason: collision with root package name */
        private final List f8024b;

        /* renamed from: P2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0157a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(z8, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(boolean z8, List preferredNetworks) {
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            this.f8023a = z8;
            this.f8024b = preferredNetworks;
        }

        public final boolean a() {
            return this.f8023a;
        }

        public final List b() {
            return this.f8024b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8023a == aVar.f8023a && AbstractC3292y.d(this.f8024b, aVar.f8024b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f8023a) * 31) + this.f8024b.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f8023a + ", preferredNetworks=" + this.f8024b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f8023a ? 1 : 0);
            out.writeStringList(this.f8024b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z8;
            boolean z9;
            AbstractC3292y.i(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(d.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            c createFromParcel = c.CREATOR.createFromParcel(parcel);
            a aVar = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readParcelable(d.class.getClassLoader()), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                linkedHashMap2.put(readString3, Boolean.valueOf(z9));
            }
            if (parcel.readInt() != 0) {
                aVar = a.CREATOR.createFromParcel(parcel);
            }
            return new d(stripeIntent, readString, readString2, createFromParcel, linkedHashMap, z8, linkedHashMap2, aVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f8025a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8026b;

        /* renamed from: c, reason: collision with root package name */
        private final String f8027c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8028d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3, String str4) {
            this.f8025a = str;
            this.f8026b = str2;
            this.f8027c = str3;
            this.f8028d = str4;
        }

        public final String a() {
            return this.f8028d;
        }

        public final String b() {
            return this.f8026b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f8025a, cVar.f8025a) && AbstractC3292y.d(this.f8026b, cVar.f8026b) && AbstractC3292y.d(this.f8027c, cVar.f8027c) && AbstractC3292y.d(this.f8028d, cVar.f8028d)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f8025a;
        }

        public final String h() {
            return this.f8027c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f8025a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f8026b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f8027c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f8028d;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "CustomerInfo(name=" + this.f8025a + ", email=" + this.f8026b + ", phone=" + this.f8027c + ", billingCountryCode=" + this.f8028d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f8025a);
            out.writeString(this.f8026b);
            out.writeString(this.f8027c);
            out.writeString(this.f8028d);
        }
    }

    public d(StripeIntent stripeIntent, String merchantName, String str, c customerInfo, Map map, boolean z8, Map flags, a aVar) {
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(customerInfo, "customerInfo");
        AbstractC3292y.i(flags, "flags");
        this.f8015a = stripeIntent;
        this.f8016b = merchantName;
        this.f8017c = str;
        this.f8018d = customerInfo;
        this.f8019e = map;
        this.f8020f = z8;
        this.f8021g = flags;
        this.f8022h = aVar;
    }

    public final a a() {
        return this.f8022h;
    }

    public final c b() {
        return this.f8018d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f8015a, dVar.f8015a) && AbstractC3292y.d(this.f8016b, dVar.f8016b) && AbstractC3292y.d(this.f8017c, dVar.f8017c) && AbstractC3292y.d(this.f8018d, dVar.f8018d) && AbstractC3292y.d(this.f8019e, dVar.f8019e) && this.f8020f == dVar.f8020f && AbstractC3292y.d(this.f8021g, dVar.f8021g) && AbstractC3292y.d(this.f8022h, dVar.f8022h)) {
            return true;
        }
        return false;
    }

    public final Map f() {
        return this.f8021g;
    }

    public final String h() {
        return this.f8017c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.f8015a.hashCode() * 31) + this.f8016b.hashCode()) * 31;
        String str = this.f8017c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode3 + hashCode) * 31) + this.f8018d.hashCode()) * 31;
        Map map = this.f8019e;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int a9 = (((((hashCode4 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f8020f)) * 31) + this.f8021g.hashCode()) * 31;
        a aVar = this.f8022h;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return a9 + i8;
    }

    public final String i() {
        return this.f8016b;
    }

    public final boolean l() {
        return this.f8020f;
    }

    public final StripeIntent p() {
        return this.f8015a;
    }

    public String toString() {
        return "LinkConfiguration(stripeIntent=" + this.f8015a + ", merchantName=" + this.f8016b + ", merchantCountryCode=" + this.f8017c + ", customerInfo=" + this.f8018d + ", shippingValues=" + this.f8019e + ", passthroughModeEnabled=" + this.f8020f + ", flags=" + this.f8021g + ", cardBrandChoice=" + this.f8022h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f8015a, i8);
        out.writeString(this.f8016b);
        out.writeString(this.f8017c);
        this.f8018d.writeToParcel(out, i8);
        Map map = this.f8019e;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeParcelable((Parcelable) entry.getKey(), i8);
                out.writeString((String) entry.getValue());
            }
        }
        out.writeInt(this.f8020f ? 1 : 0);
        Map map2 = this.f8021g;
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeInt(((Boolean) entry2.getValue()).booleanValue() ? 1 : 0);
        }
        a aVar = this.f8022h;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
    }
}
