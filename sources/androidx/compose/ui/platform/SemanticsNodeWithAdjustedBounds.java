package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final Rect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, Rect rect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = rect;
    }

    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
