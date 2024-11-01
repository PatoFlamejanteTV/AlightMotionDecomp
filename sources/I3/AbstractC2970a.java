package i3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2970a implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final g f32727a;

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0760a extends AbstractC2970a {
        public static final Parcelable.Creator<C0760a> CREATOR = new C0761a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32728b;

        /* renamed from: i3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0761a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0760a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0760a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0760a[] newArray(int i8) {
                return new C0760a[i8];
            }
        }

        public C0760a(String str) {
            super(g.f32738c, null);
            this.f32728b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0760a) && AbstractC3292y.d(this.f32728b, ((C0760a) obj).f32728b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32728b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AmexExpressCheckoutWallet(dynamicLast4=" + this.f32728b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32728b);
        }
    }

    /* renamed from: i3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2970a {
        public static final Parcelable.Creator<b> CREATOR = new C0762a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32729b;

        /* renamed from: i3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0762a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str) {
            super(g.f32739d, null);
            this.f32729b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f32729b, ((b) obj).f32729b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32729b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ApplePayWallet(dynamicLast4=" + this.f32729b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32729b);
        }
    }

    /* renamed from: i3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2970a implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0763a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32730b;

        /* renamed from: i3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0763a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            super(g.f32740e, null);
            this.f32730b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f32730b, ((c) obj).f32730b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32730b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GooglePayWallet(dynamicLast4=" + this.f32730b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32730b);
        }
    }

    /* renamed from: i3.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2970a {
        public static final Parcelable.Creator<d> CREATOR = new C0764a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32731b;

        /* renamed from: i3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0764a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(g.f32744i, null);
            this.f32731b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3292y.d(this.f32731b, ((d) obj).f32731b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32731b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkWallet(dynamicLast4=" + this.f32731b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32731b);
        }
    }

    /* renamed from: i3.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC2970a {
        public static final Parcelable.Creator<e> CREATOR = new C0765a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f32732b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32733c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32734d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f32735e;

        /* renamed from: i3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0765a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3292y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new e(aVar2, readString, readString2, aVar);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2) {
            super(g.f32741f, null);
            this.f32732b = aVar;
            this.f32733c = str;
            this.f32734d = str2;
            this.f32735e = aVar2;
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
            if (AbstractC3292y.d(this.f32732b, eVar.f32732b) && AbstractC3292y.d(this.f32733c, eVar.f32733c) && AbstractC3292y.d(this.f32734d, eVar.f32734d) && AbstractC3292y.d(this.f32735e, eVar.f32735e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            com.stripe.android.model.a aVar = this.f32732b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f32733c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f32734d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f32735e;
            if (aVar2 != null) {
                i8 = aVar2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "MasterpassWallet(billingAddress=" + this.f32732b + ", email=" + this.f32733c + ", name=" + this.f32734d + ", shippingAddress=" + this.f32735e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f32732b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f32733c);
            out.writeString(this.f32734d);
            com.stripe.android.model.a aVar2 = this.f32735e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
        }
    }

    /* renamed from: i3.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC2970a {
        public static final Parcelable.Creator<f> CREATOR = new C0766a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32736b;

        /* renamed from: i3.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0766a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        public f(String str) {
            super(g.f32742g, null);
            this.f32736b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3292y.d(this.f32736b, ((f) obj).f32736b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32736b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SamsungPayWallet(dynamicLast4=" + this.f32736b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32736b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: i3.a$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final C0767a f32737b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f32738c = new g("AmexExpressCheckout", 0, "amex_express_checkout");

        /* renamed from: d, reason: collision with root package name */
        public static final g f32739d = new g("ApplePay", 1, "apple_pay");

        /* renamed from: e, reason: collision with root package name */
        public static final g f32740e = new g("GooglePay", 2, "google_pay");

        /* renamed from: f, reason: collision with root package name */
        public static final g f32741f = new g("Masterpass", 3, "master_pass");

        /* renamed from: g, reason: collision with root package name */
        public static final g f32742g = new g("SamsungPay", 4, "samsung_pay");

        /* renamed from: h, reason: collision with root package name */
        public static final g f32743h = new g("VisaCheckout", 5, "visa_checkout");

        /* renamed from: i, reason: collision with root package name */
        public static final g f32744i = new g("Link", 6, "link");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ g[] f32745j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ W5.a f32746k;

        /* renamed from: a, reason: collision with root package name */
        private final String f32747a;

        /* renamed from: i3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0767a {
            private C0767a() {
            }

            public final g a(String str) {
                Object obj;
                Iterator<E> it = g.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((g) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (g) obj;
            }

            public /* synthetic */ C0767a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            g[] a9 = a();
            f32745j = a9;
            f32746k = W5.b.a(a9);
            f32737b = new C0767a(null);
        }

        private g(String str, int i8, String str2) {
            this.f32747a = str2;
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f32738c, f32739d, f32740e, f32741f, f32742g, f32743h, f32744i};
        }

        public static W5.a c() {
            return f32746k;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f32745j.clone();
        }

        public final String b() {
            return this.f32747a;
        }
    }

    /* renamed from: i3.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2970a {
        public static final Parcelable.Creator<h> CREATOR = new C0768a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f32748b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32749c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32750d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f32751e;

        /* renamed from: f, reason: collision with root package name */
        private final String f32752f;

        /* renamed from: i3.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0768a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3292y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new h(aVar2, readString, readString2, aVar, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2, String str3) {
            super(g.f32743h, null);
            this.f32748b = aVar;
            this.f32749c = str;
            this.f32750d = str2;
            this.f32751e = aVar2;
            this.f32752f = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (AbstractC3292y.d(this.f32748b, hVar.f32748b) && AbstractC3292y.d(this.f32749c, hVar.f32749c) && AbstractC3292y.d(this.f32750d, hVar.f32750d) && AbstractC3292y.d(this.f32751e, hVar.f32751e) && AbstractC3292y.d(this.f32752f, hVar.f32752f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f32748b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f32749c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f32750d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f32751e;
            if (aVar2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aVar2.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str3 = this.f32752f;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "VisaCheckoutWallet(billingAddress=" + this.f32748b + ", email=" + this.f32749c + ", name=" + this.f32750d + ", shippingAddress=" + this.f32751e + ", dynamicLast4=" + this.f32752f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f32748b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f32749c);
            out.writeString(this.f32750d);
            com.stripe.android.model.a aVar2 = this.f32751e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f32752f);
        }
    }

    public /* synthetic */ AbstractC2970a(g gVar, AbstractC3284p abstractC3284p) {
        this(gVar);
    }

    public final g a() {
        return this.f32727a;
    }

    private AbstractC2970a(g gVar) {
        this.f32727a = gVar;
    }
}
