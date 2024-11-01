package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d8 = dArr[0] - dArr2[0];
        double d9 = dArr[1] - dArr2[1];
        double d10 = dArr[2] - dArr2[2];
        return (d8 * d8) + (d9 * d9) + (d10 * d10);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i8) {
        double[] labFromArgb = ColorUtils.labFromArgb(i8);
        return new double[]{labFromArgb[0], labFromArgb[1], labFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
