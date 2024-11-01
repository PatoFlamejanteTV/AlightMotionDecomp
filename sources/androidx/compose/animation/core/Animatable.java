package androidx.compose.animation.core;

import Q5.I;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    public Animatable(T t8, TwoWayConverter<T, V> typeConverter, T t9, String label) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(label, "label");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = t9;
        this.label = label;
        this.internalState = new AnimationState<>(typeConverter, t8, null, 0L, 0L, false, 60, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.targetValue$delegate = mutableStateOf$default2;
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t9, 3, null);
        V createVector = createVector(t8, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = createVector;
        V createVector2 = createVector(t8, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = createVector2;
        this.lowerBoundVector = createVector;
        this.upperBoundVector = createVector2;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, U5.d dVar, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, U5.d dVar, int i8, Object obj3) {
        if ((i8 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T t8 = obj2;
        if ((i8 & 4) != 0) {
            t8 = animatable.getVelocity();
        }
        T t9 = t8;
        if ((i8 & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t9, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t8) {
        if (AbstractC3292y.d(this.lowerBoundVector, this.negativeInfinityBounds) && AbstractC3292y.d(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t8;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t8);
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        boolean z8 = false;
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            if (animationVector.get$animation_core_release(i8) < this.lowerBoundVector.get$animation_core_release(i8) || animationVector.get$animation_core_release(i8) > this.upperBoundVector.get$animation_core_release(i8)) {
                animationVector.set$animation_core_release(i8, m.j(animationVector.get$animation_core_release(i8), this.lowerBoundVector.get$animation_core_release(i8), this.upperBoundVector.get$animation_core_release(i8)));
                z8 = true;
            }
        }
        if (z8) {
            return (T) this.typeConverter.getConvertFromVector().invoke(animationVector);
        }
        return t8;
    }

    private final V createVector(T t8, float f8) {
        V v8 = (V) this.typeConverter.getConvertToVector().invoke(t8);
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            v8.set$animation_core_release(i8, f8);
        }
        return v8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t8, Function1 function1, U5.d dVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t8, animation, this.internalState.getLastFrameTimeNanos(), function1, null), dVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z8) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t8) {
        this.targetValue$delegate.setValue(t8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i8 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t8, DecayAnimationSpec<T> decayAnimationSpec, Function1 function1, U5.d dVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t8)), t8, function1, dVar);
    }

    public final Object animateTo(T t8, AnimationSpec<T> animationSpec, T t9, Function1 function1, U5.d dVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t8, t9), t9, function1, dVar);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(T t8, U5.d dVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t8, null), dVar, 1, null);
        if (mutate$default == V5.b.e()) {
            return mutate$default;
        }
        return I.f8786a;
    }

    public final Object stop(U5.d dVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), dVar, 1, null);
        if (mutate$default == V5.b.e()) {
            return mutate$default;
        }
        return I.f8786a;
    }

    public final void updateBounds(T t8, T t9) {
        V v8;
        V v9;
        if (t8 == null || (v8 = (V) this.typeConverter.getConvertToVector().invoke(t8)) == null) {
            v8 = this.negativeInfinityBounds;
        }
        if (t9 == null || (v9 = (V) this.typeConverter.getConvertToVector().invoke(t9)) == null) {
            v9 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            if (v8.get$animation_core_release(i8) > v9.get$animation_core_release(i8)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v8 + " is greater than upper bound " + v9 + " on index " + i8).toString());
            }
        }
        this.lowerBoundVector = v8;
        this.upperBoundVector = v9;
        this.upperBound = t9;
        this.lowerBound = t8;
        if (!isRunning()) {
            T clampToBounds = clampToBounds(getValue());
            if (!AbstractC3292y.d(clampToBounds, getValue())) {
                this.internalState.setValue$animation_core_release(clampToBounds);
            }
        }
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i8, AbstractC3284p abstractC3284p) {
        this(obj, twoWayConverter, (i8 & 4) != 0 ? null : obj2, (i8 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i8, AbstractC3284p abstractC3284p) {
        this(obj, twoWayConverter, (i8 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        AbstractC3292y.i(typeConverter, "typeConverter");
    }
}
