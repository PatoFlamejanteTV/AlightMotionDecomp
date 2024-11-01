package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f8, float f9, @NonNull ShapePath shapePath) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, float f10) {
        getCornerPath(f8, f9, shapePath);
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f8, f9, cornerSize.getCornerSize(rectF));
    }
}
