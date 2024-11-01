package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Shapes {
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i8 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape2;
        if ((i8 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        if ((i8 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        CornerBasedShape cornerBasedShape8 = cornerBasedShape4;
        if ((i8 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8, cornerBasedShape5);
    }

    public final Shapes copy(CornerBasedShape extraSmall, CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large, CornerBasedShape extraLarge) {
        AbstractC3292y.i(extraSmall, "extraSmall");
        AbstractC3292y.i(small, "small");
        AbstractC3292y.i(medium, "medium");
        AbstractC3292y.i(large, "large");
        AbstractC3292y.i(extraLarge, "extraLarge");
        return new Shapes(extraSmall, small, medium, large, extraLarge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        if (AbstractC3292y.d(this.extraSmall, shapes.extraSmall) && AbstractC3292y.d(this.small, shapes.small) && AbstractC3292y.d(this.medium, shapes.medium) && AbstractC3292y.d(this.large, shapes.large) && AbstractC3292y.d(this.extraLarge, shapes.extraLarge)) {
            return true;
        }
        return false;
    }

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
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
        return (((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }

    public Shapes(CornerBasedShape extraSmall, CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large, CornerBasedShape extraLarge) {
        AbstractC3292y.i(extraSmall, "extraSmall");
        AbstractC3292y.i(small, "small");
        AbstractC3292y.i(medium, "medium");
        AbstractC3292y.i(large, "large");
        AbstractC3292y.i(extraLarge, "extraLarge");
        this.extraSmall = extraSmall;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i8 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i8 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i8 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i8 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
