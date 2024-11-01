package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class SnapshotApplyResult {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;
        private final Snapshot snapshot;

        public Failure(Snapshot snapshot) {
            super(null);
            this.snapshot = snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
            this.snapshot.dispose();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return false;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return true;
        }
    }

    private SnapshotApplyResult() {
    }

    public abstract void check();

    public abstract boolean getSucceeded();

    public /* synthetic */ SnapshotApplyResult(AbstractC3284p abstractC3284p) {
        this();
    }
}
