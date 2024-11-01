package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: classes3.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f8, float f9, float f10) {
        this.fabMargin = f8;
        this.roundedCornerRadius = f9;
        setCradleVerticalOffset(f10);
        this.horizontalOffset = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f8, float f9, float f10, @NonNull ShapePath shapePath) {
        boolean z8;
        float f11;
        float f12;
        float f13 = this.fabDiameter;
        if (f13 == 0.0f) {
            shapePath.lineTo(f8, 0.0f);
            return;
        }
        float f14 = ((this.fabMargin * 2.0f) + f13) / 2.0f;
        float f15 = f10 * this.roundedCornerRadius;
        float f16 = f9 + this.horizontalOffset;
        float f17 = (this.cradleVerticalOffset * f10) + ((1.0f - f10) * f14);
        if (f17 / f14 >= 1.0f) {
            shapePath.lineTo(f8, 0.0f);
            return;
        }
        float f18 = this.fabCornerSize;
        float f19 = f18 * f10;
        if (f18 != -1.0f && Math.abs((f18 * 2.0f) - f13) >= 0.1f) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z8) {
            f12 = ROUNDED_CORNER_FAB_OFFSET;
            f11 = 0.0f;
        } else {
            f11 = f17;
            f12 = 0.0f;
        }
        float f20 = f14 + f15;
        float f21 = f11 + f15;
        float sqrt = (float) Math.sqrt((f20 * f20) - (f21 * f21));
        float f22 = f16 - sqrt;
        float f23 = f16 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f21));
        float f24 = (90.0f - degrees) + f12;
        shapePath.lineTo(f22, 0.0f);
        float f25 = f15 * 2.0f;
        shapePath.addArc(f22 - f15, 0.0f, f22 + f15, f25, 270.0f, degrees);
        if (z8) {
            shapePath.addArc(f16 - f14, (-f14) - f11, f16 + f14, f14 - f11, 180.0f - f24, (f24 * 2.0f) - 180.0f);
        } else {
            float f26 = this.fabMargin;
            float f27 = f19 * 2.0f;
            float f28 = f16 - f14;
            shapePath.addArc(f28, -(f19 + f26), f28 + f26 + f27, f26 + f19, 180.0f - f24, ((f24 * 2.0f) - 180.0f) / 2.0f);
            float f29 = f16 + f14;
            float f30 = this.fabMargin;
            shapePath.lineTo(f29 - ((f30 / 2.0f) + f19), f30 + f19);
            float f31 = this.fabMargin;
            shapePath.addArc(f29 - (f27 + f31), -(f19 + f31), f29, f31 + f19, 90.0f, f24 - 90.0f);
        }
        shapePath.addArc(f23 - f15, 0.0f, f23 + f15, f25, 270.0f - degrees, degrees);
        shapePath.lineTo(f8, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCradleVerticalOffset(@FloatRange(from = 0.0d) float f8) {
        if (f8 >= 0.0f) {
            this.cradleVerticalOffset = f8;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void setFabCornerSize(float f8) {
        this.fabCornerSize = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFabCradleMargin(float f8) {
        this.fabMargin = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFabCradleRoundedCornerRadius(float f8) {
        this.roundedCornerRadius = f8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f8) {
        this.fabDiameter = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHorizontalOffset(float f8) {
        this.horizontalOffset = f8;
    }
}
