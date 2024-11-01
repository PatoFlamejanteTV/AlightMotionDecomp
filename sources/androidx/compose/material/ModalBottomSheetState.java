package androidx.compose.material;

import Q5.I;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState {
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;
    private final AnimationSpec<Float> animationSpec;
    private Density density;
    private final boolean isSkipHalfExpanded;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<ModalBottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1 confirmValueChange, boolean z8, Density density) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(confirmValueChange, "confirmValueChange");
            AbstractC3292y.i(density, "density");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(density, animationSpec, confirmValueChange, z8));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final Saver<ModalBottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1 confirmValueChange, boolean z8) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$3.INSTANCE, new ModalBottomSheetState$Companion$Saver$4(animationSpec, confirmValueChange, z8));
        }

        public final Saver<ModalBottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, boolean z8, Function1 confirmStateChange) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, confirmStateChange, z8);
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, boolean z8, Function1 confirmStateChange) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z8;
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new ModalBottomSheetState$anchoredDraggableState$1(this), new ModalBottomSheetState$anchoredDraggableState$2(this), animationSpec, confirmStateChange);
        if (z8 && initialValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f8, d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f8, dVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + this + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    public final Object animateTo$material_release(ModalBottomSheetValue modalBottomSheetValue, float f8, d dVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f8, dVar);
        if (animateTo == V5.b.e()) {
            return animateTo;
        }
        return I.f8786a;
    }

    public final Object expand$material_release(d dVar) {
        AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState = this.anchoredDraggableState;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!anchoredDraggableState.hasAnchorForValue(modalBottomSheetValue)) {
            return I.f8786a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, null);
        if (animateTo$material_release$default == V5.b.e()) {
            return animateTo$material_release$default;
        }
        return I.f8786a;
    }

    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material_release() {
        return this.density;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.hasAnchorForValue(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getLastVelocity$material_release() {
        return this.anchoredDraggableState.getLastVelocity();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final Object halfExpand$material_release(d dVar) {
        if (!getHasHalfExpandedState$material_release()) {
            return I.f8786a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, dVar, 2, null);
        if (animateTo$material_release$default == V5.b.e()) {
            return animateTo$material_release$default;
        }
        return I.f8786a;
    }

    public final Object hide(d dVar) {
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, dVar, 2, null);
        if (animateTo$material_release$default == V5.b.e()) {
            return animateTo$material_release$default;
        }
        return I.f8786a;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        if (this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden) {
            return true;
        }
        return false;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(Density density) {
        this.density = density;
    }

    public final Object show(d dVar) {
        ModalBottomSheetValue modalBottomSheetValue;
        if (getHasHalfExpandedState$material_release()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, null);
        if (animateTo$material_release$default == V5.b.e()) {
            return animateTo$material_release$default;
        }
        return I.f8786a;
    }

    public final Object snapTo$material_release(ModalBottomSheetValue modalBottomSheetValue, d dVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, dVar);
        if (snapTo == V5.b.e()) {
            return snapTo;
        }
        return I.f8786a;
    }

    public final boolean trySnapTo$material_release(ModalBottomSheetValue target) {
        AbstractC3292y.i(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z8, Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this(modalBottomSheetValue, (i8 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i8 & 4) != 0 ? false : z8, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
    }
}
