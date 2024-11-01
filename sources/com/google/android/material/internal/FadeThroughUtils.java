package com.google.android.material.internal;

import androidx.annotation.FloatRange;

/* loaded from: classes3.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void calculateFadeOutAndInAlphas(@FloatRange(from = 0.0d, to = 1.0d) float f8, float[] fArr) {
        if (f8 <= 0.5f) {
            fArr[0] = 1.0f - (f8 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f8 * 2.0f) - 1.0f;
        }
    }
}
