package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.List;

/* loaded from: classes.dex */
public interface Canvas {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m2926clipRectmtrdDE(Canvas canvas, Rect rect, int i8) {
            T.g(canvas, rect, i8);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f8, float f9, boolean z8, Paint paint) {
            T.h(canvas, rect, f8, f9, z8, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f8, float f9, boolean z8, Paint paint) {
            T.i(canvas, rect, f8, f9, z8, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            T.j(canvas, rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            T.k(canvas, rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f8, float f9) {
            T.l(canvas, f8, f9);
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo2806clipPathmtrdDE(Path path, int i8);

    /* renamed from: clipRect-N_I0leg */
    void mo2807clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8);

    /* renamed from: clipRect-mtrdD-E */
    void mo2808clipRectmtrdDE(Rect rect, int i8);

    /* renamed from: concat-58bKbWc */
    void mo2809concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, Paint paint);

    void drawArc(Rect rect, float f8, float f9, boolean z8, Paint paint);

    void drawArcRad(Rect rect, float f8, float f9, boolean z8, Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo2810drawCircle9KIMszo(long j8, float f8, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo2811drawImaged4ec7I(ImageBitmap imageBitmap, long j8, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo2812drawImageRectHPBpro0(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo2813drawLineWko1d7g(long j8, long j9, Paint paint);

    void drawOval(float f8, float f9, float f10, float f11, Paint paint);

    void drawOval(Rect rect, Paint paint);

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo2814drawPointsO7TthRY(int i8, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo2815drawRawPointsO7TthRY(int i8, float[] fArr, Paint paint);

    void drawRect(float f8, float f9, float f10, float f11, Paint paint);

    void drawRect(Rect rect, Paint paint);

    void drawRoundRect(float f8, float f9, float f10, float f11, float f12, float f13, Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo2816drawVerticesTPEHhCM(Vertices vertices, int i8, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f8);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f8, float f9);

    void skew(float f8, float f9);

    void skewRad(float f8, float f9);

    void translate(float f8, float f9);
}
