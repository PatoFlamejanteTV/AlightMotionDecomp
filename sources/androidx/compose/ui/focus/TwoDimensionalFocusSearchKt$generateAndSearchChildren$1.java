package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $direction;
    final /* synthetic */ FocusTargetNode $focusedItem;
    final /* synthetic */ Function1 $onFound;
    final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Function1 function1) {
        super(1);
        this.$this_generateAndSearchChildren = focusTargetNode;
        this.$focusedItem = focusTargetNode2;
        this.$direction = i8;
        this.$onFound = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        boolean m2676searchChildren4C6V_qg;
        m2676searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m2676searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
        Boolean valueOf = Boolean.valueOf(m2676searchChildren4C6V_qg);
        if (m2676searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
            return valueOf;
        }
        return null;
    }
}
