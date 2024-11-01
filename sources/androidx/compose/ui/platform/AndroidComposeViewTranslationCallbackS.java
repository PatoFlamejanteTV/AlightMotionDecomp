package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi(31)
    public final void setViewTranslationCallback(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }
}
