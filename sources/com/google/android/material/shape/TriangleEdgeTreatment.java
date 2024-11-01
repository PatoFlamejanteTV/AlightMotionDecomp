package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f8, boolean z8) {
        this.size = f8;
        this.inside = z8;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f8, float f9, float f10, @NonNull ShapePath shapePath) {
        if (this.inside) {
            shapePath.lineTo(f9 - (this.size * f10), 0.0f);
            float f11 = this.size;
            shapePath.lineTo(f9, f11 * f10, (f11 * f10) + f9, 0.0f);
            shapePath.lineTo(f8, 0.0f);
            return;
        }
        float f12 = this.size;
        shapePath.lineTo(f9 - (f12 * f10), 0.0f, f9, (-f12) * f10);
        shapePath.lineTo(f9 + (this.size * f10), 0.0f, f8, 0.0f);
    }
}
