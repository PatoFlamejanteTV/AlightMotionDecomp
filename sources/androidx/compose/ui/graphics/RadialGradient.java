package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j8, float f8, int i8, AbstractC3284p abstractC3284p) {
        this(list, list2, j8, f8, i8);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2923createShaderuvyYCjk(long j8) {
        float m2712getXimpl;
        float m2713getYimpl;
        float f8;
        if (OffsetKt.m2733isUnspecifiedk4lQ0M(this.center)) {
            long m2791getCenteruvyYCjk = SizeKt.m2791getCenteruvyYCjk(j8);
            m2712getXimpl = Offset.m2712getXimpl(m2791getCenteruvyYCjk);
            m2713getYimpl = Offset.m2713getYimpl(m2791getCenteruvyYCjk);
        } else {
            if (Offset.m2712getXimpl(this.center) == Float.POSITIVE_INFINITY) {
                m2712getXimpl = Size.m2781getWidthimpl(j8);
            } else {
                m2712getXimpl = Offset.m2712getXimpl(this.center);
            }
            if (Offset.m2713getYimpl(this.center) == Float.POSITIVE_INFINITY) {
                m2713getYimpl = Size.m2778getHeightimpl(j8);
            } else {
                m2713getYimpl = Offset.m2713getYimpl(this.center);
            }
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long Offset = OffsetKt.Offset(m2712getXimpl, m2713getYimpl);
        float f9 = this.radius;
        if (f9 == Float.POSITIVE_INFINITY) {
            f8 = Size.m2780getMinDimensionimpl(j8) / 2;
        } else {
            f8 = f9;
        }
        return ShaderKt.m3242RadialGradientShader8uybcMk(Offset, f8, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (AbstractC3292y.d(this.colors, radialGradient.colors) && AbstractC3292y.d(this.stops, radialGradient.stops) && Offset.m2709equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m3294equalsimpl0(this.tileMode, radialGradient.tileMode)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2902getIntrinsicSizeNHjbRc() {
        float f8 = this.radius;
        if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
            float f9 = this.radius;
            float f10 = 2;
            return SizeKt.Size(f9 * f10, f9 * f10);
        }
        return Size.Companion.m2789getUnspecifiedNHjbRc();
    }

    public int hashCode() {
        int i8;
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        return ((((((hashCode + i8) * 31) + Offset.m2714hashCodeimpl(this.center)) * 31) + Float.floatToIntBits(this.radius)) * 31) + TileMode.m3295hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m2731isSpecifiedk4lQ0M(this.center)) {
            str = "";
        } else {
            str = "center=" + ((Object) Offset.m2720toStringimpl(this.center)) + ", ";
        }
        float f8 = this.radius;
        if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3296toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j8, float f8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(list, (i9 & 2) != 0 ? null : list2, j8, f8, (i9 & 16) != 0 ? TileMode.Companion.m3298getClamp3opZhB0() : i8, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j8, float f8, int i8) {
        this.colors = list;
        this.stops = list2;
        this.center = j8;
        this.radius = f8;
        this.tileMode = i8;
    }
}
