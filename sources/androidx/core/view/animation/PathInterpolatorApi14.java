package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i8 = (int) (length / 0.002f);
        int i9 = i8 + 1;
        this.mX = new float[i9];
        this.mY = new float[i9];
        float[] fArr = new float[2];
        for (int i10 = 0; i10 < i9; i10++) {
            pathMeasure.getPosTan((i10 * length) / i8, fArr, null);
            this.mX[i10] = fArr[0];
            this.mY[i10] = fArr[1];
        }
    }

    private static Path createCubic(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f8, f9, f10, f11, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f8, f9, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i8 = 0;
        while (length - i8 > 1) {
            int i9 = (i8 + length) / 2;
            if (f8 < this.mX[i9]) {
                length = i9;
            } else {
                i8 = i9;
            }
        }
        float[] fArr = this.mX;
        float f9 = fArr[length];
        float f10 = fArr[i8];
        float f11 = f9 - f10;
        if (f11 == 0.0f) {
            return this.mY[i8];
        }
        float f12 = (f8 - f10) / f11;
        float[] fArr2 = this.mY;
        float f13 = fArr2[i8];
        return f13 + (f12 * (fArr2[length] - f13));
    }

    PathInterpolatorApi14(float f8, float f9) {
        this(createQuad(f8, f9));
    }

    PathInterpolatorApi14(float f8, float f9, float f10, float f11) {
        this(createCubic(f8, f9, f10, f11));
    }
}
