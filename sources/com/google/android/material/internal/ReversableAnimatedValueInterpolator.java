package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator of(boolean z8, @NonNull TimeInterpolator timeInterpolator) {
        if (z8) {
            return timeInterpolator;
        }
        return new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f8);
    }
}
