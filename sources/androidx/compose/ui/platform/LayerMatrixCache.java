package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final InterfaceC2072n getMatrix;
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;
    private boolean isInverseValid = true;
    private float[] matrixCache;
    private Matrix previousAndroidMatrix;

    public LayerMatrixCache(InterfaceC2072n interfaceC2072n) {
        this.getMatrix = interfaceC2072n;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m4448calculateInverseMatrixbWbORWo(T t8) {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m3159constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m4446invertToJiSxe2E(m4449calculateMatrixGrdbGEg(t8), fArr);
            this.isInverseDirty = false;
        }
        if (!this.isInverseValid) {
            return null;
        }
        return fArr;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m4449calculateMatrixGrdbGEg(T t8) {
        float[] fArr = this.matrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m3159constructorimpl$default(null, 1, null);
            this.matrixCache = fArr;
        }
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t8, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !AbstractC3292y.d(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m2825setFromtUYjHk(fArr, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
