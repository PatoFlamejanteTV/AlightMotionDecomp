package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m5326getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m3149getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        c.K(drawScope, Color.Companion.m2974getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m2869getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f8, ColorFilter colorFilter, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f8, colorFilter);
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m3492drawCachedImageFqjB98A(int i8, long j8, Density density, LayoutDirection layoutDirection, Function1 function1) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmap = this.mCachedImage;
        Canvas canvas = this.cachedCanvas;
        if (imageBitmap == null || canvas == null || IntSize.m5321getWidthimpl(j8) > imageBitmap.getWidth() || IntSize.m5320getHeightimpl(j8) > imageBitmap.getHeight() || !ImageBitmapConfig.m3144equalsimpl0(this.config, i8)) {
            imageBitmap = ImageBitmapKt.m3154ImageBitmapx__hDU$default(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8), i8, false, null, 24, null);
            canvas = CanvasKt.Canvas(imageBitmap);
            this.mCachedImage = imageBitmap;
            this.cachedCanvas = canvas;
            this.config = i8;
        }
        this.size = j8;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long m5331toSizeozmzZPI = IntSizeKt.m5331toSizeozmzZPI(j8);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m3393component4NHjbRc = drawParams.m3393component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m3396setSizeuvyYCjk(m5331toSizeozmzZPI);
        canvas.save();
        clear(canvasDrawScope);
        function1.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3396setSizeuvyYCjk(m3393component4NHjbRc);
        imageBitmap.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope, float f8, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap != null) {
            c.z(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f8, null, colorFilter, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }
}
