package O7;

import O7.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f7927b = M7.b.i(f.class);

    /* renamed from: a, reason: collision with root package name */
    protected final M7.d f7928a;

    /* loaded from: classes5.dex */
    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final f f7929a;

        a(f fVar) {
            this.f7929a = fVar;
        }

        public abstract M7.d a();

        M7.d b() {
            return this.f7929a.f7928a;
        }

        public void c(M7.e eVar) {
            eVar.k(a());
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private d f7930a;

        /* renamed from: b, reason: collision with root package name */
        private final f f7931b;

        /* renamed from: c, reason: collision with root package name */
        private d.a f7932c = new d.a.C0153a();

        /* renamed from: d, reason: collision with root package name */
        private boolean f7933d = false;

        /* renamed from: e, reason: collision with root package name */
        private String f7934e;

        b(d dVar, f fVar) {
            this.f7930a = dVar;
            this.f7931b = fVar;
        }

        public void a(M7.e eVar) {
            if (this.f7930a == null) {
                this.f7930a = new d(eVar);
            }
            String str = this.f7934e;
            if (str != null) {
                this.f7930a.e(str);
            }
            if (this.f7933d) {
                this.f7930a.f(this.f7931b.f7928a, this.f7932c);
            } else {
                this.f7930a.h(this.f7931b.f7928a, this.f7932c);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f7935b;

        /* renamed from: c, reason: collision with root package name */
        private final O7.b f7936c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f7937d;

        /* renamed from: e, reason: collision with root package name */
        private String f7938e;

        /* renamed from: f, reason: collision with root package name */
        private String f7939f;

        /* renamed from: g, reason: collision with root package name */
        private String f7940g;

        c(f fVar, String str) {
            super(fVar);
            this.f7936c = new O7.b();
            this.f7937d = new HashMap();
            this.f7935b = str;
        }

        @Override // O7.f.a
        public M7.d a() {
            if (this.f7935b != null) {
                M7.d c8 = new M7.d(b()).c(M7.c.URL_PATH, this.f7935b).c(M7.c.ACTION_NAME, this.f7938e).c(M7.c.CAMPAIGN_NAME, this.f7939f).c(M7.c.CAMPAIGN_KEYWORD, this.f7940g);
                if (this.f7936c.a() > 0) {
                    c8.c(M7.c.SCREEN_SCOPE_CUSTOM_VARIABLES, this.f7936c.toString());
                }
                for (Map.Entry entry : this.f7937d.entrySet()) {
                    O7.a.b(c8, ((Integer) entry.getKey()).intValue(), (String) entry.getValue());
                }
                return c8;
            }
            throw new IllegalArgumentException("Screen tracking requires a non-empty path");
        }

        @Override // O7.f.a
        public /* bridge */ /* synthetic */ void c(M7.e eVar) {
            super.c(eVar);
        }
    }

    private f() {
        this(null);
    }

    public static f c() {
        return new f();
    }

    public b a() {
        return new b(null, this);
    }

    public c b(String str) {
        return new c(this, str);
    }

    private f(M7.d dVar) {
        this.f7928a = dVar == null ? new M7.d() : dVar;
    }
}
