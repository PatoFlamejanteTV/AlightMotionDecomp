package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1, reason: collision with root package name */
    private static final float f14388P1 = 0.175f;

    /* renamed from: P2, reason: collision with root package name */
    private static final float f14389P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i8) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i9 = 0; i9 < i8; i9++) {
            float f18 = i9 / i8;
            float f19 = 1.0f;
            while (true) {
                f8 = ((f19 - f16) / 2.0f) + f16;
                f9 = 1.0f - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f20 = (((f9 * f14388P1) + (f8 * f14389P2)) * f10) + f11;
                if (Math.abs(f20 - f18) < 1.0E-5d) {
                    break;
                } else if (f20 > f18) {
                    f19 = f8;
                } else {
                    f16 = f8;
                }
            }
            float f21 = 0.5f;
            fArr[i9] = (f10 * ((f9 * 0.5f) + f8)) + f11;
            float f22 = 1.0f;
            while (true) {
                f12 = ((f22 - f17) / 2.0f) + f17;
                f13 = 1.0f - f12;
                f14 = f12 * 3.0f * f13;
                f15 = f12 * f12 * f12;
                float f23 = (((f13 * f21) + f12) * f14) + f15;
                if (Math.abs(f23 - f18) >= 1.0E-5d) {
                    if (f23 > f18) {
                        f22 = f12;
                    } else {
                        f17 = f12;
                    }
                    f21 = 0.5f;
                }
            }
            fArr2[i9] = (f14 * ((f13 * f14388P1) + (f12 * f14389P2))) + f15;
        }
        fArr2[i8] = 1.0f;
        fArr[i8] = 1.0f;
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        AbstractC3292y.i(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
