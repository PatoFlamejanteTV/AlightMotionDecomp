package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t8) {
        if (t8 == null) {
            return null;
        }
        return (V) twoWayConverter.getConvertToVector().invoke(t8);
    }

    @Stable
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec(animation, repeatMode, StartOffset.m209constructorimpl$default(0, 0, 2, null), (AbstractC3284p) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m187infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j8) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec<>(animation, repeatMode, j8, (AbstractC3284p) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m188infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i8 & 4) != 0) {
            j8 = StartOffset.m209constructorimpl$default(0, 0, 2, null);
        }
        return m187infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j8);
    }

    @Stable
    public static final <T> KeyframesSpec<T> keyframes(Function1 init) {
        AbstractC3292y.i(init, "init");
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        init.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    public static final /* synthetic */ RepeatableSpec repeatable(int i8, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        return new RepeatableSpec(i8, animation, repeatMode, StartOffset.m209constructorimpl$default(0, 0, 2, null), (AbstractC3284p) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i8, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i8, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m189repeatable91I0pcU(int i8, DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j8) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        return new RepeatableSpec<>(i8, animation, repeatMode, j8, (AbstractC3284p) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m190repeatable91I0pcU$default(int i8, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i9 & 8) != 0) {
            j8 = StartOffset.m209constructorimpl$default(0, 0, 2, null);
        }
        return m189repeatable91I0pcU(i8, durationBasedAnimationSpec, repeatMode, j8);
    }

    @Stable
    public static final <T> SnapSpec<T> snap(int i8) {
        return new SnapSpec<>(i8);
    }

    public static /* synthetic */ SnapSpec snap$default(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return snap(i8);
    }

    @Stable
    public static final <T> SpringSpec<T> spring(float f8, float f9, T t8) {
        return new SpringSpec<>(f8, f9, t8);
    }

    public static /* synthetic */ SpringSpec spring$default(float f8, float f9, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1500.0f;
        }
        if ((i8 & 4) != 0) {
            obj = null;
        }
        return spring(f8, f9, obj);
    }

    @Stable
    public static final <T> TweenSpec<T> tween(int i8, int i9, Easing easing) {
        AbstractC3292y.i(easing, "easing");
        return new TweenSpec<>(i8, i9, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i8, int i9, Easing easing, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 300;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i8, i9, easing);
    }
}
