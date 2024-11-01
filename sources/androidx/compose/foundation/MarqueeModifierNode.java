package androidx.compose.foundation;

import Q5.I;
import Q5.p;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;

/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private final MutableState animationMode$delegate;
    private final MutableIntState containerWidth$delegate;
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;
    private final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    private float velocity;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i8, int i9, int i10, int i11, MarqueeSpacing marqueeSpacing, float f8, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, i11, marqueeSpacing, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float signum = Math.signum(this.velocity);
        int i8 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i9 = -1;
            } else {
                throw new p();
            }
        }
        return signum * i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    private final void restartAnimation() {
        if (isAttached()) {
            AbstractC3462k.d(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(d dVar) {
        if (this.iterations <= 0) {
            return I.f8786a;
        }
        Object g8 = AbstractC3458i.g(FixedMotionDurationScale.INSTANCE, new MarqueeModifierNode$runAnimation$2(this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void setContainerWidth(int i8) {
        this.containerWidth$delegate.setIntValue(i8);
    }

    private final void setContentWidth(int i8) {
        this.contentWidth$delegate.setIntValue(i8);
    }

    private final void setHasFocus(boolean z8) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z8));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        boolean z8;
        int spacingPx;
        AbstractC3292y.i(contentDrawScope, "<this>");
        float floatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z9 = false;
        if (getDirection() != 1.0f ? this.offset.getValue().floatValue() < getContainerWidth() : this.offset.getValue().floatValue() < getContentWidth()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getDirection() != 1.0f ? this.offset.getValue().floatValue() > getSpacingPx() : this.offset.getValue().floatValue() > (getContentWidth() + getSpacingPx()) - getContainerWidth()) {
            z9 = true;
        }
        if (getDirection() == 1.0f) {
            spacingPx = getContentWidth() + getSpacingPx();
        } else {
            spacingPx = (-getContentWidth()) - getSpacingPx();
        }
        float f8 = spacingPx;
        float m2778getHeightimpl = Size.m2778getHeightimpl(contentDrawScope.mo3391getSizeNHjbRc());
        int m2937getIntersectrtfAjoo = ClipOp.Companion.m2937getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3400clipRectN_I0leg(floatValue, 0.0f, floatValue + getContainerWidth(), m2778getHeightimpl, m2937getIntersectrtfAjoo);
        if (z8) {
            contentDrawScope.drawContent();
        }
        if (z9) {
            contentDrawScope.getDrawContext().getTransform().translate(f8, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f8, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m339getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m330unboximpl();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m5137constrainWidthK40F9xA(j8, mo4108measureBRTryo0.getWidth()));
        setContentWidth(mo4108measureBRTryo0.getWidth());
        return MeasureScope.CC.q(measure, getContainerWidth(), mo4108measureBRTryo0.getHeight(), null, new MarqueeModifierNode$measure$1(mo4108measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimation();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        AbstractC3292y.i(focusState, "focusState");
        setHasFocus(focusState.getHasFocus());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.b.a(this);
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m341setAnimationMode97h66l8(int i8) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m324boximpl(i8));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        AbstractC3292y.i(marqueeSpacing, "<set-?>");
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m342updatelWfNwf4(int i8, int i9, int i10, int i11, MarqueeSpacing spacing, float f8) {
        AbstractC3292y.i(spacing, "spacing");
        setSpacing(spacing);
        m341setAnimationMode97h66l8(i9);
        if (this.iterations != i8 || this.delayMillis != i10 || this.initialDelayMillis != i11 || !Dp.m5160equalsimpl0(this.velocity, f8)) {
            this.iterations = i8;
            this.delayMillis = i10;
            this.initialDelayMillis = i11;
            this.velocity = f8;
            restartAnimation();
        }
    }

    private MarqueeModifierNode(int i8, int i9, int i10, int i11, MarqueeSpacing spacing, float f8) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        AbstractC3292y.i(spacing, "spacing");
        this.iterations = i8;
        this.delayMillis = i10;
        this.initialDelayMillis = i11;
        this.velocity = f8;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(spacing, null, 2, null);
        this.spacing$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m324boximpl(i9), null, 2, null);
        this.animationMode$delegate = mutableStateOf$default3;
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new MarqueeModifierNode$spacingPx$2(spacing, this));
    }
}
