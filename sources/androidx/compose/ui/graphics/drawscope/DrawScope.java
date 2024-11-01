package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m2896getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m3047getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m3421getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m3422getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3428drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9) {
            c.e(drawScope, imageBitmap, j8, j9, j10, j11, f8, drawStyle, colorFilter, i8, i9);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3443getCenterF1C5BW0(DrawScope drawScope) {
            return c.f(drawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3444getSizeNHjbRc(DrawScope drawScope) {
            return c.g(drawScope);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3445roundToPxR2X_6o(DrawScope drawScope, long j8) {
            return c.h(drawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3446roundToPx0680j_4(DrawScope drawScope, float f8) {
            return c.i(drawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3447toDpGaN1DYA(DrawScope drawScope, long j8) {
            return c.j(drawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3448toDpu2uoSUM(DrawScope drawScope, float f8) {
            return c.k(drawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3450toDpSizekrfVVM(DrawScope drawScope, long j8) {
            return c.m(drawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3451toPxR2X_6o(DrawScope drawScope, long j8) {
            return c.n(drawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3452toPx0680j_4(DrawScope drawScope, float f8) {
            return c.o(drawScope, f8);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return c.p(drawScope, dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3453toSizeXkaWNTQ(DrawScope drawScope, long j8) {
            return c.q(drawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3454toSp0xMU5do(DrawScope drawScope, float f8) {
            return c.r(drawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3455toSpkPz2Gy4(DrawScope drawScope, float f8) {
            return c.s(drawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3449toDpu2uoSUM(DrawScope drawScope, int i8) {
            return c.l(drawScope, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3456toSpkPz2Gy4(DrawScope drawScope, int i8) {
            return c.t(drawScope, i8);
        }
    }

    /* renamed from: drawArc-illE91I */
    void mo3371drawArcillE91I(Brush brush, float f8, float f9, boolean z8, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawArc-yD3GUKo */
    void mo3372drawArcyD3GUKo(long j8, float f8, float f9, boolean z8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawCircle-V9BoPsw */
    void mo3373drawCircleV9BoPsw(Brush brush, float f8, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo3374drawCircleVaOC9Bg(long j8, float f8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo3375drawImage9jGpkUE(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawImage-AZ2fEMs */
    void mo3376drawImageAZ2fEMs(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9);

    /* renamed from: drawImage-gbVJVH8 */
    void mo3377drawImagegbVJVH8(ImageBitmap imageBitmap, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawLine-1RTmtNc */
    void mo3378drawLine1RTmtNc(Brush brush, long j8, long j9, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo3379drawLineNGM6Ib0(long j8, long j9, long j10, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9);

    /* renamed from: drawOval-AsUm42w */
    void mo3380drawOvalAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawOval-n-J9OG0 */
    void mo3381drawOvalnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawPath-GBMwjPU */
    void mo3382drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawPath-LG529CI */
    void mo3383drawPathLG529CI(Path path, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo3384drawPointsF8ZwMP8(List<Offset> list, int i8, long j8, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo3385drawPointsGsft0Ws(List<Offset> list, int i8, Brush brush, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10);

    /* renamed from: drawRect-AsUm42w */
    void mo3386drawRectAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawRect-n-J9OG0 */
    void mo3387drawRectnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo3388drawRoundRectZuiqVtQ(Brush brush, long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo3389drawRoundRectuAw5IA(long j8, long j9, long j10, long j11, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f8, ColorFilter colorFilter, int i8);

    /* renamed from: getCenter-F1C5BW0 */
    long mo3390getCenterF1C5BW0();

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo3391getSizeNHjbRc();
}
