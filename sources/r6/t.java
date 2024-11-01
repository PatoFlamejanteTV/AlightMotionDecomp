package r6;

import Q5.I;
import U5.g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.B0;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public final class t extends kotlin.coroutines.jvm.internal.d implements InterfaceC3822g, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3822g f38854a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.g f38855b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38856c;

    /* renamed from: d, reason: collision with root package name */
    private U5.g f38857d;

    /* renamed from: e, reason: collision with root package name */
    private U5.d f38858e;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38859a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public t(InterfaceC3822g interfaceC3822g, U5.g gVar) {
        super(q.f38848a, U5.h.f10149a);
        this.f38854a = interfaceC3822g;
        this.f38855b = gVar;
        this.f38856c = ((Number) gVar.fold(0, a.f38859a)).intValue();
    }

    private final void i(U5.g gVar, U5.g gVar2, Object obj) {
        if (gVar2 instanceof l) {
            k((l) gVar2, obj);
        }
        v.a(this, gVar);
    }

    private final Object j(U5.d dVar, Object obj) {
        U5.g context = dVar.getContext();
        B0.j(context);
        U5.g gVar = this.f38857d;
        if (gVar != context) {
            i(context, gVar, obj);
            this.f38857d = context;
        }
        this.f38858e = dVar;
        InterfaceC2073o a9 = u.a();
        InterfaceC3822g interfaceC3822g = this.f38854a;
        AbstractC3292y.g(interfaceC3822g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC3292y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a9.invoke(interfaceC3822g, obj, this);
        if (!AbstractC3292y.d(invoke, V5.b.e())) {
            this.f38858e = null;
        }
        return invoke;
    }

    private final void k(l lVar, Object obj) {
        throw new IllegalStateException(l6.n.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f38846a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // q6.InterfaceC3822g
    public Object emit(Object obj, U5.d dVar) {
        try {
            Object j8 = j(dVar, obj);
            if (j8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (j8 == V5.b.e()) {
                return j8;
            }
            return I.f8786a;
        } catch (Throwable th) {
            this.f38857d = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        U5.d dVar = this.f38858e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, U5.d
    public U5.g getContext() {
        U5.g gVar = this.f38857d;
        if (gVar == null) {
            return U5.h.f10149a;
        }
        return gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable e8 = Q5.s.e(obj);
        if (e8 != null) {
            this.f38857d = new l(e8, getContext());
        }
        U5.d dVar = this.f38858e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return V5.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
