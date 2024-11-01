package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, j6.i iVar) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, iVar);
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j8) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j8);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, j6.i iVar, long j8) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, iVar, j8);
    }
}
