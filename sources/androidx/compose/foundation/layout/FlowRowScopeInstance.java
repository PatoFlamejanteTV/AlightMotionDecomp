package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FlowRowScopeInstance implements RowScope, FlowRowScope {
    public static final FlowRowScopeInstance INSTANCE = new FlowRowScopeInstance();
    private final /* synthetic */ RowScopeInstance $$delegate_0 = RowScopeInstance.INSTANCE;

    private FlowRowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical alignment) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine alignmentLine) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        return this.$$delegate_0.alignBy(modifier, alignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        AbstractC3292y.i(modifier, "<this>");
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, float f8, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        return this.$$delegate_0.weight(modifier, f8, z8);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignmentLineBlock, "alignmentLineBlock");
        return this.$$delegate_0.alignBy(modifier, alignmentLineBlock);
    }
}
