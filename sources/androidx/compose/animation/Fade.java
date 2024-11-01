package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Fade {
    private final float alpha;
    private final FiniteAnimationSpec<Float> animationSpec;

    public Fade(float f8, FiniteAnimationSpec<Float> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        this.alpha = f8;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fade copy$default(Fade fade, float f8, FiniteAnimationSpec finiteAnimationSpec, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = fade.alpha;
        }
        if ((i8 & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f8, finiteAnimationSpec);
    }

    public final float component1() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> component2() {
        return this.animationSpec;
    }

    public final Fade copy(float f8, FiniteAnimationSpec<Float> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new Fade(f8, animationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.alpha, fade.alpha) == 0 && AbstractC3292y.d(this.animationSpec, fade.animationSpec);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
