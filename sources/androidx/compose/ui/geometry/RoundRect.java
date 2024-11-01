package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m2766RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m2697getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, j8, j9, j10, j11);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f8, float f9, float f10, float f11) {
        float f12 = f9 + f10;
        if (f12 > f11 && f12 != 0.0f) {
            return Math.min(f8, f11 / f12);
        }
        return f8;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m2688getYimpl(this.bottomLeftCornerRadius), CornerRadius.m2688getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m2687getXimpl(this.topLeftCornerRadius), CornerRadius.m2687getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m2688getYimpl(this.topRightCornerRadius), CornerRadius.m2688getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m2687getXimpl(this.bottomRightCornerRadius), CornerRadius.m2687getXimpl(this.bottomLeftCornerRadius), getWidth());
            RoundRect roundRect2 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m2687getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m2688getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2687getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m2688getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2687getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m2688getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2687getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m2688getYimpl(this.bottomLeftCornerRadius) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m2754component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m2755component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m2756component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m2757component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2758containsk4lQ0M(long j8) {
        float m2712getXimpl;
        float m2713getYimpl;
        float m2687getXimpl;
        float m2688getYimpl;
        if (Offset.m2712getXimpl(j8) < this.left || Offset.m2712getXimpl(j8) >= this.right || Offset.m2713getYimpl(j8) < this.top || Offset.m2713getYimpl(j8) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m2712getXimpl(j8) < this.left + CornerRadius.m2687getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m2713getYimpl(j8) < this.top + CornerRadius.m2688getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            m2712getXimpl = (Offset.m2712getXimpl(j8) - this.left) - CornerRadius.m2687getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m2713getYimpl = (Offset.m2713getYimpl(j8) - this.top) - CornerRadius.m2688getYimpl(scaledRadiiRect.topLeftCornerRadius);
            m2687getXimpl = CornerRadius.m2687getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m2688getYimpl = CornerRadius.m2688getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m2712getXimpl(j8) > this.right - CornerRadius.m2687getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m2713getYimpl(j8) < this.top + CornerRadius.m2688getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            m2712getXimpl = (Offset.m2712getXimpl(j8) - this.right) + CornerRadius.m2687getXimpl(scaledRadiiRect.topRightCornerRadius);
            m2713getYimpl = (Offset.m2713getYimpl(j8) - this.top) - CornerRadius.m2688getYimpl(scaledRadiiRect.topRightCornerRadius);
            m2687getXimpl = CornerRadius.m2687getXimpl(scaledRadiiRect.topRightCornerRadius);
            m2688getYimpl = CornerRadius.m2688getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m2712getXimpl(j8) > this.right - CornerRadius.m2687getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m2713getYimpl(j8) > this.bottom - CornerRadius.m2688getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            m2712getXimpl = (Offset.m2712getXimpl(j8) - this.right) + CornerRadius.m2687getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2713getYimpl = (Offset.m2713getYimpl(j8) - this.bottom) + CornerRadius.m2688getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2687getXimpl = CornerRadius.m2687getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2688getYimpl = CornerRadius.m2688getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m2712getXimpl(j8) >= this.left + CornerRadius.m2687getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m2713getYimpl(j8) <= this.bottom - CornerRadius.m2688getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            m2712getXimpl = (Offset.m2712getXimpl(j8) - this.left) - CornerRadius.m2687getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2713getYimpl = (Offset.m2713getYimpl(j8) - this.bottom) + CornerRadius.m2688getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2687getXimpl = CornerRadius.m2687getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2688getYimpl = CornerRadius.m2688getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f8 = m2712getXimpl / m2687getXimpl;
        float f9 = m2713getYimpl / m2688getYimpl;
        if ((f8 * f8) + (f9 * f9) > 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m2759copyMDFrsts(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11) {
        return new RoundRect(f8, f9, f10, f11, j8, j9, j10, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m2686equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2686equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2686equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2686equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2760getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2761getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2762getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2763getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + CornerRadius.m2689hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m2689hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m2689hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m2689hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        long j8 = this.topLeftCornerRadius;
        long j9 = this.topRightCornerRadius;
        long j10 = this.bottomRightCornerRadius;
        long j11 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (CornerRadius.m2686equalsimpl0(j8, j9) && CornerRadius.m2686equalsimpl0(j9, j10) && CornerRadius.m2686equalsimpl0(j10, j11)) {
            if (CornerRadius.m2687getXimpl(j8) == CornerRadius.m2688getYimpl(j8)) {
                return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2687getXimpl(j8), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2687getXimpl(j8), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2688getYimpl(j8), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m2693toStringimpl(j8)) + ", topRight=" + ((Object) CornerRadius.m2693toStringimpl(j9)) + ", bottomRight=" + ((Object) CornerRadius.m2693toStringimpl(j10)) + ", bottomLeft=" + ((Object) CornerRadius.m2693toStringimpl(j11)) + ')';
    }

    private RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
        this.topLeftCornerRadius = j8;
        this.topRightCornerRadius = j9;
        this.bottomRightCornerRadius = j10;
        this.bottomLeftCornerRadius = j11;
    }

    public /* synthetic */ RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, int i8, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, (i8 & 16) != 0 ? CornerRadius.Companion.m2697getZerokKHJgLs() : j8, (i8 & 32) != 0 ? CornerRadius.Companion.m2697getZerokKHJgLs() : j9, (i8 & 64) != 0 ? CornerRadius.Companion.m2697getZerokKHJgLs() : j10, (i8 & 128) != 0 ? CornerRadius.Companion.m2697getZerokKHJgLs() : j11, null);
    }
}
