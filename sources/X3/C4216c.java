package x3;

import B2.C0953e;
import B2.InterfaceC0951c;
import Q5.I;
import Q5.t;
import U5.g;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import x3.AbstractC4214a;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4216c implements InterfaceC4215b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f40960a;

    /* renamed from: b, reason: collision with root package name */
    private final C0953e f40961b;

    /* renamed from: c, reason: collision with root package name */
    private final g f40962c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40963a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4214a f40965c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4214a abstractC4214a, U5.d dVar) {
            super(2, dVar);
            this.f40965c = abstractC4214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f40965c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f40963a == 0) {
                t.b(obj);
                InterfaceC0951c interfaceC0951c = C4216c.this.f40960a;
                C0953e c0953e = C4216c.this.f40961b;
                AbstractC4214a abstractC4214a = this.f40965c;
                interfaceC0951c.a(c0953e.g(abstractC4214a, abstractC4214a.b()));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C4216c(InterfaceC0951c analyticsRequestExecutor, C0953e analyticsRequestFactory, g workContext) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3292y.i(workContext, "workContext");
        this.f40960a = analyticsRequestExecutor;
        this.f40961b = analyticsRequestFactory;
        this.f40962c = workContext;
    }

    private final void e(AbstractC4214a abstractC4214a) {
        AbstractC3462k.d(N.a(this.f40962c), null, null, new a(abstractC4214a, null), 3, null);
    }

    @Override // x3.InterfaceC4215b
    public void a(String country) {
        AbstractC3292y.i(country, "country");
        e(new AbstractC4214a.c(country));
    }

    @Override // x3.InterfaceC4215b
    public void b(String country, boolean z8, Integer num) {
        AbstractC3292y.i(country, "country");
        e(new AbstractC4214a.b(country, z8, num));
    }
}
