package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class DefaultIntrinsicMeasurable implements Measurable {
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

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
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
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4108measureBRTryo0(long j8) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                if (this.minMax == IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m5122getMaxHeightimpl(j8));
                } else {
                    minIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m5122getMaxHeightimpl(j8));
                }
                return new EmptyPlaceable(minIntrinsicWidth, Constraints.m5122getMaxHeightimpl(j8));
            }
            if (this.minMax == IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m5123getMaxWidthimpl(j8));
            } else {
                minIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m5123getMaxWidthimpl(j8));
            }
            return new EmptyPlaceable(Constraints.m5123getMaxWidthimpl(j8), minIntrinsicHeight);
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

    /* loaded from: classes.dex */
    private static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i8, int i9) {
            m4144setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i8, i9));
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return layoutModifier.mo133measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return layoutModifier.mo133measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }

    public final int minHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return layoutModifier.mo133measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return layoutModifier.mo133measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }
}
