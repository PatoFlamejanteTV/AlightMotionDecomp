package j4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2073o;
import g3.EnumC2906e;
import h4.InterfaceC2949a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.G;
import w4.C4156a;

/* renamed from: j4.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3161D extends r4.n0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2949a f33761b;

    /* renamed from: c, reason: collision with root package name */
    private final C3160C f33762c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33763d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33764e;

    /* renamed from: f, reason: collision with root package name */
    private final C2.c f33765f;

    /* renamed from: j4.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f33766a;

        /* renamed from: j4.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0776a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f33767a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0776a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f33767a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Q5.r[this.f33767a.length];
            }
        }

        /* renamed from: j4.D$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f33768a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f33769b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f33770c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f33768a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f33769b;
                    List W02 = AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f33770c));
                    this.f33768a = 1;
                    if (interfaceC3822g.emit(W02, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f33769b = interfaceC3822g;
                bVar.f33770c = objArr;
                return bVar.invokeSuspend(Q5.I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr) {
            this.f33766a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f33766a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0776a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: j4.D$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f33771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f33771a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f33771a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.W0(arrayList);
        }
    }

    /* renamed from: j4.D$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Q5.x.a(C3161D.this.i().y().a(), it);
        }
    }

    /* renamed from: j4.D$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Q5.x.a(C3161D.this.i().z().a(), it);
        }
    }

    /* renamed from: j4.D$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Q5.x.a(C3161D.this.i().v().a(), it);
        }
    }

    /* renamed from: j4.D$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f33775a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(EnumC2906e it) {
            AbstractC3292y.i(it, "it");
            return Q5.x.a(r4.G.Companion.f(), new C4156a(it.f(), true));
        }
    }

    /* renamed from: j4.D$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f33776a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(EnumC2906e brand) {
            AbstractC3292y.i(brand, "brand");
            r4.G v8 = r4.G.Companion.v();
            String f8 = brand.f();
            if (brand == EnumC2906e.f32125w) {
                f8 = null;
            }
            return Q5.x.a(v8, new C4156a(f8, true));
        }
    }

    /* renamed from: j4.D$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f33777a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(C4156a it) {
            C4156a c8;
            AbstractC3292y.i(it, "it");
            r4.G h8 = r4.G.Companion.h();
            c8 = AbstractC3162E.c(it);
            return Q5.x.a(h8, c8);
        }
    }

    /* renamed from: j4.D$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f33778a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q5.r invoke(C4156a it) {
            C4156a d8;
            AbstractC3292y.i(it, "it");
            r4.G i8 = r4.G.Companion.i();
            d8 = AbstractC3162E.d(it);
            return Q5.x.a(i8, d8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3161D(r4.G r13, p2.InterfaceC3560b.a r14, java.util.Map r15, boolean r16, h4.InterfaceC2949a r17, j4.C3160C r18, int r19, kotlin.jvm.internal.AbstractC3284p r20) {
        /*
            r12 = this;
            r0 = r19 & 8
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r16
        L8:
            r1 = r19 & 16
            if (r1 == 0) goto L10
            h4.a$c r1 = h4.InterfaceC2949a.c.f32646a
            r10 = r1
            goto L12
        L10:
            r10 = r17
        L12:
            r1 = r19 & 32
            if (r1 == 0) goto L27
            j4.C r11 = new j4.C
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r11
            r2 = r14
            r3 = r15
            r4 = r0
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r11
            goto L29
        L27:
            r7 = r18
        L29:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C3161D.<init>(r4.G, p2.b$a, java.util.Map, boolean, h4.a, j4.C, int, kotlin.jvm.internal.p):void");
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f33765f;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f33764e;
    }

    @Override // r4.k0
    public InterfaceC3813L d() {
        InterfaceC3821f aVar;
        List c8 = AbstractC1435t.c();
        if (this.f33762c.y() != null) {
            c8.add(A4.g.m(this.f33762c.y().i().l(), new c()));
        }
        c8.add(A4.g.m(this.f33762c.z().i().l(), new d()));
        c8.add(A4.g.m(this.f33762c.v().i().l(), new e()));
        c8.add(A4.g.m(this.f33762c.z().i().v(), f.f33775a));
        if (this.f33761b instanceof InterfaceC2949a.b) {
            c8.add(A4.g.m(this.f33762c.z().i().x(), g.f33776a));
        }
        c8.add(A4.g.m(this.f33762c.w().i().l(), h.f33777a));
        c8.add(A4.g.m(this.f33762c.w().i().l(), i.f33778a));
        List a9 = AbstractC1435t.a(c8);
        if (a9.isEmpty()) {
            aVar = A4.g.n(AbstractC1435t.W0(AbstractC1435t.m()));
        } else {
            aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(a9).toArray(new InterfaceC3821f[0]));
        }
        return new A4.e(aVar, new b(a9));
    }

    @Override // r4.k0
    public InterfaceC3813L e() {
        r4.G g8;
        r4.q0 y8 = this.f33762c.y();
        r4.G g9 = null;
        if (y8 != null) {
            g8 = y8.a();
        } else {
            g8 = null;
        }
        r4.G a9 = this.f33762c.z().a();
        r4.G a10 = this.f33762c.w().a();
        r4.G a11 = this.f33762c.v().a();
        G.b bVar = r4.G.Companion;
        r4.G f8 = bVar.f();
        r4.G v8 = bVar.v();
        if (this.f33761b instanceof InterfaceC2949a.b) {
            g9 = v8;
        }
        return A4.g.n(AbstractC1435t.r(g8, a9, a10, a11, f8, g9));
    }

    @Override // r4.k0
    public r4.m0 f() {
        return this.f33762c;
    }

    @Override // r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
    }

    public final C3160C i() {
        return this.f33762c;
    }

    public final boolean j() {
        return this.f33763d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3161D(r4.G identifier, InterfaceC3560b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2949a cbcEligibility, C3160C controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(initialValues, "initialValues");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        AbstractC3292y.i(controller, "controller");
        this.f33761b = cbcEligibility;
        this.f33762c = controller;
        this.f33763d = controller.z().i().w();
        this.f33764e = true;
    }
}
