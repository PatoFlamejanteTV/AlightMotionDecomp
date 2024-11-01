package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, AbstractC3284p abstractC3284p) {
        this(painter, z8, (i8 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i8 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i8 & 16) != 0 ? 1.0f : f8, (i8 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m2617calculateScaledSizeE7KxVPU(long j8) {
        float m2781getWidthimpl;
        float m2778getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m2619hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo3485getIntrinsicSizeNHjbRc())) {
                m2781getWidthimpl = Size.m2781getWidthimpl(j8);
            } else {
                m2781getWidthimpl = Size.m2781getWidthimpl(this.painter.mo3485getIntrinsicSizeNHjbRc());
            }
            if (!m2618hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo3485getIntrinsicSizeNHjbRc())) {
                m2778getHeightimpl = Size.m2778getHeightimpl(j8);
            } else {
                m2778getHeightimpl = Size.m2778getHeightimpl(this.painter.mo3485getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m2781getWidthimpl, m2778getHeightimpl);
            if (Size.m2781getWidthimpl(j8) == 0.0f || Size.m2778getHeightimpl(j8) == 0.0f) {
                return Size.Companion.m2790getZeroNHjbRc();
            }
            return ScaleFactorKt.m4180timesUQTWf7w(Size, this.contentScale.mo4099computeScaleFactorH7hwNQA(Size, j8));
        }
        return j8;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics && this.painter.mo3485getIntrinsicSizeNHjbRc() != Size.Companion.m2789getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m2618hasSpecifiedAndFiniteHeightuvyYCjk(long j8) {
        if (!Size.m2777equalsimpl0(j8, Size.Companion.m2789getUnspecifiedNHjbRc())) {
            float m2778getHeightimpl = Size.m2778getHeightimpl(j8);
            if (!Float.isInfinite(m2778getHeightimpl) && !Float.isNaN(m2778getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m2619hasSpecifiedAndFiniteWidthuvyYCjk(long j8) {
        if (!Size.m2777equalsimpl0(j8, Size.Companion.m2789getUnspecifiedNHjbRc())) {
            float m2781getWidthimpl = Size.m2781getWidthimpl(j8);
            if (!Float.isInfinite(m2781getWidthimpl) && !Float.isNaN(m2781getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m2620modifyConstraintsZezNO4M(long j8) {
        boolean z8;
        int m5125getMinWidthimpl;
        int m5124getMinHeightimpl;
        boolean z9 = false;
        if (Constraints.m5119getHasBoundedWidthimpl(j8) && Constraints.m5118getHasBoundedHeightimpl(j8)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Constraints.m5121getHasFixedWidthimpl(j8) && Constraints.m5120getHasFixedHeightimpl(j8)) {
            z9 = true;
        }
        if ((!getUseIntrinsicSize() && z8) || z9) {
            return Constraints.m5114copyZbe2FdA$default(j8, Constraints.m5123getMaxWidthimpl(j8), 0, Constraints.m5122getMaxHeightimpl(j8), 0, 10, null);
        }
        long mo3485getIntrinsicSizeNHjbRc = this.painter.mo3485getIntrinsicSizeNHjbRc();
        if (m2619hasSpecifiedAndFiniteWidthuvyYCjk(mo3485getIntrinsicSizeNHjbRc)) {
            m5125getMinWidthimpl = AbstractC2829a.d(Size.m2781getWidthimpl(mo3485getIntrinsicSizeNHjbRc));
        } else {
            m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        }
        if (m2618hasSpecifiedAndFiniteHeightuvyYCjk(mo3485getIntrinsicSizeNHjbRc)) {
            m5124getMinHeightimpl = AbstractC2829a.d(Size.m2778getHeightimpl(mo3485getIntrinsicSizeNHjbRc));
        } else {
            m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
        }
        long m2617calculateScaledSizeE7KxVPU = m2617calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m5137constrainWidthK40F9xA(j8, m5125getMinWidthimpl), ConstraintsKt.m5136constrainHeightK40F9xA(j8, m5124getMinHeightimpl)));
        return Constraints.m5114copyZbe2FdA$default(j8, ConstraintsKt.m5137constrainWidthK40F9xA(j8, AbstractC2829a.d(Size.m2781getWidthimpl(m2617calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5136constrainHeightK40F9xA(j8, AbstractC2829a.d(Size.m2778getHeightimpl(m2617calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m2781getWidthimpl;
        float m2778getHeightimpl;
        long m2790getZeroNHjbRc;
        long mo3485getIntrinsicSizeNHjbRc = this.painter.mo3485getIntrinsicSizeNHjbRc();
        if (m2619hasSpecifiedAndFiniteWidthuvyYCjk(mo3485getIntrinsicSizeNHjbRc)) {
            m2781getWidthimpl = Size.m2781getWidthimpl(mo3485getIntrinsicSizeNHjbRc);
        } else {
            m2781getWidthimpl = Size.m2781getWidthimpl(contentDrawScope.mo3391getSizeNHjbRc());
        }
        if (m2618hasSpecifiedAndFiniteHeightuvyYCjk(mo3485getIntrinsicSizeNHjbRc)) {
            m2778getHeightimpl = Size.m2778getHeightimpl(mo3485getIntrinsicSizeNHjbRc);
        } else {
            m2778getHeightimpl = Size.m2778getHeightimpl(contentDrawScope.mo3391getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m2781getWidthimpl, m2778getHeightimpl);
        if (Size.m2781getWidthimpl(contentDrawScope.mo3391getSizeNHjbRc()) == 0.0f || Size.m2778getHeightimpl(contentDrawScope.mo3391getSizeNHjbRc()) == 0.0f) {
            m2790getZeroNHjbRc = Size.Companion.m2790getZeroNHjbRc();
        } else {
            m2790getZeroNHjbRc = ScaleFactorKt.m4180timesUQTWf7w(Size, this.contentScale.mo4099computeScaleFactorH7hwNQA(Size, contentDrawScope.mo3391getSizeNHjbRc()));
        }
        long j8 = m2790getZeroNHjbRc;
        long mo2585alignKFBX0sM = this.alignment.mo2585alignKFBX0sM(IntSizeKt.IntSize(AbstractC2829a.d(Size.m2781getWidthimpl(j8)), AbstractC2829a.d(Size.m2778getHeightimpl(j8))), IntSizeKt.IntSize(AbstractC2829a.d(Size.m2781getWidthimpl(contentDrawScope.mo3391getSizeNHjbRc())), AbstractC2829a.d(Size.m2778getHeightimpl(contentDrawScope.mo3391getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m5279getXimpl = IntOffset.m5279getXimpl(mo2585alignKFBX0sM);
        float m5280getYimpl = IntOffset.m5280getYimpl(mo2585alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m5279getXimpl, m5280getYimpl);
        this.painter.m3491drawx_KDEd0(contentDrawScope, j8, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m5279getXimpl, -m5280getYimpl);
        contentDrawScope.drawContent();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2620modifyConstraintsZezNO4M = m2620modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5124getMinHeightimpl(m2620modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2620modifyConstraintsZezNO4M = m2620modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5125getMinWidthimpl(m2620modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i8));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(m2620modifyConstraintsZezNO4M(j8));
        return MeasureScope.CC.q(measureScope, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2620modifyConstraintsZezNO4M = m2620modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5124getMinHeightimpl(m2620modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2620modifyConstraintsZezNO4M = m2620modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5125getMinWidthimpl(m2620modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i8));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.b.a(this);
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f8) {
        this.alpha = f8;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z8) {
        this.sizeToIntrinsics = z8;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z8;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f8;
        this.colorFilter = colorFilter;
    }
}
