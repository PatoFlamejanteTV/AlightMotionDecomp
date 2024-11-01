package Z7;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class e extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f14026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, boolean z8, U5.d dVar) {
        super(2, dVar);
        this.f14027b = fVar;
        this.f14028c = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new e(this.f14027b, this.f14028c, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new e(this.f14027b, this.f14028c, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f14026a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Q7.g gVar = this.f14027b.f14033e;
            Boolean a9 = kotlin.coroutines.jvm.internal.b.a(this.f14028c);
            String j8 = this.f14027b.f14029a.j(X7.a.PRIVACY_STRING);
            Q7.f fVar = Q7.f.CCPA;
            this.f14026a = 1;
            if (Q7.g.c(gVar, a9, null, null, null, j8, fVar, this, 14) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
