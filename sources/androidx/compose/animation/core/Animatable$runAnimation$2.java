package androidx.compose.animation.core;

import Q5.I;
import Q5.t;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends l implements Function1 {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1 $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ O $clampingNeeded;
        final /* synthetic */ AnimationState<T, V> $endState;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<T, V> animatable, AnimationState<T, V> animationState, Function1 function1, O o8) {
            super(1);
            this.this$0 = animatable;
            this.$endState = animationState;
            this.$block = function1;
            this.$clampingNeeded = o8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope) obj);
            return I.f8786a;
        }

        public final void invoke(AnimationScope<T, V> animate) {
            Object clampToBounds;
            AbstractC3292y.i(animate, "$this$animate");
            SuspendAnimationKt.updateState(animate, this.this$0.getInternalState$animation_core_release());
            clampToBounds = this.this$0.clampToBounds(animate.getValue());
            if (!AbstractC3292y.d(clampToBounds, animate.getValue())) {
                this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                this.$endState.setValue$animation_core_release(clampToBounds);
                Function1 function1 = this.$block;
                if (function1 != null) {
                    function1.invoke(this.this$0);
                }
                animate.cancelAnimation();
                this.$clampingNeeded.f34569a = true;
                return;
            }
            Function1 function12 = this.$block;
            if (function12 != null) {
                function12.invoke(this.this$0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t8, Animation<T, V> animation, long j8, Function1 function1, U5.d dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$initialVelocity = t8;
        this.$animation = animation;
        this.$startTime = j8;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(U5.d dVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(U5.d dVar) {
        return ((Animatable$runAnimation$2) create(dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        O o8;
        AnimationEndReason animationEndReason;
        Object e8 = V5.b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    o8 = (O) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                AnimationState copy$default = AnimationStateKt.copy$default(this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                O o9 = new O();
                Animation<T, V> animation = this.$animation;
                long j8 = this.$startTime;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, copy$default, this.$block, o9);
                this.L$0 = copy$default;
                this.L$1 = o9;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j8, anonymousClass1, this) == e8) {
                    return e8;
                }
                animationState = copy$default;
                o8 = o9;
            }
            if (o8.f34569a) {
                animationEndReason = AnimationEndReason.BoundReached;
            } else {
                animationEndReason = AnimationEndReason.Finished;
            }
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e9) {
            this.this$0.endAnimation();
            throw e9;
        }
    }
}
