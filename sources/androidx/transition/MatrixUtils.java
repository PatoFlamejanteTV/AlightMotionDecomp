package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes3.dex */
class MatrixUtils {
    static final Matrix IDENTITY_MATRIX = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f8, float f9, float f10) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f8, float f9, float f10, float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f8, float f9, float f10, float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f8, float f9, float f10) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f8, float f9, float f10, float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f8, float f9, float f10, float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            oops();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            oops();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i8, float[] fArr2, int i9, int i10) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f8, float f9, float f10) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f8, float f9, float f10, float f11) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f8, float f9, float f10, float f11) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f8, float f9, float f10, float f11) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f8, float f9) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            oops();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f8, float f9) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f8) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f8, float f9) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f8, float f9) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f8, float f9) {
            oops();
        }
    };

    private MatrixUtils() {
    }
}
