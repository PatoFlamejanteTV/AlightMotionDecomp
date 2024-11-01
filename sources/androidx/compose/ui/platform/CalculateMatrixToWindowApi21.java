package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, AbstractC3284p abstractC3284p) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m4421preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m2825setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m4416preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m4422preTranslate3XD1CNM(float[] fArr, float f8, float f9) {
        AndroidComposeView_androidKt.m4417preTranslatecG2Xzmc(fArr, f8, f9, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m4423transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m4423transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m4422preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m4422preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m4422preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m4422preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            m4421preConcattUYjHk(fArr, matrix);
        }
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo4420calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m3168resetimpl(fArr);
        m4423transformMatrixToWindowEL8BTi8(view, fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
