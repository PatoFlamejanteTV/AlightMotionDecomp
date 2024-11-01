package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cornerBasedShape = shapes.small;
        }
        if ((i8 & 2) != 0) {
            cornerBasedShape2 = shapes.medium;
        }
        if ((i8 & 4) != 0) {
            cornerBasedShape3 = shapes.large;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    public final Shapes copy(CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large) {
        AbstractC3292y.i(small, "small");
        AbstractC3292y.i(medium, "medium");
        AbstractC3292y.i(large, "large");
        return new Shapes(small, medium, large);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        if (AbstractC3292y.d(this.small, shapes.small) && AbstractC3292y.d(this.medium, shapes.medium) && AbstractC3292y.d(this.large, shapes.large)) {
            return true;
        }
        return false;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public Shapes(CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large) {
        AbstractC3292y.i(small, "small");
        AbstractC3292y.i(medium, "medium");
        AbstractC3292y.i(large, "large");
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(4)) : cornerBasedShape, (i8 & 2) != 0 ? RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(4)) : cornerBasedShape2, (i8 & 4) != 0 ? RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(0)) : cornerBasedShape3);
    }
}
