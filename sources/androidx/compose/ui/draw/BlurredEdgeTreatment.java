package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m2606constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m2606constructorimpl(null);
    private final Shape shape;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m2612getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m2613getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m2605boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m2606constructorimpl(Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2607equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && AbstractC3292y.d(shape, ((BlurredEdgeTreatment) obj).m2611unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2608equalsimpl0(Shape shape, Shape shape2) {
        return AbstractC3292y.d(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2609hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2610toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m2607equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m2609hashCodeimpl(this.shape);
    }

    public String toString() {
        return m2610toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m2611unboximpl() {
        return this.shape;
    }
}
