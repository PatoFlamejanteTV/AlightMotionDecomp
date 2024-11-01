package B3;

import Q5.I;
import Q5.t;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.a0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.w;
import j4.C3158A;
import j6.InterfaceC3214c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.w;
import r4.D;
import r4.G;
import r4.h0;
import r6.k;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final List f568a;

    /* renamed from: b, reason: collision with root package name */
    private final F3.a f569b;

    /* renamed from: c, reason: collision with root package name */
    private final C3158A f570c;

    /* renamed from: d, reason: collision with root package name */
    private w f571d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f572e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3821f f573f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3821f f574g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f575h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3813L f576i;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f577a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f577a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                B3.f fVar = B3.f.f605a;
                List d8 = d.this.d();
                this.f577a = 1;
                if (fVar.b(d8, this) == e8) {
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

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final List f579a;

        /* renamed from: b, reason: collision with root package name */
        private final F3.a f580b;

        public b(List formElements, F3.a formArguments) {
            AbstractC3292y.i(formElements, "formElements");
            AbstractC3292y.i(formArguments, "formArguments");
            this.f579a = formElements;
            this.f580b = formArguments;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return new d(this.f579a, this.f580b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f581a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f582a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f582a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f582a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f583a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f584b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f585c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f583a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f584b;
                    List z8 = AbstractC1435t.z(AbstractC1428l.V0((List[]) ((Object[]) this.f585c)));
                    this.f583a = 1;
                    if (interfaceC3822g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f584b = interfaceC3822g;
                bVar.f585c = objArr;
                return bVar.invokeSuspend(I.f8786a);
            }
        }

        public c(InterfaceC3821f[] interfaceC3821fArr) {
            this.f581a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f581a;
            Object a9 = k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
    }

    /* renamed from: B3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0010d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0010d f586a = new C0010d();

        C0010d() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(Set cardBillingIdentifiers, Set externalHiddenIdentifiers) {
            AbstractC3292y.i(cardBillingIdentifiers, "cardBillingIdentifiers");
            AbstractC3292y.i(externalHiddenIdentifiers, "externalHiddenIdentifiers");
            return a0.m(externalHiddenIdentifiers, cardBillingIdentifiers);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f587a = new e();

        e() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(Set hiddenIds, List textFieldControllerIds) {
            Object obj;
            AbstractC3292y.i(hiddenIds, "hiddenIds");
            AbstractC3292y.i(textFieldControllerIds, "textFieldControllerIds");
            ListIterator listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (!hiddenIds.contains((G) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (G) obj;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f588a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f589a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f589a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f589a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f590a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f591b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f592c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f590a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f591b;
                    List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f592c)));
                    this.f590a = 1;
                    if (interfaceC3822g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f591b = interfaceC3822g;
                bVar.f592c = objArr;
                return bVar.invokeSuspend(I.f8786a);
            }
        }

        public f(InterfaceC3821f[] interfaceC3821fArr) {
            this.f588a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f588a;
            Object a9 = k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(0);
            this.f593a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f593a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f594a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f595a;

            /* renamed from: B3.d$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0011a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f596a;

                /* renamed from: b, reason: collision with root package name */
                int f597b;

                public C0011a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f596a = obj;
                    this.f597b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g) {
                this.f595a = interfaceC3822g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, U5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof B3.d.h.a.C0011a
                    if (r0 == 0) goto L13
                    r0 = r9
                    B3.d$h$a$a r0 = (B3.d.h.a.C0011a) r0
                    int r1 = r0.f597b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f597b = r1
                    goto L18
                L13:
                    B3.d$h$a$a r0 = new B3.d$h$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f596a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f597b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    Q5.t.b(r9)
                    goto Ld1
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    Q5.t.b(r9)
                    q6.g r9 = r7.f595a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L44:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L65
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    Q5.r r5 = (Q5.r) r5
                    java.lang.Object r5 = r5.c()
                    r4.G$b r6 = r4.G.Companion
                    r4.G r6 = r6.x()
                    boolean r5 = kotlin.jvm.internal.AbstractC3292y.d(r5, r6)
                    if (r5 == 0) goto L44
                    r2.add(r4)
                    goto L44
                L65:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r4 = 10
                    int r5 = R5.AbstractC1435t.x(r2, r4)
                    r8.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L74:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L96
                    java.lang.Object r5 = r2.next()
                    Q5.r r5 = (Q5.r) r5
                    java.lang.Object r5 = r5.d()
                    w4.a r5 = (w4.C4156a) r5
                    java.lang.String r5 = r5.c()
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r8.add(r5)
                    goto L74
                L96:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r4 = R5.AbstractC1435t.x(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                La3:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto Lbe
                    java.lang.Object r4 = r8.next()
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto Lb8
                    D3.f$a r4 = D3.f.a.f1246b
                    goto Lba
                Lb8:
                    D3.f$a r4 = D3.f.a.f1247c
                Lba:
                    r2.add(r4)
                    goto La3
                Lbe:
                    java.lang.Object r8 = R5.AbstractC1435t.o0(r2)
                    D3.f$a r8 = (D3.f.a) r8
                    if (r8 != 0) goto Lc8
                    D3.f$a r8 = D3.f.a.f1248d
                Lc8:
                    r0.f597b = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto Ld1
                    return r1
                Ld1:
                    Q5.I r8 = Q5.I.f8786a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: B3.d.h.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public h(InterfaceC3821f interfaceC3821f) {
            this.f594a = interfaceC3821f;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f594a.collect(new a(interfaceC3822g), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f599a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f600a;

            /* renamed from: B3.d$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0012a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f601a;

                /* renamed from: b, reason: collision with root package name */
                int f602b;

                public C0012a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f601a = obj;
                    this.f602b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g) {
                this.f600a = interfaceC3822g;
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
                    boolean r0 = r6 instanceof B3.d.i.a.C0012a
                    if (r0 == 0) goto L13
                    r0 = r6
                    B3.d$i$a$a r0 = (B3.d.i.a.C0012a) r0
                    int r1 = r0.f602b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f602b = r1
                    goto L18
                L13:
                    B3.d$i$a$a r0 = new B3.d$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f601a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f602b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    q6.g r6 = r4.f600a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Map r5 = R5.Q.u(r5)
                    r0.f602b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: B3.d.i.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3821f interfaceC3821f) {
            this.f599a = interfaceC3821f;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f599a.collect(new a(interfaceC3822g), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return I.f8786a;
        }
    }

    public d(List elements, F3.a formArguments) {
        InterfaceC3821f fVar;
        InterfaceC3813L w8;
        AbstractC3292y.i(elements, "elements");
        AbstractC3292y.i(formArguments, "formArguments");
        this.f568a = elements;
        this.f569b = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof h0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1435t.C(arrayList2, ((h0) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C3158A) {
                arrayList3.add(obj2);
            }
        }
        C3158A c3158a = (C3158A) AbstractC1435t.o0(arrayList3);
        this.f570c = c3158a;
        this.f571d = AbstractC3815N.a(a0.f());
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        InterfaceC3813L d8 = A4.g.d((c3158a == null || (w8 = c3158a.w()) == null) ? A4.g.n(a0.f()) : w8, this.f571d, C0010d.f586a);
        this.f572e = d8;
        h hVar = new h(a());
        this.f573f = hVar;
        this.f574g = new B3.a(new i(a()), d8, hVar, c()).d();
        List list = this.f568a;
        ArrayList arrayList4 = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((D) it2.next()).e());
        }
        if (arrayList4.isEmpty()) {
            fVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
        } else {
            fVar = new f((InterfaceC3821f[]) AbstractC1435t.W0(arrayList4).toArray(new InterfaceC3821f[0]));
        }
        A4.e eVar = new A4.e(fVar, new g(arrayList4));
        this.f575h = eVar;
        this.f576i = A4.g.d(this.f572e, eVar, e.f587a);
    }

    private final InterfaceC3821f a() {
        if (this.f568a.isEmpty()) {
            return AbstractC3823h.B(AbstractC1435t.m());
        }
        List list = this.f568a;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((D) it.next()).d());
        }
        return new c((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
    }

    public final InterfaceC3821f b() {
        return this.f574g;
    }

    public final Map c() {
        w.c b9;
        String b10;
        String i8;
        String l8;
        String a9;
        String h8;
        String f8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f569b.c().b() && (b9 = this.f569b.b()) != null) {
            String f9 = b9.f();
            if (f9 != null) {
                linkedHashMap.put(G.Companion.r(), f9);
            }
            String b11 = b9.b();
            if (b11 != null) {
                linkedHashMap.put(G.Companion.n(), b11);
            }
            String h9 = b9.h();
            if (h9 != null) {
                linkedHashMap.put(G.Companion.t(), h9);
            }
            w.a a10 = b9.a();
            if (a10 != null && (f8 = a10.f()) != null) {
                linkedHashMap.put(G.Companion.p(), f8);
            }
            w.a a11 = b9.a();
            if (a11 != null && (h8 = a11.h()) != null) {
                linkedHashMap.put(G.Companion.q(), h8);
            }
            w.a a12 = b9.a();
            if (a12 != null && (a9 = a12.a()) != null) {
                linkedHashMap.put(G.Companion.k(), a9);
            }
            w.a a13 = b9.a();
            if (a13 != null && (l8 = a13.l()) != null) {
                linkedHashMap.put(G.Companion.z(), l8);
            }
            w.a a14 = b9.a();
            if (a14 != null && (i8 = a14.i()) != null) {
                linkedHashMap.put(G.Companion.u(), i8);
            }
            w.a a15 = b9.a();
            if (a15 != null && (b10 = a15.b()) != null) {
                linkedHashMap.put(G.Companion.l(), b10);
            }
        }
        return linkedHashMap;
    }

    public final List d() {
        return this.f568a;
    }

    public final InterfaceC3813L e() {
        return this.f572e;
    }

    public final InterfaceC3813L f() {
        return this.f576i;
    }
}
