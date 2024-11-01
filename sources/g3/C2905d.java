package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2905d implements z2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f32094a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f32095b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32096c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32097d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32098e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32099f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32100g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32101h;

    /* renamed from: i, reason: collision with root package name */
    private final String f32102i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32103j;

    /* renamed from: k, reason: collision with root package name */
    private final String f32104k;

    /* renamed from: l, reason: collision with root package name */
    private final String f32105l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC2906e f32106m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC2907f f32107n;

    /* renamed from: o, reason: collision with root package name */
    private final String f32108o;

    /* renamed from: p, reason: collision with root package name */
    private final String f32109p;

    /* renamed from: q, reason: collision with root package name */
    private final String f32110q;

    /* renamed from: r, reason: collision with root package name */
    private final String f32111r;

    /* renamed from: s, reason: collision with root package name */
    private final String f32112s;

    /* renamed from: t, reason: collision with root package name */
    private final String f32113t;

    /* renamed from: u, reason: collision with root package name */
    private final M f32114u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f32093v = new a(null);
    public static final Parcelable.Creator<C2905d> CREATOR = new b();

    /* renamed from: g3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ EnumC2906e a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return EnumC2906e.f32122t;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return EnumC2906e.f32119q;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return EnumC2906e.f32123u;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return EnumC2906e.f32118p;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return EnumC2906e.f32121s;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return EnumC2906e.f32117o;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return EnumC2906e.f32120r;
                        }
                        break;
                }
            }
            return EnumC2906e.f32125w;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2905d createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            EnumC2907f valueOf3;
            M valueOf4;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            EnumC2906e valueOf5 = EnumC2906e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = EnumC2907f.valueOf(parcel.readString());
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = M.valueOf(parcel.readString());
            }
            return new C2905d(valueOf, valueOf2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, valueOf5, valueOf3, readString11, readString12, readString13, readString14, readString15, readString16, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2905d[] newArray(int i8) {
            return new C2905d[i8];
        }
    }

    public C2905d(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EnumC2906e brand, EnumC2907f enumC2907f, String str11, String str12, String str13, String str14, String str15, String str16, M m8) {
        AbstractC3292y.i(brand, "brand");
        this.f32094a = num;
        this.f32095b = num2;
        this.f32096c = str;
        this.f32097d = str2;
        this.f32098e = str3;
        this.f32099f = str4;
        this.f32100g = str5;
        this.f32101h = str6;
        this.f32102i = str7;
        this.f32103j = str8;
        this.f32104k = str9;
        this.f32105l = str10;
        this.f32106m = brand;
        this.f32107n = enumC2907f;
        this.f32108o = str11;
        this.f32109p = str12;
        this.f32110q = str13;
        this.f32111r = str14;
        this.f32112s = str15;
        this.f32113t = str16;
        this.f32114u = m8;
    }

    public final M a() {
        return this.f32114u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2905d)) {
            return false;
        }
        C2905d c2905d = (C2905d) obj;
        if (AbstractC3292y.d(this.f32094a, c2905d.f32094a) && AbstractC3292y.d(this.f32095b, c2905d.f32095b) && AbstractC3292y.d(this.f32096c, c2905d.f32096c) && AbstractC3292y.d(this.f32097d, c2905d.f32097d) && AbstractC3292y.d(this.f32098e, c2905d.f32098e) && AbstractC3292y.d(this.f32099f, c2905d.f32099f) && AbstractC3292y.d(this.f32100g, c2905d.f32100g) && AbstractC3292y.d(this.f32101h, c2905d.f32101h) && AbstractC3292y.d(this.f32102i, c2905d.f32102i) && AbstractC3292y.d(this.f32103j, c2905d.f32103j) && AbstractC3292y.d(this.f32104k, c2905d.f32104k) && AbstractC3292y.d(this.f32105l, c2905d.f32105l) && this.f32106m == c2905d.f32106m && this.f32107n == c2905d.f32107n && AbstractC3292y.d(this.f32108o, c2905d.f32108o) && AbstractC3292y.d(this.f32109p, c2905d.f32109p) && AbstractC3292y.d(this.f32110q, c2905d.f32110q) && AbstractC3292y.d(this.f32111r, c2905d.f32111r) && AbstractC3292y.d(this.f32112s, c2905d.f32112s) && AbstractC3292y.d(this.f32113t, c2905d.f32113t) && this.f32114u == c2905d.f32114u) {
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        Integer num = this.f32094a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f32095b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f32096c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f32097d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f32098e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f32099f;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f32100g;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.f32101h;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.f32102i;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.f32103j;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.f32104k;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.f32105l;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int hashCode20 = (((i19 + hashCode12) * 31) + this.f32106m.hashCode()) * 31;
        EnumC2907f enumC2907f = this.f32107n;
        if (enumC2907f == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = enumC2907f.hashCode();
        }
        int i20 = (hashCode20 + hashCode13) * 31;
        String str11 = this.f32108o;
        if (str11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str11.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        String str12 = this.f32109p;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str13 = this.f32110q;
        if (str13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str13.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        String str14 = this.f32111r;
        if (str14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str14.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        String str15 = this.f32112s;
        if (str15 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str15.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        String str16 = this.f32113t;
        if (str16 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str16.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        M m8 = this.f32114u;
        if (m8 != null) {
            i8 = m8.hashCode();
        }
        return i26 + i8;
    }

    public String toString() {
        return "Card(expMonth=" + this.f32094a + ", expYear=" + this.f32095b + ", name=" + this.f32096c + ", addressLine1=" + this.f32097d + ", addressLine1Check=" + this.f32098e + ", addressLine2=" + this.f32099f + ", addressCity=" + this.f32100g + ", addressState=" + this.f32101h + ", addressZip=" + this.f32102i + ", addressZipCheck=" + this.f32103j + ", addressCountry=" + this.f32104k + ", last4=" + this.f32105l + ", brand=" + this.f32106m + ", funding=" + this.f32107n + ", fingerprint=" + this.f32108o + ", country=" + this.f32109p + ", currency=" + this.f32110q + ", customerId=" + this.f32111r + ", cvcCheck=" + this.f32112s + ", id=" + this.f32113t + ", tokenizationMethod=" + this.f32114u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        Integer num = this.f32094a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f32095b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f32096c);
        out.writeString(this.f32097d);
        out.writeString(this.f32098e);
        out.writeString(this.f32099f);
        out.writeString(this.f32100g);
        out.writeString(this.f32101h);
        out.writeString(this.f32102i);
        out.writeString(this.f32103j);
        out.writeString(this.f32104k);
        out.writeString(this.f32105l);
        out.writeString(this.f32106m.name());
        EnumC2907f enumC2907f = this.f32107n;
        if (enumC2907f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC2907f.name());
        }
        out.writeString(this.f32108o);
        out.writeString(this.f32109p);
        out.writeString(this.f32110q);
        out.writeString(this.f32111r);
        out.writeString(this.f32112s);
        out.writeString(this.f32113t);
        M m8 = this.f32114u;
        if (m8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(m8.name());
        }
    }
}
