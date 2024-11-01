package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.K;
import androidx.compose.ui.unit.Density;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(float f8) {
        this.percent = f8;
        if (f8 >= 0.0f && f8 <= 100.0f) {
        } else {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f8);
    }

    public final PercentCornerSize copy(float f8) {
        return new PercentCornerSize(f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ InterfaceC3255g getInspectableElements() {
        return K.a(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return K.b(this);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo820toPxTmRCtEA(long j8, Density density) {
        AbstractC3292y.i(density, "density");
        return Size.m2780getMinDimensionimpl(j8) * (this.percent / 100.0f);
    }

    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.percent);
        sb.append('%');
        return sb.toString();
    }
}
