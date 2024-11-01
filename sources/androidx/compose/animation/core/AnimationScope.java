package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private long finishedTimeNanos;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final Function0 onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationScope(T t8, TwoWayConverter<T, V> typeConverter, V initialVelocityVector, long j8, T t9, long j9, boolean z8, Function0 onCancel) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(initialVelocityVector, "initialVelocityVector");
        AbstractC3292y.i(onCancel, "onCancel");
        this.typeConverter = typeConverter;
        this.targetValue = t9;
        this.startTimeNanos = j9;
        this.onCancel = onCancel;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.lastFrameTimeNanos = j8;
        this.finishedTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j8) {
        this.finishedTimeNanos = j8;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j8) {
        this.lastFrameTimeNanos = j8;
    }

    public final void setRunning$animation_core_release(boolean z8) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setValue$animation_core_release(T t8) {
        this.value$delegate.setValue(t8);
    }

    public final void setVelocityVector$animation_core_release(V v8) {
        AbstractC3292y.i(v8, "<set-?>");
        this.velocityVector = v8;
    }

    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
