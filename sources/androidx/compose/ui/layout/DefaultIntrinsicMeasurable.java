package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i8) {
        return this.measurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i8) {
        return this.measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo4108measureBRTryo0(long j8) {
        int minIntrinsicHeight;
        int minIntrinsicWidth;
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            if (this.minMax == IntrinsicMinMax.Max) {
                minIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m5122getMaxHeightimpl(j8));
            } else {
                minIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m5122getMaxHeightimpl(j8));
            }
            return new FixedSizeIntrinsicsPlaceable(minIntrinsicWidth, Constraints.m5122getMaxHeightimpl(j8));
        }
        if (this.minMax == IntrinsicMinMax.Max) {
            minIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m5123getMaxWidthimpl(j8));
        } else {
            minIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m5123getMaxWidthimpl(j8));
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m5123getMaxWidthimpl(j8), minIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i8) {
        return this.measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i8) {
        return this.measurable.minIntrinsicWidth(i8);
    }
}
