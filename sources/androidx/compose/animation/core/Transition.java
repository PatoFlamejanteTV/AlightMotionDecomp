package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final MutableLongState playTimeNanos$delegate;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final MutableTransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    @InternalAnimationApi
    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate;
        private final String label;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private Function1 targetValueByState;
            final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;
            private Function1 transitionSpec;

            public DeferredAnimationData(DeferredAnimation deferredAnimation, Transition<S>.TransitionAnimationState<T, V> animation, Function1 transitionSpec, Function1 targetValueByState) {
                AbstractC3292y.i(animation, "animation");
                AbstractC3292y.i(transitionSpec, "transitionSpec");
                AbstractC3292y.i(targetValueByState, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = animation;
                this.transitionSpec = transitionSpec;
                this.targetValueByState = targetValueByState;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final Function1 getTargetValueByState() {
                return this.targetValueByState;
            }

            public final Function1 getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(Function1 function1) {
                AbstractC3292y.i(function1, "<set-?>");
                this.targetValueByState = function1;
            }

            public final void setTransitionSpec(Function1 function1) {
                AbstractC3292y.i(function1, "<set-?>");
                this.transitionSpec = function1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void updateAnimationStates(Segment<S> segment) {
                AbstractC3292y.i(segment, "segment");
                Object invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (this.this$0.this$0.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateTargetValue$animation_core_release(invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(Transition transition, TwoWayConverter<T, V> typeConverter, String label) {
            MutableState mutableStateOf$default;
            AbstractC3292y.i(typeConverter, "typeConverter");
            AbstractC3292y.i(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.data$delegate = mutableStateOf$default;
        }

        public final State<T> animate(Function1 transitionSpec, Function1 targetValueByState) {
            AbstractC3292y.i(transitionSpec, "transitionSpec");
            AbstractC3292y.i(targetValueByState, "targetValueByState");
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = this.this$0;
                data$animation_core_release = new DeferredAnimationData<>(this, new TransitionAnimationState(transition, targetValueByState.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, targetValueByState.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition<S> transition2 = this.this$0;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = this.this$0;
            data$animation_core_release.setTargetValueByState(targetValueByState);
            data$animation_core_release.setTransitionSpec(transitionSpec);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = this.this$0;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec) data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface Segment<S> {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s8, S s9) {
                boolean a9;
                a9 = e.a(segment, s8, s9);
                return a9;
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s8, S s9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s8, S s9) {
            this.initialState = s8;
            this.targetState = s9;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (AbstractC3292y.d(getInitialState(), segment.getInitialState()) && AbstractC3292y.d(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            int i8;
            S initialState = getInitialState();
            int i9 = 0;
            if (initialState != null) {
                i8 = initialState.hashCode();
            } else {
                i8 = 0;
            }
            int i10 = i8 * 31;
            S targetState = getTargetState();
            if (targetState != null) {
                i9 = targetState.hashCode();
            }
            return i10 + i9;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return e.a(this, obj, obj2);
        }
    }

    @Stable
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private final String label;
        private final MutableState needsReset$delegate;
        private final MutableLongState offsetTimeNanos$delegate;
        private final MutableState targetValue$delegate;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(Transition transition, T t8, V initialVelocityVector, TwoWayConverter<T, V> typeConverter, String label) {
            MutableState mutableStateOf$default;
            MutableState mutableStateOf$default2;
            MutableState mutableStateOf$default3;
            MutableState mutableStateOf$default4;
            MutableState mutableStateOf$default5;
            MutableState mutableStateOf$default6;
            Object obj;
            AbstractC3292y.i(initialVelocityVector, "initialVelocityVector");
            AbstractC3292y.i(typeConverter, "typeConverter");
            AbstractC3292y.i(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            this.targetValue$delegate = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animationSpec$delegate = mutableStateOf$default2;
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), typeConverter, t8, getTargetValue(), initialVelocityVector), null, 2, null);
            this.animation$delegate = mutableStateOf$default3;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.isFinished$delegate = mutableStateOf$default4;
            this.offsetTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.needsReset$delegate = mutableStateOf$default5;
            mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            this.value$delegate = mutableStateOf$default6;
            this.velocityVector = initialVelocityVector;
            Float f8 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(typeConverter);
            if (f8 != null) {
                float floatValue = f8.floatValue();
                AnimationVector animationVector = (AnimationVector) typeConverter.getConvertToVector().invoke(t8);
                int size$animation_core_release = animationVector.getSize$animation_core_release();
                for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                    animationVector.set$animation_core_release(i8, floatValue);
                }
                obj = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                obj = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, obj, 3, null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset$delegate.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return this.offsetTimeNanos$delegate.getLongValue();
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z8) {
            this.needsReset$delegate.setValue(Boolean.valueOf(z8));
        }

        private final void setOffsetTimeNanos(long j8) {
            this.offsetTimeNanos$delegate.setLongValue(j8);
        }

        private final void setTargetValue(T t8) {
            this.targetValue$delegate.setValue(t8);
        }

        private final void updateAnimation(T t8, boolean z8) {
            FiniteAnimationSpec<T> animationSpec;
            if (z8) {
                if (getAnimationSpec() instanceof SpringSpec) {
                    animationSpec = getAnimationSpec();
                } else {
                    animationSpec = this.interruptionSpec;
                }
            } else {
                animationSpec = getAnimationSpec();
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t8, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z8, int i8, Object obj2) {
            if ((i8 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            transitionAnimationState.updateAnimation(obj, z8);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j8, float f8) {
            long durationNanos;
            if (f8 > 0.0f) {
                float offsetTimeNanos = ((float) (j8 - getOffsetTimeNanos())) / f8;
                if (!Float.isNaN(offsetTimeNanos)) {
                    durationNanos = offsetTimeNanos;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f8 + ",playTimeNanos: " + j8 + ", offsetTimeNanos: " + getOffsetTimeNanos()).toString());
                }
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long j8) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j8));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j8);
        }

        public final void setFinished$animation_core_release(boolean z8) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z8));
        }

        public void setValue$animation_core_release(T t8) {
            this.value$delegate.setValue(t8);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t8, T t9, FiniteAnimationSpec<T> animationSpec) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            setTargetValue(t9);
            setAnimationSpec(animationSpec);
            if (AbstractC3292y.d(getAnimation().getInitialValue(), t8) && AbstractC3292y.d(getAnimation().getTargetValue(), t9)) {
                return;
            }
            updateAnimation$default(this, t8, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T t8, FiniteAnimationSpec<T> animationSpec) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            if (!AbstractC3292y.d(getTargetValue(), t8) || getNeedsReset()) {
                setTargetValue(t8);
                setAnimationSpec(animationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    public Transition(MutableTransitionState<S> transitionState, String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        AbstractC3292y.i(transitionState, "transitionState");
        this.transitionState = transitionState;
        this.label = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.targetState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.segment$delegate = mutableStateOf$default2;
        this.playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.updateChildrenNeeded$delegate = mutableStateOf$default3;
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isSeeking$delegate = mutableStateOf$default4;
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    private final long getStartTimeNanos() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long j8 = 0;
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
                j8 = Math.max(j8, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setStartTimeNanos(long j8) {
        this.startTimeNanos$delegate.setLongValue(j8);
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> animation) {
        AbstractC3292y.i(animation, "animation");
        return this._animations.add(animation);
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        AbstractC3292y.i(transition, "transition");
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s8, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(s8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i9, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:425)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s8, startRestartGroup, i9 & 126);
                if (!AbstractC3292y.d(s8, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    int i12 = (i9 >> 3) & 14;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(this);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new Transition$animateTo$1$1(this, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (InterfaceC2072n) rememberedValue, startRestartGroup, i12 | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$animateTo$2(this, s8, i8));
        }
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final long getPlayTimeNanos() {
        return this.playTimeNanos$delegate.getLongValue();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        if (getStartTimeNanos() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j8, float f8) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j8);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j8 - getStartTimeNanos());
        boolean z8 = true;
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f8);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z8 = false;
            }
        }
        for (Transition<?> transition : this._transitions) {
            if (!AbstractC3292y.d(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), f8);
            }
            if (!AbstractC3292y.d(transition.getTargetState(), transition.getCurrentState())) {
                z8 = false;
            }
        }
        if (z8) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j8) {
        setStartTimeNanos(j8);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> animation) {
        AbstractC3292y.i(animation, "animation");
        this._animations.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        AbstractC3292y.i(transition, "transition");
        return this._transitions.remove(transition);
    }

    public final void seek(S s8, S s9, long j8) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !AbstractC3292y.d(getCurrentState(), s8) || !AbstractC3292y.d(getTargetState(), s9)) {
            setCurrentState$animation_core_release(s8);
            setTargetState$animation_core_release(s9);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s8, s9));
        }
        for (Transition<?> transition : this._transitions) {
            AbstractC3292y.g(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j8);
            }
        }
        Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
        while (it.hasNext()) {
            it.next().seekTo$animation_core_release(j8);
        }
        this.lastSeekedTimeNanos = j8;
    }

    public final void setCurrentState$animation_core_release(S s8) {
        this.transitionState.setCurrentState$animation_core_release(s8);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j8) {
        this.lastSeekedTimeNanos = j8;
    }

    public final void setPlayTimeNanos(long j8) {
        this.playTimeNanos$delegate.setLongValue(j8);
    }

    public final void setSeeking$animation_core_release(boolean z8) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setTargetState$animation_core_release(S s8) {
        this.targetState$delegate.setValue(s8);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z8) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z8));
    }

    @Composable
    public final void updateTarget$animation_core_release(S s8, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(s8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i8, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:400)");
            }
            if (!isSeeking() && !AbstractC3292y.d(getTargetState(), s8)) {
                setSegment(new SegmentImpl(getTargetState(), s8));
                setCurrentState$animation_core_release(getTargetState());
                setTargetState$animation_core_release(s8);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
                while (it.hasNext()) {
                    it.next().resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$updateTarget$2(this, s8, i8));
        }
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        AbstractC3292y.i(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i8, AbstractC3284p abstractC3284p) {
        this(mutableTransitionState, (i8 & 2) != 0 ? null : str);
    }

    public Transition(S s8, String str) {
        this(new MutableTransitionState(s8), str);
    }
}
