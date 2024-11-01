package androidx.compose.runtime;

import Q5.r;
import R5.AbstractC1428l;
import R5.Q;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(State<? extends T> state, Object obj, j6.i iVar) {
        return state.getValue();
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t8, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return ActualAndroid_androidKt.createSnapshotMutableState(t8, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t8, Composer composer, int i8) {
        composer.startReplaceableGroup(-1058319986);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i8, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, j6.i iVar, T t8) {
        mutableState.setValue(t8);
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends r> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(Q.u(iterable));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(AbstractC1428l.V0(tArr));
        return snapshotStateList;
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(r... rVarArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(Q.z(rVarArr));
        return snapshotStateMap;
    }
}
