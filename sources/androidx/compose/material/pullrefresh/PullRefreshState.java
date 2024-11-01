package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;
    private final MutableFloatState _position$delegate;
    private final MutableState _refreshing$delegate;
    private final MutableFloatState _refreshingOffset$delegate;
    private final MutableFloatState _threshold$delegate;
    private final State adjustedDistancePulled$delegate;
    private final M animationScope;
    private final MutableFloatState distancePulled$delegate;
    private final MutatorMutex mutatorMutex;
    private final State<Function0> onRefreshState;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(M animationScope, State<? extends Function0> onRefreshState, float f8, float f9) {
        MutableState mutableStateOf$default;
        AbstractC3292y.i(animationScope, "animationScope");
        AbstractC3292y.i(onRefreshState, "onRefreshState");
        this.animationScope = animationScope;
        this.onRefreshState = onRefreshState;
        this.adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this._refreshing$delegate = mutableStateOf$default;
        this._position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f9);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f8);
        this.mutatorMutex = new MutatorMutex();
    }

    private final InterfaceC3488x0 animateIndicatorTo(float f8) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, f8, null), 3, null);
        return d8;
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float j8 = m.j(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (j8 - (((float) Math.pow(j8, 2)) / 4)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset$delegate.getFloatValue();
    }

    private final float get_threshold() {
        return this._threshold$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f8) {
        this.distancePulled$delegate.setFloatValue(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f8) {
        this._position$delegate.setFloatValue(f8);
    }

    private final void set_refreshing(boolean z8) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z8));
    }

    private final void set_refreshingOffset(float f8) {
        this._refreshingOffset$delegate.setFloatValue(f8);
    }

    private final void set_threshold(float f8) {
        this._threshold$delegate.setFloatValue(f8);
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float f8) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float c8 = m.c(getDistancePulled() + f8, 0.0f);
        float distancePulled = c8 - getDistancePulled();
        setDistancePulled(c8);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float f8) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f || f8 < 0.0f) {
            f8 = 0.0f;
        }
        setDistancePulled(0.0f);
        return f8;
    }

    public final void setRefreshing$material_release(boolean z8) {
        if (get_refreshing() != z8) {
            set_refreshing(z8);
            float f8 = 0.0f;
            setDistancePulled(0.0f);
            if (z8) {
                f8 = get_refreshingOffset();
            }
            animateIndicatorTo(f8);
        }
    }

    public final void setRefreshingOffset$material_release(float f8) {
        if (get_refreshingOffset() != f8) {
            set_refreshingOffset(f8);
            if (getRefreshing$material_release()) {
                animateIndicatorTo(f8);
            }
        }
    }

    public final void setThreshold$material_release(float f8) {
        set_threshold(f8);
    }
}
