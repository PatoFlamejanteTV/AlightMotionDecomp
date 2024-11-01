package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* loaded from: classes.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, j6.i iVar) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, iVar);
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d8) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d8);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, j6.i iVar, double d8) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, iVar, d8);
    }
}
