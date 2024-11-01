package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i8, final int i9, final Map<AlignmentLine, Integer> map, Function1 function1) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i9;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i8;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo418roundToPxR2X_6o(long j8) {
        return this.$$delegate_0.mo418roundToPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo419roundToPx0680j_4(float f8) {
        return this.$$delegate_0.mo419roundToPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo420toDpGaN1DYA(long j8) {
        return this.$$delegate_0.mo420toDpGaN1DYA(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo421toDpu2uoSUM(float f8) {
        return this.$$delegate_0.mo421toDpu2uoSUM(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo423toDpSizekrfVVM(long j8) {
        return this.$$delegate_0.mo423toDpSizekrfVVM(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo424toPxR2X_6o(long j8) {
        return this.$$delegate_0.mo424toPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo425toPx0680j_4(float f8) {
        return this.$$delegate_0.mo425toPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo426toSizeXkaWNTQ(long j8) {
        return this.$$delegate_0.mo426toSizeXkaWNTQ(j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo427toSp0xMU5do(float f8) {
        return this.$$delegate_0.mo427toSp0xMU5do(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo428toSpkPz2Gy4(float f8) {
        return this.$$delegate_0.mo428toSpkPz2Gy4(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo422toDpu2uoSUM(int i8) {
        return this.$$delegate_0.mo422toDpu2uoSUM(i8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo429toSpkPz2Gy4(int i8) {
        return this.$$delegate_0.mo429toSpkPz2Gy4(i8);
    }
}
