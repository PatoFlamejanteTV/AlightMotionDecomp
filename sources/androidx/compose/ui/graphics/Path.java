package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;

/* loaded from: classes.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m3197combinexh6zSI8(int i8, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo2846opN5in7k0(path, path2, i8)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f8, float f9, boolean z8) {
            V0.d(path, rect, f8, f9, z8);
        }

        @Deprecated
        public static void rewind(Path path) {
            V0.e(path);
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m3199transform58bKbWc(Path path, float[] fArr) {
            V0.f(path, fArr);
        }
    }

    void addArc(Rect rect, float f8, float f9);

    void addArcRad(Rect rect, float f8, float f9);

    void addOval(Rect rect);

    /* renamed from: addPath-Uv8p0NA */
    void mo2844addPathUv8p0NA(Path path, long j8);

    void addRect(Rect rect);

    void addRoundRect(RoundRect roundRect);

    void arcTo(Rect rect, float f8, float f9, boolean z8);

    void arcToRad(Rect rect, float f8, float f9, boolean z8);

    void close();

    void cubicTo(float f8, float f9, float f10, float f11, float f12, float f13);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo2845getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f8, float f9);

    void moveTo(float f8, float f9);

    /* renamed from: op-N5in7k0 */
    boolean mo2846opN5in7k0(Path path, Path path2, int i8);

    void quadraticBezierTo(float f8, float f9, float f10, float f11);

    void relativeCubicTo(float f8, float f9, float f10, float f11, float f12, float f13);

    void relativeLineTo(float f8, float f9);

    void relativeMoveTo(float f8, float f9);

    void relativeQuadraticBezierTo(float f8, float f9, float f10, float f11);

    void reset();

    void rewind();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo2847setFillTypeoQ8Xj4U(int i8);

    /* renamed from: transform-58bKbWc */
    void mo2848transform58bKbWc(float[] fArr);

    /* renamed from: translate-k-4lQ0M */
    void mo2849translatek4lQ0M(long j8);
}
