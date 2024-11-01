package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RememberObserverHolder {
    public static final int $stable = 8;
    private RememberObserver wrapped;

    public RememberObserverHolder(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }

    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
