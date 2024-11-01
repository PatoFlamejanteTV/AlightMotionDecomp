package q0;

import android.os.Handler;
import android.os.Looper;
import h0.HandlerC2928a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class M implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36622a = new HandlerC2928a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36622a.post(runnable);
    }
}
