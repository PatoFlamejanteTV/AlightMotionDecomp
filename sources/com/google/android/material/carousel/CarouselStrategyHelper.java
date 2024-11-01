package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    static float addEnd(float f8, float f9, int i8) {
        return f8 + (Math.max(0, i8 - 1) * f9);
    }

    static float addStart(float f8, float f9, int i8) {
        return i8 > 0 ? f8 + (f9 / 2.0f) : f8;
    }

    static KeylineState createCenterAlignedKeylineState(@NonNull Context context, float f8, float f9, @NonNull Arrangement arrangement) {
        float f10;
        float f11;
        float min = Math.min(getExtraSmallSize(context) + f8, arrangement.largeSize);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f14 = f12 + f9;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f8);
        KeylineState.Builder addAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, f9).addAnchorKeyline(f13, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f10 = f14;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f10 = f14;
        }
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r4 / 2.0f));
        }
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            f11 = 2.0f;
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r4 / 2.0f));
        } else {
            f11 = 2.0f;
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(r0 / f11));
        }
        addAnchorKeyline.addAnchorKeyline(f10, childMaskPercentage, min);
        return addAnchorKeyline.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState createKeylineState(@NonNull Context context, float f8, float f9, @NonNull Arrangement arrangement, int i8) {
        if (i8 == 1) {
            return createCenterAlignedKeylineState(context, f8, f9, arrangement);
        }
        return createLeftAlignedKeylineState(context, f8, f9, arrangement);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState createLeftAlignedKeylineState(@NonNull Context context, float f8, float f9, @NonNull Arrangement arrangement) {
        float min = Math.min(getExtraSmallSize(context) + f8, arrangement.largeSize);
        float f10 = min / 2.0f;
        float f11 = 0.0f - f10;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f12 = f10 + f9;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f8);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(arrangement.largeSize, f9).addAnchorKeyline(f11, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i8 = arrangement.smallCount;
        if (i8 > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, i8);
        }
        addKeylineRange.addAnchorKeyline(f12, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getExtraSmallSize(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getSmallSizeMax(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getSmallSizeMin(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int maxValue(int[] iArr) {
        int i8 = Integer.MIN_VALUE;
        for (int i9 : iArr) {
            if (i9 > i8) {
                i8 = i9;
            }
        }
        return i8;
    }

    static float updateCurPosition(float f8, float f9, float f10, int i8) {
        return i8 > 0 ? f9 + (f10 / 2.0f) : f8;
    }
}
