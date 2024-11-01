package androidx.compose.ui.graphics;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {
    private static final android.graphics.Canvas EmptyCanvas = new android.graphics.Canvas();

    public static final Canvas ActualCanvas(ImageBitmap imageBitmap) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap)));
        return androidCanvas;
    }

    public static final Canvas Canvas(android.graphics.Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(canvas);
        return androidCanvas;
    }

    public static final android.graphics.Canvas getNativeCanvas(Canvas canvas) {
        AbstractC3292y.g(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
