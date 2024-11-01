package n6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n6.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3486w0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f35756e;

    public C3486w0(Function1 function1) {
        this.f35756e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Q5.I.f8786a;
    }

    @Override // n6.AbstractC3439E
    public void r(Throwable th) {
        this.f35756e.invoke(th);
    }
}
