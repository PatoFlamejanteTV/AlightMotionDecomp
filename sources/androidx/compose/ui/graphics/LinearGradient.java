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
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, AbstractC3284p abstractC3284p) {
        this(list, list2, j8, j9, i8);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2923createShaderuvyYCjk(long j8) {
        float m2712getXimpl;
        float m2713getYimpl;
        float m2712getXimpl2;
        float m2713getYimpl2;
        if (Offset.m2712getXimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2712getXimpl = Size.m2781getWidthimpl(j8);
        } else {
            m2712getXimpl = Offset.m2712getXimpl(this.start);
        }
        if (Offset.m2713getYimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2713getYimpl = Size.m2778getHeightimpl(j8);
        } else {
            m2713getYimpl = Offset.m2713getYimpl(this.start);
        }
        if (Offset.m2712getXimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2712getXimpl2 = Size.m2781getWidthimpl(j8);
        } else {
            m2712getXimpl2 = Offset.m2712getXimpl(this.end);
        }
        if (Offset.m2713getYimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2713getYimpl2 = Size.m2778getHeightimpl(j8);
        } else {
            m2713getYimpl2 = Offset.m2713getYimpl(this.end);
        }
        return ShaderKt.m3240LinearGradientShaderVjE6UOU(OffsetKt.Offset(m2712getXimpl, m2713getYimpl), OffsetKt.Offset(m2712getXimpl2, m2713getYimpl2), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (AbstractC3292y.d(this.colors, linearGradient.colors) && AbstractC3292y.d(this.stops, linearGradient.stops) && Offset.m2709equalsimpl0(this.start, linearGradient.start) && Offset.m2709equalsimpl0(this.end, linearGradient.end) && TileMode.m3294equalsimpl0(this.tileMode, linearGradient.tileMode)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2902getIntrinsicSizeNHjbRc() {
        float f8;
        float m2713getYimpl;
        float m2713getYimpl2;
        float m2712getXimpl = Offset.m2712getXimpl(this.start);
        float f9 = Float.NaN;
        if (!Float.isInfinite(m2712getXimpl) && !Float.isNaN(m2712getXimpl)) {
            float m2712getXimpl2 = Offset.m2712getXimpl(this.end);
            if (!Float.isInfinite(m2712getXimpl2) && !Float.isNaN(m2712getXimpl2)) {
                f8 = Math.abs(Offset.m2712getXimpl(this.start) - Offset.m2712getXimpl(this.end));
                m2713getYimpl = Offset.m2713getYimpl(this.start);
                if (!Float.isInfinite(m2713getYimpl) && !Float.isNaN(m2713getYimpl)) {
                    m2713getYimpl2 = Offset.m2713getYimpl(this.end);
                    if (!Float.isInfinite(m2713getYimpl2) && !Float.isNaN(m2713getYimpl2)) {
                        f9 = Math.abs(Offset.m2713getYimpl(this.start) - Offset.m2713getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f8, f9);
            }
        }
        f8 = Float.NaN;
        m2713getYimpl = Offset.m2713getYimpl(this.start);
        if (!Float.isInfinite(m2713getYimpl)) {
            m2713getYimpl2 = Offset.m2713getYimpl(this.end);
            if (!Float.isInfinite(m2713getYimpl2)) {
                f9 = Math.abs(Offset.m2713getYimpl(this.start) - Offset.m2713getYimpl(this.end));
            }
        }
        return SizeKt.Size(f8, f9);
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
        return ((((((hashCode + i8) * 31) + Offset.m2714hashCodeimpl(this.start)) * 31) + Offset.m2714hashCodeimpl(this.end)) * 31) + TileMode.m3295hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m2729isFinitek4lQ0M(this.start)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m2720toStringimpl(this.start)) + ", ";
        }
        if (OffsetKt.m2729isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m2720toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3296toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(list, (i9 & 2) != 0 ? null : list2, j8, j9, (i9 & 16) != 0 ? TileMode.Companion.m3298getClamp3opZhB0() : i8, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j8, long j9, int i8) {
        this.colors = list;
        this.stops = list2;
        this.start = j8;
        this.end = j9;
        this.tileMode = i8;
    }
}
