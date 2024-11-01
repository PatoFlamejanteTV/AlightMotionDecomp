package androidx.compose.ui.node;

import R5.Q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import e6.AbstractC2829a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AlignmentLines {
    public static final int $stable = 8;
    private final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, AbstractC3284p abstractC3284p) {
        this(alignmentLinesOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i8, NodeCoordinator nodeCoordinator) {
        int d8;
        float f8 = i8;
        long Offset = OffsetKt.Offset(f8, f8);
        while (true) {
            Offset = mo4185calculatePositionInParentR5De75A(nodeCoordinator, Offset);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            AbstractC3292y.f(nodeCoordinator);
            if (AbstractC3292y.d(nodeCoordinator, this.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
                Offset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            d8 = AbstractC2829a.d(Offset.m2713getYimpl(Offset));
        } else {
            d8 = AbstractC2829a.d(Offset.m2712getXimpl(Offset));
        }
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            d8 = AlignmentLineKt.merge(alignmentLine, ((Number) Q.i(this.alignmentLineMap, alignmentLine)).intValue(), d8);
        }
        map.put(alignmentLine, Integer.valueOf(d8));
    }

    /* renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    protected abstract long mo4185calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator);

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        if (!this.usedDuringParentMeasurement && !this.previousUsedDuringParentLayout && !this.usedByModifierMeasurement && !this.usedByModifierLayout) {
            return false;
        }
        return true;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        if (this.queryOwner != null) {
            return true;
        }
        return false;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AlignmentLines$recalculate$1(this));
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner;
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            alignmentLinesOwner = this.alignmentLinesOwner;
        } else {
            AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                if (alignmentLinesOwner2 != null && !alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                        alignmentLines2.recalculateQueryOwner();
                    }
                    AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner3 != null && (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) != null) {
                        alignmentLinesOwner = alignmentLines.queryOwner;
                    } else {
                        alignmentLinesOwner = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z8) {
        this.dirty = z8;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z8) {
        this.previousUsedDuringParentLayout = z8;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z8) {
        this.usedByModifierLayout = z8;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z8) {
        this.usedByModifierMeasurement = z8;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z8) {
        this.usedDuringParentLayout = z8;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z8) {
        this.usedDuringParentMeasurement = z8;
    }

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
