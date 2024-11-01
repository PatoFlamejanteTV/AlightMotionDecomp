package r6;

import Q5.I;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.T;
import n6.M;
import n6.N;
import p6.EnumC3588a;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public final class i extends g {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2073o f38807e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38808a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38809b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f38811d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r6.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0873a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T f38812a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f38813b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f38814c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f38815d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: r6.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0874a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f38816a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f38817b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3822g f38818c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f38819d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0874a(i iVar, InterfaceC3822g interfaceC3822g, Object obj, U5.d dVar) {
                    super(2, dVar);
                    this.f38817b = iVar;
                    this.f38818c = interfaceC3822g;
                    this.f38819d = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0874a(this.f38817b, this.f38818c, this.f38819d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f38816a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC2073o interfaceC2073o = this.f38817b.f38807e;
                        InterfaceC3822g interfaceC3822g = this.f38818c;
                        Object obj2 = this.f38819d;
                        this.f38816a = 1;
                        if (interfaceC2073o.invoke(interfaceC3822g, obj2, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0874a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: r6.i$a$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f38820a;

                /* renamed from: b, reason: collision with root package name */
                Object f38821b;

                /* renamed from: c, reason: collision with root package name */
                Object f38822c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f38823d;

                /* renamed from: f, reason: collision with root package name */
                int f38825f;

                b(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f38823d = obj;
                    this.f38825f |= Integer.MIN_VALUE;
                    return C0873a.this.emit(null, this);
                }
            }

            C0873a(T t8, M m8, i iVar, InterfaceC3822g interfaceC3822g) {
                this.f38812a = t8;
                this.f38813b = m8;
                this.f38814c = iVar;
                this.f38815d = interfaceC3822g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, U5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof r6.i.a.C0873a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    r6.i$a$a$b r0 = (r6.i.a.C0873a.b) r0
                    int r1 = r0.f38825f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f38825f = r1
                    goto L18
                L13:
                    r6.i$a$a$b r0 = new r6.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f38823d
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f38825f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f38822c
                    n6.x0 r8 = (n6.InterfaceC3488x0) r8
                    java.lang.Object r8 = r0.f38821b
                    java.lang.Object r0 = r0.f38820a
                    r6.i$a$a r0 = (r6.i.a.C0873a) r0
                    Q5.t.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Q5.t.b(r9)
                    kotlin.jvm.internal.T r9 = r7.f38812a
                    java.lang.Object r9 = r9.f34573a
                    n6.x0 r9 = (n6.InterfaceC3488x0) r9
                    if (r9 == 0) goto L5d
                    r6.j r2 = new r6.j
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f38820a = r7
                    r0.f38821b = r8
                    r0.f38822c = r9
                    r0.f38825f = r3
                    java.lang.Object r9 = r9.k(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.T r9 = r0.f38812a
                    n6.M r1 = r0.f38813b
                    n6.O r3 = n6.O.UNDISPATCHED
                    r6.i$a$a$a r4 = new r6.i$a$a$a
                    r6.i r2 = r0.f38814c
                    q6.g r0 = r0.f38815d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    n6.x0 r8 = n6.AbstractC3458i.d(r1, r2, r3, r4, r5, r6)
                    r9.f34573a = r8
                    Q5.I r8 = Q5.I.f8786a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: r6.i.a.C0873a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            super(2, dVar);
            this.f38811d = interfaceC3822g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f38811d, dVar);
            aVar.f38809b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f38808a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                M m8 = (M) this.f38809b;
                T t8 = new T();
                i iVar = i.this;
                InterfaceC3821f interfaceC3821f = iVar.f38803d;
                C0873a c0873a = new C0873a(t8, m8, iVar, this.f38811d);
                this.f38808a = 1;
                if (interfaceC3821f.collect(c0873a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public /* synthetic */ i(InterfaceC2073o interfaceC2073o, InterfaceC3821f interfaceC3821f, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, AbstractC3284p abstractC3284p) {
        this(interfaceC2073o, interfaceC3821f, (i9 & 4) != 0 ? U5.h.f10149a : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? EnumC3588a.SUSPEND : enumC3588a);
    }

    @Override // r6.e
    protected e i(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return new i(this.f38807e, this.f38803d, gVar, i8, enumC3588a);
    }

    @Override // r6.g
    protected Object q(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        Object e8 = N.e(new a(interfaceC3822g, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public i(InterfaceC2073o interfaceC2073o, InterfaceC3821f interfaceC3821f, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(interfaceC3821f, gVar, i8, enumC3588a);
        this.f38807e = interfaceC2073o;
    }
}
