package B2;

import B2.G;
import R5.AbstractC1435t;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: B2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0950b extends G {

    /* renamed from: j, reason: collision with root package name */
    public static final a f412j = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final Map f413c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f414d;

    /* renamed from: e, reason: collision with root package name */
    private final String f415e;

    /* renamed from: f, reason: collision with root package name */
    private final G.a f416f;

    /* renamed from: g, reason: collision with root package name */
    private final G.b f417g;

    /* renamed from: h, reason: collision with root package name */
    private final Iterable f418h;

    /* renamed from: i, reason: collision with root package name */
    private final String f419i;

    /* renamed from: B2.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C0950b(Map params, Map headers) {
        AbstractC3292y.i(params, "params");
        AbstractC3292y.i(headers, "headers");
        this.f413c = params;
        this.f414d = headers;
        String c8 = v.f517a.c(params);
        this.f415e = c8;
        this.f416f = G.a.f392b;
        this.f417g = G.b.f398b;
        this.f418h = new i6.i(429, 429);
        this.f419i = AbstractC1435t.w0(AbstractC1435t.r("https://q.stripe.com", c8.length() <= 0 ? null : c8), "?", null, null, 0, null, null, 62, null);
    }

    @Override // B2.G
    public Map a() {
        return this.f414d;
    }

    @Override // B2.G
    public G.a b() {
        return this.f416f;
    }

    @Override // B2.G
    public Iterable d() {
        return this.f418h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0950b)) {
            return false;
        }
        C0950b c0950b = (C0950b) obj;
        if (AbstractC3292y.d(this.f413c, c0950b.f413c) && AbstractC3292y.d(this.f414d, c0950b.f414d)) {
            return true;
        }
        return false;
    }

    @Override // B2.G
    public String f() {
        return this.f419i;
    }

    public final Map h() {
        return this.f413c;
    }

    public int hashCode() {
        return (this.f413c.hashCode() * 31) + this.f414d.hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.f413c + ", headers=" + this.f414d + ")";
    }
}
