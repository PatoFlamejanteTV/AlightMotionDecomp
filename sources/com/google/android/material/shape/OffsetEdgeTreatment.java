package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f8) {
        this.other = edgeTreatment;
        this.offset = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f8, float f9, float f10, @NonNull ShapePath shapePath) {
        this.other.getEdgePath(f8, f9 - this.offset, f10, shapePath);
    }
}
