package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight;
        int i8;
        int i9;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i9 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i9 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f8 = i8 + i9;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f8, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(containerHeight + f8, containerHeight), 1, containerHeight));
    }
}
