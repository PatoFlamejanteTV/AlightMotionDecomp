package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ForceUpdateElement extends ModifierNodeElement<Modifier.Node> {
    private final ModifierNodeElement<?> original;

    public ForceUpdateElement(ModifierNodeElement<?> modifierNodeElement) {
        this.original = modifierNodeElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForceUpdateElement copy$default(ForceUpdateElement forceUpdateElement, ModifierNodeElement modifierNodeElement, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            modifierNodeElement = forceUpdateElement.original;
        }
        return forceUpdateElement.copy(modifierNodeElement);
    }

    public final ModifierNodeElement<?> component1() {
        return this.original;
    }

    public final ForceUpdateElement copy(ModifierNodeElement<?> modifierNodeElement) {
        return new ForceUpdateElement(modifierNodeElement);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Modifier.Node create() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && AbstractC3292y.d(this.original, ((ForceUpdateElement) obj).original);
    }

    public final ModifierNodeElement<?> getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.original.hashCode();
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.original + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(Modifier.Node node) {
        throw new IllegalStateException("Shouldn't be called");
    }
}
