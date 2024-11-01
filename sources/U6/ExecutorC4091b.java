package u6;

import java.util.concurrent.Executor;
import n6.AbstractC3469n0;
import n6.I;
import s6.G;

/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC4091b extends AbstractC3469n0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC4091b f40355b = new ExecutorC4091b();

    /* renamed from: c, reason: collision with root package name */
    private static final I f40356c;

    static {
        int e8;
        C4102m c4102m = C4102m.f40376a;
        e8 = s6.I.e("kotlinx.coroutines.io.parallelism", i6.m.d(64, G.a()), 0, 0, 12, null);
        f40356c = c4102m.limitedParallelism(e8);
    }

    private ExecutorC4091b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        f40356c.dispatch(gVar, runnable);
    }

    @Override // n6.I
    public void dispatchYield(U5.g gVar, Runnable runnable) {
        f40356c.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(U5.h.f10149a, runnable);
    }

    @Override // n6.I
    public I limitedParallelism(int i8) {
        return C4102m.f40376a.limitedParallelism(i8);
    }

    @Override // n6.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
