package q6;

import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f37511a = s6.G.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f37512a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37513b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2072n interfaceC2072n, U5.d dVar) {
            super(3, dVar);
            this.f37515d = interfaceC2072n;
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3822g interfaceC3822g, Object obj, U5.d dVar) {
            a aVar = new a(this.f37515d, dVar);
            aVar.f37513b = interfaceC3822g;
            aVar.f37514c = obj;
            return aVar.invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3822g interfaceC3822g;
            Object e8 = V5.b.e();
            int i8 = this.f37512a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3822g = (InterfaceC3822g) this.f37513b;
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                interfaceC3822g = (InterfaceC3822g) this.f37513b;
                Object obj2 = this.f37514c;
                InterfaceC2072n interfaceC2072n = this.f37515d;
                this.f37513b = interfaceC3822g;
                this.f37512a = 1;
                obj = interfaceC2072n.invoke(obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f37513b = null;
            this.f37512a = 2;
            if (interfaceC3822g.emit(obj, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }
    }

    public static final InterfaceC3821f a(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
        return AbstractC3823h.M(interfaceC3821f, new a(interfaceC2072n, null));
    }

    public static final InterfaceC3821f b(InterfaceC3821f interfaceC3821f, InterfaceC2073o interfaceC2073o) {
        return new r6.i(interfaceC2073o, interfaceC3821f, null, 0, null, 28, null);
    }
}
