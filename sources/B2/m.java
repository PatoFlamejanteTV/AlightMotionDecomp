package B2;

import Q5.I;
import Q5.s;
import androidx.core.app.NotificationCompat;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;

/* loaded from: classes4.dex */
public final class m implements InterfaceC0951c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f478d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final F f479a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f480b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.d f481c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f482a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f483b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0950b f485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0950b c0950b, U5.d dVar) {
            super(2, dVar);
            this.f485d = c0950b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f485d, dVar);
            bVar.f483b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f482a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    m mVar = m.this;
                    C0950b c0950b = this.f485d;
                    s.a aVar = Q5.s.f8810b;
                    F f8 = mVar.f479a;
                    this.f482a = 1;
                    obj = f8.a(c0950b, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b9 = Q5.s.b((H) obj);
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            m mVar2 = m.this;
            Throwable e9 = Q5.s.e(b9);
            if (e9 != null) {
                mVar2.f481c.a("Exception while making analytics request", e9);
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public m(F stripeNetworkClient, U5.g workContext, v2.d logger) {
        AbstractC3292y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(logger, "logger");
        this.f479a = stripeNetworkClient;
        this.f480b = workContext;
        this.f481c = logger;
    }

    @Override // B2.InterfaceC0951c
    public void a(C0950b request) {
        AbstractC3292y.i(request, "request");
        this.f481c.d("Event: " + request.h().get(NotificationCompat.CATEGORY_EVENT));
        AbstractC3462k.d(N.a(this.f480b), null, null, new b(request, null), 3, null);
    }

    public m() {
        this(v2.d.f40434a.b(), C3445b0.b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(v2.d logger, U5.g workContext) {
        this(new o(workContext, null, null, 0, logger, 14, null), workContext, logger);
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(workContext, "workContext");
    }
}
