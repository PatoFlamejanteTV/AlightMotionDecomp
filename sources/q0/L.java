package q0;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class L implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
