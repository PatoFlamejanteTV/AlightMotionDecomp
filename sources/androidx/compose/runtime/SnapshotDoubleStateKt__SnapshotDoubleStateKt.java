package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, j6.i iVar) {
        return doubleState.getDoubleValue();
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d8) {
        return ActualAndroid_androidKt.createSnapshotMutableDoubleState(d8);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, j6.i iVar, double d8) {
        mutableDoubleState.setDoubleValue(d8);
    }
}
