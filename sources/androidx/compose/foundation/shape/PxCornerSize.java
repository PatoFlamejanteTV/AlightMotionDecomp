package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.K;
import androidx.compose.ui.unit.Density;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f8) {
        this.size = f8;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = pxCornerSize.size;
        }
        return pxCornerSize.copy(f8);
    }

    public final PxCornerSize copy(float f8) {
        return new PxCornerSize(f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
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
        return Float.floatToIntBits(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo820toPxTmRCtEA(long j8, Density density) {
        AbstractC3292y.i(density, "density");
        return this.size;
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return this.size + "px";
    }
}
