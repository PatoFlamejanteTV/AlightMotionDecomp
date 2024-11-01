package r6;

import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.Z;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2073o f38860a;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3289v implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38861a = new a();

        a() {
            super(3, InterfaceC3822g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3822g interfaceC3822g, Object obj, U5.d dVar) {
            return interfaceC3822g.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f38861a;
        AbstractC3292y.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f38860a = (InterfaceC2073o) Z.d(aVar, 3);
    }

    public static final /* synthetic */ InterfaceC2073o a() {
        return f38860a;
    }
}
