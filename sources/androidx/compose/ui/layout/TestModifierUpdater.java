package androidx.compose.ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode layoutNode) {
        this.node = layoutNode;
    }

    public final void updateModifier(Modifier modifier) {
        this.node.setModifier(modifier);
    }
}
