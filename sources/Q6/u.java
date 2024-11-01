package q6;

import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f37571a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2074p f37572b;

        /* renamed from: q6.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0840a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f37573a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37574b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37575c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2074p f37576d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0840a(U5.d dVar, InterfaceC2074p interfaceC2074p) {
                super(3, dVar);
                this.f37576d = interfaceC2074p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3822g interfaceC3822g;
                Object e8 = V5.b.e();
                int i8 = this.f37573a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            Q5.t.b(obj);
                            return Q5.I.f8786a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3822g = (InterfaceC3822g) this.f37574b;
                    Q5.t.b(obj);
                } else {
                    Q5.t.b(obj);
                    interfaceC3822g = (InterfaceC3822g) this.f37574b;
                    Object[] objArr = (Object[]) this.f37575c;
                    InterfaceC2074p interfaceC2074p = this.f37576d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f37574b = interfaceC3822g;
                    this.f37573a = 1;
                    AbstractC3290w.c(6);
                    obj = interfaceC2074p.invoke(obj2, obj3, obj4, this);
                    AbstractC3290w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f37574b = null;
                this.f37573a = 2;
                if (interfaceC3822g.emit(obj, this) == e8) {
                    return e8;
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0840a c0840a = new C0840a(dVar, this.f37576d);
                c0840a.f37574b = interfaceC3822g;
                c0840a.f37575c = objArr;
                return c0840a.invokeSuspend(Q5.I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr, InterfaceC2074p interfaceC2074p) {
            this.f37571a = interfaceC3821fArr;
            this.f37572b = interfaceC2074p;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object a9 = r6.k.a(interfaceC3822g, this.f37571a, u.a(), new C0840a(null, this.f37572b), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f37577a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2075q f37578b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f37579a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37580b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37581c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2075q f37582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(U5.d dVar, InterfaceC2075q interfaceC2075q) {
                super(3, dVar);
                this.f37582d = interfaceC2075q;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3822g interfaceC3822g;
                Object e8 = V5.b.e();
                int i8 = this.f37579a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            Q5.t.b(obj);
                            return Q5.I.f8786a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3822g = (InterfaceC3822g) this.f37580b;
                    Q5.t.b(obj);
                } else {
                    Q5.t.b(obj);
                    interfaceC3822g = (InterfaceC3822g) this.f37580b;
                    Object[] objArr = (Object[]) this.f37581c;
                    InterfaceC2075q interfaceC2075q = this.f37582d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f37580b = interfaceC3822g;
                    this.f37579a = 1;
                    AbstractC3290w.c(6);
                    obj = interfaceC2075q.invoke(obj2, obj3, obj4, obj5, this);
                    AbstractC3290w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f37580b = null;
                this.f37579a = 2;
                if (interfaceC3822g.emit(obj, this) == e8) {
                    return e8;
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                a aVar = new a(dVar, this.f37582d);
                aVar.f37580b = interfaceC3822g;
                aVar.f37581c = objArr;
                return aVar.invokeSuspend(Q5.I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr, InterfaceC2075q interfaceC2075q) {
            this.f37577a = interfaceC3821fArr;
            this.f37578b = interfaceC2075q;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object a9 = r6.k.a(interfaceC3822g, this.f37577a, u.a(), new a(null, this.f37578b), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f37585c;

        public c(InterfaceC3821f interfaceC3821f, InterfaceC3821f interfaceC3821f2, InterfaceC2073o interfaceC2073o) {
            this.f37583a = interfaceC3821f;
            this.f37584b = interfaceC3821f2;
            this.f37585c = interfaceC2073o;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object a9 = r6.k.a(interfaceC3822g, new InterfaceC3821f[]{this.f37583a, this.f37584b}, u.a(), new d(this.f37585c, null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f37586a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37587b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f37589d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2073o interfaceC2073o, U5.d dVar) {
            super(3, dVar);
            this.f37589d = interfaceC2073o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3822g interfaceC3822g;
            Object e8 = V5.b.e();
            int i8 = this.f37586a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3822g = (InterfaceC3822g) this.f37587b;
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                interfaceC3822g = (InterfaceC3822g) this.f37587b;
                Object[] objArr = (Object[]) this.f37588c;
                InterfaceC2073o interfaceC2073o = this.f37589d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f37587b = interfaceC3822g;
                this.f37586a = 1;
                obj = interfaceC2073o.invoke(obj2, obj3, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f37587b = null;
            this.f37586a = 2;
            if (interfaceC3822g.emit(obj, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2073o
        public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
            d dVar2 = new d(this.f37589d, dVar);
            dVar2.f37587b = interfaceC3822g;
            dVar2.f37588c = objArr;
            return dVar2.invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37590a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ Function0 a() {
        return f();
    }

    public static final InterfaceC3821f b(InterfaceC3821f interfaceC3821f, InterfaceC3821f interfaceC3821f2, InterfaceC2073o interfaceC2073o) {
        return AbstractC3823h.A(interfaceC3821f, interfaceC3821f2, interfaceC2073o);
    }

    public static final InterfaceC3821f c(InterfaceC3821f interfaceC3821f, InterfaceC3821f interfaceC3821f2, InterfaceC3821f interfaceC3821f3, InterfaceC2074p interfaceC2074p) {
        return new a(new InterfaceC3821f[]{interfaceC3821f, interfaceC3821f2, interfaceC3821f3}, interfaceC2074p);
    }

    public static final InterfaceC3821f d(InterfaceC3821f interfaceC3821f, InterfaceC3821f interfaceC3821f2, InterfaceC3821f interfaceC3821f3, InterfaceC3821f interfaceC3821f4, InterfaceC2075q interfaceC2075q) {
        return new b(new InterfaceC3821f[]{interfaceC3821f, interfaceC3821f2, interfaceC3821f3, interfaceC3821f4}, interfaceC2075q);
    }

    public static final InterfaceC3821f e(InterfaceC3821f interfaceC3821f, InterfaceC3821f interfaceC3821f2, InterfaceC2073o interfaceC2073o) {
        return new c(interfaceC3821f, interfaceC3821f2, interfaceC2073o);
    }

    private static final Function0 f() {
        return e.f37590a;
    }
}
