package V5;

import Q5.t;
import U5.g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c {

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f10660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f10661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U5.d dVar, InterfaceC2072n interfaceC2072n, Object obj) {
            super(dVar);
            this.f10661b = interfaceC2072n;
            this.f10662c = obj;
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f10660a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f10660a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10660a = 1;
            t.b(obj);
            AbstractC3292y.g(this.f10661b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC2072n) Z.d(this.f10661b, 2)).invoke(this.f10662c, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f10663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f10664b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(U5.d dVar, g gVar, InterfaceC2072n interfaceC2072n, Object obj) {
            super(dVar, gVar);
            this.f10664b = interfaceC2072n;
            this.f10665c = obj;
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f10663a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f10663a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10663a = 1;
            t.b(obj);
            AbstractC3292y.g(this.f10664b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC2072n) Z.d(this.f10664b, 2)).invoke(this.f10665c, this);
        }
    }

    /* renamed from: V5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0226c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0226c(U5.d dVar) {
            super(dVar);
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            t.b(obj);
            return obj;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(U5.d dVar, g gVar) {
            super(dVar, gVar);
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            t.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static U5.d a(InterfaceC2072n interfaceC2072n, Object obj, U5.d completion) {
        AbstractC3292y.i(interfaceC2072n, "<this>");
        AbstractC3292y.i(completion, "completion");
        U5.d a9 = h.a(completion);
        if (interfaceC2072n instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) interfaceC2072n).create(obj, a9);
        }
        g context = a9.getContext();
        if (context == U5.h.f10149a) {
            return new a(a9, interfaceC2072n, obj);
        }
        return new b(a9, context, interfaceC2072n, obj);
    }

    private static final U5.d b(U5.d dVar) {
        g context = dVar.getContext();
        if (context == U5.h.f10149a) {
            return new C0226c(dVar);
        }
        return new d(dVar, context);
    }

    public static U5.d c(U5.d dVar) {
        kotlin.coroutines.jvm.internal.d dVar2;
        U5.d intercepted;
        AbstractC3292y.i(dVar, "<this>");
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            dVar2 = (kotlin.coroutines.jvm.internal.d) dVar;
        } else {
            dVar2 = null;
        }
        if (dVar2 != null && (intercepted = dVar2.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static Object d(InterfaceC2073o interfaceC2073o, Object obj, Object obj2, U5.d completion) {
        AbstractC3292y.i(interfaceC2073o, "<this>");
        AbstractC3292y.i(completion, "completion");
        return ((InterfaceC2073o) Z.d(interfaceC2073o, 3)).invoke(obj, obj2, b(h.a(completion)));
    }
}
