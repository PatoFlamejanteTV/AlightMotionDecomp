package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m4446invertToJiSxe2E(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        float f17 = fArr[9];
        float f18 = fArr[10];
        float f19 = fArr[11];
        float f20 = fArr[12];
        float f21 = fArr[13];
        float f22 = fArr[14];
        float f23 = fArr[15];
        float f24 = (f8 * f13) - (f9 * f12);
        float f25 = (f8 * f14) - (f10 * f12);
        float f26 = (f8 * f15) - (f11 * f12);
        float f27 = (f9 * f14) - (f10 * f13);
        float f28 = (f9 * f15) - (f11 * f13);
        float f29 = (f10 * f15) - (f11 * f14);
        float f30 = (f16 * f21) - (f17 * f20);
        float f31 = (f16 * f22) - (f18 * f20);
        float f32 = (f16 * f23) - (f19 * f20);
        float f33 = (f17 * f22) - (f18 * f21);
        float f34 = (f17 * f23) - (f19 * f21);
        float f35 = (f18 * f23) - (f19 * f22);
        float f36 = (((((f24 * f35) - (f25 * f34)) + (f26 * f33)) + (f27 * f32)) - (f28 * f31)) + (f29 * f30);
        if (f36 == 0.0f) {
            return false;
        }
        float f37 = 1.0f / f36;
        fArr2[0] = (((f13 * f35) - (f14 * f34)) + (f15 * f33)) * f37;
        fArr2[1] = ((((-f9) * f35) + (f10 * f34)) - (f11 * f33)) * f37;
        fArr2[2] = (((f21 * f29) - (f22 * f28)) + (f23 * f27)) * f37;
        fArr2[3] = ((((-f17) * f29) + (f18 * f28)) - (f19 * f27)) * f37;
        float f38 = -f12;
        fArr2[4] = (((f38 * f35) + (f14 * f32)) - (f15 * f31)) * f37;
        fArr2[5] = (((f35 * f8) - (f10 * f32)) + (f11 * f31)) * f37;
        float f39 = -f20;
        fArr2[6] = (((f39 * f29) + (f22 * f26)) - (f23 * f25)) * f37;
        fArr2[7] = (((f29 * f16) - (f18 * f26)) + (f19 * f25)) * f37;
        fArr2[8] = (((f12 * f34) - (f13 * f32)) + (f15 * f30)) * f37;
        fArr2[9] = ((((-f8) * f34) + (f32 * f9)) - (f11 * f30)) * f37;
        fArr2[10] = (((f20 * f28) - (f21 * f26)) + (f23 * f24)) * f37;
        fArr2[11] = ((((-f16) * f28) + (f26 * f17)) - (f19 * f24)) * f37;
        fArr2[12] = (((f38 * f33) + (f13 * f31)) - (f14 * f30)) * f37;
        fArr2[13] = (((f8 * f33) - (f9 * f31)) + (f10 * f30)) * f37;
        fArr2[14] = (((f39 * f27) + (f21 * f25)) - (f22 * f24)) * f37;
        fArr2[15] = (((f16 * f27) - (f17 * f25)) + (f18 * f24)) * f37;
        return true;
    }
}
