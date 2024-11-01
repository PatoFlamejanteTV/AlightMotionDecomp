package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* renamed from: r4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3902b0 extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private final List f38321b;

    /* renamed from: c, reason: collision with root package name */
    private final C3900a0 f38322c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38323d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38324e;

    /* renamed from: r4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38325a;

        /* renamed from: r4.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0864a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38326a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0864a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38326a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f38326a.length];
            }
        }

        /* renamed from: r4.b0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38327a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38328b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38329c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38327a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38328b;
                    List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f38329c)));
                    this.f38327a = 1;
                    if (interfaceC3822g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f38328b = interfaceC3822g;
                bVar.f38329c = objArr;
                return bVar.invokeSuspend(Q5.I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38325a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38325a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0864a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: r4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f38330a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38330a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3902b0(G _identifier, List fields, C3900a0 controller) {
        super(_identifier);
        AbstractC3292y.i(_identifier, "_identifier");
        AbstractC3292y.i(fields, "fields");
        AbstractC3292y.i(controller, "controller");
        this.f38321b = fields;
        this.f38322c = controller;
        List list = fields;
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((o0) it.next()).c()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f38323d = z8;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38324e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38323d;
    }

    @Override // r4.k0
    public InterfaceC3813L d() {
        InterfaceC3821f aVar;
        List list = this.f38321b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            aVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
        } else {
            aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        return new A4.e(aVar, new b(arrayList));
    }

    @Override // r4.k0
    public InterfaceC3813L e() {
        List list = this.f38321b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).e());
        }
        return (InterfaceC3813L) AbstractC1435t.y0(arrayList);
    }

    @Override // r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        Iterator it = this.f38321b.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).h(rawValuesMap);
        }
    }

    @Override // r4.k0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3900a0 f() {
        return this.f38322c;
    }
}
