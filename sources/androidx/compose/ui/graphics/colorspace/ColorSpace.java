package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class ColorSpace {
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ ColorSpace(String str, long j8, int i8, AbstractC3284p abstractC3284p) {
        this(str, j8, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id != colorSpace.id || !AbstractC3292y.d(this.name, colorSpace.name)) {
            return false;
        }
        return ColorModel.m3332equalsimpl0(this.model, colorSpace.model);
    }

    @Size(min = 3)
    public final float[] fromXyz(float f8, float f9, float f10) {
        float[] fArr = new float[ColorModel.m3333getComponentCountimpl(this.model)];
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        return fromXyz(fArr);
    }

    @Size(min = 3)
    public abstract float[] fromXyz(@Size(min = 3) float[] fArr);

    @IntRange(from = 1, to = 4)
    public final int getComponentCount() {
        return ColorModel.m3333getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    public abstract float getMaxValue(@IntRange(from = 0, to = 3) int i8);

    public abstract float getMinValue(@IntRange(from = 0, to = 3) int i8);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m3341getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m3334hashCodeimpl(this.model)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m3335toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float f8, float f9, float f10) {
        float[] xyz = toXyz(f8, f9, f10);
        float f11 = xyz[0];
        float f12 = xyz[1];
        return (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
    }

    @Size(3)
    public final float[] toXyz(float f8, float f9, float f10) {
        return toXyz(new float[]{f8, f9, f10});
    }

    @Size(min = 3)
    public abstract float[] toXyz(@Size(min = 3) float[] fArr);

    public float toZ$ui_graphics_release(float f8, float f9, float f10) {
        return toXyz(f8, f9, f10)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo3342xyzaToColorJlNiLsg$ui_graphics_release(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(f8, f9, f10);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f11, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j8, AbstractC3284p abstractC3284p) {
        this(str, j8);
    }

    private ColorSpace(String str, long j8, int i8) {
        this.name = str;
        this.model = j8;
        this.id = i8;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i8 < -1 || i8 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j8) {
        this(str, j8, -1, null);
    }
}
