package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* loaded from: classes3.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f8, float f9, float f10, float f11) {
        if (f9 > f11) {
            return new PointF(f10, f9);
        }
        return new PointF(f8, f11);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f8, f9);
        PointF controlPoint = getControlPoint(f8, f9, f10, f11);
        path.quadTo(controlPoint.x, controlPoint.y, f10, f11);
        return path;
    }
}
