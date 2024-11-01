package u6;

import n6.AbstractC3469n0;

/* renamed from: u6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4095f extends AbstractC3469n0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f40359b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40360c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40361d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40362e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorC4090a f40363f = E();

    public AbstractC4095f(int i8, int i9, long j8, String str) {
        this.f40359b = i8;
        this.f40360c = i9;
        this.f40361d = j8;
        this.f40362e = str;
    }

    private final ExecutorC4090a E() {
        return new ExecutorC4090a(this.f40359b, this.f40360c, this.f40361d, this.f40362e);
    }

    public final void F(Runnable runnable, InterfaceC4098i interfaceC4098i, boolean z8) {
        this.f40363f.j(runnable, interfaceC4098i, z8);
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        ExecutorC4090a.k(this.f40363f, runnable, null, false, 6, null);
    }

    @Override // n6.I
    public void dispatchYield(U5.g gVar, Runnable runnable) {
        ExecutorC4090a.k(this.f40363f, runnable, null, true, 2, null);
    }
}
