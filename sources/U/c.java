package u;

import s.AbstractC3937d;
import s.C3936c;
import u.o;

/* loaded from: classes3.dex */
final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f40097a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40098b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3937d f40099c;

    /* renamed from: d, reason: collision with root package name */
    private final s.h f40100d;

    /* renamed from: e, reason: collision with root package name */
    private final C3936c f40101e;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f40102a;

        /* renamed from: b, reason: collision with root package name */
        private String f40103b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC3937d f40104c;

        /* renamed from: d, reason: collision with root package name */
        private s.h f40105d;

        /* renamed from: e, reason: collision with root package name */
        private C3936c f40106e;

        @Override // u.o.a
        public o a() {
            String str = "";
            if (this.f40102a == null) {
                str = " transportContext";
            }
            if (this.f40103b == null) {
                str = str + " transportName";
            }
            if (this.f40104c == null) {
                str = str + " event";
            }
            if (this.f40105d == null) {
                str = str + " transformer";
            }
            if (this.f40106e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f40102a, this.f40103b, this.f40104c, this.f40105d, this.f40106e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.o.a
        o.a b(C3936c c3936c) {
            if (c3936c != null) {
                this.f40106e = c3936c;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // u.o.a
        o.a c(AbstractC3937d abstractC3937d) {
            if (abstractC3937d != null) {
                this.f40104c = abstractC3937d;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // u.o.a
        o.a d(s.h hVar) {
            if (hVar != null) {
                this.f40105d = hVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // u.o.a
        public o.a e(p pVar) {
            if (pVar != null) {
                this.f40102a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // u.o.a
        public o.a f(String str) {
            if (str != null) {
                this.f40103b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // u.o
    public C3936c b() {
        return this.f40101e;
    }

    @Override // u.o
    AbstractC3937d c() {
        return this.f40099c;
    }

    @Override // u.o
    s.h e() {
        return this.f40100d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f40097a.equals(oVar.f()) && this.f40098b.equals(oVar.g()) && this.f40099c.equals(oVar.c()) && this.f40100d.equals(oVar.e()) && this.f40101e.equals(oVar.b())) {
            return true;
        }
        return false;
    }

    @Override // u.o
    public p f() {
        return this.f40097a;
    }

    @Override // u.o
    public String g() {
        return this.f40098b;
    }

    public int hashCode() {
        return ((((((((this.f40097a.hashCode() ^ 1000003) * 1000003) ^ this.f40098b.hashCode()) * 1000003) ^ this.f40099c.hashCode()) * 1000003) ^ this.f40100d.hashCode()) * 1000003) ^ this.f40101e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f40097a + ", transportName=" + this.f40098b + ", event=" + this.f40099c + ", transformer=" + this.f40100d + ", encoding=" + this.f40101e + "}";
    }

    private c(p pVar, String str, AbstractC3937d abstractC3937d, s.h hVar, C3936c c3936c) {
        this.f40097a = pVar;
        this.f40098b = str;
        this.f40099c = abstractC3937d;
        this.f40100d = hVar;
        this.f40101e = c3936c;
    }
}
