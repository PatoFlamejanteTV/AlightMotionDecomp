package u6;

import n6.I;
import s6.AbstractC3994n;

/* renamed from: u6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C4102m extends I {

    /* renamed from: a, reason: collision with root package name */
    public static final C4102m f40376a = new C4102m();

    private C4102m() {
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        C4092c.f40357g.F(runnable, AbstractC4101l.f40375h, false);
    }

    @Override // n6.I
    public void dispatchYield(U5.g gVar, Runnable runnable) {
        C4092c.f40357g.F(runnable, AbstractC4101l.f40375h, true);
    }

    @Override // n6.I
    public I limitedParallelism(int i8) {
        AbstractC3994n.a(i8);
        if (i8 >= AbstractC4101l.f40371d) {
            return this;
        }
        return super.limitedParallelism(i8);
    }
}
