package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import e6.AbstractC2829a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m4125getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m2716minusMKHz9U(mo4116localPositionOfR5De75A(coordinates, companion.m2728getZeroF1C5BW0()), getCoordinator().mo4116localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m2728getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null && (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) != null) {
                return lookaheadDelegate.getCoordinates();
            }
            return null;
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
                return null;
            }
            return lookaheadDelegate.getCoordinates();
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo4115getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z8) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z8);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo4116localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j8) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long m4266positionInBjo55l4$ui_release = lookaheadDelegate.m4266positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset = IntOffsetKt.IntOffset(AbstractC2829a.d(Offset.m2712getXimpl(j8)), AbstractC2829a.d(Offset.m2713getYimpl(j8)));
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m4266positionInBjo55l4$ui_release) + IntOffset.m5279getXimpl(IntOffset), IntOffset.m5280getYimpl(m4266positionInBjo55l4$ui_release) + IntOffset.m5280getYimpl(IntOffset));
                long m4266positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m4266positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(IntOffset2) - IntOffset.m5279getXimpl(m4266positionInBjo55l4$ui_release2), IntOffset.m5280getYimpl(IntOffset2) - IntOffset.m5280getYimpl(m4266positionInBjo55l4$ui_release2));
                return OffsetKt.Offset(IntOffset.m5279getXimpl(IntOffset3), IntOffset.m5280getYimpl(IntOffset3));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long m4266positionInBjo55l4$ui_release3 = lookaheadDelegate.m4266positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long mo4261getPositionnOccac = rootLookaheadDelegate.mo4261getPositionnOccac();
            long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m4266positionInBjo55l4$ui_release3) + IntOffset.m5279getXimpl(mo4261getPositionnOccac), IntOffset.m5280getYimpl(m4266positionInBjo55l4$ui_release3) + IntOffset.m5280getYimpl(mo4261getPositionnOccac));
            long IntOffset5 = IntOffsetKt.IntOffset(AbstractC2829a.d(Offset.m2712getXimpl(j8)), AbstractC2829a.d(Offset.m2713getYimpl(j8)));
            long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(IntOffset4) + IntOffset.m5279getXimpl(IntOffset5), IntOffset.m5280getYimpl(IntOffset4) + IntOffset.m5280getYimpl(IntOffset5));
            LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
            long m4266positionInBjo55l4$ui_release4 = lookaheadDelegate3.m4266positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long mo4261getPositionnOccac2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).mo4261getPositionnOccac();
            long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m4266positionInBjo55l4$ui_release4) + IntOffset.m5279getXimpl(mo4261getPositionnOccac2), IntOffset.m5280getYimpl(m4266positionInBjo55l4$ui_release4) + IntOffset.m5280getYimpl(mo4261getPositionnOccac2));
            long IntOffset8 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(IntOffset6) - IntOffset.m5279getXimpl(IntOffset7), IntOffset.m5280getYimpl(IntOffset6) - IntOffset.m5280getYimpl(IntOffset7));
            NodeCoordinator wrappedBy$ui_release = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy$ui_release();
            AbstractC3292y.f(wrappedBy$ui_release);
            NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
            AbstractC3292y.f(wrappedBy$ui_release2);
            return wrappedBy$ui_release.mo4116localPositionOfR5De75A(wrappedBy$ui_release2, OffsetKt.Offset(IntOffset.m5279getXimpl(IntOffset8), IntOffset.m5280getYimpl(IntOffset8)));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m2717plusMKHz9U(mo4116localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), j8), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo4116localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2728getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo4117localToRootMKHz9U(long j8) {
        return getCoordinator().mo4117localToRootMKHz9U(Offset.m2717plusMKHz9U(j8, m4125getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo4118localToWindowMKHz9U(long j8) {
        return getCoordinator().mo4118localToWindowMKHz9U(Offset.m2717plusMKHz9U(j8, m4125getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo4119transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo4119transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo4120windowToLocalMKHz9U(long j8) {
        return Offset.m2717plusMKHz9U(getCoordinator().mo4120windowToLocalMKHz9U(j8), m4125getLookaheadOffsetF1C5BW0());
    }
}
