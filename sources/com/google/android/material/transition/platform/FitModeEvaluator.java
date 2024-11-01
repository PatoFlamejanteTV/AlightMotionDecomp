package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(21)
/* loaded from: classes3.dex */
public interface FitModeEvaluator {
    void applyMask(RectF rectF, float f8, FitModeResult fitModeResult);

    FitModeResult evaluate(float f8, float f9, float f10, float f11, float f12, float f13, float f14);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
