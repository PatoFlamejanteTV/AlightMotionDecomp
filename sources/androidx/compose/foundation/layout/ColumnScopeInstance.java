package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal alignment) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignment, "alignment");
        return modifier.then(new HorizontalAlignElement(alignment));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine alignmentLine) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        return modifier.then(new WithAlignmentLineElement(alignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, float f8, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        if (f8 > 0.0d) {
            return modifier.then(new LayoutWeightElement(f8, z8));
        }
        throw new IllegalArgumentException(("invalid weight " + f8 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLineBlock, "alignmentLineBlock");
        return modifier.then(new WithAlignmentLineBlockElement(alignmentLineBlock));
    }
}
