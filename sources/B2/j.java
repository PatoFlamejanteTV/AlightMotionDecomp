package B2;

import B2.G;
import B2.y;
import R5.AbstractC1435t;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import v2.C4120a;
import x2.C4212f;

/* loaded from: classes4.dex */
public final class j extends G {

    /* renamed from: q, reason: collision with root package name */
    public static final a f447q = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final G.a f448c;

    /* renamed from: d, reason: collision with root package name */
    private final String f449d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f450e;

    /* renamed from: f, reason: collision with root package name */
    private final c f451f;

    /* renamed from: g, reason: collision with root package name */
    private final v2.c f452g;

    /* renamed from: h, reason: collision with root package name */
    private final String f453h;

    /* renamed from: i, reason: collision with root package name */
    private final String f454i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f455j;

    /* renamed from: k, reason: collision with root package name */
    private final String f456k;

    /* renamed from: l, reason: collision with root package name */
    private final y.b f457l;

    /* renamed from: m, reason: collision with root package name */
    private final G.b f458m;

    /* renamed from: n, reason: collision with root package name */
    private final Iterable f459n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f460o;

    /* renamed from: p, reason: collision with root package name */
    private Map f461p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final v2.c f462a;

        /* renamed from: b, reason: collision with root package name */
        private final String f463b;

        /* renamed from: c, reason: collision with root package name */
        private final String f464c;

        public b(v2.c cVar, String apiVersion, String sdkVersion) {
            AbstractC3292y.i(apiVersion, "apiVersion");
            AbstractC3292y.i(sdkVersion, "sdkVersion");
            this.f462a = cVar;
            this.f463b = apiVersion;
            this.f464c = sdkVersion;
        }

        public static /* synthetic */ j b(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.a(str, cVar, map, z8);
        }

        public static /* synthetic */ j d(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.c(str, cVar, map, z8);
        }

        public final j a(String url, c options, Map map, boolean z8) {
            AbstractC3292y.i(url, "url");
            AbstractC3292y.i(options, "options");
            return new j(G.a.f392b, url, map, options, this.f462a, this.f463b, this.f464c, z8);
        }

        public final j c(String url, c options, Map map, boolean z8) {
            AbstractC3292y.i(url, "url");
            AbstractC3292y.i(options, "options");
            return new j(G.a.f393c, url, map, options, this.f462a, this.f463b, this.f464c, z8);
        }
    }

    public j(G.a method, String baseUrl, Map map, c options, v2.c cVar, String apiVersion, String sdkVersion, boolean z8) {
        AbstractC3292y.i(method, "method");
        AbstractC3292y.i(baseUrl, "baseUrl");
        AbstractC3292y.i(options, "options");
        AbstractC3292y.i(apiVersion, "apiVersion");
        AbstractC3292y.i(sdkVersion, "sdkVersion");
        this.f448c = method;
        this.f449d = baseUrl;
        this.f450e = map;
        this.f451f = options;
        this.f452g = cVar;
        this.f453h = apiVersion;
        this.f454i = sdkVersion;
        this.f455j = z8;
        this.f456k = v.f517a.c(map);
        y.b bVar = new y.b(options, cVar, null, apiVersion, sdkVersion, 4, null);
        this.f457l = bVar;
        this.f458m = G.b.f398b;
        this.f459n = t.a();
        this.f460o = bVar.b();
        this.f461p = bVar.c();
    }

    private final byte[] i() {
        try {
            byte[] bytes = this.f456k.getBytes(C3338d.f34755b);
            AbstractC3292y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C4212f(null, null, 0, "Unable to encode parameters to " + C3338d.f34755b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // B2.G
    public Map a() {
        return this.f460o;
    }

    @Override // B2.G
    public G.a b() {
        return this.f448c;
    }

    @Override // B2.G
    public Map c() {
        return this.f461p;
    }

    @Override // B2.G
    public Iterable d() {
        return this.f459n;
    }

    @Override // B2.G
    public boolean e() {
        return this.f455j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f448c == jVar.f448c && AbstractC3292y.d(this.f449d, jVar.f449d) && AbstractC3292y.d(this.f450e, jVar.f450e) && AbstractC3292y.d(this.f451f, jVar.f451f) && AbstractC3292y.d(this.f452g, jVar.f452g) && AbstractC3292y.d(this.f453h, jVar.f453h) && AbstractC3292y.d(this.f454i, jVar.f454i) && this.f455j == jVar.f455j) {
            return true;
        }
        return false;
    }

    @Override // B2.G
    public String f() {
        if (G.a.f392b != b() && G.a.f394d != b()) {
            return this.f449d;
        }
        String str = this.f449d;
        String str2 = this.f456k;
        if (str2.length() <= 0) {
            str2 = null;
        }
        List r8 = AbstractC1435t.r(str, str2);
        String str3 = "?";
        if (l6.n.G(this.f449d, "?", false, 2, null)) {
            str3 = "&";
        }
        return AbstractC1435t.w0(r8, str3, null, null, 0, null, null, 62, null);
    }

    @Override // B2.G
    public void g(OutputStream outputStream) {
        AbstractC3292y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }

    public final String h() {
        return this.f449d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f448c.hashCode() * 31) + this.f449d.hashCode()) * 31;
        Map map = this.f450e;
        int i8 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f451f.hashCode()) * 31;
        v2.c cVar = this.f452g;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((((((hashCode3 + i8) * 31) + this.f453h.hashCode()) * 31) + this.f454i.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f455j);
    }

    public String toString() {
        return b().b() + " " + this.f449d;
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f466a;

        /* renamed from: b, reason: collision with root package name */
        private final String f467b;

        /* renamed from: c, reason: collision with root package name */
        private final String f468c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f465d = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

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
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String apiKey, String str, String str2) {
            AbstractC3292y.i(apiKey, "apiKey");
            this.f466a = apiKey;
            this.f467b = str;
            this.f468c = str2;
            new C4120a().b(apiKey);
        }

        public static /* synthetic */ c b(c cVar, String str, String str2, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = cVar.f466a;
            }
            if ((i8 & 2) != 0) {
                str2 = cVar.f467b;
            }
            if ((i8 & 4) != 0) {
                str3 = cVar.f468c;
            }
            return cVar.a(str, str2, str3);
        }

        public final c a(String apiKey, String str, String str2) {
            AbstractC3292y.i(apiKey, "apiKey");
            return new c(apiKey, str, str2);
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
            if (AbstractC3292y.d(this.f466a, cVar.f466a) && AbstractC3292y.d(this.f467b, cVar.f467b) && AbstractC3292y.d(this.f468c, cVar.f468c)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f466a;
        }

        public final boolean h() {
            return l6.n.B(this.f466a, "uk_", false, 2, null);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f466a.hashCode() * 31;
            String str = this.f467b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            String str2 = this.f468c;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public final String i() {
            return this.f468c;
        }

        public final String l() {
            return this.f467b;
        }

        public String toString() {
            return "Options(apiKey=" + this.f466a + ", stripeAccount=" + this.f467b + ", idempotencyKey=" + this.f468c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f466a);
            out.writeString(this.f467b);
            out.writeString(this.f468c);
        }

        public /* synthetic */ c(String str, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
            this((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke(), null, 4, null);
            AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3292y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
