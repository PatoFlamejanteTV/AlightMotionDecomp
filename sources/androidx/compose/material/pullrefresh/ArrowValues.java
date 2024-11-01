package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Immutable;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class ArrowValues {
    private final float endAngle;
    private final float rotation;
    private final float scale;
    private final float startAngle;

    public ArrowValues(float f8, float f9, float f10, float f11) {
        this.rotation = f8;
        this.startAngle = f9;
        this.endAngle = f10;
        this.scale = f11;
    }

    public final float getEndAngle() {
        return this.endAngle;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }
}
