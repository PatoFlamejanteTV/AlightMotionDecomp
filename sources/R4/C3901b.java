package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3533g;
import p4.C3577b;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.AbstractC3910i;
import r4.G;
import r4.Q;
import w4.C4156a;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3901b extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private Map f38275b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3910i f38276c;

    /* renamed from: d, reason: collision with root package name */
    private final I f38277d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38278e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38279f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.c f38280g;

    /* renamed from: h, reason: collision with root package name */
    private final C3921u f38281h;

    /* renamed from: i, reason: collision with root package name */
    private final q0 f38282i;

    /* renamed from: j, reason: collision with root package name */
    private final C3908g f38283j;

    /* renamed from: k, reason: collision with root package name */
    private final S f38284k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f38285l;

    /* renamed from: m, reason: collision with root package name */
    private final C3906e f38286m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f38287n;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f38288o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f38289p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f38290q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f38291r;

    /* renamed from: s, reason: collision with root package name */
    private final C3899a f38292s;

    /* renamed from: r4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2074p {
        a() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:            if (((r4.AbstractC3910i.b) r6.f38293a.f38276c).a(r7, r6.f38293a.f38277d) != false) goto L22;     */
        @Override // c6.InterfaceC2074p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List invoke(java.lang.String r7, java.util.List r8, Q5.I r9, Q5.I r10) {
            /*
                r6 = this;
                r9 = 2
                r10 = 1
                r0 = 0
                java.lang.String r1 = "otherFields"
                kotlin.jvm.internal.AbstractC3292y.i(r8, r1)
                r4.b r1 = r4.C3901b.this
                r4.q0 r1 = r4.C3901b.o(r1)
                r4.b r2 = r4.C3901b.this
                r4.u r2 = r2.t()
                r4.b r3 = r4.C3901b.this
                boolean r3 = r4.C3901b.m(r3)
                r4 = 0
                if (r3 != 0) goto L1e
                goto L1f
            L1e:
                r2 = r4
            L1f:
                r4.b r3 = r4.C3901b.this
                r4.g r3 = r4.C3901b.i(r3)
                r5 = 3
                r4.o0[] r5 = new r4.o0[r5]
                r5[r0] = r1
                r5[r10] = r2
                r5[r9] = r3
                java.util.List r1 = R5.AbstractC1435t.r(r5)
                r4.b r2 = r4.C3901b.this
                r4.q0 r2 = r4.C3901b.o(r2)
                r4.b r3 = r4.C3901b.this
                r4.u r3 = r3.t()
                r4.b r5 = r4.C3901b.this
                boolean r5 = r4.C3901b.m(r5)
                if (r5 != 0) goto L47
                goto L48
            L47:
                r3 = r4
            L48:
                r4.o0[] r9 = new r4.o0[r9]
                r9[r0] = r2
                r9[r10] = r3
                java.util.List r9 = R5.AbstractC1435t.r(r9)
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.List r9 = R5.AbstractC1435t.G0(r9, r8)
                r4.b r10 = r4.C3901b.this
                r4.i r10 = r4.C3901b.j(r10)
                boolean r0 = r10 instanceof r4.AbstractC3910i.b
                if (r0 == 0) goto L79
                r4.b r8 = r4.C3901b.this
                r4.i r8 = r4.C3901b.j(r8)
                r4.i$b r8 = (r4.AbstractC3910i.b) r8
                r4.b r10 = r4.C3901b.this
                r4.I r10 = r4.C3901b.q(r10)
                boolean r7 = r8.a(r7, r10)
                if (r7 == 0) goto L7d
                goto L98
            L79:
                boolean r7 = r10 instanceof r4.AbstractC3910i.c
                if (r7 == 0) goto L7f
            L7d:
                r1 = r9
                goto L98
            L7f:
                r4.b r7 = r4.C3901b.this
                r4.u r7 = r7.t()
                r4.b r9 = r4.C3901b.this
                boolean r9 = r4.C3901b.m(r9)
                if (r9 != 0) goto L8e
                r4 = r7
            L8e:
                java.util.List r7 = R5.AbstractC1435t.q(r4)
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.List r1 = R5.AbstractC1435t.G0(r7, r8)
            L98:
                r4.b r7 = r4.C3901b.this
                r4.i r7 = r4.C3901b.j(r7)
                r4.W r7 = r7.i()
                r4.W r8 = r4.W.f38207b
                if (r7 == r8) goto Lb2
                java.util.Collection r1 = (java.util.Collection) r1
                r4.b r7 = r4.C3901b.this
                r4.S r7 = r7.u()
                java.util.List r1 = R5.AbstractC1435t.H0(r1, r7)
            Lb2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.C3901b.a.invoke(java.lang.String, java.util.List, Q5.I, Q5.I):java.util.List");
        }
    }

    /* renamed from: r4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0854b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0854b f38294a = new C0854b();

        /* renamed from: r4.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38295a;

            /* renamed from: r4.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0855a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f38296a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0855a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f38296a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f38296a.length];
                }
            }

            /* renamed from: r4.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0856b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f38297a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f38298b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f38299c;

                public C0856b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f38297a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38298b;
                        List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38299c)));
                        this.f38297a = 1;
                        if (interfaceC3822g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    C0856b c0856b = new C0856b(dVar);
                    c0856b.f38298b = interfaceC3822g;
                    c0856b.f38299c = objArr;
                    return c0856b.invokeSuspend(Q5.I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f38295a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f38295a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0855a(interfaceC3821fArr), new C0856b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return Q5.I.f8786a;
            }
        }

        /* renamed from: r4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0857b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f38300a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0857b(List list) {
                super(0);
                this.f38300a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f38300a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
            }
        }

        C0854b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List fieldElements) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new C0857b(arrayList));
        }
    }

    /* renamed from: r4.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f38302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f38303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var, Map map) {
            super(2);
            this.f38302b = e0Var;
            this.f38303c = map;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.I invoke(String str, List values) {
            String str2;
            AbstractC3292y.i(values, "values");
            if (str != null) {
                C3901b.this.f38285l.put(G.Companion.l(), str);
            }
            Map map = C3901b.this.f38285l;
            List<Q5.r> list = values;
            LinkedHashMap linkedHashMap = new LinkedHashMap(i6.m.d(R5.Q.d(AbstractC1435t.x(list, 10)), 16));
            for (Q5.r rVar : list) {
                Q5.r rVar2 = new Q5.r(rVar.c(), ((C4156a) rVar.d()).c());
                linkedHashMap.put(rVar2.c(), rVar2.d());
            }
            map.putAll(linkedHashMap);
            Map map2 = C3901b.this.f38285l;
            Map map3 = this.f38303c;
            boolean z8 = true;
            if (!map2.isEmpty()) {
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (map3 == null || (str2 = (String) map3.get(entry.getKey())) == null) {
                        str2 = "";
                    }
                    if (!AbstractC3292y.d(str2, entry.getValue())) {
                        z8 = false;
                        break;
                    }
                }
            }
            C3901b.this.f38288o = Boolean.valueOf(z8);
            e0 e0Var = this.f38302b;
            if (e0Var != null) {
                e0Var.h(R5.Q.e(Q5.x.a(e0Var.a(), String.valueOf(z8))));
                return Q5.I.f8786a;
            }
            return null;
        }
    }

    /* renamed from: r4.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38304a = new d();

        /* renamed from: r4.b$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38305a;

            /* renamed from: r4.b$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0858a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f38306a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0858a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f38306a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f38306a.length];
                }
            }

            /* renamed from: r4.b$d$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0859b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f38307a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f38308b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f38309c;

                public C0859b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f38307a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38308b;
                        List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38309c)));
                        this.f38307a = 1;
                        if (interfaceC3822g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    C0859b c0859b = new C0859b(dVar);
                    c0859b.f38308b = interfaceC3822g;
                    c0859b.f38309c = objArr;
                    return c0859b.invokeSuspend(Q5.I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f38305a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f38305a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0858a(interfaceC3821fArr), new C0859b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return Q5.I.f8786a;
            }
        }

        /* renamed from: r4.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0860b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f38310a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0860b(List list) {
                super(0);
                this.f38310a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f38310a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
            }
        }

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List fieldElements) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new C0860b(arrayList));
        }
    }

    /* renamed from: r4.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f38311a = new e();

        /* renamed from: r4.b$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38312a;

            /* renamed from: r4.b$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0861a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f38313a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0861a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f38313a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f38313a.length];
                }
            }

            /* renamed from: r4.b$e$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0862b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f38314a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f38315b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f38316c;

                public C0862b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f38314a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38315b;
                        List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38316c)));
                        this.f38314a = 1;
                        if (interfaceC3822g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    C0862b c0862b = new C0862b(dVar);
                    c0862b.f38315b = interfaceC3822g;
                    c0862b.f38316c = objArr;
                    return c0862b.invokeSuspend(Q5.I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f38312a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f38312a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0861a(interfaceC3821fArr), new C0862b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return Q5.I.f8786a;
            }
        }

        /* renamed from: r4.b$e$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0863b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f38317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0863b(List list) {
                super(0);
                this.f38317a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f38317a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List it) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((k0) it2.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new C0863b(arrayList));
        }
    }

    /* renamed from: r4.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String str) {
            if (str != null) {
                C3901b.this.u().i().y().q(str);
            }
            List a9 = C3901b.this.f38286m.a(str);
            if (a9 == null) {
                a9 = AbstractC1435t.m();
            }
            List<k0> list = a9;
            C3901b c3901b = C3901b.this;
            for (k0 k0Var : list) {
                AbstractC3903c.b(k0Var, str, c3901b.f38276c, c3901b.f38277d);
                k0Var.h(c3901b.f38275b);
            }
            return list;
        }
    }

    /* renamed from: r4.b$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f38320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Map map) {
            super(2);
            this.f38320b = map;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.I invoke(List fields, Boolean bool) {
            String str;
            AbstractC3292y.i(fields, "fields");
            if (!AbstractC3292y.d(bool, C3901b.this.f38288o)) {
                C3901b.this.f38288o = bool;
            } else {
                bool = null;
            }
            C3921u t8 = C3901b.this.t();
            if (C3901b.this.f38278e) {
                t8 = null;
            }
            List G02 = AbstractC1435t.G0(AbstractC1435t.q(t8), fields);
            if (bool == null) {
                return null;
            }
            Map map = this.f38320b;
            C3901b c3901b = C3901b.this;
            if (!bool.booleanValue()) {
                Map map2 = c3901b.f38285l;
                map = new LinkedHashMap(R5.Q.d(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    if (AbstractC3292y.d(entry.getKey(), G.Companion.l())) {
                        str = (String) entry.getValue();
                    } else {
                        str = (String) c3901b.f38275b.get(entry.getKey());
                        if (str == null) {
                            str = "";
                        }
                    }
                    map.put(key, str);
                }
            } else if (map == null) {
                map = R5.Q.h();
            }
            Iterator it = G02.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).h(map);
            }
            return Q5.I.f8786a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3901b(r4.G r16, java.util.Map r17, r4.AbstractC3910i r18, java.util.Set r19, r4.C3925y r20, r4.e0 r21, java.util.Map r22, r4.I r23, boolean r24, int r25, kotlin.jvm.internal.AbstractC3284p r26) {
        /*
            r15 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Map r1 = R5.Q.h()
            r4 = r1
            goto Le
        Lc:
            r4 = r17
        Le:
            r1 = r0 & 4
            if (r1 == 0) goto L1b
            r4.i$a r1 = new r4.i$a
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2, r3)
            r5 = r1
            goto L1d
        L1b:
            r5 = r18
        L1d:
            r1 = r0 & 8
            if (r1 == 0) goto L26
            java.util.Set r1 = R5.a0.f()
            goto L28
        L26:
            r1 = r19
        L28:
            r2 = r0 & 16
            if (r2 == 0) goto L4e
            r4.y r2 = new r4.y
            r4.t r3 = new r4.t
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r3
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.G$b r6 = r4.G.Companion
            r4.G r6 = r6.l()
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.<init>(r3, r6)
            r7 = r2
            goto L50
        L4e:
            r7 = r20
        L50:
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L5b
            r4.w r2 = new r4.w
            r2.<init>()
            r10 = r2
            goto L5d
        L5b:
            r10 = r23
        L5d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L64
            r0 = 0
            r11 = 0
            goto L66
        L64:
            r11 = r24
        L66:
            r2 = r15
            r3 = r16
            r6 = r1
            r8 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C3901b.<init>(r4.G, java.util.Map, r4.i, java.util.Set, r4.y, r4.e0, java.util.Map, r4.I, boolean, int, kotlin.jvm.internal.p):void");
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38280g;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38279f;
    }

    @Override // r4.k0
    public InterfaceC3813L d() {
        return A4.g.l(this.f38291r, d.f38304a);
    }

    @Override // r4.k0
    public InterfaceC3813L e() {
        return A4.g.l(this.f38291r, e.f38311a);
    }

    @Override // r4.k0
    public m0 f() {
        return this.f38292s;
    }

    @Override // r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        this.f38275b = rawValuesMap;
    }

    public final C3899a s() {
        return this.f38292s;
    }

    public final C3921u t() {
        return this.f38281h;
    }

    public final S u() {
        return this.f38284k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3901b(G _identifier, Map rawValuesMap, AbstractC3910i addressType, Set countryCodes, C3925y countryDropdownFieldController, e0 e0Var, Map map, I isPlacesAvailable, boolean z8) {
        super(_identifier);
        d0 i8;
        InterfaceC3813L w8;
        AbstractC3292y.i(_identifier, "_identifier");
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        AbstractC3292y.i(addressType, "addressType");
        AbstractC3292y.i(countryCodes, "countryCodes");
        AbstractC3292y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3292y.i(isPlacesAvailable, "isPlacesAvailable");
        this.f38275b = rawValuesMap;
        this.f38276c = addressType;
        this.f38277d = isPlacesAvailable;
        this.f38278e = z8;
        this.f38279f = true;
        G.b bVar = G.Companion;
        C3921u c3921u = new C3921u(bVar.l(), countryDropdownFieldController);
        this.f38281h = c3921u;
        this.f38282i = new q0(bVar.r(), new s0(new r0(Integer.valueOf(v2.e.f40442e), 0, 0, null, 14, null), false, (String) this.f38275b.get(bVar.r()), 2, null));
        G s8 = bVar.s();
        r0 r0Var = new r0(Integer.valueOf(AbstractC3533g.f35957a), 0, 0, null, 14, null);
        AbstractC3910i.b bVar2 = addressType instanceof AbstractC3910i.b ? (AbstractC3910i.b) addressType : null;
        this.f38283j = new C3908g(s8, r0Var, bVar2 != null ? bVar2.f() : null);
        G t8 = bVar.t();
        Q.a aVar = Q.f38111r;
        String str = (String) this.f38275b.get(bVar.t());
        this.f38284k = new S(t8, Q.a.b(aVar, str == null ? "" : str, null, null, addressType.i() == W.f38208c, true, 6, null));
        this.f38285l = new LinkedHashMap();
        this.f38286m = new C3906e(C3577b.f36258a);
        InterfaceC3813L m8 = A4.g.m(c3921u.i().y(), new f());
        this.f38287n = m8;
        InterfaceC3813L d8 = A4.g.d(m8, (e0Var == null || (i8 = e0Var.i()) == null || (w8 = i8.w()) == null) ? A4.g.n(null) : w8, new g(map));
        this.f38289p = d8;
        InterfaceC3813L d9 = A4.g.d(c3921u.i().y(), A4.g.l(m8, C0854b.f38294a), new c(e0Var, map));
        this.f38290q = d9;
        InterfaceC3813L f8 = A4.g.f(c3921u.i().y(), m8, d8, d9, new a());
        this.f38291r = f8;
        this.f38292s = new C3899a(f8);
    }
}
