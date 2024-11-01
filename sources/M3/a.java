package M3;

import B2.j;
import M3.c;
import M3.d;
import Q5.I;
import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import R5.a0;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import g3.EnumC2906e;
import i3.AbstractC2970a;
import j3.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n2.r;
import n6.AbstractC3452f;
import n6.AbstractC3462k;
import n6.M;
import n6.U;
import p3.i;
import x2.k;

/* loaded from: classes4.dex */
public final class a implements M3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f6091a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f6092b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.d f6093c;

    /* renamed from: d, reason: collision with root package name */
    private final i f6094d;

    /* renamed from: e, reason: collision with root package name */
    private final U5.g f6095e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f6096f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0111a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6097a;

        /* renamed from: b, reason: collision with root package name */
        Object f6098b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6099c;

        /* renamed from: e, reason: collision with root package name */
        int f6101e;

        C0111a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6099c = obj;
            this.f6101e |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, false, this);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6102a;

        /* renamed from: b, reason: collision with root package name */
        Object f6103b;

        /* renamed from: c, reason: collision with root package name */
        Object f6104c;

        /* renamed from: d, reason: collision with root package name */
        Object f6105d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6106e;

        /* renamed from: g, reason: collision with root package name */
        int f6108g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6106e = obj;
            this.f6108g |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            if (l8 == V5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f6109a;

        /* renamed from: b, reason: collision with root package name */
        Object f6110b;

        /* renamed from: c, reason: collision with root package name */
        int f6111c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f6112d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M3.c f6113e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a f6114f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f6115g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, M3.c cVar, c.a aVar, List list, U5.d dVar) {
            super(2, dVar);
            this.f6112d = oVar;
            this.f6113e = cVar;
            this.f6114f = aVar;
            this.f6115g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f6112d, this.f6113e, this.f6114f, this.f6115g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            List list;
            Object e8 = V5.b.e();
            int i8 = this.f6111c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f6110b;
                    list = (List) this.f6109a;
                    t.b(obj);
                    obj2 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f6112d.f25631a;
                if (str2 != null) {
                    M3.c cVar = this.f6113e;
                    c.a aVar = this.f6114f;
                    List list2 = this.f6115g;
                    this.f6109a = list2;
                    this.f6110b = str2;
                    this.f6111c = 1;
                    Object d8 = cVar.d(aVar, str2, false, this);
                    if (d8 == e8) {
                        return e8;
                    }
                    str = str2;
                    obj2 = d8;
                    list = list2;
                } else {
                    return null;
                }
            }
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                list.add(new d.a(str, e9));
            }
            return s.a(obj2);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6116a;

        /* renamed from: c, reason: collision with root package name */
        int f6118c;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6116a = obj;
            this.f6118c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, false, this);
            if (c8 == V5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6119a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f6121c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f6122d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.a f6123e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6124f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0112a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6125a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6126b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c.a f6127c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o.p f6128d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0112a(a aVar, c.a aVar2, o.p pVar, U5.d dVar) {
                super(2, dVar);
                this.f6126b = aVar;
                this.f6127c = aVar2;
                this.f6128d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0112a(this.f6126b, this.f6127c, this.f6128d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object g8;
                Object e8 = V5.b.e();
                int i8 = this.f6125a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        g8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    m mVar = this.f6126b.f6091a;
                    com.stripe.android.model.l lVar = new com.stripe.android.model.l(this.f6127c.b(), this.f6128d, kotlin.coroutines.jvm.internal.b.c(100), null, null, 24, null);
                    Set set = this.f6126b.f6096f;
                    j.c cVar = new j.c(this.f6127c.a(), ((r) this.f6126b.f6092b.get()).h(), null, 4, null);
                    this.f6125a = 1;
                    g8 = mVar.g(lVar, set, cVar, this);
                    if (g8 == e8) {
                        return e8;
                    }
                }
                a aVar = this.f6126b;
                Throwable e9 = s.e(g8);
                if (e9 != null) {
                    aVar.f6093c.a("Failed to retrieve payment methods.", e9);
                    i.b.a(aVar.f6094d, i.d.f36200d, k.f40948e.b(e9), null, 4, null);
                }
                a aVar2 = this.f6126b;
                if (s.h(g8)) {
                    i.b.a(aVar2.f6094d, i.e.f36221b, null, null, 6, null);
                }
                return s.a(g8);
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0112a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, a aVar, c.a aVar2, boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f6121c = list;
            this.f6122d = aVar;
            this.f6123e = aVar2;
            this.f6124f = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            e eVar = new e(this.f6121c, this.f6122d, this.f6123e, this.f6124f, dVar);
            eVar.f6120b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            U b9;
            Object e8 = V5.b.e();
            int i8 = this.f6119a;
            if (i8 != 0) {
                if (i8 == 1) {
                    list = (List) this.f6120b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f6120b;
                List list2 = this.f6121c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (a0.i(o.p.f25755i, o.p.f25745O, o.p.f25759m).contains((o.p) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                a aVar = this.f6122d;
                c.a aVar2 = this.f6123e;
                ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b9 = AbstractC3462k.b(m8, null, null, new C0112a(aVar, aVar2, (o.p) it.next(), null), 3, null);
                    arrayList2.add(b9);
                }
                ArrayList arrayList3 = new ArrayList();
                this.f6120b = arrayList3;
                this.f6119a = 1;
                Object a9 = AbstractC3452f.a(arrayList2, this);
                if (a9 == e8) {
                    return e8;
                }
                list = arrayList3;
                obj = a9;
            }
            a aVar3 = this.f6122d;
            boolean z8 = this.f6124f;
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                Object j8 = ((s) it2.next()).j();
                Throwable e9 = s.e(j8);
                if (e9 == null) {
                    list.addAll(aVar3.m((List) j8));
                } else if (!z8) {
                    return s.a(s.b(t.a(e9)));
                }
            }
            return s.a(s.b(list));
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6129a;

        /* renamed from: c, reason: collision with root package name */
        int f6131c;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6129a = obj;
            this.f6131c |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6132a;

        /* renamed from: b, reason: collision with root package name */
        Object f6133b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6134c;

        /* renamed from: e, reason: collision with root package name */
        int f6136e;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6134c = obj;
            this.f6136e |= Integer.MIN_VALUE;
            Object b9 = a.this.b(null, null, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    public a(m stripeRepository, N5.a lazyPaymentConfig, v2.d logger, i errorReporter, U5.g workContext, Set productUsageTokens) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        this.f6091a = stripeRepository;
        this.f6092b = lazyPaymentConfig;
        this.f6093c = logger;
        this.f6094d = errorReporter;
        this.f6095e = workContext;
        this.f6096f = productUsageTokens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(M3.c r21, M3.c.a r22, java.lang.String r23, U5.d r24) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.l(M3.c, M3.c$a, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m(java.util.List r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r9.n(r10)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r1 = 4
            i3.a$g[] r1 = new i3.AbstractC2970a.g[r1]
            i3.a$g r2 = i3.AbstractC2970a.g.f32739d
            r3 = 0
            r1[r3] = r2
            i3.a$g r2 = i3.AbstractC2970a.g.f32740e
            r4 = 1
            r1[r4] = r2
            i3.a$g r2 = i3.AbstractC2970a.g.f32742g
            r5 = 2
            r1[r5] = r2
            i3.a$g r2 = i3.AbstractC2970a.g.f32744i
            r5 = 3
            r1[r5] = r2
            java.util.Set r1 = R5.a0.i(r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r10.next()
            r6 = r5
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6
            com.stripe.android.model.o$p r7 = r6.f25635e
            com.stripe.android.model.o$p r8 = com.stripe.android.model.o.p.f25755i
            if (r7 != r8) goto L60
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.stripe.android.model.o$g r6 = r6.f25638h
            if (r6 == 0) goto L57
            i3.a r6 = r6.f25707j
            if (r6 == 0) goto L57
            i3.a$g r6 = r6.a()
            goto L58
        L57:
            r6 = 0
        L58:
            boolean r6 = R5.AbstractC1435t.d0(r7, r6)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            r6 = r6 ^ r4
            if (r6 == 0) goto L34
            r2.add(r5)
            goto L34
        L68:
            r0.addAll(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.m(java.util.List):java.util.List");
    }

    private final List n(List list) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        EnumC2906e enumC2906e;
        AbstractC2970a abstractC2970a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            AbstractC2970a.g gVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            if (oVar.f25635e == o.p.f25755i) {
                o.g gVar2 = oVar.f25638h;
                if (gVar2 != null && (abstractC2970a = gVar2.f25707j) != null) {
                    gVar = abstractC2970a.a();
                }
                if (gVar == AbstractC2970a.g.f32744i) {
                    arrayList.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            o.g gVar3 = ((o) obj).f25638h;
            if (gVar3 != null) {
                str = gVar3.f25705h;
            } else {
                str = null;
            }
            if (gVar3 != null) {
                num = gVar3.f25701d;
            } else {
                num = null;
            }
            if (gVar3 != null) {
                num2 = gVar3.f25702e;
            } else {
                num2 = null;
            }
            if (gVar3 != null && (enumC2906e = gVar3.f25698a) != null) {
                str2 = enumC2906e.f();
            } else {
                str2 = null;
            }
            if (hashSet.add(str + "-" + num + "-" + num2 + "-" + str2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(M3.c.a r13, U5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof M3.a.f
            if (r0 == 0) goto L13
            r0 = r14
            M3.a$f r0 = (M3.a.f) r0
            int r1 = r0.f6131c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6131c = r1
            goto L18
        L13:
            M3.a$f r0 = new M3.a$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6129a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6131c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r13 = r14.j()
            goto L64
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            Q5.t.b(r14)
            j3.m r14 = r12.f6091a
            java.lang.String r2 = r13.b()
            java.util.Set r4 = r12.f6096f
            B2.j$c r11 = new B2.j$c
            java.lang.String r6 = r13.a()
            N5.a r13 = r12.f6092b
            java.lang.Object r13 = r13.get()
            n2.r r13 = (n2.r) r13
            java.lang.String r7 = r13.h()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f6131c = r3
            java.lang.Object r13 = r14.s(r2, r4, r11, r0)
            if (r13 != r1) goto L64
            return r1
        L64:
            boolean r14 = Q5.s.g(r13)
            if (r14 == 0) goto L6b
            r13 = 0
        L6b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.a(M3.c$a, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(M3.c.a r11, java.lang.String r12, com.stripe.android.model.t r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof M3.a.g
            if (r0 == 0) goto L13
            r0 = r14
            M3.a$g r0 = (M3.a.g) r0
            int r1 = r0.f6136e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6136e = r1
            goto L18
        L13:
            M3.a$g r0 = new M3.a$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6134c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6136e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r11 = r0.f6133b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f6132a
            M3.a r11 = (M3.a) r11
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r13 = r14.j()
            goto L6c
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            Q5.t.b(r14)
            j3.m r14 = r10.f6091a
            B2.j$c r2 = new B2.j$c
            java.lang.String r5 = r11.a()
            N5.a r11 = r10.f6092b
            java.lang.Object r11 = r11.get()
            n2.r r11 = (n2.r) r11
            java.lang.String r6 = r11.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6132a = r10
            r0.f6133b = r12
            r0.f6136e = r3
            java.lang.Object r13 = r14.p(r12, r13, r2, r0)
            if (r13 != r1) goto L6b
            return r1
        L6b:
            r11 = r10
        L6c:
            java.lang.Throwable r14 = Q5.s.e(r13)
            if (r14 == 0) goto L8d
            v2.d r11 = r11.f6093c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to update payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        L8d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.b(M3.c$a, java.lang.String, com.stripe.android.model.t, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(M3.c.a r11, java.util.List r12, boolean r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof M3.a.d
            if (r0 == 0) goto L13
            r0 = r14
            M3.a$d r0 = (M3.a.d) r0
            int r1 = r0.f6118c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6118c = r1
            goto L18
        L13:
            M3.a$d r0 = new M3.a$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6116a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6118c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Q5.t.b(r14)
            U5.g r14 = r10.f6095e
            M3.a$e r2 = new M3.a$e
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6118c = r3
            java.lang.Object r14 = n6.AbstractC3458i.g(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.c(M3.c$a, java.util.List, boolean, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // M3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(M3.c.a r11, java.lang.String r12, boolean r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof M3.a.C0111a
            if (r0 == 0) goto L13
            r0 = r14
            M3.a$a r0 = (M3.a.C0111a) r0
            int r1 = r0.f6101e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6101e = r1
            goto L18
        L13:
            M3.a$a r0 = new M3.a$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6099c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6101e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L28
            if (r2 != r3) goto L3b
        L28:
            java.lang.Object r11 = r0.f6098b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f6097a
            M3.a r11 = (M3.a) r11
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r13 = r14.j()
            goto L82
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            Q5.t.b(r14)
            if (r13 == 0) goto L57
            r0.f6097a = r10
            r0.f6098b = r12
            r0.f6101e = r4
            java.lang.Object r11 = r10.l(r10, r11, r12, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r13 = r11
            goto L81
        L57:
            j3.m r13 = r10.f6091a
            java.util.Set r14 = r10.f6096f
            B2.j$c r2 = new B2.j$c
            java.lang.String r5 = r11.a()
            N5.a r11 = r10.f6092b
            java.lang.Object r11 = r11.get()
            n2.r r11 = (n2.r) r11
            java.lang.String r6 = r11.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6097a = r10
            r0.f6098b = r12
            r0.f6101e = r3
            java.lang.Object r13 = r13.B(r14, r12, r2, r0)
            if (r13 != r1) goto L81
            return r1
        L81:
            r11 = r10
        L82:
            java.lang.Throwable r14 = Q5.s.e(r13)
            if (r14 == 0) goto La3
            v2.d r11 = r11.f6093c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to detach payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        La3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.d(M3.c$a, java.lang.String, boolean, U5.d):java.lang.Object");
    }
}
