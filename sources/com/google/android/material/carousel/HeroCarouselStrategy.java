package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int[] iArr;
        int i8;
        int[] iArr2;
        int[] iArr3;
        int i9;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f8;
        float max = Math.max(getSmallItemSizeMax() + f8, smallItemSizeMin);
        float f9 = containerHeight;
        float min = Math.min(measuredWidth + f8, f9);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f8, smallItemSizeMin + f8, max + f8);
        float f10 = (min + clamp) / 2.0f;
        int[] iArr4 = SMALL_COUNTS;
        if (f9 < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        } else {
            iArr = iArr4;
        }
        int max2 = (int) Math.max(1.0d, Math.floor((f9 - (CarouselStrategyHelper.maxValue(iArr4) * max)) / min));
        int ceil = (((int) Math.ceil(f9 / min)) - max2) + 1;
        int[] iArr5 = new int[ceil];
        for (int i10 = 0; i10 < ceil; i10++) {
            iArr5[i10] = max2 + i10;
        }
        if (carousel.getCarouselAlignment() == 1) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (i8 != 0) {
            iArr2 = CarouselStrategy.doubleCounts(iArr);
        } else {
            iArr2 = iArr;
        }
        if (i8 != 0) {
            iArr3 = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArr3 = MEDIUM_COUNTS;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, iArr2, f10, iArr3, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, iArr, f10, MEDIUM_COUNTS, min, iArr5);
            i9 = 0;
        } else {
            i9 = i8;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f8, f9, findLowestCostArrangement, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i8) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i8 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i8 >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}
