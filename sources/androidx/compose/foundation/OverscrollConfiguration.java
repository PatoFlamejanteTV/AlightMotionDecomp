package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j8, PaddingValues paddingValues, AbstractC3284p abstractC3284p) {
        this(j8, paddingValues);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3292y.d(OverscrollConfiguration.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        if (Color.m2949equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && AbstractC3292y.d(this.drawPadding, overscrollConfiguration.drawPadding)) {
            return true;
        }
        return false;
    }

    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m343getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (Color.m2955hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m2956toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j8, PaddingValues drawPadding) {
        AbstractC3292y.i(drawPadding, "drawPadding");
        this.glowColor = j8;
        this.drawPadding = drawPadding;
    }

    public /* synthetic */ OverscrollConfiguration(long j8, PaddingValues paddingValues, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? ColorKt.Color(4284900966L) : j8, (i8 & 2) != 0 ? PaddingKt.m572PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
