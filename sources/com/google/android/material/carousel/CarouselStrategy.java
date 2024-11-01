package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes3.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = iArr[i8] * 2;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public static float getChildMaskPercentage(float f8, float f9, float f10) {
        return 1.0f - ((f8 - f10) / (f9 - f10));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initialize(Context context) {
        float f8 = this.smallSizeMin;
        if (f8 <= 0.0f) {
            f8 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f8;
        float f9 = this.smallSizeMax;
        if (f9 <= 0.0f) {
            f9 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isContained() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f8) {
        this.smallSizeMax = f8;
    }

    public void setSmallItemSizeMin(float f8) {
        this.smallSizeMin = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldRefreshKeylineState(Carousel carousel, int i8) {
        return false;
    }
}
