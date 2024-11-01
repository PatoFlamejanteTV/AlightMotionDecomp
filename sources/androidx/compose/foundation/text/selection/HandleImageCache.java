package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;

/* loaded from: classes.dex */
final class HandleImageCache {
    public static final HandleImageCache INSTANCE = new HandleImageCache();
    private static Canvas canvas;
    private static CanvasDrawScope canvasDrawScope;
    private static ImageBitmap imageBitmap;

    private HandleImageCache() {
    }

    public final Canvas getCanvas() {
        return canvas;
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return canvasDrawScope;
    }

    public final ImageBitmap getImageBitmap() {
        return imageBitmap;
    }

    public final void setCanvas(Canvas canvas2) {
        canvas = canvas2;
    }

    public final void setCanvasDrawScope(CanvasDrawScope canvasDrawScope2) {
        canvasDrawScope = canvasDrawScope2;
    }

    public final void setImageBitmap(ImageBitmap imageBitmap2) {
        imageBitmap = imageBitmap2;
    }
}
