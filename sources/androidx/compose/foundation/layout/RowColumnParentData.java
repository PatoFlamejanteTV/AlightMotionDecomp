package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RowColumnParentData {
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f8, boolean z8, CrossAxisAlignment crossAxisAlignment, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = rowColumnParentData.weight;
        }
        if ((i8 & 2) != 0) {
            z8 = rowColumnParentData.fill;
        }
        if ((i8 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        return rowColumnParentData.copy(f8, z8, crossAxisAlignment);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final RowColumnParentData copy(float f8, boolean z8, CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnParentData(f8, z8, crossAxisAlignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && AbstractC3292y.d(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.weight) * 31;
        boolean z8 = this.fill;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        int i9 = (floatToIntBits + i8) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        if (crossAxisAlignment == null) {
            hashCode = 0;
        } else {
            hashCode = crossAxisAlignment.hashCode();
        }
        return i9 + hashCode;
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z8) {
        this.fill = z8;
    }

    public final void setWeight(float f8) {
        this.weight = f8;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public RowColumnParentData(float f8, boolean z8, CrossAxisAlignment crossAxisAlignment) {
        this.weight = f8;
        this.fill = z8;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnParentData(float f8, boolean z8, CrossAxisAlignment crossAxisAlignment, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? 0.0f : f8, (i8 & 2) != 0 ? true : z8, (i8 & 4) != 0 ? null : crossAxisAlignment);
    }
}
