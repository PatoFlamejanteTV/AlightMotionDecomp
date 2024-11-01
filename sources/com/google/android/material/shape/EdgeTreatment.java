package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class EdgeTreatment {
    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f8, float f9, @NonNull ShapePath shapePath) {
        getEdgePath(f8, f8 / 2.0f, f9, shapePath);
    }

    public void getEdgePath(float f8, float f9, float f10, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f8, 0.0f);
    }
}
