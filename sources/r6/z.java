package r6;

import Q5.I;
import c6.InterfaceC2072n;
import q6.InterfaceC3822g;
import s6.J;

/* loaded from: classes5.dex */
final class z implements InterfaceC3822g {

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f38866a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38867b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2072n f38868c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38869a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f38871c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            super(2, dVar);
            this.f38871c = interfaceC3822g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f38871c, dVar);
            aVar.f38870b = obj;
            return aVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(Object obj, U5.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f38869a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Object obj2 = this.f38870b;
                InterfaceC3822g interfaceC3822g = this.f38871c;
                this.f38869a = 1;
                if (interfaceC3822g.emit(obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    public z(InterfaceC3822g interfaceC3822g, U5.g gVar) {
        this.f38866a = gVar;
        this.f38867b = J.b(gVar);
        this.f38868c = new a(interfaceC3822g, null);
    }

    @Override // q6.InterfaceC3822g
    public Object emit(Object obj, U5.d dVar) {
        Object b9 = f.b(this.f38866a, obj, this.f38867b, this.f38868c, dVar);
        if (b9 == V5.b.e()) {
            return b9;
        }
        return I.f8786a;
    }
}
