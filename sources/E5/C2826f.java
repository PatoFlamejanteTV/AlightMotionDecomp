package e5;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import f5.InterfaceC2867a;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2826f extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2867a f31720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2826f(InterfaceC2867a interfaceC2867a, String str, U5.d dVar) {
        super(2, dVar);
        this.f31720a = interfaceC2867a;
        this.f31721b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C2826f(this.f31720a, this.f31721b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Object obj, Object obj2) {
        return new C2826f(this.f31720a, this.f31721b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        t.b(obj);
        this.f31720a.a(this.f31721b);
        return I.f8786a;
    }
}
