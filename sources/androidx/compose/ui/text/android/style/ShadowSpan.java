package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ShadowSpan extends CharacterStyle {
    public static final int $stable = 0;
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowSpan(int i8, float f8, float f9, float f10) {
        this.color = i8;
        this.offsetX = f8;
        this.offsetY = f9;
        this.radius = f10;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
