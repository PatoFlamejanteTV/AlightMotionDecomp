package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected long mo4185calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j8) {
        return nodeCoordinator.m4306toParentPositionMKHz9U(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.get(alignmentLine);
    }
}
