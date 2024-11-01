package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AnimationResult<T, V extends AnimationVector> {
    private final AnimationState<T, V> currentAnimationState;
    private final T remainingOffset;

    public AnimationResult(T t8, AnimationState<T, V> currentAnimationState) {
        AbstractC3292y.i(currentAnimationState, "currentAnimationState");
        this.remainingOffset = t8;
        this.currentAnimationState = currentAnimationState;
    }

    public final T component1() {
        return this.remainingOffset;
    }

    public final AnimationState<T, V> component2() {
        return this.currentAnimationState;
    }

    public final AnimationState<T, V> getCurrentAnimationState() {
        return this.currentAnimationState;
    }

    public final T getRemainingOffset() {
        return this.remainingOffset;
    }
}
