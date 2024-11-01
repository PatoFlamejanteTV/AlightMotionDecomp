package b;

import Q5.I;
import Q5.t;
import U7.q;
import c6.InterfaceC2072n;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f14858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1957l f14859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1950e(C1957l c1957l, U5.d dVar) {
        super(2, dVar);
        this.f14859b = c1957l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C1950e(this.f14859b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new C1950e(this.f14859b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f14858a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            C1957l c1957l = this.f14859b;
            q qVar = c1957l.f14876d;
            int i9 = c1957l.f14875c.f4497b.f4442G;
            this.f14858a = 1;
            obj = qVar.a(i9, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
