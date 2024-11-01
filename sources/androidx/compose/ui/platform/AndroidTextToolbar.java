package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, 62, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        ActionMode startActionMode;
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(function0);
        this.textActionModeCallback.setOnCutRequested(function03);
        this.textActionModeCallback.setOnPasteRequested(function02);
        this.textActionModeCallback.setOnSelectAllRequested(function04);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            if (Build.VERSION.SDK_INT >= 23) {
                startActionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
            } else {
                startActionMode = this.view.startActionMode(new PrimaryTextActionModeCallback(this.textActionModeCallback));
            }
            this.actionMode = startActionMode;
            return;
        }
        if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
