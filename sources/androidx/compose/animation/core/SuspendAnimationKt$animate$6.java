package androidx.compose.animation.core;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TV; */
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$6 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1 $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ AnimationVector $initialVelocityVector;
    final /* synthetic */ T $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnimationState<T, V> animationState) {
            super(0);
            this.$this_animate = animationState;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m226invoke() {
            this.$this_animate.setRunning$animation_core_release(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m226invoke();
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/T;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;FLkotlin/jvm/functions/Function1;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$6(T t8, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f8, Function1 function1) {
        super(1);
        this.$lateInitScope = t8;
        this.$initialValue = obj;
        this.$animation = animation;
        this.$initialVelocityVector = animationVector;
        this.$this_animate = animationState;
        this.$durationScale = f8;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return I.f8786a;
    }

    public final void invoke(long j8) {
        T t8 = this.$lateInitScope;
        AnimationScope animationScope = new AnimationScope(this.$initialValue, this.$animation.getTypeConverter(), this.$initialVelocityVector, j8, this.$animation.getTargetValue(), j8, true, new AnonymousClass1(this.$this_animate));
        SuspendAnimationKt.doAnimationFrameWithScale(animationScope, j8, this.$durationScale, this.$animation, this.$this_animate, this.$block);
        t8.f34573a = animationScope;
    }
}
