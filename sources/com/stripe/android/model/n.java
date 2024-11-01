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
public final class n implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f25550a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25551b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f25552c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25553d;

    /* renamed from: e, reason: collision with root package name */
    private final a f25554e;

    /* renamed from: f, reason: collision with root package name */
    private final b f25555f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25556g;

    /* renamed from: h, reason: collision with root package name */
    private final e f25557h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25558i;

    /* renamed from: j, reason: collision with root package name */
    private final long f25559j;

    /* renamed from: k, reason: collision with root package name */
    private final String f25560k;

    /* renamed from: l, reason: collision with root package name */
    private final String f25561l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25562m;

    /* renamed from: n, reason: collision with root package name */
    private final o f25563n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25564o;

    /* renamed from: p, reason: collision with root package name */
    private final String f25565p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeIntent.Status f25566q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeIntent.Usage f25567r;

    /* renamed from: s, reason: collision with root package name */
    private final g f25568s;

    /* renamed from: t, reason: collision with root package name */
    private final h f25569t;

    /* renamed from: u, reason: collision with root package name */
    private final List f25570u;

    /* renamed from: v, reason: collision with root package name */
    private final List f25571v;

    /* renamed from: w, reason: collision with root package name */
    private final StripeIntent.a f25572w;

    /* renamed from: x, reason: collision with root package name */
    private final String f25573x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f25548y = new d(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f25549z = 8;
    public static final Parcelable.Creator<n> CREATOR = new f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0511a f25574b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25575c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f25576d = new a("Fraudulent", 1, "fraudulent");

        /* renamed from: e, reason: collision with root package name */
        public static final a f25577e = new a("RequestedByCustomer", 2, "requested_by_customer");

        /* renamed from: f, reason: collision with root package name */
        public static final a f25578f = new a("Abandoned", 3, "abandoned");

        /* renamed from: g, reason: collision with root package name */
        public static final a f25579g = new a("FailedInvoice", 4, "failed_invoice");

        /* renamed from: h, reason: collision with root package name */
        public static final a f25580h = new a("VoidInvoice", 5, "void_invoice");

        /* renamed from: i, reason: collision with root package name */
        public static final a f25581i = new a("Automatic", 6, "automatic");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f25582j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25583k;

        /* renamed from: a, reason: collision with root package name */
        private final String f25584a;

        /* renamed from: com.stripe.android.model.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0511a {
            private C0511a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((a) obj).f25584a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0511a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            a[] a9 = a();
            f25582j = a9;
            f25583k = W5.b.a(a9);
            f25574b = new C0511a(null);
        }

        private a(String str, int i8, String str2) {
            this.f25584a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f25575c, f25576d, f25577e, f25578f, f25579g, f25580h, f25581i};
        }

        public static W5.a c() {
            return f25583k;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25582j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25585b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f25586c = new b("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final b f25587d = new b("AutomaticAsync", 1, "automatic_async");

        /* renamed from: e, reason: collision with root package name */
        public static final b f25588e = new b("Manual", 2, "manual");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f25589f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25590g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25591a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(String str) {
                Object obj;
                Iterator<E> it = b.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((b) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar == null) {
                    return b.f25586c;
                }
                return bVar;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            b[] a9 = a();
            f25589f = a9;
            f25590g = W5.b.a(a9);
            f25585b = new a(null);
        }

        private b(String str, int i8, String str2) {
            this.f25591a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f25586c, f25587d, f25588e};
        }

        public static W5.a c() {
            return f25590g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25589f.clone();
        }

        public final String b() {
            return this.f25591a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f25592c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f25593d = Pattern.compile("^pi_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f25594a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25595b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3292y.i(value, "value");
                return c.f25593d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public c(String value) {
            List m8;
            AbstractC3292y.i(value, "value");
            this.f25594a = value;
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
            this.f25595b = ((String[]) m8.toArray(new String[0]))[0];
            if (f25592c.a(this.f25594a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.f25594a).toString());
        }

        public final String b() {
            return this.f25595b;
        }

        public final String c() {
            return this.f25594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f25594a, ((c) obj).f25594a);
        }

        public int hashCode() {
            return this.f25594a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f25594a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25596b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f25597c = new e("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final e f25598d = new e("Manual", 1, "manual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f25599e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25600f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25601a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a(String str) {
                Object obj;
                Iterator<E> it = e.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((e) obj).f25601a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e eVar = (e) obj;
                if (eVar == null) {
                    return e.f25597c;
                }
                return eVar;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            e[] a9 = a();
            f25599e = a9;
            f25600f = W5.b.a(a9);
            f25596b = new a(null);
        }

        private e(String str, int i8, String str2) {
            this.f25601a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f25597c, f25598d};
        }

        public static W5.a c() {
            return f25600f;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f25599e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(n.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements z2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f25604a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25605b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25606c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25607d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25608e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25609f;

        /* renamed from: g, reason: collision with root package name */
        private final o f25610g;

        /* renamed from: h, reason: collision with root package name */
        private final c f25611h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f25602i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f25603j = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

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
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25612b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f25613c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25614d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f25615e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f25616f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f25617g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f25618h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f25619i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f25620j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25621k;

            /* renamed from: a, reason: collision with root package name */
            private final String f25622a;

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
                f25620j = a9;
                f25621k = W5.b.a(a9);
                f25612b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f25622a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25613c, f25614d, f25615e, f25616f, f25617g, f25618h, f25619i};
            }

            public static W5.a c() {
                return f25621k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25620j.clone();
            }

            public final String b() {
                return this.f25622a;
            }
        }

        public g(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            this.f25604a = str;
            this.f25605b = str2;
            this.f25606c = str3;
            this.f25607d = str4;
            this.f25608e = str5;
            this.f25609f = str6;
            this.f25610g = oVar;
            this.f25611h = cVar;
        }

        public final g a(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            return new g(str, str2, str3, str4, str5, str6, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3292y.d(this.f25604a, gVar.f25604a) && AbstractC3292y.d(this.f25605b, gVar.f25605b) && AbstractC3292y.d(this.f25606c, gVar.f25606c) && AbstractC3292y.d(this.f25607d, gVar.f25607d) && AbstractC3292y.d(this.f25608e, gVar.f25608e) && AbstractC3292y.d(this.f25609f, gVar.f25609f) && AbstractC3292y.d(this.f25610g, gVar.f25610g) && this.f25611h == gVar.f25611h;
        }

        public final String f() {
            return this.f25608e;
        }

        public final c h() {
            return this.f25611h;
        }

        public int hashCode() {
            String str = this.f25604a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25605b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25606c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25607d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25608e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25609f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            o oVar = this.f25610g;
            int hashCode7 = (hashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f25611h;
            return hashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String o() {
            return this.f25605b;
        }

        public String toString() {
            return "Error(charge=" + this.f25604a + ", code=" + this.f25605b + ", declineCode=" + this.f25606c + ", docUrl=" + this.f25607d + ", message=" + this.f25608e + ", param=" + this.f25609f + ", paymentMethod=" + this.f25610g + ", type=" + this.f25611h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25604a);
            out.writeString(this.f25605b);
            out.writeString(this.f25606c);
            out.writeString(this.f25607d);
            out.writeString(this.f25608e);
            out.writeString(this.f25609f);
            o oVar = this.f25610g;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f25611h;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements z2.f {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25623a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25624b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25625c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25626d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25627e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new h(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3292y.i(address, "address");
            this.f25623a = address;
            this.f25624b = str;
            this.f25625c = str2;
            this.f25626d = str3;
            this.f25627e = str4;
        }

        public final com.stripe.android.model.a a() {
            return this.f25623a;
        }

        public final String b() {
            return this.f25625c;
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
            return AbstractC3292y.d(this.f25623a, hVar.f25623a) && AbstractC3292y.d(this.f25624b, hVar.f25624b) && AbstractC3292y.d(this.f25625c, hVar.f25625c) && AbstractC3292y.d(this.f25626d, hVar.f25626d) && AbstractC3292y.d(this.f25627e, hVar.f25627e);
        }

        public int hashCode() {
            int hashCode = this.f25623a.hashCode() * 31;
            String str = this.f25624b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25625c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25626d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25627e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25623a + ", carrier=" + this.f25624b + ", name=" + this.f25625c + ", phone=" + this.f25626d + ", trackingNumber=" + this.f25627e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25623a.writeToParcel(out, i8);
            out.writeString(this.f25624b);
            out.writeString(this.f25625c);
            out.writeString(this.f25626d);
            out.writeString(this.f25627e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25628a;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.f25380c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.f25381d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.f25382e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25628a = iArr;
        }
    }

    public n(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(captureMethod, "captureMethod");
        AbstractC3292y.i(confirmationMethod, "confirmationMethod");
        AbstractC3292y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3292y.i(linkFundingSources, "linkFundingSources");
        this.f25550a = str;
        this.f25551b = paymentMethodTypes;
        this.f25552c = l8;
        this.f25553d = j8;
        this.f25554e = aVar;
        this.f25555f = captureMethod;
        this.f25556g = str2;
        this.f25557h = confirmationMethod;
        this.f25558i = str3;
        this.f25559j = j9;
        this.f25560k = str4;
        this.f25561l = str5;
        this.f25562m = z8;
        this.f25563n = oVar;
        this.f25564o = str6;
        this.f25565p = str7;
        this.f25566q = status;
        this.f25567r = usage;
        this.f25568s = gVar;
        this.f25569t = hVar;
        this.f25570u = unactivatedPaymentMethods;
        this.f25571v = linkFundingSources;
        this.f25572w = aVar2;
        this.f25573x = str8;
    }

    private final boolean s(String str) {
        JSONObject optJSONObject;
        String str2 = this.f25573x;
        if (str2 == null || (optJSONObject = new JSONObject(str2).optJSONObject(str)) == null) {
            return false;
        }
        return optJSONObject.has("setup_future_usage");
    }

    private final boolean v() {
        int i8;
        StripeIntent.Usage usage = this.f25567r;
        if (usage == null) {
            i8 = -1;
        } else {
            i8 = i.f25628a[usage.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                return false;
            }
            throw new Q5.p();
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List F() {
        return this.f25570u;
    }

    public final StripeIntent.Usage G() {
        return this.f25567r;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List J() {
        return this.f25571v;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean K() {
        return AbstractC1435t.d0(a0.i(StripeIntent.Status.f25370d, StripeIntent.Status.f25375i, StripeIntent.Status.f25374h), getStatus());
    }

    public final String L() {
        return this.f25560k;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b9;
        String str = this.f25573x;
        if (str == null || (b9 = z2.e.f41477a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b9;
    }

    public final n a(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(captureMethod, "captureMethod");
        AbstractC3292y.i(confirmationMethod, "confirmationMethod");
        AbstractC3292y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3292y.i(linkFundingSources, "linkFundingSources");
        return new n(str, paymentMethodTypes, l8, j8, aVar, captureMethod, str2, confirmationMethod, str3, j9, str4, str5, z8, oVar, str6, str7, status, usage, gVar, hVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str8);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean c() {
        return this.f25562m;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f25556g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List e() {
        return this.f25551b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3292y.d(this.f25550a, nVar.f25550a) && AbstractC3292y.d(this.f25551b, nVar.f25551b) && AbstractC3292y.d(this.f25552c, nVar.f25552c) && this.f25553d == nVar.f25553d && this.f25554e == nVar.f25554e && this.f25555f == nVar.f25555f && AbstractC3292y.d(this.f25556g, nVar.f25556g) && this.f25557h == nVar.f25557h && AbstractC3292y.d(this.f25558i, nVar.f25558i) && this.f25559j == nVar.f25559j && AbstractC3292y.d(this.f25560k, nVar.f25560k) && AbstractC3292y.d(this.f25561l, nVar.f25561l) && this.f25562m == nVar.f25562m && AbstractC3292y.d(this.f25563n, nVar.f25563n) && AbstractC3292y.d(this.f25564o, nVar.f25564o) && AbstractC3292y.d(this.f25565p, nVar.f25565p) && this.f25566q == nVar.f25566q && this.f25567r == nVar.f25567r && AbstractC3292y.d(this.f25568s, nVar.f25568s) && AbstractC3292y.d(this.f25569t, nVar.f25569t) && AbstractC3292y.d(this.f25570u, nVar.f25570u) && AbstractC3292y.d(this.f25571v, nVar.f25571v) && AbstractC3292y.d(this.f25572w, nVar.f25572w) && AbstractC3292y.d(this.f25573x, nVar.f25573x);
    }

    public final Long f() {
        return this.f25552c;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f25550a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f25566q;
    }

    public final e h() {
        return this.f25557h;
    }

    public int hashCode() {
        String str = this.f25550a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f25551b.hashCode()) * 31;
        Long l8 = this.f25552c;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.collection.a.a(this.f25553d)) * 31;
        a aVar = this.f25554e;
        int hashCode3 = (((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f25555f.hashCode()) * 31;
        String str2 = this.f25556g;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25557h.hashCode()) * 31;
        String str3 = this.f25558i;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.collection.a.a(this.f25559j)) * 31;
        String str4 = this.f25560k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25561l;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25562m)) * 31;
        o oVar = this.f25563n;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str6 = this.f25564o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25565p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.f25566q;
        int hashCode11 = (hashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f25567r;
        int hashCode12 = (hashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        g gVar = this.f25568s;
        int hashCode13 = (hashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f25569t;
        int hashCode14 = (((((hashCode13 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f25570u.hashCode()) * 31) + this.f25571v.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f25572w;
        int hashCode15 = (hashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str8 = this.f25573x;
        return hashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final g i() {
        return this.f25568s;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a j() {
        return this.f25572w;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType k() {
        boolean z8;
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
        if (j8 instanceof StripeIntent.a.l) {
            return StripeIntent.NextActionType.f25359j;
        }
        if (j8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f25360k;
        }
        if (j8 instanceof StripeIntent.a.b) {
            return StripeIntent.NextActionType.f25356g;
        }
        if (j8 instanceof StripeIntent.a.k) {
            return StripeIntent.NextActionType.f25364o;
        }
        boolean z9 = true;
        if (j8 instanceof StripeIntent.a.C0478a) {
            z8 = true;
        } else {
            z8 = j8 instanceof StripeIntent.a.n;
        }
        if (!z8 && j8 != null) {
            z9 = false;
        }
        if (z9) {
            return null;
        }
        throw new Q5.p();
    }

    public final boolean l() {
        JSONObject optJSONObject;
        String str = this.f25573x;
        if (str == null || (optJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return optJSONObject.optBoolean("require_cvc_recollection");
    }

    @Override // com.stripe.android.model.StripeIntent
    public String m() {
        return this.f25558i;
    }

    public final h p() {
        return this.f25569t;
    }

    @Override // com.stripe.android.model.StripeIntent
    public o r() {
        return this.f25563n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean t() {
        if (getStatus() == StripeIntent.Status.f25371e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PaymentIntent(id=" + this.f25550a + ", paymentMethodTypes=" + this.f25551b + ", amount=" + this.f25552c + ", canceledAt=" + this.f25553d + ", cancellationReason=" + this.f25554e + ", captureMethod=" + this.f25555f + ", clientSecret=" + this.f25556g + ", confirmationMethod=" + this.f25557h + ", countryCode=" + this.f25558i + ", created=" + this.f25559j + ", currency=" + this.f25560k + ", description=" + this.f25561l + ", isLiveMode=" + this.f25562m + ", paymentMethod=" + this.f25563n + ", paymentMethodId=" + this.f25564o + ", receiptEmail=" + this.f25565p + ", status=" + this.f25566q + ", setupFutureUsage=" + this.f25567r + ", lastPaymentError=" + this.f25568s + ", shipping=" + this.f25569t + ", unactivatedPaymentMethods=" + this.f25570u + ", linkFundingSources=" + this.f25571v + ", nextActionData=" + this.f25572w + ", paymentMethodOptionsJsonString=" + this.f25573x + ")";
    }

    public final boolean u(String code) {
        AbstractC3292y.i(code, "code");
        if (!v() && !s(code)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25550a);
        out.writeStringList(this.f25551b);
        Long l8 = this.f25552c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeLong(this.f25553d);
        a aVar = this.f25554e;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeString(this.f25555f.name());
        out.writeString(this.f25556g);
        out.writeString(this.f25557h.name());
        out.writeString(this.f25558i);
        out.writeLong(this.f25559j);
        out.writeString(this.f25560k);
        out.writeString(this.f25561l);
        out.writeInt(this.f25562m ? 1 : 0);
        o oVar = this.f25563n;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25564o);
        out.writeString(this.f25565p);
        StripeIntent.Status status = this.f25566q;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f25567r;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        g gVar = this.f25568s;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f25569t;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f25570u);
        out.writeStringList(this.f25571v);
        out.writeParcelable(this.f25572w, i8);
        out.writeString(this.f25573x);
    }

    public /* synthetic */ n(String str, List list, Long l8, long j8, a aVar, b bVar, String str2, e eVar, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List list2, List list3, StripeIntent.a aVar2, String str8, int i8, AbstractC3284p abstractC3284p) {
        this(str, list, l8, (i8 & 8) != 0 ? 0L : j8, (i8 & 16) != 0 ? null : aVar, (i8 & 32) != 0 ? b.f25586c : bVar, str2, (i8 & 128) != 0 ? e.f25597c : eVar, str3, j9, str4, (i8 & 2048) != 0 ? null : str5, z8, (i8 & 8192) != 0 ? null : oVar, (i8 & 16384) != 0 ? null : str6, (32768 & i8) != 0 ? null : str7, (65536 & i8) != 0 ? null : status, (131072 & i8) != 0 ? null : usage, (262144 & i8) != 0 ? null : gVar, (524288 & i8) != 0 ? null : hVar, list2, (2097152 & i8) != 0 ? AbstractC1435t.m() : list3, (4194304 & i8) != 0 ? null : aVar2, (i8 & 8388608) != 0 ? null : str8);
    }
}
