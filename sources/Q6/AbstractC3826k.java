package q6;

import c6.InterfaceC2072n;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3826k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.k$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3821f interfaceC3821f, U5.d dVar) {
            super(2, dVar);
            this.f37426b = interfaceC3821f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f37426b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f37425a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f interfaceC3821f = this.f37426b;
                this.f37425a = 1;
                if (AbstractC3823h.i(interfaceC3821f, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public static final Object a(InterfaceC3821f interfaceC3821f, U5.d dVar) {
        Object collect = interfaceC3821f.collect(r6.r.f38850a, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }

    public static final Object b(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        InterfaceC3821f b9;
        b9 = AbstractC3827l.b(AbstractC3823h.E(interfaceC3821f, interfaceC2072n), 0, null, 2, null);
        Object i8 = AbstractC3823h.i(b9, dVar);
        if (i8 == V5.b.e()) {
            return i8;
        }
        return Q5.I.f8786a;
    }

    public static final Object c(InterfaceC3822g interfaceC3822g, InterfaceC3821f interfaceC3821f, U5.d dVar) {
        AbstractC3823h.u(interfaceC3822g);
        Object collect = interfaceC3821f.collect(interfaceC3822g, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }

    public static final InterfaceC3488x0 d(InterfaceC3821f interfaceC3821f, n6.M m8) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(m8, null, null, new a(interfaceC3821f, null), 3, null);
        return d8;
    }
}
