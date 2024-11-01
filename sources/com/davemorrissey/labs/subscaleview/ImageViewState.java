package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ImageViewState implements Serializable {
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;

    public ImageViewState(float f8, @NonNull PointF pointF, int i8) {
        this.scale = f8;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i8;
    }

    @NonNull
    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}
