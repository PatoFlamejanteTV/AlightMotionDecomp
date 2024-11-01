package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes.dex */
final class CanvasZHelper {
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    @DoNotInline
    public final void enableZ(android.graphics.Canvas canvas, boolean z8) {
        if (z8) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
