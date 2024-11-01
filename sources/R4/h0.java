package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class h0 implements D {

    /* renamed from: f, reason: collision with root package name */
    public static final a f38430f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f38431g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f38432a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38433b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f38434c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38435d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38436e;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ h0 c(a aVar, k0 k0Var, Integer num, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                num = null;
            }
            return aVar.b(k0Var, num);
        }

        public final h0 a(List sectionFieldElements, Integer num) {
            AbstractC3292y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f());
            }
            return new h0(G.Companion.a(((k0) AbstractC1435t.m0(sectionFieldElements)).a().j0() + "_section"), sectionFieldElements, new g0(num, arrayList));
        }

        public final h0 b(k0 sectionFieldElement, Integer num) {
            AbstractC3292y.i(sectionFieldElement, "sectionFieldElement");
            return a(AbstractC1435t.e(sectionFieldElement), num);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38437a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38438a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38438a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f38438a.length];
            }
        }

        /* renamed from: r4.h0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0867b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38439a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38440b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38441c;

            public C0867b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38439a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38440b;
                    List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38441c)));
                    this.f38439a = 1;
                    if (interfaceC3822g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0867b c0867b = new C0867b(dVar);
                c0867b.f38440b = interfaceC3822g;
                c0867b.f38441c = objArr;
                return c0867b.invokeSuspend(Q5.I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38437a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38437a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new C0867b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f38442a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38442a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38443a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38444a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38444a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f38444a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38445a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38446b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38447c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38445a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38446b;
                    List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38447c)));
                    this.f38445a = 1;
                    if (interfaceC3822g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f38446b = interfaceC3822g;
                bVar.f38447c = objArr;
                return bVar.invokeSuspend(Q5.I.f8786a);
            }
        }

        public d(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38443a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38443a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f38448a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38448a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
        }
    }

    public h0(G identifier, List fields, g0 controller) {
        C2.c cVar;
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(fields, "fields");
        AbstractC3292y.i(controller, "controller");
        this.f38432a = identifier;
        this.f38433b = fields;
        this.f38434c = controller;
        List list = fields;
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k0) it.next()).c()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f38435d = z8;
        Iterator it2 = this.f38433b.iterator();
        while (true) {
            if (it2.hasNext()) {
                cVar = ((k0) it2.next()).b();
                if (cVar != null) {
                    break;
                }
            } else {
                cVar = null;
                break;
            }
        }
        this.f38436e = cVar;
    }

    @Override // r4.D
    public G a() {
        return this.f38432a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f38436e;
    }

    @Override // r4.D
    public boolean c() {
        return this.f38435d;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        InterfaceC3821f bVar;
        List list = this.f38433b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            bVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
        } else {
            bVar = new b((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        return new A4.e(bVar, new c(arrayList));
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        InterfaceC3821f dVar;
        List list = this.f38433b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).e());
        }
        if (arrayList.isEmpty()) {
            dVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
        } else {
            dVar = new d((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        return new A4.e(dVar, new e(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (AbstractC3292y.d(this.f38432a, h0Var.f38432a) && AbstractC3292y.d(this.f38433b, h0Var.f38433b) && AbstractC3292y.d(this.f38434c, h0Var.f38434c)) {
            return true;
        }
        return false;
    }

    public g0 f() {
        return this.f38434c;
    }

    public final List g() {
        return this.f38433b;
    }

    public int hashCode() {
        return (((this.f38432a.hashCode() * 31) + this.f38433b.hashCode()) * 31) + this.f38434c.hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + this.f38432a + ", fields=" + this.f38433b + ", controller=" + this.f38434c + ")";
    }
}
