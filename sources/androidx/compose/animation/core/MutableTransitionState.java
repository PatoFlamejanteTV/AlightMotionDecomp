package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MutableTransitionState<S> {
    public static final int $stable = 0;
    private final MutableState currentState$delegate;
    private final MutableState isRunning$delegate;
    private final MutableState targetState$delegate;

    public MutableTransitionState(S s8) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s8, null, 2, null);
        this.currentState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s8, null, 2, null);
        this.targetState$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default3;
    }

    public final S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        if (AbstractC3292y.d(getCurrentState(), getTargetState()) && !isRunning$animation_core_release()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(S s8) {
        this.currentState$delegate.setValue(s8);
    }

    public final void setRunning$animation_core_release(boolean z8) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setTargetState(S s8) {
        this.targetState$delegate.setValue(s8);
    }
}
