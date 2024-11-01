package androidx.compose.ui.modifier;

import Q5.r;
import R5.Q;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    public MultiLocalMap(r... rVarArr) {
        super(null);
        SnapshotStateMap<ModifierLocal<?>, Object> mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = mutableStateMapOf;
        mutableStateMapOf.putAll(Q.z(rVarArr));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        T t8 = (T) this.map.get(modifierLocal);
        if (t8 == null) {
            return null;
        }
        return t8;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo4183set$ui_release(ModifierLocal<T> modifierLocal, T t8) {
        this.map.put(modifierLocal, t8);
    }
}
