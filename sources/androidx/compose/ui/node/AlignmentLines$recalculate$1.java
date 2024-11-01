package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlignmentLines$recalculate$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return I.f8786a;
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        Map map;
        if (alignmentLinesOwner.isPlaced()) {
            if (alignmentLinesOwner.getAlignmentLines().getDirty$ui_release()) {
                alignmentLinesOwner.layoutChildren();
            }
            map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui_release = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui_release();
            AbstractC3292y.f(wrappedBy$ui_release);
            while (!AbstractC3292y.d(wrappedBy$ui_release, this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
                Set<AlignmentLine> keySet = this.this$0.getAlignmentLinesMap(wrappedBy$ui_release).keySet();
                AlignmentLines alignmentLines2 = this.this$0;
                for (AlignmentLine alignmentLine : keySet) {
                    alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                }
                wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                AbstractC3292y.f(wrappedBy$ui_release);
            }
        }
    }
}
