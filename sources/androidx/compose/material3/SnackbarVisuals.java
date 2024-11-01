package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface SnackbarVisuals {
    String getActionLabel();

    SnackbarDuration getDuration();

    String getMessage();

    boolean getWithDismissAction();
}
