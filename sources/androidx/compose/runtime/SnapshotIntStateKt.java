package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, j6.i iVar) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, iVar);
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i8) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i8);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, j6.i iVar, int i8) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, iVar, i8);
    }
}
