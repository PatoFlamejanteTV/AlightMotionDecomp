package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;
    private ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        if (modifierLocal == this.element.getKey()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (modifierLocal == this.element.getKey()) {
            return (T) this.element.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo4183set$ui_release(ModifierLocal<T> modifierLocal, T t8) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    public final void setElement(ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }
}
