package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.AbstractC3462k;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            p6.d b9 = p6.g.b(1, null, null, 6, null);
            AbstractC3462k.d(n6.N.a(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(b9, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new GlobalSnapshotManager$ensureStarted$2(b9));
        }
    }
}
