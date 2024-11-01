package Q5;

import Q5.s;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Q5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1409d extends AbstractC1408c implements U5.d {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2073o f8791a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8792b;

    /* renamed from: c, reason: collision with root package name */
    private U5.d f8793c;

    /* renamed from: d, reason: collision with root package name */
    private Object f8794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409d(InterfaceC2073o block, Object obj) {
        super(null);
        Object obj2;
        AbstractC3292y.i(block, "block");
        this.f8791a = block;
        this.f8792b = obj;
        AbstractC3292y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8793c = this;
        obj2 = AbstractC1407b.f8790a;
        this.f8794d = obj2;
    }

    @Override // Q5.AbstractC1408c
    public Object a(Object obj, U5.d dVar) {
        AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8793c = dVar;
        this.f8792b = obj;
        Object e8 = V5.b.e();
        if (e8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8;
    }

    public final Object c() {
        Object obj;
        Object obj2;
        Object invoke;
        while (true) {
            Object obj3 = this.f8794d;
            U5.d dVar = this.f8793c;
            if (dVar != null) {
                obj = AbstractC1407b.f8790a;
                if (!s.d(obj, obj3)) {
                    obj2 = AbstractC1407b.f8790a;
                    this.f8794d = obj2;
                    dVar.resumeWith(obj3);
                } else {
                    try {
                        InterfaceC2073o interfaceC2073o = this.f8791a;
                        Object obj4 = this.f8792b;
                        if (!(interfaceC2073o instanceof kotlin.coroutines.jvm.internal.a)) {
                            invoke = V5.b.d(interfaceC2073o, this, obj4, dVar);
                        } else {
                            invoke = ((InterfaceC2073o) Z.d(interfaceC2073o, 3)).invoke(this, obj4, dVar);
                        }
                        if (invoke != V5.b.e()) {
                            dVar.resumeWith(s.b(invoke));
                        }
                    } catch (Throwable th) {
                        s.a aVar = s.f8810b;
                        dVar.resumeWith(s.b(t.a(th)));
                    }
                }
            } else {
                t.b(obj3);
                return obj3;
            }
        }
    }

    @Override // U5.d
    public U5.g getContext() {
        return U5.h.f10149a;
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        this.f8793c = null;
        this.f8794d = obj;
    }
}
