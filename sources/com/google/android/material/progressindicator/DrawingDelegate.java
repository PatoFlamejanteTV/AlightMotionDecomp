package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes3.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    /* loaded from: classes3.dex */
    protected static class ActiveIndicator {

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float endFraction;

        @Px
        int gapSize;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s8) {
        this.spec = s8;
    }

    abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f8, boolean z8, boolean z9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9, @Px int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredHeight();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredWidth();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z8, boolean z9) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f8, z8, z9);
    }
}
