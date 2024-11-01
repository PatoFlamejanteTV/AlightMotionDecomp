package G2;

import B2.C0953e;
import B2.InterfaceC0951c;
import G2.a;
import G2.b;
import Q5.I;
import Q5.p;
import Q5.t;
import U5.g;
import c6.InterfaceC2072n;
import g3.EnumC2906e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.N;

/* loaded from: classes4.dex */
public final class c implements G2.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f2815a;

    /* renamed from: b, reason: collision with root package name */
    private final C0953e f2816b;

    /* renamed from: c, reason: collision with root package name */
    private final g f2817c;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2818a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2819b;

        static {
            int[] iArr = new int[b.EnumC0047b.values().length];
            try {
                iArr[b.EnumC0047b.f2811d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2818a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.f2805a.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[b.a.f2806b.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f2819b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2820a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G2.a f2822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(G2.a aVar, U5.d dVar) {
            super(2, dVar);
            this.f2822c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f2822c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f2820a == 0) {
                t.b(obj);
                InterfaceC0951c interfaceC0951c = c.this.f2815a;
                C0953e c0953e = c.this.f2816b;
                G2.a aVar = this.f2822c;
                interfaceC0951c.a(c0953e.g(aVar, aVar.b()));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public c(InterfaceC0951c analyticsRequestExecutor, C0953e analyticsRequestFactory, g workContext) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3292y.i(workContext, "workContext");
        this.f2815a = analyticsRequestExecutor;
        this.f2816b = analyticsRequestFactory;
        this.f2817c = workContext;
    }

    private final void r(G2.a aVar) {
        AbstractC3462k.d(N.a(this.f2817c), null, null, new b(aVar, null), 3, null);
    }

    @Override // G2.b
    public void a() {
        r(new a.C0042a());
    }

    @Override // G2.b
    public void b(EnumC2906e selectedBrand, Throwable error) {
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        AbstractC3292y.i(error, "error");
        r(new a.o(selectedBrand, error));
    }

    @Override // G2.b
    public void c(EnumC2906e selectedBrand) {
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        r(new a.p(selectedBrand));
    }

    @Override // G2.b
    public void d(b.a source, EnumC2906e enumC2906e) {
        a.g.EnumC0043a enumC0043a;
        AbstractC3292y.i(source, "source");
        int i8 = a.f2819b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0043a = a.g.EnumC0043a.f2775b;
            } else {
                throw new p();
            }
        } else {
            enumC0043a = a.g.EnumC0043a.f2776c;
        }
        r(new a.g(enumC0043a, enumC2906e));
    }

    @Override // G2.b
    public void e(String code) {
        AbstractC3292y.i(code, "code");
        r(new a.m(code));
    }

    @Override // G2.b
    public void f(F2.c configuration) {
        AbstractC3292y.i(configuration, "configuration");
        r(new a.h(configuration));
    }

    @Override // G2.b
    public void g(b.a source, EnumC2906e selectedBrand) {
        a.n.EnumC0046a enumC0046a;
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        int i8 = a.f2819b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0046a = a.n.EnumC0046a.f2796b;
            } else {
                throw new p();
            }
        } else {
            enumC0046a = a.n.EnumC0046a.f2797c;
        }
        r(new a.n(enumC0046a, selectedBrand));
    }

    @Override // G2.b
    public void h(String type) {
        AbstractC3292y.i(type, "type");
        r(new a.c(type));
    }

    @Override // G2.b
    public void i() {
        r(new a.j());
    }

    @Override // G2.b
    public void j(b.EnumC0047b screen) {
        AbstractC3292y.i(screen, "screen");
        r(new a.l(screen));
    }

    @Override // G2.b
    public void k(String type) {
        AbstractC3292y.i(type, "type");
        r(new a.d(type));
    }

    @Override // G2.b
    public void l() {
        r(new a.i());
    }

    @Override // G2.b
    public void m() {
        r(new a.f());
    }

    @Override // G2.b
    public void n() {
        r(new a.e());
    }

    @Override // G2.b
    public void o(b.EnumC0047b screen) {
        AbstractC3292y.i(screen, "screen");
        if (a.f2818a[screen.ordinal()] == 1) {
            r(new a.k(screen));
        }
    }
}
