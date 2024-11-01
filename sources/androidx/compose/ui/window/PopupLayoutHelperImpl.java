package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void getWindowVisibleDisplayFrame(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i8, int i9) {
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
