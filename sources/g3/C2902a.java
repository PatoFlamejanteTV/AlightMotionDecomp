package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2902a implements z2.f {
    public static final Parcelable.Creator<C2902a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final C2904c f32074a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32075b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0740a f32076c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32077d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: g3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0740a {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0740a f32078c = new EnumC0740a("Visa", 0, "VISA", EnumC2906e.f32117o);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0740a f32079d = new EnumC0740a("Mastercard", 1, "MASTERCARD", EnumC2906e.f32118p);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0740a f32080e = new EnumC0740a("AmericanExpress", 2, "AMERICAN_EXPRESS", EnumC2906e.f32119q);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0740a f32081f = new EnumC0740a("JCB", 3, "JCB", EnumC2906e.f32121s);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0740a f32082g = new EnumC0740a("DinersClub", 4, "DINERS_CLUB", EnumC2906e.f32122t);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0740a f32083h = new EnumC0740a("Discover", 5, "DISCOVER", EnumC2906e.f32120r);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC0740a f32084i = new EnumC0740a("UnionPay", 6, "UNIONPAY", EnumC2906e.f32123u);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC0740a f32085j = new EnumC0740a("CartesBancaires", 7, "CARTES_BANCAIRES", EnumC2906e.f32124v);

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC0740a[] f32086k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ W5.a f32087l;

        /* renamed from: a, reason: collision with root package name */
        private final String f32088a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2906e f32089b;

        static {
            EnumC0740a[] a9 = a();
            f32086k = a9;
            f32087l = W5.b.a(a9);
        }

        private EnumC0740a(String str, int i8, String str2, EnumC2906e enumC2906e) {
            this.f32088a = str2;
            this.f32089b = enumC2906e;
        }

        private static final /* synthetic */ EnumC0740a[] a() {
            return new EnumC0740a[]{f32078c, f32079d, f32080e, f32081f, f32082g, f32083h, f32084i, f32085j};
        }

        public static W5.a d() {
            return f32087l;
        }

        public static EnumC0740a valueOf(String str) {
            return (EnumC0740a) Enum.valueOf(EnumC0740a.class, str);
        }

        public static EnumC0740a[] values() {
            return (EnumC0740a[]) f32086k.clone();
        }

        public final EnumC2906e b() {
            return this.f32089b;
        }

        public final String c() {
            return this.f32088a;
        }
    }

    /* renamed from: g3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2902a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2902a(C2904c.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC0740a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2902a[] newArray(int i8) {
            return new C2902a[i8];
        }
    }

    public C2902a(C2904c binRange, int i8, EnumC0740a brandInfo, String str) {
        AbstractC3292y.i(binRange, "binRange");
        AbstractC3292y.i(brandInfo, "brandInfo");
        this.f32074a = binRange;
        this.f32075b = i8;
        this.f32076c = brandInfo;
        this.f32077d = str;
    }

    public final C2904c a() {
        return this.f32074a;
    }

    public final EnumC2906e b() {
        return this.f32076c.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2902a)) {
            return false;
        }
        C2902a c2902a = (C2902a) obj;
        if (AbstractC3292y.d(this.f32074a, c2902a.f32074a) && this.f32075b == c2902a.f32075b && this.f32076c == c2902a.f32076c && AbstractC3292y.d(this.f32077d, c2902a.f32077d)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f32075b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f32074a.hashCode() * 31) + this.f32075b) * 31) + this.f32076c.hashCode()) * 31;
        String str = this.f32077d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AccountRange(binRange=" + this.f32074a + ", panLength=" + this.f32075b + ", brandInfo=" + this.f32076c + ", country=" + this.f32077d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f32074a.writeToParcel(out, i8);
        out.writeInt(this.f32075b);
        out.writeString(this.f32076c.name());
        out.writeString(this.f32077d);
    }

    public /* synthetic */ C2902a(C2904c c2904c, int i8, EnumC0740a enumC0740a, String str, int i9, AbstractC3284p abstractC3284p) {
        this(c2904c, i8, enumC0740a, (i9 & 8) != 0 ? null : str);
    }
}
