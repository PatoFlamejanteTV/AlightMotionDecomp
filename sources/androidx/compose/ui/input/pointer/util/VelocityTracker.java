package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private long currentPointerPositionAccumulator = Offset.Companion.m2728getZeroF1C5BW0();

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m4080addPositionUv8p0NA(long j8, long j9) {
        this.xVelocityTracker.addDataPoint(j8, Offset.m2712getXimpl(j9));
        this.yVelocityTracker.addDataPoint(j8, Offset.m2713getYimpl(j9));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m4081calculateVelocity9UxMQ8M() {
        return m4082calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m4082calculateVelocityAH228Gc(long j8) {
        if (Velocity.m5386getXimpl(j8) > 0.0f && Velocity.m5387getYimpl(j8) > 0.0f) {
            return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m5386getXimpl(j8)), this.yVelocityTracker.calculateVelocity(Velocity.m5387getYimpl(j8)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m5393toStringimpl(j8))).toString());
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m4083getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m4084setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j8) {
        this.currentPointerPositionAccumulator = j8;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j8) {
        this.lastMoveEventTimeStamp = j8;
    }
}
