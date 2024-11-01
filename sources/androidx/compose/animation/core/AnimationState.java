package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationState(TwoWayConverter<T, V> typeConverter, T t8, V v8, long j8, long j9, boolean z8) {
        MutableState mutableStateOf$default;
        V v9;
        AbstractC3292y.i(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (v8 == null || (v9 = (V) AnimationVectorsKt.copy(v8)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(typeConverter, t8) : v9;
        this.lastFrameTimeNanos = j8;
        this.finishedTimeNanos = j9;
        this.isRunning = z8;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j8) {
        this.finishedTimeNanos = j8;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j8) {
        this.lastFrameTimeNanos = j8;
    }

    public final void setRunning$animation_core_release(boolean z8) {
        this.isRunning = z8;
    }

    public void setValue$animation_core_release(T t8) {
        this.value$delegate.setValue(t8);
    }

    public final void setVelocityVector$animation_core_release(V v8) {
        AbstractC3292y.i(v8, "<set-?>");
        this.velocityVector = v8;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j8, long j9, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(twoWayConverter, obj, (i8 & 4) != 0 ? null : animationVector, (i8 & 8) != 0 ? Long.MIN_VALUE : j8, (i8 & 16) != 0 ? Long.MIN_VALUE : j9, (i8 & 32) != 0 ? false : z8);
    }
}
