package e5;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import f5.InterfaceC2867a;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: e5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2828h extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2867a f31723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2828h(InterfaceC2867a interfaceC2867a, U5.d dVar) {
        super(2, dVar);
        this.f31723a = interfaceC2867a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C2828h(this.f31723a, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Object obj, Object obj2) {
        return new C2828h(this.f31723a, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        t.b(obj);
        this.f31723a.a("Something went wrong");
        return I.f8786a;
    }
}
