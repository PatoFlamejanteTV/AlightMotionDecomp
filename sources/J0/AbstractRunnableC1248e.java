package J0;

import android.os.Process;

/* renamed from: J0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC1248e implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
