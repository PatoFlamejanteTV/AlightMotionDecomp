package e5;

import f5.InterfaceC2867a;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2823c extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2867a f31714a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2821a f31716c;

    /* renamed from: d, reason: collision with root package name */
    public int f31717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2823c(C2821a c2821a, U5.d dVar) {
        super(dVar);
        this.f31716c = c2821a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31715b = obj;
        this.f31717d |= Integer.MIN_VALUE;
        return C2821a.b(this.f31716c, null, null, this);
    }
}
