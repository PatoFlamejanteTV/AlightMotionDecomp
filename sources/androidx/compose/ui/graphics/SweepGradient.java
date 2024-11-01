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
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j8, List list, List list2, AbstractC3284p abstractC3284p) {
        this(j8, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2923createShaderuvyYCjk(long j8) {
        float m2712getXimpl;
        float m2713getYimpl;
        long Offset;
        if (OffsetKt.m2733isUnspecifiedk4lQ0M(this.center)) {
            Offset = SizeKt.m2791getCenteruvyYCjk(j8);
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
            Offset = OffsetKt.Offset(m2712getXimpl, m2713getYimpl);
        }
        return ShaderKt.m3244SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (Offset.m2709equalsimpl0(this.center, sweepGradient.center) && AbstractC3292y.d(this.colors, sweepGradient.colors) && AbstractC3292y.d(this.stops, sweepGradient.stops)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int m2714hashCodeimpl = ((Offset.m2714hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        return m2714hashCodeimpl + i8;
    }

    public String toString() {
        String str;
        if (OffsetKt.m2731isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m2720toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    public /* synthetic */ SweepGradient(long j8, List list, List list2, int i8, AbstractC3284p abstractC3284p) {
        this(j8, list, (i8 & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j8, List<Color> list, List<Float> list2) {
        this.center = j8;
        this.colors = list;
        this.stops = list2;
    }
}
