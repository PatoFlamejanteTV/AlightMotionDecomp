package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, float f10) {
        shapePath.reset(0.0f, f10 * f9, 180.0f, 180.0f - f8);
        double d8 = f10;
        double d9 = f9;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f8)) * d8 * d9), (float) (Math.sin(Math.toRadians(90.0f - f8)) * d8 * d9));
    }

    @Deprecated
    public CutCornerTreatment(float f8) {
        this.size = f8;
    }
}
