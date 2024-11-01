package x6;

import java.util.concurrent.Executor;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class ExecutorC4231a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC4231a f41137a = new ExecutorC4231a();

    private ExecutorC4231a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
