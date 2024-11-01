package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, j6.i iVar) {
        return longState.getLongValue();
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j8) {
        return ActualAndroid_androidKt.createSnapshotMutableLongState(j8);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, j6.i iVar, long j8) {
        mutableLongState.setLongValue(j8);
    }
}
