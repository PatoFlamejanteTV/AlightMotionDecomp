package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, j6.i iVar) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f8) {
        return ActualAndroid_androidKt.createSnapshotMutableFloatState(f8);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, j6.i iVar, float f8) {
        mutableFloatState.setFloatValue(f8);
    }
}
