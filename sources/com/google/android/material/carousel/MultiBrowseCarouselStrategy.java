package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i8) {
        boolean z8;
        int itemCount = arrangement.getItemCount() - i8;
        if (itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1)) {
            z8 = true;
        } else {
            z8 = false;
        }
        while (itemCount > 0) {
            int i9 = arrangement.smallCount;
            if (i9 > 0) {
                arrangement.smallCount = i9 - 1;
            } else {
                int i10 = arrangement.mediumCount;
                if (i10 > 1) {
                    arrangement.mediumCount = i10 - 1;
                }
            }
            itemCount--;
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f9 = f8;
        float smallItemSizeMin = getSmallItemSizeMin() + f9;
        float max = Math.max(getSmallItemSizeMax() + f9, smallItemSizeMin);
        float min = Math.min(measuredHeight + f9, containerHeight);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f9, smallItemSizeMin + f9, max + f9);
        float f10 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        if (containerHeight < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((containerHeight - (CarouselStrategyHelper.maxValue(iArr4) * f10)) - (CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(containerHeight / min);
        int i8 = (ceil - max2) + 1;
        int[] iArr5 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr5[i9] = ceil - i9;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, iArr3, f10, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount())) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f10, new int[]{findLowestCostArrangement.mediumCount}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f9, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i8) {
        if ((i8 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i8 >= this.keylineCount && carousel.getItemCount() < this.keylineCount)) {
            return true;
        }
        return false;
    }
}
