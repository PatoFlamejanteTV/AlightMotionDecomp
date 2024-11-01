package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected long mo4185calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j8) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        long mo4261getPositionnOccac = lookaheadDelegate.mo4261getPositionnOccac();
        return Offset.m2717plusMKHz9U(OffsetKt.Offset(IntOffset.m5279getXimpl(mo4261getPositionnOccac), IntOffset.m5280getYimpl(mo4261getPositionnOccac)), j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
