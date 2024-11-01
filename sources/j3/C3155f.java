package j3;

import B2.G;
import B2.t;
import B2.y;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import x2.C4212f;

/* renamed from: j3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3155f extends G {

    /* renamed from: k, reason: collision with root package name */
    private static final a f33681k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f33682l = 8;

    /* renamed from: c, reason: collision with root package name */
    private final Map f33683c;

    /* renamed from: d, reason: collision with root package name */
    private final y.e f33684d;

    /* renamed from: e, reason: collision with root package name */
    private final G.a f33685e;

    /* renamed from: f, reason: collision with root package name */
    private final G.b f33686f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterable f33687g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33688h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f33689i;

    /* renamed from: j, reason: collision with root package name */
    private Map f33690j;

    /* renamed from: j3.f$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3155f(Map params, String guid) {
        AbstractC3292y.i(params, "params");
        AbstractC3292y.i(guid, "guid");
        this.f33683c = params;
        y.e eVar = new y.e(guid);
        this.f33684d = eVar;
        this.f33685e = G.a.f393c;
        this.f33686f = G.b.f400d;
        this.f33687g = t.a();
        this.f33688h = "https://m.stripe.com/6";
        this.f33689i = eVar.b();
        this.f33690j = eVar.c();
    }

    private final String h() {
        return String.valueOf(z2.e.f41477a.d(this.f33683c));
    }

    private final byte[] i() {
        try {
            byte[] bytes = h().getBytes(C3338d.f34755b);
            AbstractC3292y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C4212f(null, null, 0, "Unable to encode parameters to " + C3338d.f34755b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // B2.G
    public Map a() {
        return this.f33689i;
    }

    @Override // B2.G
    public G.a b() {
        return this.f33685e;
    }

    @Override // B2.G
    public Map c() {
        return this.f33690j;
    }

    @Override // B2.G
    public Iterable d() {
        return this.f33687g;
    }

    @Override // B2.G
    public String f() {
        return this.f33688h;
    }

    @Override // B2.G
    public void g(OutputStream outputStream) {
        AbstractC3292y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }
}
