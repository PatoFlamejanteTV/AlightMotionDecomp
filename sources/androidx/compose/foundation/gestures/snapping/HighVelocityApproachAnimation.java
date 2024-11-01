package androidx.compose.foundation.gestures.snapping;

import U5.d;
import V5.b;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HighVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public HighVelocityApproachAnimation(DecayAnimationSpec<Float> decayAnimationSpec) {
        AbstractC3292y.i(decayAnimationSpec, "decayAnimationSpec");
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f8, Float f9, Function1 function1, d dVar) {
        return approachAnimation(scrollScope, f8.floatValue(), f9.floatValue(), function1, dVar);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f8, float f9, Function1 function1, d dVar) {
        Object access$animateDecay = SnapFlingBehaviorKt.access$animateDecay(scrollScope, f8, AnimationStateKt.AnimationState$default(0.0f, f9, 0L, 0L, false, 28, null), this.decayAnimationSpec, function1, dVar);
        return access$animateDecay == b.e() ? access$animateDecay : (AnimationResult) access$animateDecay;
    }
}
