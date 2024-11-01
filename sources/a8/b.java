package a8;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;

/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f14159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f14160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, U5.d dVar) {
        super(2, dVar);
        this.f14160b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new b(this.f14160b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new b(this.f14160b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f14159a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            U7.a aVar = this.f14160b.f14161a;
            this.f14159a = 1;
            obj = aVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
