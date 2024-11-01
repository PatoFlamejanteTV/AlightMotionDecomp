package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i8, int i9, int i10, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i8, i9, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f8, float f9, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f8, f9, z8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i8, int i9, float[] fArr, int i10, int[] iArr, int i11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i8, i9, fArr, i10, iArr, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f8, float f9, float f10, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f8, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i8);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float f8, float f9, RectF rectF2, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, f8, f9, rectF2, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(int[] iArr, int i8, float[] fArr, int i9, int i10, Font font, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(iArr, i8, fArr, i9, i10, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f8, f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i8, int i9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i8, i9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i8, int i9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i8, i9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i8, int i9, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i8, i9, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i8, int i9, int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i8, i9, i10);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i8, int i9, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i8, i9, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i8, int i9, Path path, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i8, i9, path, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(char[] cArr, int i8, int i9, int i10, int i11, float f8, float f9, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(cArr, i8, i9, i10, i11, f8, f9, z8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i8, float[] fArr, int i9, float[] fArr2, int i10, int[] iArr, int i11, short[] sArr, int i12, int i13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i8, fArr, i9, fArr2, i10, iArr, i11, sArr, i12, i13, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i8);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f8);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i8);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i8, int i9) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i8, i9);
    }

    @Override // android.graphics.Canvas
    public void scale(float f8, float f9) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f8, f9);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i8);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f8, float f9) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f8, f9);
    }

    @Override // android.graphics.Canvas
    public void translate(float f8, float f9) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f8, f9);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f8, f9, f10, f11, f12, f13, z8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j8);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f8, f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f8, float f9, float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f8, f9, f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(CharSequence charSequence, int i8, int i9, int i10, int i11, float f8, float f9, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(charSequence, i8, i9, i10, i11, f8, f9, z8, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(RectF rectF) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i8);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f8, float f9, float f10, float f11) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(f8, f9, f10, f11);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i8, PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i8, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f8, f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i8, int i9, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i8, i9, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(MeasuredText measuredText, int i8, int i9, int i10, int i11, float f8, float f9, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(measuredText, i8, i9, i10, i11, f8, f9, z8, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f8, float f9, float f10, float f11, Paint paint, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f8, f9, f10, f11, paint, i8);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f8, float f9, float f10, float f11, int i8, int i9) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f8, f9, f10, f11, i8, i9);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int i8, int i9, int i10, int i11) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(i8, i9, i10, i11);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i8, int i9, float f8, float f9, int i10, int i11, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i8, i9, f8, f9, i10, i11, z8, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int i8, BlendMode blendMode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i8, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i8, int i9, float f8, float f9, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i8, i9, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(Path path) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f8, f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f8, float f9, float f10, float f11, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f8, f9, f10, f11, i8);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f8, float f9, float f10, float f11, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f8, f9, f10, f11, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i8, int i9, int i10, int i11, int i12, int i13, boolean z8, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i8, i9, i10, i11, i12, i13, z8, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j8, BlendMode blendMode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j8, blendMode);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f8, float f9, float f10, float f11, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f8, f9, f10, f11, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f8, float f9, float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f8, f9, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f8, float f9, float f10, float f11) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(f8, f9, f10, f11);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i8, int i9, int i10, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC3292y.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i8, i9, i10, i11);
    }
}
