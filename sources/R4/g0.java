package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class g0 implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38415c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Integer f38416a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f38417b;

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38418a;

        /* renamed from: r4.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0866a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38419a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0866a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38419a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f38419a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38420a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38421b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38422c;

            public b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C c8;
                Object e8 = V5.b.e();
                int i8 = this.f38420a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38421b;
                    Iterator it = AbstractC1428l.V0((Object[]) this.f38422c).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c8 = (C) it.next();
                            if (c8 != null) {
                                break;
                            }
                        } else {
                            c8 = null;
                            break;
                        }
                    }
                    this.f38420a = 1;
                    if (interfaceC3822g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar);
                bVar.f38421b = interfaceC3822g;
                bVar.f38422c = objArr;
                return bVar.invokeSuspend(Q5.I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38418a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38418a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0866a(interfaceC3821fArr), new b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f38423a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38423a;
            ArrayList<C> arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            for (C c8 : arrayList) {
                if (c8 != null) {
                    return c8;
                }
            }
            return null;
        }
    }

    public g0(Integer num, List sectionFieldErrorControllers) {
        InterfaceC3821f aVar;
        C c8;
        AbstractC3292y.i(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.f38416a = num;
        List list = sectionFieldErrorControllers;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).getError());
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = AbstractC1435t.m().iterator();
            while (true) {
                if (it2.hasNext()) {
                    c8 = (C) it2.next();
                    if (c8 != null) {
                        break;
                    }
                } else {
                    c8 = null;
                    break;
                }
            }
            aVar = A4.g.n(c8);
        } else {
            aVar = new a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        this.f38417b = new A4.e(aVar, new b(arrayList));
    }

    public final InterfaceC3813L getError() {
        return this.f38417b;
    }

    public final Integer v() {
        return this.f38416a;
    }
}
