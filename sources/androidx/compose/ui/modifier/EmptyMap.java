package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class EmptyMap extends ModifierLocalMap {
    public static final int $stable = 0;
    public static final EmptyMap INSTANCE = new EmptyMap();

    private EmptyMap() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        throw new IllegalStateException("".toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo4183set$ui_release(ModifierLocal modifierLocal, Object obj) {
        set$ui_release((ModifierLocal<ModifierLocal>) modifierLocal, (ModifierLocal) obj);
    }

    public <T> Void set$ui_release(ModifierLocal<T> modifierLocal, T t8) {
        throw new IllegalStateException("".toString());
    }
}
