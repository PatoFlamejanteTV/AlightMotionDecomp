package E6;

import C6.AbstractC1007b;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class O extends B6.b implements D6.m {

    /* renamed from: a, reason: collision with root package name */
    private final C1050h f2037a;

    /* renamed from: b, reason: collision with root package name */
    private final D6.a f2038b;

    /* renamed from: c, reason: collision with root package name */
    private final U f2039c;

    /* renamed from: d, reason: collision with root package name */
    private final D6.m[] f2040d;

    /* renamed from: e, reason: collision with root package name */
    private final F6.b f2041e;

    /* renamed from: f, reason: collision with root package name */
    private final D6.f f2042f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2043g;

    /* renamed from: h, reason: collision with root package name */
    private String f2044h;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2045a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f2051d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f2052e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f2053f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2045a = iArr;
        }
    }

    public O(C1050h composer, D6.a json, U mode, D6.m[] mVarArr) {
        AbstractC3292y.i(composer, "composer");
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(mode, "mode");
        this.f2037a = composer;
        this.f2038b = json;
        this.f2039c = mode;
        this.f2040d = mVarArr;
        this.f2041e = d().e();
        this.f2042f = d().d();
        int ordinal = mode.ordinal();
        if (mVarArr != null) {
            D6.m mVar = mVarArr[ordinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[ordinal] = this;
        }
    }

    private final void I(A6.f fVar) {
        this.f2037a.c();
        String str = this.f2044h;
        AbstractC3292y.f(str);
        F(str);
        this.f2037a.e(':');
        this.f2037a.o();
        F(fVar.a());
    }

    @Override // B6.f
    public void A(A6.f enumDescriptor, int i8) {
        AbstractC3292y.i(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.f(i8));
    }

    @Override // B6.b, B6.f
    public void B(int i8) {
        if (this.f2043g) {
            F(String.valueOf(i8));
        } else {
            this.f2037a.h(i8);
        }
    }

    @Override // B6.b, B6.f
    public void C(long j8) {
        if (this.f2043g) {
            F(String.valueOf(j8));
        } else {
            this.f2037a.i(j8);
        }
    }

    @Override // B6.b, B6.d
    public void D(A6.f descriptor, int i8, y6.i serializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(serializer, "serializer");
        if (obj != null || this.f2042f.h()) {
            super.D(descriptor, i8, serializer, obj);
        }
    }

    @Override // B6.b, B6.f
    public void F(String value) {
        AbstractC3292y.i(value, "value");
        this.f2037a.m(value);
    }

    @Override // B6.b
    public boolean G(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        int i9 = a.f2045a[this.f2039c.ordinal()];
        if (i9 != 1) {
            boolean z8 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f2037a.a()) {
                        this.f2037a.e(',');
                    }
                    this.f2037a.c();
                    F(C.g(descriptor, d(), i8));
                    this.f2037a.e(':');
                    this.f2037a.o();
                } else {
                    if (i8 == 0) {
                        this.f2043g = true;
                    }
                    if (i8 == 1) {
                        this.f2037a.e(',');
                        this.f2037a.o();
                        this.f2043g = false;
                    }
                }
            } else if (!this.f2037a.a()) {
                if (i8 % 2 == 0) {
                    this.f2037a.e(',');
                    this.f2037a.c();
                    z8 = true;
                } else {
                    this.f2037a.e(':');
                    this.f2037a.o();
                }
                this.f2043g = z8;
            } else {
                this.f2043g = true;
                this.f2037a.c();
            }
        } else {
            if (!this.f2037a.a()) {
                this.f2037a.e(',');
            }
            this.f2037a.c();
        }
        return true;
    }

    @Override // B6.b, B6.d
    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (this.f2039c.f2057b != 0) {
            this.f2037a.p();
            this.f2037a.c();
            this.f2037a.e(this.f2039c.f2057b);
        }
    }

    @Override // B6.f
    public F6.b b() {
        return this.f2041e;
    }

    @Override // B6.b, B6.f
    public B6.d c(A6.f descriptor) {
        D6.m mVar;
        AbstractC3292y.i(descriptor, "descriptor");
        U b9 = V.b(d(), descriptor);
        char c8 = b9.f2056a;
        if (c8 != 0) {
            this.f2037a.e(c8);
            this.f2037a.b();
        }
        if (this.f2044h != null) {
            I(descriptor);
            this.f2044h = null;
        }
        if (this.f2039c == b9) {
            return this;
        }
        D6.m[] mVarArr = this.f2040d;
        if (mVarArr == null || (mVar = mVarArr[b9.ordinal()]) == null) {
            return new O(this.f2037a, d(), b9, this.f2040d);
        }
        return mVar;
    }

    @Override // D6.m
    public D6.a d() {
        return this.f2038b;
    }

    @Override // B6.f
    public void e() {
        this.f2037a.j("null");
    }

    @Override // B6.b, B6.f
    public void h(double d8) {
        if (this.f2043g) {
            F(String.valueOf(d8));
        } else {
            this.f2037a.f(d8);
        }
        if (!this.f2042f.a()) {
            if (Double.isInfinite(d8) || Double.isNaN(d8)) {
                throw B.b(Double.valueOf(d8), this.f2037a.f2072a.toString());
            }
        }
    }

    @Override // B6.b, B6.f
    public void i(short s8) {
        if (this.f2043g) {
            F(String.valueOf((int) s8));
        } else {
            this.f2037a.k(s8);
        }
    }

    @Override // B6.b, B6.f
    public void j(byte b9) {
        if (this.f2043g) {
            F(String.valueOf((int) b9));
        } else {
            this.f2037a.d(b9);
        }
    }

    @Override // B6.b, B6.f
    public void k(boolean z8) {
        if (this.f2043g) {
            F(String.valueOf(z8));
        } else {
            this.f2037a.l(z8);
        }
    }

    @Override // B6.b, B6.f
    public void p(float f8) {
        if (this.f2043g) {
            F(String.valueOf(f8));
        } else {
            this.f2037a.g(f8);
        }
        if (!this.f2042f.a()) {
            if (Float.isInfinite(f8) || Float.isNaN(f8)) {
                throw B.b(Float.valueOf(f8), this.f2037a.f2072a.toString());
            }
        }
    }

    @Override // B6.b, B6.f
    public void s(char c8) {
        F(String.valueOf(c8));
    }

    @Override // B6.b, B6.f
    public B6.f v(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            C1050h c1050h = this.f2037a;
            if (!(c1050h instanceof C1059q)) {
                c1050h = new C1059q(c1050h.f2072a, this.f2043g);
            }
            return new O(c1050h, d(), this.f2039c, (D6.m[]) null);
        }
        if (P.a(descriptor)) {
            C1050h c1050h2 = this.f2037a;
            if (!(c1050h2 instanceof C1051i)) {
                c1050h2 = new C1051i(c1050h2.f2072a, this.f2043g);
            }
            return new O(c1050h2, d(), this.f2039c, (D6.m[]) null);
        }
        return super.v(descriptor);
    }

    @Override // B6.b, B6.d
    public boolean x(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return this.f2042f.g();
    }

    @Override // B6.b, B6.f
    public void z(y6.i serializer, Object obj) {
        AbstractC3292y.i(serializer, "serializer");
        if ((serializer instanceof AbstractC1007b) && !d().d().n()) {
            AbstractC1007b abstractC1007b = (AbstractC1007b) serializer;
            String c8 = L.c(serializer.a(), d());
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            y6.i b9 = y6.f.b(abstractC1007b, this, obj);
            L.e(abstractC1007b, b9, c8);
            L.b(b9.a().getKind());
            this.f2044h = c8;
            b9.e(this, obj);
            return;
        }
        serializer.e(this, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(InterfaceC1063v output, D6.a json, U mode, D6.m[] modeReuseCache) {
        this(AbstractC1060s.a(output, json), json, mode, modeReuseCache);
        AbstractC3292y.i(output, "output");
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(mode, "mode");
        AbstractC3292y.i(modeReuseCache, "modeReuseCache");
    }
}
