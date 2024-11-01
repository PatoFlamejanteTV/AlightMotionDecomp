package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f25913a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25914b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25915c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25916d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25917e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25918f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25919g;

    /* renamed from: h, reason: collision with root package name */
    private final o f25920h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25921i;

    /* renamed from: j, reason: collision with root package name */
    private final List f25922j;

    /* renamed from: k, reason: collision with root package name */
    private final StripeIntent.Status f25923k;

    /* renamed from: l, reason: collision with root package name */
    private final StripeIntent.Usage f25924l;

    /* renamed from: m, reason: collision with root package name */
    private final e f25925m;

    /* renamed from: n, reason: collision with root package name */
    private final List f25926n;

    /* renamed from: o, reason: collision with root package name */
    private final List f25927o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeIntent.a f25928p;

    /* renamed from: q, reason: collision with root package name */
    private final String f25929q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f25911r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f25912s = 8;
    public static final Parcelable.Creator<u> CREATOR = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0526a f25930b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25931c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f25932d = new a("RequestedByCustomer", 1, "requested_by_customer");

        /* renamed from: e, reason: collision with root package name */
        public static final a f25933e = new a("Abandoned", 2, "abandoned");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f25934f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25935g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25936a;

        /* renamed from: com.stripe.android.model.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0526a {
            private C0526a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((a) obj).f25936a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0526a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            a[] a9 = a();
            f25934f = a9;
            f25935g = W5.b.a(a9);
            f25930b = new C0526a(null);
        }

        private a(String str, int i8, String str2) {
            this.f25936a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f25931c, f25932d, f25933e};
        }

        public static W5.a c() {
            return f25935g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25934f.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f25937c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f25938d = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f25939a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25940b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3292y.i(value, "value");
                return b.f25938d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public b(String value) {
            List m8;
            AbstractC3292y.i(value, "value");
            this.f25939a = value;
            List i8 = new l6.j("_secret").i(value, 0);
            if (!i8.isEmpty()) {
                ListIterator listIterator = i8.listIterator(i8.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m8 = AbstractC1435t.Q0(i8, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m8 = AbstractC1435t.m();
            this.f25940b = ((String[]) m8.toArray(new String[0]))[0];
            if (f25937c.a(this.f25939a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.f25939a).toString());
        }

        public final String b() {
            return this.f25940b;
        }

        public final String c() {
            return this.f25939a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f25939a, ((b) obj).f25939a);
        }

        public int hashCode() {
            return this.f25939a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f25939a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new u(parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(u.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements z2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f25943a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25944b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25945c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25946d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25947e;

        /* renamed from: f, reason: collision with root package name */
        private final o f25948f;

        /* renamed from: g, reason: collision with root package name */
        private final c f25949g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f25941h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f25942i = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25950b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f25951c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25952d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f25953e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f25954f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f25955g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f25956h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f25957i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f25958j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25959k;

            /* renamed from: a, reason: collision with root package name */
            private final String f25960a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final c a(String str) {
                    Object obj;
                    Iterator<E> it = c.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(((c) obj).b(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (c) obj;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            static {
                c[] a9 = a();
                f25958j = a9;
                f25959k = W5.b.a(a9);
                f25950b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f25960a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25951c, f25952d, f25953e, f25954f, f25955g, f25956h, f25957i};
            }

            public static W5.a c() {
                return f25959k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25958j.clone();
            }

            public final String b() {
                return this.f25960a;
            }
        }

        public e(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            this.f25943a = str;
            this.f25944b = str2;
            this.f25945c = str3;
            this.f25946d = str4;
            this.f25947e = str5;
            this.f25948f = oVar;
            this.f25949g = cVar;
        }

        public static /* synthetic */ e b(e eVar, String str, String str2, String str3, String str4, String str5, o oVar, c cVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = eVar.f25943a;
            }
            if ((i8 & 2) != 0) {
                str2 = eVar.f25944b;
            }
            String str6 = str2;
            if ((i8 & 4) != 0) {
                str3 = eVar.f25945c;
            }
            String str7 = str3;
            if ((i8 & 8) != 0) {
                str4 = eVar.f25946d;
            }
            String str8 = str4;
            if ((i8 & 16) != 0) {
                str5 = eVar.f25947e;
            }
            String str9 = str5;
            if ((i8 & 32) != 0) {
                oVar = eVar.f25948f;
            }
            o oVar2 = oVar;
            if ((i8 & 64) != 0) {
                cVar = eVar.f25949g;
            }
            return eVar.a(str, str6, str7, str8, str9, oVar2, cVar);
        }

        public final e a(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            return new e(str, str2, str3, str4, str5, oVar, cVar);
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
            return AbstractC3292y.d(this.f25943a, eVar.f25943a) && AbstractC3292y.d(this.f25944b, eVar.f25944b) && AbstractC3292y.d(this.f25945c, eVar.f25945c) && AbstractC3292y.d(this.f25946d, eVar.f25946d) && AbstractC3292y.d(this.f25947e, eVar.f25947e) && AbstractC3292y.d(this.f25948f, eVar.f25948f) && this.f25949g == eVar.f25949g;
        }

        public final String f() {
            return this.f25946d;
        }

        public final c h() {
            return this.f25949g;
        }

        public int hashCode() {
            String str = this.f25943a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25944b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25945c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25946d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25947e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            o oVar = this.f25948f;
            int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f25949g;
            return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String o() {
            return this.f25943a;
        }

        public String toString() {
            return "Error(code=" + this.f25943a + ", declineCode=" + this.f25944b + ", docUrl=" + this.f25945c + ", message=" + this.f25946d + ", param=" + this.f25947e + ", paymentMethod=" + this.f25948f + ", type=" + this.f25949g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25943a);
            out.writeString(this.f25944b);
            out.writeString(this.f25945c);
            out.writeString(this.f25946d);
            out.writeString(this.f25947e);
            o oVar = this.f25948f;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f25949g;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    public u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3292y.i(linkFundingSources, "linkFundingSources");
        this.f25913a = str;
        this.f25914b = aVar;
        this.f25915c = j8;
        this.f25916d = str2;
        this.f25917e = str3;
        this.f25918f = str4;
        this.f25919g = z8;
        this.f25920h = oVar;
        this.f25921i = str5;
        this.f25922j = paymentMethodTypes;
        this.f25923k = status;
        this.f25924l = usage;
        this.f25925m = eVar;
        this.f25926n = unactivatedPaymentMethods;
        this.f25927o = linkFundingSources;
        this.f25928p = aVar2;
        this.f25929q = str6;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List F() {
        return this.f25926n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List J() {
        return this.f25927o;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean K() {
        return AbstractC1435t.d0(a0.i(StripeIntent.Status.f25370d, StripeIntent.Status.f25374h), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b9;
        String str = this.f25929q;
        if (str == null || (b9 = z2.e.f41477a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b9;
    }

    public final u a(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3292y.i(linkFundingSources, "linkFundingSources");
        return new u(str, aVar, j8, str2, str3, str4, z8, oVar, str5, paymentMethodTypes, status, usage, eVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str6);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean c() {
        return this.f25919g;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f25917e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List e() {
        return this.f25922j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC3292y.d(this.f25913a, uVar.f25913a) && this.f25914b == uVar.f25914b && this.f25915c == uVar.f25915c && AbstractC3292y.d(this.f25916d, uVar.f25916d) && AbstractC3292y.d(this.f25917e, uVar.f25917e) && AbstractC3292y.d(this.f25918f, uVar.f25918f) && this.f25919g == uVar.f25919g && AbstractC3292y.d(this.f25920h, uVar.f25920h) && AbstractC3292y.d(this.f25921i, uVar.f25921i) && AbstractC3292y.d(this.f25922j, uVar.f25922j) && this.f25923k == uVar.f25923k && this.f25924l == uVar.f25924l && AbstractC3292y.d(this.f25925m, uVar.f25925m) && AbstractC3292y.d(this.f25926n, uVar.f25926n) && AbstractC3292y.d(this.f25927o, uVar.f25927o) && AbstractC3292y.d(this.f25928p, uVar.f25928p) && AbstractC3292y.d(this.f25929q, uVar.f25929q);
    }

    public final e f() {
        return this.f25925m;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f25913a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f25923k;
    }

    public int hashCode() {
        String str = this.f25913a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f25914b;
        int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + androidx.collection.a.a(this.f25915c)) * 31;
        String str2 = this.f25916d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25917e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25918f;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25919g)) * 31;
        o oVar = this.f25920h;
        int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str5 = this.f25921i;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f25922j.hashCode()) * 31;
        StripeIntent.Status status = this.f25923k;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f25924l;
        int hashCode9 = (hashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        e eVar = this.f25925m;
        int hashCode10 = (((((hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f25926n.hashCode()) * 31) + this.f25927o.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f25928p;
        int hashCode11 = (hashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str6 = this.f25929q;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a j() {
        return this.f25928p;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType k() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        StripeIntent.a j8 = j();
        if (j8 instanceof StripeIntent.a.j) {
            return StripeIntent.NextActionType.f25353d;
        }
        if (j8 instanceof StripeIntent.a.i) {
            return StripeIntent.NextActionType.f25352c;
        }
        if (j8 instanceof StripeIntent.a.g) {
            return StripeIntent.NextActionType.f25354e;
        }
        if (j8 instanceof StripeIntent.a.d) {
            return StripeIntent.NextActionType.f25361l;
        }
        if (j8 instanceof StripeIntent.a.e) {
            return StripeIntent.NextActionType.f25362m;
        }
        if (j8 instanceof StripeIntent.a.f) {
            return StripeIntent.NextActionType.f25363n;
        }
        if (j8 instanceof StripeIntent.a.m) {
            return StripeIntent.NextActionType.f25358i;
        }
        if (j8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f25360k;
        }
        boolean z12 = true;
        if (j8 instanceof StripeIntent.a.C0478a) {
            z8 = true;
        } else {
            z8 = j8 instanceof StripeIntent.a.b;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = j8 instanceof StripeIntent.a.n;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = j8 instanceof StripeIntent.a.l;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = j8 instanceof StripeIntent.a.k;
        }
        if (!z11 && j8 != null) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new Q5.p();
    }

    @Override // com.stripe.android.model.StripeIntent
    public String m() {
        return this.f25916d;
    }

    @Override // com.stripe.android.model.StripeIntent
    public o r() {
        return this.f25920h;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean t() {
        if (getStatus() == StripeIntent.Status.f25371e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SetupIntent(id=" + this.f25913a + ", cancellationReason=" + this.f25914b + ", created=" + this.f25915c + ", countryCode=" + this.f25916d + ", clientSecret=" + this.f25917e + ", description=" + this.f25918f + ", isLiveMode=" + this.f25919g + ", paymentMethod=" + this.f25920h + ", paymentMethodId=" + this.f25921i + ", paymentMethodTypes=" + this.f25922j + ", status=" + this.f25923k + ", usage=" + this.f25924l + ", lastSetupError=" + this.f25925m + ", unactivatedPaymentMethods=" + this.f25926n + ", linkFundingSources=" + this.f25927o + ", nextActionData=" + this.f25928p + ", paymentMethodOptionsJsonString=" + this.f25929q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25913a);
        a aVar = this.f25914b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeLong(this.f25915c);
        out.writeString(this.f25916d);
        out.writeString(this.f25917e);
        out.writeString(this.f25918f);
        out.writeInt(this.f25919g ? 1 : 0);
        o oVar = this.f25920h;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25921i);
        out.writeStringList(this.f25922j);
        StripeIntent.Status status = this.f25923k;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f25924l;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        e eVar = this.f25925m;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f25926n);
        out.writeStringList(this.f25927o);
        out.writeParcelable(this.f25928p, i8);
        out.writeString(this.f25929q);
    }

    public /* synthetic */ u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List list2, List list3, StripeIntent.a aVar2, String str6, int i8, AbstractC3284p abstractC3284p) {
        this(str, aVar, j8, str2, str3, str4, z8, (i8 & 128) != 0 ? null : oVar, str5, list, status, usage, (i8 & 4096) != 0 ? null : eVar, list2, list3, aVar2, (i8 & 65536) != 0 ? null : str6);
    }
}
