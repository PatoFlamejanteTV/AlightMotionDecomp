package androidx.compose.animation;

import Q5.p;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final State<Alignment> alignment;
    private Alignment currentAlignment;
    private final State<ChangeSize> expand;
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private final State<ChangeSize> shrink;
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private final Function1 sizeTransitionSpec;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, State<ChangeSize> expand, State<ChangeSize> shrink, State<? extends Alignment> alignment) {
        AbstractC3292y.i(sizeAnimation, "sizeAnimation");
        AbstractC3292y.i(offsetAnimation, "offsetAnimation");
        AbstractC3292y.i(expand, "expand");
        AbstractC3292y.i(shrink, "shrink");
        AbstractC3292y.i(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }

    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final Function1 getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo133measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        long m5289getZeronOccac;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        long IntSize = IntSizeKt.IntSize(mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight());
        long m5325unboximpl = this.sizeAnimation.animate(this.sizeTransitionSpec, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue().m5325unboximpl();
        long m5288unboximpl = this.offsetAnimation.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue().m5288unboximpl();
        Alignment alignment = this.currentAlignment;
        if (alignment != null) {
            m5289getZeronOccac = alignment.mo2585alignKFBX0sM(IntSize, m5325unboximpl, LayoutDirection.Ltr);
        } else {
            m5289getZeronOccac = IntOffset.Companion.m5289getZeronOccac();
        }
        return MeasureScope.CC.q(measure, IntSize.m5321getWidthimpl(m5325unboximpl), IntSize.m5320getHeightimpl(m5325unboximpl), null, new ExpandShrinkModifier$measure$1(mo4108measureBRTryo0, m5289getZeronOccac, m5288unboximpl), 4, null);
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m154sizeByStateUzc_VyU(EnterExitState targetState, long j8) {
        long j9;
        long j10;
        AbstractC3292y.i(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        if (value != null) {
            j9 = ((IntSize) value.getSize().invoke(IntSize.m5313boximpl(j8))).m5325unboximpl();
        } else {
            j9 = j8;
        }
        ChangeSize value2 = this.shrink.getValue();
        if (value2 != null) {
            j10 = ((IntSize) value2.getSize().invoke(IntSize.m5313boximpl(j8))).m5325unboximpl();
        } else {
            j10 = j8;
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return j10;
                }
                throw new p();
            }
            return j9;
        }
        return j8;
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m155targetOffsetByStateoFUgxo0(EnterExitState targetState, long j8) {
        AbstractC3292y.i(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m5289getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.Companion.m5289getZeronOccac();
        }
        if (AbstractC3292y.d(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.Companion.m5289getZeronOccac();
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    ChangeSize value = this.shrink.getValue();
                    if (value != null) {
                        long m5325unboximpl = ((IntSize) value.getSize().invoke(IntSize.m5313boximpl(j8))).m5325unboximpl();
                        Alignment value2 = this.alignment.getValue();
                        AbstractC3292y.f(value2);
                        Alignment alignment = value2;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo2585alignKFBX0sM = alignment.mo2585alignKFBX0sM(j8, m5325unboximpl, layoutDirection);
                        Alignment alignment2 = this.currentAlignment;
                        AbstractC3292y.f(alignment2);
                        long mo2585alignKFBX0sM2 = alignment2.mo2585alignKFBX0sM(j8, m5325unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(mo2585alignKFBX0sM) - IntOffset.m5279getXimpl(mo2585alignKFBX0sM2), IntOffset.m5280getYimpl(mo2585alignKFBX0sM) - IntOffset.m5280getYimpl(mo2585alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m5289getZeronOccac();
                }
                throw new p();
            }
            return IntOffset.Companion.m5289getZeronOccac();
        }
        return IntOffset.Companion.m5289getZeronOccac();
    }
}
