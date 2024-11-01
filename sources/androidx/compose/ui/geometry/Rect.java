package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public Rect(float f8, float f9, float f10, float f11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = rect.left;
        }
        if ((i8 & 2) != 0) {
            f9 = rect.top;
        }
        if ((i8 & 4) != 0) {
            f10 = rect.right;
        }
        if ((i8 & 8) != 0) {
            f11 = rect.bottom;
        }
        return rect.copy(f8, f9, f10, f11);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m2737getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
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

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2738containsk4lQ0M(long j8) {
        if (Offset.m2712getXimpl(j8) >= this.left && Offset.m2712getXimpl(j8) < this.right && Offset.m2713getYimpl(j8) >= this.top && Offset.m2713getYimpl(j8) < this.bottom) {
            return true;
        }
        return false;
    }

    public final Rect copy(float f8, float f9, float f10, float f11) {
        return new Rect(f8, f9, f10, f11);
    }

    @Stable
    public final Rect deflate(float f8) {
        return inflate(-f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m2739getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.bottom);
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m2740getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m2741getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m2742getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m2743getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m2744getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2745getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m2746getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m2747getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m2748getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom);
    }

    @Stable
    public final Rect inflate(float f8) {
        return new Rect(this.left - f8, this.top - f8, this.right + f8, this.bottom + f8);
    }

    @Stable
    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final boolean isFinite() {
        float f8 = this.left;
        if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
            float f9 = this.top;
            if (!Float.isInfinite(f9) && !Float.isNaN(f9)) {
                float f10 = this.right;
                if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                    float f11 = this.bottom;
                    if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        if (this.left < Float.POSITIVE_INFINITY && this.top < Float.POSITIVE_INFINITY && this.right < Float.POSITIVE_INFINITY && this.bottom < Float.POSITIVE_INFINITY) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(Rect rect) {
        if (this.right <= rect.left || rect.right <= this.left || this.bottom <= rect.top || rect.bottom <= this.top) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    public final Rect translate(float f8, float f9) {
        return new Rect(this.left + f8, this.top + f9, this.right + f8, this.bottom + f9);
    }

    @Stable
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m2749translatek4lQ0M(long j8) {
        return new Rect(this.left + Offset.m2712getXimpl(j8), this.top + Offset.m2713getYimpl(j8), this.right + Offset.m2712getXimpl(j8), this.bottom + Offset.m2713getYimpl(j8));
    }

    @Stable
    public final Rect intersect(float f8, float f9, float f10, float f11) {
        return new Rect(Math.max(this.left, f8), Math.max(this.top, f9), Math.min(this.right, f10), Math.min(this.bottom, f11));
    }
}
