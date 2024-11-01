package androidx.compose.ui.graphics;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CanvasHolder {
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }

    public final void drawInto(android.graphics.Canvas canvas, Function1 function1) {
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        function1.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }
}
