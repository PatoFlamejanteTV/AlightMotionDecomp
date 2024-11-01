package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

/* loaded from: classes3.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UncontainedCarouselStrategy() {
    }

    private float calculateMediumChildSize(float f8, float f9, float f10) {
        float max = Math.max(1.5f * f10, f8);
        float f11 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f9;
        if (max > f11) {
            max = Math.max(f11, f10 * 1.2f);
        }
        return Math.min(f9, max);
    }

    private KeylineState createCenterAlignedKeylineState(float f8, float f9, float f10, int i8, float f11, float f12, float f13) {
        float min = Math.min(f12, f10);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, f10, f9);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f11, f10, f9);
        float f14 = f11 / 2.0f;
        float f15 = (f13 + 0.0f) - f14;
        float f16 = f15 + f14;
        float f17 = min / 2.0f;
        float f18 = (i8 * f10) + f16;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f10, f8).addAnchorKeyline((f15 - f14) - f17, childMaskPercentage, min).addKeyline(f15, childMaskPercentage2, f11, false).addKeylineRange((f10 / 2.0f) + f16, 0.0f, f10, i8, true);
        addKeylineRange.addKeyline(f14 + f18, childMaskPercentage2, f11, false);
        addKeylineRange.addAnchorKeyline(f18 + f11 + f17, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f8, float f9, float f10, int i8, float f11, int i9, float f12) {
        float min = Math.min(f12, f10);
        float max = Math.max(min, 0.5f * f11);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(max, f10, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(min, f10, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f11, f10, f8);
        float f13 = (i8 * f10) + 0.0f;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f10, f9).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f10 / 2.0f, 0.0f, f10, i8, true);
        if (i9 > 0) {
            float f14 = (f11 / 2.0f) + f13;
            f13 += f11;
            addKeylineRange.addKeyline(f14, childMaskPercentage3, f11, false);
        }
        addKeylineRange.addAnchorKeyline(f13 + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, min);
        return addKeylineRange.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        float f8;
        int i8;
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f9 = containerHeight;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
            f8 = f11;
        } else {
            f8 = f10;
        }
        float f12 = measuredHeight + f8;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f8;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f8;
        int max = Math.max(1, (int) Math.floor(f9 / f12));
        float f13 = f9 - (max * f12);
        if (carousel.getCarouselAlignment() == 1) {
            float f14 = f13 / 2.0f;
            return createCenterAlignedKeylineState(f9, f8, f12, max, Math.max(Math.min(3.0f * f14, f12), getSmallItemSizeMin() + f8), extraSmallSize2, f14);
        }
        if (f13 > 0.0f) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f8, f9, f12, max, calculateMediumChildSize(extraSmallSize, f12, f13), i8, extraSmallSize2);
    }
}
