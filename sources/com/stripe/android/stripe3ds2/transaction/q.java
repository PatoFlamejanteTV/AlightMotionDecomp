package com.stripe.android.stripe3ds2.transaction;

import Q5.I;
import Q5.s;
import Q5.t;
import c6.InterfaceC2072n;
import com.stripe.android.stripe3ds2.transaction.k;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;

/* loaded from: classes4.dex */
public final class q implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final a f28163d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final c4.k f28164a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.c f28165b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f28166c;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final U5.g f28167a;

        public b(U5.g workContext) {
            AbstractC3292y.i(workContext, "workContext");
            this.f28167a = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.k.a
        public k a(String acsUrl, Z3.c errorReporter) {
            AbstractC3292y.i(acsUrl, "acsUrl");
            AbstractC3292y.i(errorReporter, "errorReporter");
            return new q(new r(acsUrl, null, errorReporter, this.f28167a, 2, null), errorReporter, C3445b0.b());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28168a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28169b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28171d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, U5.d dVar) {
            super(2, dVar);
            this.f28171d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            c cVar = new c(this.f28171d, dVar);
            cVar.f28169b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f28168a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    q qVar = q.this;
                    String str = this.f28171d;
                    s.a aVar = s.f8810b;
                    c4.k kVar = qVar.f28164a;
                    AbstractC3292y.f(str);
                    this.f28168a = 1;
                    obj = kVar.a(str, "application/json; charset=utf-8", this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b9 = s.b((c4.l) obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            q qVar2 = q.this;
            Throwable e9 = s.e(b9);
            if (e9 != null) {
                qVar2.f28165b.l(e9);
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public q(c4.k httpClient, Z3.c errorReporter, U5.g workContext) {
        AbstractC3292y.i(httpClient, "httpClient");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f28164a = httpClient;
        this.f28165b = errorReporter;
        this.f28166c = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.k
    public void a(d4.d errorData) {
        Object b9;
        AbstractC3292y.i(errorData, "errorData");
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(errorData.a().toString());
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f28165b.l(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, e8));
        }
        if (s.g(b9)) {
            b9 = null;
        }
        String str = (String) b9;
        if (str != null) {
            AbstractC3462k.d(N.a(this.f28166c), null, null, new c(str, null), 3, null);
        }
    }
}
