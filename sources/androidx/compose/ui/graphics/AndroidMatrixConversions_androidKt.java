package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class AndroidMatrixConversions_androidKt {
    /* renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m2824setFromEL8BTi8(android.graphics.Matrix matrix, float[] fArr) {
        float f8 = fArr[2];
        if (f8 == 0.0f) {
            float f9 = fArr[6];
            if (f9 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f10 = fArr[8];
                if (f10 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f11 = fArr[0];
                    float f12 = fArr[1];
                    float f13 = fArr[3];
                    float f14 = fArr[4];
                    float f15 = fArr[5];
                    float f16 = fArr[7];
                    float f17 = fArr[12];
                    float f18 = fArr[13];
                    float f19 = fArr[15];
                    fArr[0] = f11;
                    fArr[1] = f14;
                    fArr[2] = f17;
                    fArr[3] = f12;
                    fArr[4] = f15;
                    fArr[5] = f18;
                    fArr[6] = f13;
                    fArr[7] = f16;
                    fArr[8] = f19;
                    matrix.setValues(fArr);
                    fArr[0] = f11;
                    fArr[1] = f12;
                    fArr[2] = f8;
                    fArr[3] = f13;
                    fArr[4] = f14;
                    fArr[5] = f15;
                    fArr[6] = f9;
                    fArr[7] = f16;
                    fArr[8] = f10;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
    }

    /* renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m2825setFromtUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        matrix.getValues(fArr);
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        fArr[0] = f8;
        fArr[1] = f11;
        fArr[2] = 0.0f;
        fArr[3] = f14;
        fArr[4] = f9;
        fArr[5] = f12;
        fArr[6] = 0.0f;
        fArr[7] = f15;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f10;
        fArr[13] = f13;
        fArr[14] = 0.0f;
        fArr[15] = f16;
    }
}
