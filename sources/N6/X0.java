package n6;

import s6.C3980F;

/* loaded from: classes5.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f35683a = new X0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f35684b = s6.M.a(new C3980F("ThreadLocalEventLoop"));

    private X0() {
    }

    public final AbstractC3457h0 a() {
        return (AbstractC3457h0) f35684b.get();
    }

    public final AbstractC3457h0 b() {
        ThreadLocal threadLocal = f35684b;
        AbstractC3457h0 abstractC3457h0 = (AbstractC3457h0) threadLocal.get();
        if (abstractC3457h0 == null) {
            AbstractC3457h0 a9 = AbstractC3463k0.a();
            threadLocal.set(a9);
            return a9;
        }
        return abstractC3457h0;
    }

    public final void c() {
        f35684b.set(null);
    }

    public final void d(AbstractC3457h0 abstractC3457h0) {
        f35684b.set(abstractC3457h0);
    }
}
