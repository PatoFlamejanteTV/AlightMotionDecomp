package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;

/* loaded from: classes.dex */
final class LinearFontScaleConverter implements FontScaleConverter {
    private final float fontScale;

    public LinearFontScaleConverter(float f8) {
        this.fontScale = f8;
    }

    private final float component1() {
        return this.fontScale;
    }

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f8);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f8) {
        return f8 / this.fontScale;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f8) {
        return f8 * this.fontScale;
    }

    public final LinearFontScaleConverter copy(float f8) {
        return new LinearFontScaleConverter(f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) obj).fontScale) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fontScale);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.fontScale + ')';
    }
}
