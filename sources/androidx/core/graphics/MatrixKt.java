package androidx.core.graphics;

import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class MatrixKt {
    public static final Matrix rotationMatrix(float f8, float f9, float f10) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f8, f9, f10);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        return rotationMatrix(f8, f9, f10);
    }

    public static final Matrix scaleMatrix(float f8, float f9) {
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f9);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1.0f;
        }
        return scaleMatrix(f8, f9);
    }

    public static final Matrix times(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    public static final Matrix translationMatrix(float f8, float f9) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f8, f9);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        return translationMatrix(f8, f9);
    }

    public static final float[] values(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
