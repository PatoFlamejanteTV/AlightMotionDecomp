package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f8) {
        this.radius = f8 - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f8, float f9, float f10, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((this.radius * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(sqrt, 2.0d));
        shapePath.reset(f9 - sqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + sqrt2);
        shapePath.lineTo(f9, (float) (-((this.radius * Math.sqrt(2.0d)) - this.radius)));
        shapePath.lineTo(f9 + sqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + sqrt2);
    }
}
