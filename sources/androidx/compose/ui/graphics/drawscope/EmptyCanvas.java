package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;

/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {
    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo2806clipPathmtrdDE(Path path, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo2807clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E */
    public /* synthetic */ void mo2808clipRectmtrdDE(Rect rect, int i8) {
        T.a(this, rect, i8);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo2809concat58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArc(Rect rect, float f8, float f9, boolean z8, Paint paint) {
        T.b(this, rect, f8, f9, z8, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArcRad(Rect rect, float f8, float f9, boolean z8, Paint paint) {
        T.c(this, rect, f8, f9, z8, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo2810drawCircle9KIMszo(long j8, float f8, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo2811drawImaged4ec7I(ImageBitmap imageBitmap, long j8, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo2812drawImageRectHPBpro0(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo2813drawLineWko1d7g(long j8, long j9, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawOval(Rect rect, Paint paint) {
        T.d(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo2814drawPointsO7TthRY(int i8, List<Offset> list, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo2815drawRawPointsO7TthRY(int i8, float[] fArr, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawRect(Rect rect, Paint paint) {
        T.e(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f8, float f9, float f10, float f11, float f12, float f13, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo2816drawVerticesTPEHhCM(Vertices vertices, int i8, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(Rect rect, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f8, float f9) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f8, float f9) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void skewRad(float f8, float f9) {
        T.f(this, f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f8, float f9) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f8, float f9, float f10, float f11, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f8, float f9, float f10, float f11, Paint paint) {
        throw new UnsupportedOperationException();
    }
}
