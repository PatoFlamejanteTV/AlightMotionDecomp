package p2;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p2.AbstractC3564f;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3562d {

    /* renamed from: a, reason: collision with root package name */
    private final p f36186a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f36187b;

    public o(p accountRanges) {
        AbstractC3292y.i(accountRanges, "accountRanges");
        this.f36186a = accountRanges;
        this.f36187b = A4.g.n(Boolean.FALSE);
    }

    @Override // p2.InterfaceC3562d
    public InterfaceC3813L a() {
        return this.f36187b;
    }

    @Override // p2.InterfaceC3562d
    public Object b(AbstractC3564f.b bVar, U5.d dVar) {
        return this.f36186a.a(bVar);
    }

    public /* synthetic */ o(p pVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new C3569k() : pVar);
    }
}
