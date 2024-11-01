package c;

import Q5.I;
import Q5.t;
import Q7.m;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996d extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f15158a;

    public C1996d(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C1996d(dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new C1996d((U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f15158a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f9074a;
            this.f15158a = 1;
            if (mVar.d(this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
