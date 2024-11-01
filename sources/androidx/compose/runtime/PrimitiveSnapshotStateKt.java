package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, j6.i iVar) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, iVar);
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f8) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f8);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, j6.i iVar, float f8) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, iVar, f8);
    }
}
