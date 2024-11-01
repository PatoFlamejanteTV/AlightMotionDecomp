package G3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.BankAccount;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2.c f2955a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2956b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0056a();

        /* renamed from: c, reason: collision with root package name */
        private final C2.c f2957c;

        /* renamed from: d, reason: collision with root package name */
        private final C2.c f2958d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f2959e;

        /* renamed from: G3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0056a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                C2.c cVar = (C2.c) parcel.readParcelable(a.class.getClassLoader());
                C2.c cVar2 = (C2.c) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(cVar, cVar2, z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(C2.c cVar, C2.c cVar2, boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : cVar, cVar2, z8);
        }

        public static /* synthetic */ a l(a aVar, C2.c cVar, C2.c cVar2, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                cVar = aVar.f2957c;
            }
            if ((i8 & 2) != 0) {
                cVar2 = aVar.f2958d;
            }
            if ((i8 & 4) != 0) {
                z8 = aVar.f2959e;
            }
            return aVar.i(cVar, cVar2, z8);
        }

        @Override // G3.f
        public C2.c a() {
            return this.f2957c;
        }

        @Override // G3.f
        public C2.c b() {
            return null;
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
            if (AbstractC3292y.d(this.f2957c, aVar.f2957c) && AbstractC3292y.d(this.f2958d, aVar.f2958d) && this.f2959e == aVar.f2959e) {
                return true;
            }
            return false;
        }

        @Override // G3.f
        public C2.c f() {
            return this.f2958d;
        }

        @Override // G3.f
        public boolean h() {
            return this.f2959e;
        }

        public int hashCode() {
            int hashCode;
            C2.c cVar = this.f2957c;
            if (cVar == null) {
                hashCode = 0;
            } else {
                hashCode = cVar.hashCode();
            }
            return (((hashCode * 31) + this.f2958d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f2959e);
        }

        public final a i(C2.c cVar, C2.c primaryButtonText, boolean z8) {
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            return new a(cVar, primaryButtonText, z8);
        }

        public String toString() {
            return "BillingDetailsCollection(error=" + this.f2957c + ", primaryButtonText=" + this.f2958d + ", isProcessing=" + this.f2959e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f2957c, i8);
            out.writeParcelable(this.f2958d, i8);
            out.writeInt(this.f2959e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2.c cVar, C2.c primaryButtonText, boolean z8) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            this.f2957c = cVar;
            this.f2958d = primaryButtonText;
            this.f2959e = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final c f2960c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2961d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2962e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2963f;

        /* renamed from: g, reason: collision with root package name */
        private final C2.c f2964g;

        /* renamed from: h, reason: collision with root package name */
        private final C2.c f2965h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b((c) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (C2.c) parcel.readParcelable(b.class.getClassLoader()), (C2.c) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c resultIdentifier, String str, String str2, String str3, C2.c primaryButtonText, C2.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3292y.i(resultIdentifier, "resultIdentifier");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            this.f2960c = resultIdentifier;
            this.f2961d = str;
            this.f2962e = str2;
            this.f2963f = str3;
            this.f2964g = primaryButtonText;
            this.f2965h = cVar;
        }

        public static /* synthetic */ b l(b bVar, c cVar, String str, String str2, String str3, C2.c cVar2, C2.c cVar3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                cVar = bVar.f2960c;
            }
            if ((i8 & 2) != 0) {
                str = bVar.f2961d;
            }
            String str4 = str;
            if ((i8 & 4) != 0) {
                str2 = bVar.f2962e;
            }
            String str5 = str2;
            if ((i8 & 8) != 0) {
                str3 = bVar.f2963f;
            }
            String str6 = str3;
            if ((i8 & 16) != 0) {
                cVar2 = bVar.f2964g;
            }
            C2.c cVar4 = cVar2;
            if ((i8 & 32) != 0) {
                cVar3 = bVar.f2965h;
            }
            return bVar.i(cVar, str4, str5, str6, cVar4, cVar3);
        }

        @Override // G3.f
        public C2.c b() {
            return this.f2965h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f2960c, bVar.f2960c) && AbstractC3292y.d(this.f2961d, bVar.f2961d) && AbstractC3292y.d(this.f2962e, bVar.f2962e) && AbstractC3292y.d(this.f2963f, bVar.f2963f) && AbstractC3292y.d(this.f2964g, bVar.f2964g) && AbstractC3292y.d(this.f2965h, bVar.f2965h)) {
                return true;
            }
            return false;
        }

        @Override // G3.f
        public C2.c f() {
            return this.f2964g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f2960c.hashCode() * 31;
            String str = this.f2961d;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str2 = this.f2962e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f2963f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((i10 + hashCode3) * 31) + this.f2964g.hashCode()) * 31;
            C2.c cVar = this.f2965h;
            if (cVar != null) {
                i8 = cVar.hashCode();
            }
            return hashCode5 + i8;
        }

        public final b i(c resultIdentifier, String str, String str2, String str3, C2.c primaryButtonText, C2.c cVar) {
            AbstractC3292y.i(resultIdentifier, "resultIdentifier");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            return new b(resultIdentifier, str, str2, str3, primaryButtonText, cVar);
        }

        public final String p() {
            return this.f2961d;
        }

        public final String s() {
            return this.f2962e;
        }

        public String toString() {
            return "MandateCollection(resultIdentifier=" + this.f2960c + ", bankName=" + this.f2961d + ", last4=" + this.f2962e + ", intentId=" + this.f2963f + ", primaryButtonText=" + this.f2964g + ", mandateText=" + this.f2965h + ")";
        }

        public final c u() {
            return this.f2960c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f2960c, i8);
            out.writeString(this.f2961d);
            out.writeString(this.f2962e);
            out.writeString(this.f2963f);
            out.writeParcelable(this.f2964g, i8);
            out.writeParcelable(this.f2965h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements c {
            public static final Parcelable.Creator<a> CREATOR = new C0057a();

            /* renamed from: a, reason: collision with root package name */
            private final String f2966a;

            /* renamed from: G3.f$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0057a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String id) {
                AbstractC3292y.i(id, "id");
                this.f2966a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3292y.d(this.f2966a, ((a) obj).f2966a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f2966a;
            }

            public int hashCode() {
                return this.f2966a.hashCode();
            }

            public String toString() {
                return "PaymentMethod(id=" + this.f2966a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f2966a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f2967a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
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

            public b(String id) {
                AbstractC3292y.i(id, "id");
                this.f2967a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3292y.d(this.f2967a, ((b) obj).f2967a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f2967a;
            }

            public int hashCode() {
                return this.f2967a.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f2967a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f2967a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f2968c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2969d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2970e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2971f;

        /* renamed from: g, reason: collision with root package name */
        private final C2.c f2972g;

        /* renamed from: h, reason: collision with root package name */
        private final C2.c f2973h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (C2.c) parcel.readParcelable(d.class.getClassLoader()), (C2.c) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String bankName, String str3, C2.c primaryButtonText, C2.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3292y.i(bankName, "bankName");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            this.f2968c = str;
            this.f2969d = str2;
            this.f2970e = bankName;
            this.f2971f = str3;
            this.f2972g = primaryButtonText;
            this.f2973h = cVar;
        }

        public static /* synthetic */ d l(d dVar, String str, String str2, String str3, String str4, C2.c cVar, C2.c cVar2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = dVar.f2968c;
            }
            if ((i8 & 2) != 0) {
                str2 = dVar.f2969d;
            }
            String str5 = str2;
            if ((i8 & 4) != 0) {
                str3 = dVar.f2970e;
            }
            String str6 = str3;
            if ((i8 & 8) != 0) {
                str4 = dVar.f2971f;
            }
            String str7 = str4;
            if ((i8 & 16) != 0) {
                cVar = dVar.f2972g;
            }
            C2.c cVar3 = cVar;
            if ((i8 & 32) != 0) {
                cVar2 = dVar.f2973h;
            }
            return dVar.i(str, str5, str6, str7, cVar3, cVar2);
        }

        @Override // G3.f
        public C2.c b() {
            return this.f2973h;
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
            if (AbstractC3292y.d(this.f2968c, dVar.f2968c) && AbstractC3292y.d(this.f2969d, dVar.f2969d) && AbstractC3292y.d(this.f2970e, dVar.f2970e) && AbstractC3292y.d(this.f2971f, dVar.f2971f) && AbstractC3292y.d(this.f2972g, dVar.f2972g) && AbstractC3292y.d(this.f2973h, dVar.f2973h)) {
                return true;
            }
            return false;
        }

        @Override // G3.f
        public C2.c f() {
            return this.f2972g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f2968c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f2969d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode4 = (((i9 + hashCode2) * 31) + this.f2970e.hashCode()) * 31;
            String str3 = this.f2971f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((hashCode4 + hashCode3) * 31) + this.f2972g.hashCode()) * 31;
            C2.c cVar = this.f2973h;
            if (cVar != null) {
                i8 = cVar.hashCode();
            }
            return hashCode5 + i8;
        }

        public final d i(String str, String str2, String bankName, String str3, C2.c primaryButtonText, C2.c cVar) {
            AbstractC3292y.i(bankName, "bankName");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            return new d(str, str2, bankName, str3, primaryButtonText, cVar);
        }

        public final String p() {
            return this.f2970e;
        }

        public final String s() {
            return this.f2968c;
        }

        public String toString() {
            return "SavedAccount(financialConnectionsSessionId=" + this.f2968c + ", intentId=" + this.f2969d + ", bankName=" + this.f2970e + ", last4=" + this.f2971f + ", primaryButtonText=" + this.f2972g + ", mandateText=" + this.f2973h + ")";
        }

        public final String u() {
            return this.f2971f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f2968c);
            out.writeString(this.f2969d);
            out.writeString(this.f2970e);
            out.writeString(this.f2971f);
            out.writeParcelable(this.f2972g, i8);
            out.writeParcelable(this.f2973h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final BankAccount f2974c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2975d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2976e;

        /* renamed from: f, reason: collision with root package name */
        private final C2.c f2977f;

        /* renamed from: g, reason: collision with root package name */
        private final C2.c f2978g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readString(), (C2.c) parcel.readParcelable(e.class.getClassLoader()), (C2.c) parcel.readParcelable(e.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BankAccount paymentAccount, String financialConnectionsSessionId, String str, C2.c primaryButtonText, C2.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3292y.i(paymentAccount, "paymentAccount");
            AbstractC3292y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            this.f2974c = paymentAccount;
            this.f2975d = financialConnectionsSessionId;
            this.f2976e = str;
            this.f2977f = primaryButtonText;
            this.f2978g = cVar;
        }

        public static /* synthetic */ e l(e eVar, BankAccount bankAccount, String str, String str2, C2.c cVar, C2.c cVar2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                bankAccount = eVar.f2974c;
            }
            if ((i8 & 2) != 0) {
                str = eVar.f2975d;
            }
            String str3 = str;
            if ((i8 & 4) != 0) {
                str2 = eVar.f2976e;
            }
            String str4 = str2;
            if ((i8 & 8) != 0) {
                cVar = eVar.f2977f;
            }
            C2.c cVar3 = cVar;
            if ((i8 & 16) != 0) {
                cVar2 = eVar.f2978g;
            }
            return eVar.i(bankAccount, str3, str4, cVar3, cVar2);
        }

        @Override // G3.f
        public C2.c b() {
            return this.f2978g;
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
            if (AbstractC3292y.d(this.f2974c, eVar.f2974c) && AbstractC3292y.d(this.f2975d, eVar.f2975d) && AbstractC3292y.d(this.f2976e, eVar.f2976e) && AbstractC3292y.d(this.f2977f, eVar.f2977f) && AbstractC3292y.d(this.f2978g, eVar.f2978g)) {
                return true;
            }
            return false;
        }

        @Override // G3.f
        public C2.c f() {
            return this.f2977f;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f2974c.hashCode() * 31) + this.f2975d.hashCode()) * 31;
            String str = this.f2976e;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f2977f.hashCode()) * 31;
            C2.c cVar = this.f2978g;
            if (cVar != null) {
                i8 = cVar.hashCode();
            }
            return hashCode3 + i8;
        }

        public final e i(BankAccount paymentAccount, String financialConnectionsSessionId, String str, C2.c primaryButtonText, C2.c cVar) {
            AbstractC3292y.i(paymentAccount, "paymentAccount");
            AbstractC3292y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            AbstractC3292y.i(primaryButtonText, "primaryButtonText");
            return new e(paymentAccount, financialConnectionsSessionId, str, primaryButtonText, cVar);
        }

        public final String p() {
            return this.f2975d;
        }

        public final BankAccount s() {
            return this.f2974c;
        }

        public String toString() {
            return "VerifyWithMicrodeposits(paymentAccount=" + this.f2974c + ", financialConnectionsSessionId=" + this.f2975d + ", intentId=" + this.f2976e + ", primaryButtonText=" + this.f2977f + ", mandateText=" + this.f2978g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable((Parcelable) this.f2974c, i8);
            out.writeString(this.f2975d);
            out.writeString(this.f2976e);
            out.writeParcelable(this.f2977f, i8);
            out.writeParcelable(this.f2978g, i8);
        }
    }

    public /* synthetic */ f(C2.c cVar, boolean z8, AbstractC3284p abstractC3284p) {
        this(cVar, z8);
    }

    public C2.c a() {
        return this.f2955a;
    }

    public abstract C2.c b();

    public abstract C2.c f();

    public boolean h() {
        return this.f2956b;
    }

    private f(C2.c cVar, boolean z8) {
        this.f2955a = cVar;
        this.f2956b = z8;
    }

    public /* synthetic */ f(C2.c cVar, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : cVar, (i8 & 2) != 0 ? false : z8, null);
    }
}
