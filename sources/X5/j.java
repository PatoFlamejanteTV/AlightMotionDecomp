package x5;

import Q5.I;
import Q5.t;
import Q7.m;
import c6.InterfaceC2072n;

/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f41120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f41121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, U5.d dVar) {
        super(2, dVar);
        this.f41121b = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new j(this.f41121b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new j(this.f41121b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f41120a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f9074a;
            Q7.f fVar = Q7.f.GDPR;
            int i9 = this.f41121b.f41133l;
            this.f41120a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
