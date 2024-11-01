package A4;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import c6.InterfaceC2076r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public abstract class g {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2075q f184b;

        /* renamed from: A4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0002a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f185a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0002a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f185a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f185a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f186a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f187b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f188c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2075q f189d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(U5.d dVar, InterfaceC2075q interfaceC2075q) {
                super(3, dVar);
                this.f189d = interfaceC2075q;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f186a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f187b;
                    Object[] objArr = (Object[]) this.f188c;
                    Object invoke = this.f189d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                    this.f186a = 1;
                    if (interfaceC3822g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar, this.f189d);
                bVar.f187b = interfaceC3822g;
                bVar.f188c = objArr;
                return bVar.invokeSuspend(I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr, InterfaceC2075q interfaceC2075q) {
            this.f183a = interfaceC3821fArr;
            this.f184b = interfaceC2075q;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f183a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0002a(interfaceC3821fArr), new b(null, this.f184b), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2076r f191b;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f192a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f192a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f192a.length];
            }
        }

        /* renamed from: A4.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0003b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f193a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f194b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f195c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2076r f196d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0003b(U5.d dVar, InterfaceC2076r interfaceC2076r) {
                super(3, dVar);
                this.f196d = interfaceC2076r;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f193a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f194b;
                    Object[] objArr = (Object[]) this.f195c;
                    Object invoke = this.f196d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                    this.f193a = 1;
                    if (interfaceC3822g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0003b c0003b = new C0003b(dVar, this.f196d);
                c0003b.f194b = interfaceC3822g;
                c0003b.f195c = objArr;
                return c0003b.invokeSuspend(I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr, InterfaceC2076r interfaceC2076r) {
            this.f190a = interfaceC3821fArr;
            this.f191b = interfaceC2076r;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f190a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new C0003b(null, this.f191b), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2076r f197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f200d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f201e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f202f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2076r interfaceC2076r, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4, InterfaceC3813L interfaceC3813L5, InterfaceC3813L interfaceC3813L6) {
            super(0);
            this.f197a = interfaceC2076r;
            this.f198b = interfaceC3813L;
            this.f199c = interfaceC3813L2;
            this.f200d = interfaceC3813L3;
            this.f201e = interfaceC3813L4;
            this.f202f = interfaceC3813L5;
            this.f203g = interfaceC3813L6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f197a.invoke(this.f198b.getValue(), this.f199c.getValue(), this.f200d.getValue(), this.f201e.getValue(), this.f202f.getValue(), this.f203g.getValue());
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class d extends C3289v implements InterfaceC2073o {
        d(Object obj) {
            super(3, obj, AbstractC3292y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, U5.d dVar) {
            return g.i((InterfaceC2072n) this.receiver, obj, obj2, dVar);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f204a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f205b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC2072n interfaceC2072n, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2) {
            super(0);
            this.f204a = interfaceC2072n;
            this.f205b = interfaceC3813L;
            this.f206c = interfaceC3813L2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f204a.invoke(this.f205b.getValue(), this.f206c.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends C3289v implements InterfaceC2074p {
        f(Object obj) {
            super(4, obj, AbstractC3292y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // c6.InterfaceC2074p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, U5.d dVar) {
            return g.j((InterfaceC2073o) this.receiver, obj, obj2, obj3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0004g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0004g(InterfaceC2073o interfaceC2073o, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3) {
            super(0);
            this.f207a = interfaceC2073o;
            this.f208b = interfaceC3813L;
            this.f209c = interfaceC3813L2;
            this.f210d = interfaceC3813L3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f207a.invoke(this.f208b.getValue(), this.f209c.getValue(), this.f210d.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends C3289v implements InterfaceC2075q {
        h(Object obj) {
            super(5, obj, AbstractC3292y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // c6.InterfaceC2075q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, U5.d dVar) {
            return g.k((InterfaceC2074p) this.receiver, obj, obj2, obj3, obj4, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2074p f211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f212b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f214d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f215e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC2074p interfaceC2074p, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4) {
            super(0);
            this.f211a = interfaceC2074p;
            this.f212b = interfaceC3813L;
            this.f213c = interfaceC3813L2;
            this.f214d = interfaceC3813L3;
            this.f215e = interfaceC3813L4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f211a.invoke(this.f212b.getValue(), this.f213c.getValue(), this.f214d.getValue(), this.f215e.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2075q f216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f219d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f220e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f221f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC2075q interfaceC2075q, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4, InterfaceC3813L interfaceC3813L5) {
            super(0);
            this.f216a = interfaceC2075q;
            this.f217b = interfaceC3813L;
            this.f218c = interfaceC3813L2;
            this.f219d = interfaceC3813L3;
            this.f220e = interfaceC3813L4;
            this.f221f = interfaceC3813L5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f216a.invoke(this.f217b.getValue(), this.f218c.getValue(), this.f219d.getValue(), this.f220e.getValue(), this.f221f.getValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f222a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f223b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f225d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(U5.d dVar, Function1 function1) {
            super(3, dVar);
            this.f225d = function1;
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3822g interfaceC3822g, Object obj, U5.d dVar) {
            k kVar = new k(dVar, this.f225d);
            kVar.f223b = interfaceC3822g;
            kVar.f224c = obj;
            return kVar.invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f222a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f223b;
                InterfaceC3821f interfaceC3821f = (InterfaceC3821f) this.f225d.invoke(this.f224c);
                this.f222a = 1;
                if (AbstractC3823h.t(interfaceC3822g, interfaceC3821f, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f226a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function1 function1, InterfaceC3813L interfaceC3813L) {
            super(0);
            this.f226a = function1;
            this.f227b = interfaceC3813L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((InterfaceC3813L) this.f226a.invoke(this.f227b.getValue())).getValue();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f229b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f231b;

            /* renamed from: A4.g$m$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0005a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f232a;

                /* renamed from: b, reason: collision with root package name */
                int f233b;

                public C0005a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f232a = obj;
                    this.f233b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g, Function1 function1) {
                this.f230a = interfaceC3822g;
                this.f231b = function1;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof A4.g.m.a.C0005a
                    if (r0 == 0) goto L13
                    r0 = r6
                    A4.g$m$a$a r0 = (A4.g.m.a.C0005a) r0
                    int r1 = r0.f233b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f233b = r1
                    goto L18
                L13:
                    A4.g$m$a$a r0 = new A4.g$m$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f232a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f233b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    q6.g r6 = r4.f230a
                    kotlin.jvm.functions.Function1 r2 = r4.f231b
                    java.lang.Object r5 = r2.invoke(r5)
                    r0.f233b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: A4.g.m.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public m(InterfaceC3821f interfaceC3821f, Function1 function1) {
            this.f228a = interfaceC3821f;
            this.f229b = function1;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f228a.collect(new a(interfaceC3822g, this.f229b), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, InterfaceC3813L interfaceC3813L) {
            super(0);
            this.f235a = function1;
            this.f236b = interfaceC3813L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f235a.invoke(this.f236b.getValue());
        }
    }

    public static final InterfaceC3813L d(InterfaceC3813L flow1, InterfaceC3813L flow2, InterfaceC2072n transform) {
        AbstractC3292y.i(flow1, "flow1");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(AbstractC3823h.k(flow1, flow2, new d(transform)), new e(transform, flow1, flow2));
    }

    public static final InterfaceC3813L e(InterfaceC3813L flow1, InterfaceC3813L flow2, InterfaceC3813L flow3, InterfaceC2073o transform) {
        AbstractC3292y.i(flow1, "flow1");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(flow3, "flow3");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(AbstractC3823h.l(flow1, flow2, flow3, new f(transform)), new C0004g(transform, flow1, flow2, flow3));
    }

    public static final InterfaceC3813L f(InterfaceC3813L flow1, InterfaceC3813L flow2, InterfaceC3813L flow3, InterfaceC3813L flow4, InterfaceC2074p transform) {
        AbstractC3292y.i(flow1, "flow1");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(flow3, "flow3");
        AbstractC3292y.i(flow4, "flow4");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(AbstractC3823h.m(flow1, flow2, flow3, flow4, new h(transform)), new i(transform, flow1, flow2, flow3, flow4));
    }

    public static final InterfaceC3813L g(InterfaceC3813L flow1, InterfaceC3813L flow2, InterfaceC3813L flow3, InterfaceC3813L flow4, InterfaceC3813L flow5, InterfaceC2075q transform) {
        AbstractC3292y.i(flow1, "flow1");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(flow3, "flow3");
        AbstractC3292y.i(flow4, "flow4");
        AbstractC3292y.i(flow5, "flow5");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(new a((InterfaceC3821f[]) AbstractC1435t.W0(AbstractC1435t.p(flow1, flow2, flow3, flow4, flow5)).toArray(new InterfaceC3821f[0]), transform), new j(transform, flow1, flow2, flow3, flow4, flow5));
    }

    public static final InterfaceC3813L h(InterfaceC3813L flow1, InterfaceC3813L flow2, InterfaceC3813L flow3, InterfaceC3813L flow4, InterfaceC3813L flow5, InterfaceC3813L flow6, InterfaceC2076r transform) {
        AbstractC3292y.i(flow1, "flow1");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(flow3, "flow3");
        AbstractC3292y.i(flow4, "flow4");
        AbstractC3292y.i(flow5, "flow5");
        AbstractC3292y.i(flow6, "flow6");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(new b((InterfaceC3821f[]) AbstractC1435t.W0(AbstractC1435t.p(flow1, flow2, flow3, flow4, flow5, flow6)).toArray(new InterfaceC3821f[0]), transform), new c(transform, flow1, flow2, flow3, flow4, flow5, flow6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object i(InterfaceC2072n interfaceC2072n, Object obj, Object obj2, U5.d dVar) {
        return interfaceC2072n.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object j(InterfaceC2073o interfaceC2073o, Object obj, Object obj2, Object obj3, U5.d dVar) {
        return interfaceC2073o.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object k(InterfaceC2074p interfaceC2074p, Object obj, Object obj2, Object obj3, Object obj4, U5.d dVar) {
        return interfaceC2074p.invoke(obj, obj2, obj3, obj4);
    }

    public static final InterfaceC3813L l(InterfaceC3813L interfaceC3813L, Function1 transform) {
        AbstractC3292y.i(interfaceC3813L, "<this>");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(AbstractC3823h.M(interfaceC3813L, new k(null, transform)), new l(transform, interfaceC3813L));
    }

    public static final InterfaceC3813L m(InterfaceC3813L interfaceC3813L, Function1 transform) {
        AbstractC3292y.i(interfaceC3813L, "<this>");
        AbstractC3292y.i(transform, "transform");
        return new A4.e(new m(interfaceC3813L, transform), new n(transform, interfaceC3813L));
    }

    public static final InterfaceC3813L n(Object obj) {
        return AbstractC3823h.b(AbstractC3815N.a(obj));
    }
}
