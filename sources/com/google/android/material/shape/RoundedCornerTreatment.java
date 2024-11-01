package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, float f10) {
        shapePath.reset(0.0f, f10 * f9, 180.0f, 180.0f - f8);
        float f11 = f10 * 2.0f * f9;
        shapePath.addArc(0.0f, 0.0f, f11, f11, 180.0f, f8);
    }

    @Deprecated
    public RoundedCornerTreatment(float f8) {
        this.radius = f8;
    }
}
