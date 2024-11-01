package B2;

import B2.l;
import Q5.I;
import Q5.s;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;
import n6.X;
import x2.C4207a;

/* loaded from: classes4.dex */
public final class o implements F {

    /* renamed from: f, reason: collision with root package name */
    private static final a f488f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f489a;

    /* renamed from: b, reason: collision with root package name */
    private final l f490b;

    /* renamed from: c, reason: collision with root package name */
    private final B f491c;

    /* renamed from: d, reason: collision with root package name */
    private final int f492d;

    /* renamed from: e, reason: collision with root package name */
    private final v2.d f493e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f498e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, Iterable iterable, int i8, o oVar, U5.d dVar) {
            super(2, dVar);
            this.f495b = function0;
            this.f496c = iterable;
            this.f497d = i8;
            this.f498e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f495b, this.f496c, this.f497d, this.f498e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f494a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return (H) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                H h8 = (H) this.f495b.invoke();
                if (AbstractC1435t.d0(this.f496c, kotlin.coroutines.jvm.internal.b.c(h8.b())) && this.f497d > 0) {
                    this.f498e.f493e.d("Request failed with code " + h8.b() + ". Retrying up to " + this.f497d + " more time(s).");
                    long a9 = this.f498e.f491c.a(3, this.f497d);
                    this.f494a = 1;
                    if (X.c(a9, this) == e8) {
                        return e8;
                    }
                } else {
                    return h8;
                }
            }
            o oVar = this.f498e;
            int i9 = this.f497d - 1;
            Iterable iterable = this.f496c;
            Function0 function0 = this.f495b;
            this.f494a = 2;
            obj = oVar.e(i9, iterable, function0, this);
            if (obj == e8) {
                return e8;
            }
            return (H) obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g8) {
            super(0);
            this.f500b = g8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke() {
            return o.this.f(this.f500b);
        }
    }

    public o(U5.g workContext, l connectionFactory, B retryDelaySupplier, int i8, v2.d logger) {
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(connectionFactory, "connectionFactory");
        AbstractC3292y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3292y.i(logger, "logger");
        this.f489a = workContext;
        this.f490b = connectionFactory;
        this.f491c = retryDelaySupplier;
        this.f492d = i8;
        this.f493e = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H f(G g8) {
        return g(this.f490b.a(g8), g8.f());
    }

    private final H g(E e8, String str) {
        Object b9;
        try {
            s.a aVar = Q5.s.f8810b;
            H A8 = e8.A();
            this.f493e.d(A8.toString());
            b9 = Q5.s.b(A8);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e9 = Q5.s.e(b9);
        if (e9 == null) {
            return (H) b9;
        }
        this.f493e.a("Exception while making Stripe API request", e9);
        if (e9 instanceof IOException) {
            throw C4207a.f40944f.a((IOException) e9, str);
        }
        throw e9;
    }

    @Override // B2.F
    public Object a(G g8, U5.d dVar) {
        return e(this.f492d, g8.d(), new c(g8), dVar);
    }

    public final Object e(int i8, Iterable iterable, Function0 function0, U5.d dVar) {
        return AbstractC3458i.g(this.f489a, new b(function0, iterable, i8, this, null), dVar);
    }

    public /* synthetic */ o(U5.g gVar, l lVar, B b9, int i8, v2.d dVar, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? C3445b0.b() : gVar, (i9 & 2) != 0 ? l.c.f475a : lVar, (i9 & 4) != 0 ? new p() : b9, (i9 & 8) != 0 ? 3 : i8, (i9 & 16) != 0 ? v2.d.f40434a.b() : dVar);
    }
}
