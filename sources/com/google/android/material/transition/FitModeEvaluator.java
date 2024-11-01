package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface FitModeEvaluator {
    void applyMask(RectF rectF, float f8, FitModeResult fitModeResult);

    FitModeResult evaluate(float f8, float f9, float f10, float f11, float f12, float f13, float f14);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
