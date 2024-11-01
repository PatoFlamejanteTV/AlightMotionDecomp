package androidx.transition;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f8, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i8 = 0; i8 < fArr3.length; i8++) {
            float f9 = fArr[i8];
            fArr3[i8] = f9 + ((fArr2[i8] - f9) * f8);
        }
        return fArr3;
    }
}
