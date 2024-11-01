package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(23)
/* loaded from: classes.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final void invalidateContentRect(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @DoNotInline
    @RequiresApi(23)
    public final ActionMode startActionMode(View view, ActionMode.Callback callback, int i8) {
        ActionMode startActionMode;
        startActionMode = view.startActionMode(callback, i8);
        return startActionMode;
    }
}
