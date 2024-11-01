package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface SnackbarData {
    void dismiss();

    SnackbarVisuals getVisuals();

    void performAction();
}
