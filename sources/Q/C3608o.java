package q;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3608o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f36596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3606m f36597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3608o(C3606m c3606m, U5.d dVar) {
        super(2, dVar);
        this.f36597b = c3606m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C3608o(this.f36597b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new C3608o(this.f36597b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f36596a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Q7.m mVar = Q7.m.f9074a;
            Q7.f fVar = Q7.f.MSPA;
            int i9 = this.f36597b.f36593d;
            this.f36596a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}