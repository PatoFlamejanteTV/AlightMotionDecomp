package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class MatrixKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dot-p89u6pk, reason: not valid java name */
    public static final float m3182dotp89u6pk(float[] fArr, int i8, float[] fArr2, int i9) {
        int i10 = i8 * 4;
        return (fArr[i10] * fArr2[i9]) + (fArr[i10 + 1] * fArr2[4 + i9]) + (fArr[i10 + 2] * fArr2[8 + i9]) + (fArr[i10 + 3] * fArr2[12 + i9]);
    }

    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m3183isIdentity58bKbWc(float[] fArr) {
        float f8;
        for (int i8 = 0; i8 < 4; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                if (i8 == i9) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                if (fArr[(i8 * 4) + i9] != f8) {
                    return false;
                }
            }
        }
        return true;
    }
}
