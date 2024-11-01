package J3;

import J3.c;
import J3.e;
import Q5.C1413h;
import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import g3.EnumC2906e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import q6.w;

/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4107a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2906e f4108b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4109c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4110d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f4111e;

    /* renamed from: f, reason: collision with root package name */
    private final w f4112f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f4113g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f4114h;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f4115a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0076a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f4117a;

            C0076a(h hVar) {
                this.f4117a = hVar;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object value;
                w wVar = this.f4117a.f4112f;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, f.b((f) value, null, false, null, !z8, 7, null)));
                return I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f4115a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L interfaceC3813L = h.this.f4111e;
                C0076a c0076a = new C0076a(h.this);
                this.f4115a = 1;
                if (interfaceC3813L.collect(c0076a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4118a = new b();

        private b() {
        }

        @Override // J3.e.a
        public e a(J3.a args, InterfaceC3813L processing, M coroutineScope) {
            AbstractC3292y.i(args, "args");
            AbstractC3292y.i(processing, "processing");
            AbstractC3292y.i(coroutineScope, "coroutineScope");
            return new h(args.c(), args.a(), args.b(), args.d(), processing, coroutineScope);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4119a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J3.c invoke(f state) {
            AbstractC3292y.i(state, "state");
            if (state.c().e()) {
                return new c.a(state.c().b());
            }
            return c.b.f4093a;
        }
    }

    public h(String lastFour, EnumC2906e cardBrand, String cvc, boolean z8, InterfaceC3813L processing, M coroutineScope) {
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cardBrand, "cardBrand");
        AbstractC3292y.i(cvc, "cvc");
        AbstractC3292y.i(processing, "processing");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        this.f4107a = lastFour;
        this.f4108b = cardBrand;
        this.f4109c = cvc;
        this.f4110d = z8;
        this.f4111e = processing;
        w a9 = AbstractC3815N.a(new f(lastFour, z8, new g(cvc, cardBrand), !((Boolean) processing.getValue()).booleanValue()));
        this.f4112f = a9;
        this.f4113g = AbstractC3823h.b(a9);
        AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
        this.f4114h = A4.g.m(a9, c.f4119a);
    }

    @Override // J3.e
    public InterfaceC3813L a() {
        return this.f4113g;
    }

    @Override // J3.e
    public void b(String cvc) {
        Object value;
        f fVar;
        AbstractC3292y.i(cvc, "cvc");
        w wVar = this.f4112f;
        do {
            value = wVar.getValue();
            fVar = (f) value;
        } while (!wVar.a(value, f.b(fVar, null, false, fVar.c().f(cvc), false, 11, null)));
    }

    @Override // J3.e
    public InterfaceC3813L c() {
        return this.f4114h;
    }
}
