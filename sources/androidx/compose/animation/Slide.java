package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Slide {
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final Function1 slideOffset;

    public Slide(Function1 slideOffset, FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(slideOffset, "slideOffset");
        AbstractC3292y.i(animationSpec, "animationSpec");
        this.slideOffset = slideOffset;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = slide.slideOffset;
        }
        if ((i8 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(function1, finiteAnimationSpec);
    }

    public final Function1 component1() {
        return this.slideOffset;
    }

    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    public final Slide copy(Function1 slideOffset, FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(slideOffset, "slideOffset");
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new Slide(slideOffset, animationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return AbstractC3292y.d(this.slideOffset, slide.slideOffset) && AbstractC3292y.d(this.animationSpec, slide.animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1 getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
