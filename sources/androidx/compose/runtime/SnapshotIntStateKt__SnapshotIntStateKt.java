package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, j6.i iVar) {
        return intState.getIntValue();
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i8) {
        return ActualAndroid_androidKt.createSnapshotMutableIntState(i8);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, j6.i iVar, int i8) {
        mutableIntState.setIntValue(i8);
    }
}
