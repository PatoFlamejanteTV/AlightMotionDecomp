package E0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public enum m implements Executor {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    private static final Handler f1542b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f1542b.post(runnable);
    }
}
