package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes.dex */
final class AndroidComposeViewForceDarkModeQ {
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    @DoNotInline
    @RequiresApi(29)
    public final void disallowForceDark(View view) {
        view.setForceDarkAllowed(false);
    }
}
