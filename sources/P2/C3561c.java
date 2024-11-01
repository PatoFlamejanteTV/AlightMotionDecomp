package p2;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import g3.C2902a;
import g3.C2904c;
import g3.EnumC2906e;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;
import p2.AbstractC3564f;
import q6.InterfaceC3813L;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3561c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3560b f36104a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f36105b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f36106c;

    /* renamed from: d, reason: collision with root package name */
    private final p f36107d;

    /* renamed from: e, reason: collision with root package name */
    private final a f36108e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f36109f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f36110g;

    /* renamed from: h, reason: collision with root package name */
    private C3559a f36111h;

    /* renamed from: i, reason: collision with root package name */
    private List f36112i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3488x0 f36113j;

    /* renamed from: p2.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(List list);
    }

    /* renamed from: p2.c$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36114a;

        static {
            int[] iArr = new int[EnumC2906e.values().length];
            try {
                iArr[EnumC2906e.f32125w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2906e.f32123u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36114a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0822c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f36115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3564f.b f36116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3561c f36117c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p2.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f36118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3561c f36119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f36120c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3561c c3561c, List list, U5.d dVar) {
                super(2, dVar);
                this.f36119b = c3561c;
                this.f36120c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f36119b, this.f36120c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f36118a == 0) {
                    t.b(obj);
                    C3561c c3561c = this.f36119b;
                    List list = this.f36120c;
                    if (list == null) {
                        list = AbstractC1435t.m();
                    }
                    c3561c.l(list);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0822c(AbstractC3564f.b bVar, C3561c c3561c, U5.d dVar) {
            super(2, dVar);
            this.f36116b = bVar;
            this.f36117c = c3561c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0822c(this.f36116b, this.f36117c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r6.f36115a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                Q5.t.b(r7)
                goto L55
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                Q5.t.b(r7)
                goto L3b
            L1f:
                Q5.t.b(r7)
                p2.f$b r7 = r6.f36116b
                p2.a r7 = r7.d()
                if (r7 == 0) goto L3e
                p2.c r7 = r6.f36117c
                p2.b r7 = p2.C3561c.a(r7)
                p2.f$b r1 = r6.f36116b
                r6.f36115a = r4
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                java.util.List r7 = (java.util.List) r7
                goto L3f
            L3e:
                r7 = r2
            L3f:
                p2.c r1 = r6.f36117c
                U5.g r1 = p2.C3561c.b(r1)
                p2.c$c$a r4 = new p2.c$c$a
                p2.c r5 = r6.f36117c
                r4.<init>(r5, r7, r2)
                r6.f36115a = r3
                java.lang.Object r7 = n6.AbstractC3458i.g(r1, r4, r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.C3561c.C0822c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0822c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3561c(InterfaceC3560b cardAccountRangeRepository, U5.g uiContext, U5.g workContext, p staticCardAccountRanges, a accountRangeResultListener, Function0 isCbcEligible) {
        AbstractC3292y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3292y.i(accountRangeResultListener, "accountRangeResultListener");
        AbstractC3292y.i(isCbcEligible, "isCbcEligible");
        this.f36104a = cardAccountRangeRepository;
        this.f36105b = uiContext;
        this.f36106c = workContext;
        this.f36107d = staticCardAccountRanges;
        this.f36108e = accountRangeResultListener;
        this.f36109f = isCbcEligible;
        this.f36110g = cardAccountRangeRepository.a();
        this.f36112i = AbstractC1435t.m();
    }

    private final boolean j(AbstractC3564f.b bVar) {
        boolean z8;
        C2902a d8;
        C2904c a9;
        if (d() != null && bVar.d() != null && (((d8 = d()) == null || (a9 = d8.a()) == null || a9.a(bVar)) && AbstractC3292y.d(bVar.d(), this.f36111h))) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f36111h = bVar.d();
        return z8;
    }

    private final boolean k(List list) {
        EnumC2906e enumC2906e;
        int i8;
        C2902a c2902a = (C2902a) AbstractC1435t.o0(list);
        if (c2902a != null) {
            enumC2906e = c2902a.b();
        } else {
            enumC2906e = null;
        }
        if (enumC2906e == null) {
            i8 = -1;
        } else {
            i8 = b.f36114a[enumC2906e.ordinal()];
        }
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
        InterfaceC3488x0 interfaceC3488x0 = this.f36113j;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        this.f36113j = null;
    }

    public final C2902a d() {
        return (C2902a) AbstractC1435t.o0(this.f36112i);
    }

    public final List e() {
        return this.f36112i;
    }

    public final p f() {
        return this.f36107d;
    }

    public final InterfaceC3813L g() {
        return this.f36110g;
    }

    public final void h(AbstractC3564f.b cardNumber) {
        List m8;
        AbstractC3292y.i(cardNumber, "cardNumber");
        boolean booleanValue = ((Boolean) this.f36109f.invoke()).booleanValue();
        if (booleanValue && cardNumber.f() < 8) {
            l(AbstractC1435t.m());
            return;
        }
        if (((Boolean) this.f36109f.invoke()).booleanValue()) {
            m8 = C3565g.f36133a.a(cardNumber);
        } else {
            m8 = AbstractC1435t.m();
        }
        if (!m8.isEmpty()) {
            l(m8);
            return;
        }
        List a9 = this.f36107d.a(cardNumber);
        if (booleanValue) {
            i(cardNumber);
        } else if (!a9.isEmpty() && !k(a9)) {
            l(a9);
        } else {
            i(cardNumber);
        }
    }

    public final /* synthetic */ void i(AbstractC3564f.b cardNumber) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(cardNumber, "cardNumber");
        if (j(cardNumber)) {
            c();
            this.f36112i = AbstractC1435t.m();
            d8 = AbstractC3462k.d(N.a(this.f36106c), null, null, new C0822c(cardNumber, this, null), 3, null);
            this.f36113j = d8;
        }
    }

    public final void l(List accountRanges) {
        AbstractC3292y.i(accountRanges, "accountRanges");
        this.f36112i = accountRanges;
        this.f36108e.a(accountRanges);
    }
}
