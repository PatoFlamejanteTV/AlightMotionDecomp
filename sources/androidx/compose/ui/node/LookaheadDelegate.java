package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m5289getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: access$setMeasurementConstraints-BRTryo0 */
    public static final /* synthetic */ void m4262access$setMeasurementConstraintsBRTryo0(LookaheadDelegate lookaheadDelegate, long j8) {
        lookaheadDelegate.m4145setMeasurementConstraintsBRTryo0(j8);
    }

    public static final /* synthetic */ void access$set_measureResult(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        lookaheadDelegate.set_measureResult(measureResult);
    }

    /* renamed from: placeSelf--gyyYBs */
    private final void m4263placeSelfgyyYBs(long j8) {
        if (!IntOffset.m5278equalsimpl0(mo4261getPositionnOccac(), j8)) {
            m4267setPositiongyyYBs(j8);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
    }

    public final void set_measureResult(MeasureResult measureResult) {
        I i8;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m4144setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            i8 = I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            m4144setMeasuredSizeozmzZPI(IntSize.Companion.m5326getZeroYbymL2g());
        }
        if (!AbstractC3292y.d(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !AbstractC3292y.d(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        AbstractC3292y.f(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this._measureResult != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo4261getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i8) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC3292y.f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i8);
    }

    public int maxIntrinsicWidth(int i8) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC3292y.f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i8);
    }

    public int minIntrinsicHeight(int i8) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC3292y.f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i8);
    }

    public int minIntrinsicWidth(int i8) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC3292y.f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i8);
    }

    /* renamed from: performingMeasure-K40F9xA */
    public final Placeable m4264performingMeasureK40F9xA(long j8, Function0 function0) {
        m4145setMeasurementConstraintsBRTryo0(j8);
        set_measureResult((MeasureResult) function0.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
        m4263placeSelfgyyYBs(j8);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release */
    public final void m4265placeSelfApparentToRealOffsetgyyYBs$ui_release(long j8) {
        long m4141getApparentToRealOffsetnOccac = m4141getApparentToRealOffsetnOccac();
        m4263placeSelfgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(j8) + IntOffset.m5279getXimpl(m4141getApparentToRealOffsetnOccac), IntOffset.m5280getYimpl(j8) + IntOffset.m5280getYimpl(m4141getApparentToRealOffsetnOccac)));
    }

    /* renamed from: positionIn-Bjo55l4$ui_release */
    public final long m4266positionInBjo55l4$ui_release(LookaheadDelegate lookaheadDelegate) {
        long m5289getZeronOccac = IntOffset.Companion.m5289getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!AbstractC3292y.d(lookaheadDelegate2, lookaheadDelegate)) {
            long mo4261getPositionnOccac = lookaheadDelegate2.mo4261getPositionnOccac();
            m5289getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5289getZeronOccac) + IntOffset.m5279getXimpl(mo4261getPositionnOccac), IntOffset.m5280getYimpl(m5289getZeronOccac) + IntOffset.m5280getYimpl(mo4261getPositionnOccac));
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            AbstractC3292y.f(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate2);
        }
        return m5289getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4109placeAtf8xVGno(mo4261getPositionnOccac(), 0.0f, null);
    }

    /* renamed from: setPosition--gyyYBs */
    public void m4267setPositiongyyYBs(long j8) {
        this.position = j8;
    }
}
