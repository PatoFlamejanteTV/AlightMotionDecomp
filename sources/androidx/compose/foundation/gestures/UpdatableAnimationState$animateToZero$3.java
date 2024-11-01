package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$3(UpdatableAnimationState updatableAnimationState, float f8, Function1 function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f8;
        this.$beforeFrame = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return I.f8786a;
    }

    public final void invoke(long j8) {
        long j9;
        long j10;
        long f8;
        UpdatableAnimationState.Companion companion;
        UpdatableAnimationState.Companion companion2;
        AnimationVector1D animationVector1D;
        UpdatableAnimationState.Companion companion3;
        UpdatableAnimationState.Companion companion4;
        AnimationVector1D animationVector1D2;
        UpdatableAnimationState.Companion companion5;
        UpdatableAnimationState.Companion companion6;
        AnimationVector1D animationVector1D3;
        j9 = this.this$0.lastFrameTime;
        if (j9 == Long.MIN_VALUE) {
            this.this$0.lastFrameTime = j8;
        }
        AnimationVector1D animationVector1D4 = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            companion5 = UpdatableAnimationState.Companion;
            VectorizedSpringSpec<AnimationVector1D> rebasableAnimationSpec = companion5.getRebasableAnimationSpec();
            AnimationVector1D animationVector1D5 = new AnimationVector1D(this.this$0.getValue());
            companion6 = UpdatableAnimationState.Companion;
            AnimationVector1D zeroVector = companion6.getZeroVector();
            animationVector1D3 = this.this$0.lastVelocity;
            f8 = rebasableAnimationSpec.getDurationNanos(animationVector1D5, zeroVector, animationVector1D3);
        } else {
            j10 = this.this$0.lastFrameTime;
            f8 = AbstractC2829a.f(((float) (j8 - j10)) / this.$durationScale);
        }
        long j11 = f8;
        companion = UpdatableAnimationState.Companion;
        VectorizedSpringSpec<AnimationVector1D> rebasableAnimationSpec2 = companion.getRebasableAnimationSpec();
        companion2 = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector2 = companion2.getZeroVector();
        animationVector1D = this.this$0.lastVelocity;
        float value = rebasableAnimationSpec2.getValueFromNanos(j11, animationVector1D4, zeroVector2, animationVector1D).getValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        companion3 = UpdatableAnimationState.Companion;
        VectorizedSpringSpec<AnimationVector1D> rebasableAnimationSpec3 = companion3.getRebasableAnimationSpec();
        companion4 = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector3 = companion4.getZeroVector();
        animationVector1D2 = this.this$0.lastVelocity;
        updatableAnimationState.lastVelocity = rebasableAnimationSpec3.getVelocityFromNanos(j11, animationVector1D4, zeroVector3, animationVector1D2);
        this.this$0.lastFrameTime = j8;
        float value2 = this.this$0.getValue() - value;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(value2));
    }
}
