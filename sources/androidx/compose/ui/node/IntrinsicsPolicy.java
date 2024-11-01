package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {
    private static final String NoPolicyError = "Intrinsic size is queried but there is no measure policy in place.";
    private final LayoutNode layoutNode;
    private final MutableState measurePolicyState$delegate;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public IntrinsicsPolicy(LayoutNode layoutNode) {
        MutableState mutableStateOf$default;
        this.layoutNode = layoutNode;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.measurePolicyState$delegate = mutableStateOf$default;
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final MeasurePolicy measurePolicyFromState() {
        MeasurePolicy measurePolicyState = getMeasurePolicyState();
        if (measurePolicyState != null) {
            return measurePolicyState;
        }
        throw new IllegalStateException(NoPolicyError.toString());
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int i8) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i8);
    }

    public final int maxIntrinsicWidth(int i8) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i8);
    }

    public final int maxLookaheadIntrinsicHeight(int i8) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i8);
    }

    public final int maxLookaheadIntrinsicWidth(int i8) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i8);
    }

    public final int minIntrinsicHeight(int i8) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i8);
    }

    public final int minIntrinsicWidth(int i8) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i8);
    }

    public final int minLookaheadIntrinsicHeight(int i8) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i8);
    }

    public final int minLookaheadIntrinsicWidth(int i8) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i8);
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }
}
