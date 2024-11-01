package androidx.compose.animation.core;

import Q5.I;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    public static final Object animate(float f8, float f9, float f10, AnimationSpec<Float> animationSpec, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object animate = animate(VectorConvertersKt.getVectorConverter(r.f34602a), kotlin.coroutines.jvm.internal.b.b(f8), kotlin.coroutines.jvm.internal.b.b(f9), kotlin.coroutines.jvm.internal.b.b(f10), animationSpec, interfaceC2072n, dVar);
        return animate == V5.b.e() ? animate : I.f8786a;
    }

    public static /* synthetic */ Object animate$default(float f8, float f9, float f10, AnimationSpec animationSpec, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        float f11 = (i8 & 4) != 0 ? 0.0f : f10;
        if ((i8 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f8, f9, f11, animationSpec, interfaceC2072n, dVar);
    }

    public static final Object animateDecay(float f8, float f9, FloatDecayAnimationSpec floatDecayAnimationSpec, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f8, f9, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f8, f9), 0L, new SuspendAnimationKt$animateDecay$2(interfaceC2072n), dVar, 2, null);
        return animate$default == V5.b.e() ? animate$default : I.f8786a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z8, Function1 function1, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            function1 = SuspendAnimationKt$animateDecay$4.INSTANCE;
        }
        return animateDecay(animationState, decayAnimationSpec, z8, function1, dVar);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t8, AnimationSpec<T> animationSpec, boolean z8, Function1 function1, U5.d dVar) {
        long j8;
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t8, animationState.getVelocityVector());
        if (z8) {
            j8 = animationState.getLastFrameTimeNanos();
        } else {
            j8 = Long.MIN_VALUE;
        }
        Object animate = animate(animationState, targetBasedAnimation, j8, function1, dVar);
        if (animate == V5.b.e()) {
            return animate;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z8, Function1 function1, U5.d dVar, int i8, Object obj2) {
        boolean z9;
        if ((i8 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i8 & 4) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 8) != 0) {
            function1 = SuspendAnimationKt$animateTo$2.INSTANCE;
        }
        return animateTo(animationState, obj, animationSpec2, z9, function1, dVar);
    }

    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, Function1 function1, U5.d dVar) {
        if (animation.isInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, dVar);
        }
        return MonotonicFrameClockKt.withFrameNanos(new SuspendAnimationKt$callWithFrameNanos$2(function1), dVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j8, long j9, Animation<T, V> animation, AnimationState<T, V> animationState, Function1 function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j8);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j9));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j9));
        if (animation.isFinishedFromNanos(j9)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j8, float f8, Animation<T, V> animation, AnimationState<T, V> animationState, Function1 function1) {
        long startTimeNanos;
        if (f8 == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = ((float) (j8 - animationScope.getStartTimeNanos())) / f8;
        }
        doAnimationFrame(animationScope, j8, startTimeNanos, animation, animationState, function1);
    }

    public static final float getDurationScale(U5.g gVar) {
        float f8;
        AbstractC3292y.i(gVar, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        if (motionDurationScale != null) {
            f8 = motionDurationScale.getScaleFactor();
        } else {
            f8 = 1.0f;
        }
        if (f8 >= 0.0f) {
            return f8;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> state) {
        AbstractC3292y.i(animationScope, "<this>");
        AbstractC3292y.i(state, "state");
        state.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(state.getVelocityVector(), animationScope.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z8, Function1 function1, U5.d dVar) {
        Object animate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) animationState.getTypeConverter(), (Object) animationState.getValue(), (AnimationVector) animationState.getVelocityVector()), z8 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, dVar);
        return animate == V5.b.e() ? animate : I.f8786a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j8, Function1 function1, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j8;
        if ((i8 & 4) != 0) {
            function1 = SuspendAnimationKt$animate$5.INSTANCE;
        }
        return animate(animationState, animation, j9, function1, dVar);
    }

    public static final <T, V extends AnimationVector> Object animate(TwoWayConverter<T, V> twoWayConverter, T t8, T t9, T t10, AnimationSpec<T> animationSpec, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        AnimationVector newInstance;
        if (t10 == null || (newInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t10)) == null) {
            newInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t8));
        }
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t8, newInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t8, t9, newInstance), 0L, new SuspendAnimationKt$animate$3(interfaceC2072n, twoWayConverter), dVar, 2, null);
        return animate$default == V5.b.e() ? animate$default : I.f8786a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[Catch: CancellationException -> 0x0045, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0045, blocks: (B:13:0x0041, B:16:0x00e6, B:18:0x00f3), top: B:12:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(androidx.compose.animation.core.AnimationState<T, V> r25, androidx.compose.animation.core.Animation<T, V> r26, long r27, kotlin.jvm.functions.Function1 r29, U5.d r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }
}
