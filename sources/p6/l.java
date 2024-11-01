package p6;

import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import n6.AbstractC3458i;
import n6.M;
import p6.h;

/* loaded from: classes5.dex */
abstract /* synthetic */ class l {

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f36423a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f36425c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f36426d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar, Object obj, U5.d dVar) {
            super(2, dVar);
            this.f36425c = vVar;
            this.f36426d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f36425c, this.f36426d, dVar);
            aVar.f36424b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f36423a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    v vVar = this.f36425c;
                    Object obj2 = this.f36426d;
                    s.a aVar = Q5.s.f8810b;
                    this.f36423a = 1;
                    if (vVar.l(obj2, this) == e8) {
                        return e8;
                    }
                }
                b9 = Q5.s.b(I.f8786a);
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            if (Q5.s.h(b9)) {
                a9 = h.f36417b.c(I.f8786a);
            } else {
                a9 = h.f36417b.a(Q5.s.e(b9));
            }
            return h.b(a9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public static final Object a(v vVar, Object obj) {
        Object x8 = vVar.x(obj);
        if (!(x8 instanceof h.c)) {
            return h.f36417b.c(I.f8786a);
        }
        return ((h) AbstractC3458i.f(null, new a(vVar, obj, null), 1, null)).k();
    }
}
