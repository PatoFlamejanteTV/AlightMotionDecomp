package w3;

import Q5.I;
import Q5.t;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import c3.C2028h;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import j4.C3158A;
import j4.C3201q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.D;
import r4.G;
import r4.h0;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f40711a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f40712b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f40713c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f40714d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f40715e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f40716f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f40717g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40718a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3158A invoke(List elementsList) {
            AbstractC3292y.i(elementsList, "elementsList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementsList) {
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
            return (C3158A) AbstractC1435t.o0(arrayList3);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40719a = new b();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f40720a;

            /* renamed from: w3.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0916a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f40721a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0916a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f40721a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40721a.length];
                }
            }

            /* renamed from: w3.i$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0917b extends l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f40722a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40723b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40724c;

                public C0917b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f40722a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f40723b;
                        Map u8 = Q.u(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f40724c))));
                        this.f40722a = 1;
                        if (interfaceC3822g.emit(u8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    C0917b c0917b = new C0917b(dVar);
                    c0917b.f40723b = interfaceC3822g;
                    c0917b.f40724c = objArr;
                    return c0917b.invokeSuspend(I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f40720a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f40720a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0916a(interfaceC3821fArr), new C0917b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return I.f8786a;
            }
        }

        /* renamed from: w3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0918b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40725a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0918b(List list) {
                super(0);
                this.f40725a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40725a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return Q.u(AbstractC1435t.z(AbstractC1435t.W0(arrayList)));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List elementsList) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(Q.u(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m()))));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new C0918b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40726a = new c();

        c() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3292y.i(elementsList, "elementsList");
            AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f40727a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3292y.i(map, "map");
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((C4156a) it.next()).d()) {
                        return null;
                    }
                }
                return map;
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40728a = new e();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f40729a;

            /* renamed from: w3.i$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0919a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f40730a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0919a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f40730a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40730a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f40731a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40732b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40733c;

                public b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f40731a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f40732b;
                        Map u8 = Q.u(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f40733c))));
                        this.f40731a = 1;
                        if (interfaceC3822g.emit(u8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f40732b = interfaceC3822g;
                    bVar.f40733c = objArr;
                    return bVar.invokeSuspend(I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f40729a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f40729a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0919a(interfaceC3821fArr), new b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40734a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f40734a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40734a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return Q.u(AbstractC1435t.z(AbstractC1435t.W0(arrayList)));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List elementsList) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(Q.u(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m()))));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f40735a = new f();

        f() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3292y.i(elementsList, "elementsList");
            AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f40736a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3292y.i(map, "map");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((C4156a) entry.getValue()).d()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40737a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(C3158A c3158a) {
            InterfaceC3813L w8;
            if (c3158a == null || (w8 = c3158a.w()) == null) {
                return A4.g.n(a0.f());
            }
            return w8;
        }
    }

    /* renamed from: w3.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0920i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0920i f40738a = new C0920i();

        C0920i() {
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
    static final class j extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f40739a = new j();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f40740a;

            /* renamed from: w3.i$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0921a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f40741a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0921a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f40741a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40741a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f40742a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40743b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40744c;

                public b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f40742a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f40743b;
                        List z8 = AbstractC1435t.z(AbstractC1435t.W0(AbstractC1428l.V0((Object[]) this.f40744c)));
                        this.f40742a = 1;
                        if (interfaceC3822g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f40743b = interfaceC3822g;
                    bVar.f40744c = objArr;
                    return bVar.invokeSuspend(I.f8786a);
                }
            }

            public a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f40740a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f40740a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0921a(interfaceC3821fArr), new b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40745a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f40745a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40745a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return AbstractC1435t.z(AbstractC1435t.W0(arrayList));
            }
        }

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List elementsList) {
            InterfaceC3821f aVar;
            AbstractC3292y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = A4.g.n(AbstractC1435t.z(AbstractC1435t.W0(AbstractC1435t.m())));
            } else {
                aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(aVar, new b(arrayList));
        }
    }

    public i(C3201q0 formSpec, C2028h transformSpecToElement) {
        AbstractC3292y.i(formSpec, "formSpec");
        AbstractC3292y.i(transformSpecToElement, "transformSpecToElement");
        InterfaceC3813L n8 = A4.g.n(C2028h.b(transformSpecToElement, formSpec.a(), null, 2, null));
        this.f40711a = n8;
        InterfaceC3813L m8 = A4.g.m(n8, a.f40718a);
        this.f40712b = m8;
        InterfaceC3813L l8 = A4.g.l(m8, h.f40737a);
        this.f40713c = l8;
        this.f40714d = A4.g.m(A4.g.d(A4.g.l(n8, b.f40719a), l8, c.f40726a), d.f40727a);
        this.f40715e = A4.g.m(A4.g.d(A4.g.l(n8, e.f40728a), l8, f.f40735a), g.f40736a);
        InterfaceC3813L l9 = A4.g.l(n8, j.f40739a);
        this.f40716f = l9;
        this.f40717g = A4.g.d(l8, l9, C0920i.f40738a);
    }

    public final InterfaceC3813L a() {
        return this.f40714d;
    }

    public final InterfaceC3813L b() {
        return this.f40711a;
    }

    public final InterfaceC3813L c() {
        return this.f40715e;
    }

    public final InterfaceC3813L d() {
        return this.f40713c;
    }

    public final InterfaceC3813L e() {
        return this.f40717g;
    }
}
