package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final ModifierLocal<?> key;
    private final MutableState value$delegate;

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        MutableState mutableStateOf$default;
        this.key = modifierLocal;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        if (modifierLocal == this.key) {
            return true;
        }
        return false;
    }

    public final void forceValue$ui_release(Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (modifierLocal == this.key) {
            T t8 = (T) getValue();
            if (t8 == null) {
                return null;
            }
            return t8;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo4183set$ui_release(ModifierLocal<T> modifierLocal, T t8) {
        if (modifierLocal == this.key) {
            setValue(t8);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
