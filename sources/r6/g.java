package r6;

import Q5.I;
import U5.e;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.H;
import p6.EnumC3588a;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public abstract class g extends e {

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3821f f38803d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38804a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38805b;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(dVar);
            aVar.f38805b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f38804a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38805b;
                g gVar = g.this;
                this.f38804a = 1;
                if (gVar.q(interfaceC3822g, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            return ((a) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public g(InterfaceC3821f interfaceC3821f, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(gVar, i8, enumC3588a);
        this.f38803d = interfaceC3821f;
    }

    static /* synthetic */ Object n(g gVar, InterfaceC3822g interfaceC3822g, U5.d dVar) {
        if (gVar.f38794b == -3) {
            U5.g context = dVar.getContext();
            U5.g d8 = H.d(context, gVar.f38793a);
            if (AbstractC3292y.d(d8, context)) {
                Object q8 = gVar.q(interfaceC3822g, dVar);
                if (q8 == V5.b.e()) {
                    return q8;
                }
                return I.f8786a;
            }
            e.b bVar = U5.e.f10146a0;
            if (AbstractC3292y.d(d8.get(bVar), context.get(bVar))) {
                Object p8 = gVar.p(interfaceC3822g, d8, dVar);
                if (p8 == V5.b.e()) {
                    return p8;
                }
                return I.f8786a;
            }
        }
        Object collect = super.collect(interfaceC3822g, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    static /* synthetic */ Object o(g gVar, p6.s sVar, U5.d dVar) {
        Object q8 = gVar.q(new w(sVar), dVar);
        if (q8 == V5.b.e()) {
            return q8;
        }
        return I.f8786a;
    }

    private final Object p(InterfaceC3822g interfaceC3822g, U5.g gVar, U5.d dVar) {
        Object c8 = f.c(gVar, f.a(interfaceC3822g, dVar.getContext()), null, new a(null), dVar, 4, null);
        if (c8 == V5.b.e()) {
            return c8;
        }
        return I.f8786a;
    }

    @Override // r6.e, q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        return n(this, interfaceC3822g, dVar);
    }

    @Override // r6.e
    protected Object h(p6.s sVar, U5.d dVar) {
        return o(this, sVar, dVar);
    }

    protected abstract Object q(InterfaceC3822g interfaceC3822g, U5.d dVar);

    @Override // r6.e
    public String toString() {
        return this.f38803d + " -> " + super.toString();
    }
}
