package androidx.compose.foundation.gestures.snapping;

import U5.d;
import V5.b;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LowVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final Density density;
    private final SnapLayoutInfoProvider layoutInfoProvider;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;

    public LowVelocityApproachAnimation(AnimationSpec<Float> lowVelocityAnimationSpec, SnapLayoutInfoProvider layoutInfoProvider, Density density) {
        AbstractC3292y.i(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        AbstractC3292y.i(layoutInfoProvider, "layoutInfoProvider");
        AbstractC3292y.i(density, "density");
        this.lowVelocityAnimationSpec = lowVelocityAnimationSpec;
        this.layoutInfoProvider = layoutInfoProvider;
        this.density = density;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f8, Float f9, Function1 function1, d dVar) {
        return approachAnimation(scrollScope, f8.floatValue(), f9.floatValue(), function1, dVar);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f8, float f9, Function1 function1, d dVar) {
        Object access$animateSnap = SnapFlingBehaviorKt.access$animateSnap(scrollScope, (Math.abs(f8) + this.layoutInfoProvider.calculateSnapStepSize(this.density)) * Math.signum(f9), f8, AnimationStateKt.AnimationState$default(0.0f, f9, 0L, 0L, false, 28, null), this.lowVelocityAnimationSpec, function1, dVar);
        return access$animateSnap == b.e() ? access$animateSnap : (AnimationResult) access$animateSnap;
    }
}
