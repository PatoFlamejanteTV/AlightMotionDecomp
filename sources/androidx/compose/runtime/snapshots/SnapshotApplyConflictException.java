package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotApplyConflictException(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
