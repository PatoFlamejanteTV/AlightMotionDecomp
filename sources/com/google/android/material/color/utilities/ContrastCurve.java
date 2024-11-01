package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d8, double d9, double d10, double d11) {
        this.low = d8;
        this.normal = d9;
        this.medium = d10;
        this.high = d11;
    }

    public double getContrast(double d8) {
        if (d8 <= -1.0d) {
            return this.low;
        }
        if (d8 < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (d8 - (-1.0d)) / 1.0d);
        }
        if (d8 < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (d8 - 0.0d) / 0.5d);
        }
        if (d8 < 1.0d) {
            return MathUtils.lerp(this.medium, this.high, (d8 - 0.5d) / 0.5d);
        }
        return this.high;
    }
}
