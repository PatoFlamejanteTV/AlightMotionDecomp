package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final FlowColumnScopeInstance INSTANCE = new FlowColumnScopeInstance();
    private final /* synthetic */ ColumnScopeInstance $$delegate_0 = ColumnScopeInstance.INSTANCE;

    private FlowColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal alignment) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine alignmentLine) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        return this.$$delegate_0.alignBy(modifier, alignmentLine);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, float f8, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        return this.$$delegate_0.weight(modifier, f8, z8);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLineBlock, "alignmentLineBlock");
        return this.$$delegate_0.alignBy(modifier, alignmentLineBlock);
    }
}
