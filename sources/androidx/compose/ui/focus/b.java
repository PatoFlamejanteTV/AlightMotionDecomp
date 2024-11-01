package androidx.compose.ui.focus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void a(FocusManager focusManager, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            focusManager.clearFocus(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }
}
