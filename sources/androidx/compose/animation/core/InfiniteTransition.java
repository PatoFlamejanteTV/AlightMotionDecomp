package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations;
    private final MutableState isRunning$delegate;
    private final String label;
    private final MutableState refreshChildNeeded$delegate;
    private long startTimeNanos;

    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t8, T t9, TwoWayConverter<T, V> typeConverter, AnimationSpec<T> animationSpec, String label) {
            MutableState mutableStateOf$default;
            AbstractC3292y.i(typeConverter, "typeConverter");
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(label, "label");
            this.this$0 = infiniteTransition;
            this.initialValue = t8;
            this.targetValue = t9;
            this.typeConverter = typeConverter;
            this.label = label;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            this.value$delegate = mutableStateOf$default;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(this.animationSpec, typeConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (AbstractC3284p) null);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core_release(long j8) {
            this.this$0.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j8;
            }
            long j9 = j8 - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j9));
            this.isFinished = this.animation.isFinishedFromNanos(j9);
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation$animation_core_release(TargetBasedAnimation<T, V> targetBasedAnimation) {
            AbstractC3292y.i(targetBasedAnimation, "<set-?>");
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z8) {
            this.isFinished = z8;
        }

        public final void setInitialValue$animation_core_release(T t8) {
            this.initialValue = t8;
        }

        public final void setTargetValue$animation_core_release(T t8) {
            this.targetValue = t8;
        }

        public void setValue$animation_core_release(T t8) {
            this.value$delegate.setValue(t8);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues$animation_core_release(T t8, T t9, AnimationSpec<T> animationSpec) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            this.initialValue = t8;
            this.targetValue = t9;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t8, t9, (AnimationVector) null, 16, (AbstractC3284p) null);
            this.this$0.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(String label) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(label, "label");
        this.label = label;
        this._animations = new MutableVector<>(new TransitionAnimationState[16], 0);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.refreshChildNeeded$delegate = mutableStateOf$default;
        this.startTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j8) {
        boolean z8;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            int i8 = 0;
            z8 = true;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i8];
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j8);
                }
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    z8 = false;
                }
                i8++;
            } while (i8 < size);
        } else {
            z8 = true;
        }
        setRunning(!z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z8) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z8));
    }

    private final void setRunning(boolean z8) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> animation) {
        AbstractC3292y.i(animation, "animation");
        this._animations.add(animation);
        setRefreshChildNeeded(true);
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> animation) {
        AbstractC3292y.i(animation, "animation");
        this._animations.remove(animation);
    }

    @Composable
    public final void run$animation_core_release(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318043801, i8, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(mutableState, this, null), startRestartGroup, 72);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new InfiniteTransition$run$2(this, i8));
        }
    }
}
