package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;

/* loaded from: classes.dex */
public final class SnapshotContextElementKt {
    @ExperimentalComposeApi
    public static final SnapshotContextElement asContextElement(Snapshot snapshot) {
        return new SnapshotContextElementImpl(snapshot);
    }
}
