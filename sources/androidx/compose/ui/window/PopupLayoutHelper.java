package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes.dex */
public interface PopupLayoutHelper {
    void getWindowVisibleDisplayFrame(View view, Rect rect);

    void setGestureExclusionRects(View view, int i8, int i9);

    void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams);
}
