package androidx.compose.ui.unit;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;

/* loaded from: classes.dex */
public final class FontScalingKt {
    private static final MutableState DisableNonLinearFontScalingInCompose$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalComposeUiApi
    public static final boolean getDisableNonLinearFontScalingInCompose() {
        return ((Boolean) DisableNonLinearFontScalingInCompose$delegate.getValue()).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableNonLinearFontScalingInCompose$annotations() {
    }

    @ExperimentalComposeUiApi
    public static final void setDisableNonLinearFontScalingInCompose(boolean z8) {
        DisableNonLinearFontScalingInCompose$delegate.setValue(Boolean.valueOf(z8));
    }
}
