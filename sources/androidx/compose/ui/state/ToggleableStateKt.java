package androidx.compose.ui.state;

/* loaded from: classes.dex */
public final class ToggleableStateKt {
    public static final ToggleableState ToggleableState(boolean z8) {
        if (z8) {
            return ToggleableState.On;
        }
        return ToggleableState.Off;
    }
}
