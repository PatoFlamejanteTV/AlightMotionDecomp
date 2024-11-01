package I5;

import Q5.I;
import Q5.t;
import U7.u;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public Object f3787a;

    /* renamed from: b, reason: collision with root package name */
    public int f3788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f3789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f3790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Function1 function1, l lVar, U5.d dVar) {
        super(2, dVar);
        this.f3789c = function1;
        this.f3790d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new k(this.f3789c, this.f3790d, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new k(this.f3789c, this.f3790d, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object e8 = V5.b.e();
        int i8 = this.f3788b;
        if (i8 != 0) {
            if (i8 == 1) {
                function1 = (Function1) this.f3787a;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Function1 function12 = this.f3789c;
            u uVar = this.f3790d.f3795e;
            this.f3787a = function12;
            this.f3788b = 1;
            Object a9 = uVar.a(this);
            if (a9 == e8) {
                return e8;
            }
            function1 = function12;
            obj = a9;
        }
        function1.invoke(obj);
        return I.f8786a;
    }
}
