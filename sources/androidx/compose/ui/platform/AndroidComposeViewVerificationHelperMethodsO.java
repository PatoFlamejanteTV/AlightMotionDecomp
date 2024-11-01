package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsO {
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void focusable(View view, int i8, boolean z8) {
        view.setFocusable(i8);
        view.setDefaultFocusHighlightEnabled(z8);
    }
}
