package r6;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3488x0;
import s6.C3976B;

/* loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f38862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(2);
            this.f38862a = tVar;
        }

        public final Integer a(int i8, g.b bVar) {
            int i9;
            g.c key = bVar.getKey();
            g.b bVar2 = this.f38862a.f38855b.get(key);
            if (key != InterfaceC3488x0.f35757n0) {
                if (bVar != bVar2) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i9 = i8 + 1;
                }
                return Integer.valueOf(i9);
            }
            InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) bVar2;
            AbstractC3292y.g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC3488x0 b9 = v.b((InterfaceC3488x0) bVar, interfaceC3488x0);
            if (b9 == interfaceC3488x0) {
                if (interfaceC3488x0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b9 + ", expected child of " + interfaceC3488x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(t tVar, U5.g gVar) {
        if (((Number) gVar.fold(0, new a(tVar))).intValue() == tVar.f38856c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f38855b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC3488x0 b(InterfaceC3488x0 interfaceC3488x0, InterfaceC3488x0 interfaceC3488x02) {
        while (interfaceC3488x0 != null) {
            if (interfaceC3488x0 == interfaceC3488x02) {
                return interfaceC3488x0;
            }
            if (!(interfaceC3488x0 instanceof C3976B)) {
                return interfaceC3488x0;
            }
            interfaceC3488x0 = interfaceC3488x0.getParent();
        }
        return null;
    }
}
