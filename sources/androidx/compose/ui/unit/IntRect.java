package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public IntRect(int i8, int i9, int i10, int i11) {
        this.left = i8;
        this.top = i9;
        this.right = i10;
        this.bottom = i11;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = intRect.left;
        }
        if ((i12 & 2) != 0) {
            i9 = intRect.top;
        }
        if ((i12 & 4) != 0) {
            i10 = intRect.right;
        }
        if ((i12 & 8) != 0) {
            i11 = intRect.bottom;
        }
        return intRect.copy(i8, i9, i10, i11);
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
    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m5297getSizeYbymL2g$annotations() {
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

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m5298containsgyyYBs(long j8) {
        if (IntOffset.m5279getXimpl(j8) >= this.left && IntOffset.m5279getXimpl(j8) < this.right && IntOffset.m5280getYimpl(j8) >= this.top && IntOffset.m5280getYimpl(j8) < this.bottom) {
            return true;
        }
        return false;
    }

    public final IntRect copy(int i8, int i9, int i10, int i11) {
        return new IntRect(i8, i9, i10, i11);
    }

    @Stable
    public final IntRect deflate(int i8) {
        return inflate(-i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m5299getBottomCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.bottom);
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m5300getBottomLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m5301getBottomRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.bottom);
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m5302getCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top + (getHeight() / 2));
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m5303getCenterLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top + (getHeight() / 2));
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m5304getCenterRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top + (getHeight() / 2));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5305getSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m5306getTopCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top);
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m5307getTopLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top);
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m5308getTopRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @Stable
    public final IntRect inflate(int i8) {
        return new IntRect(this.left - i8, this.top - i8, this.right + i8, this.bottom + i8);
    }

    @Stable
    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(IntRect intRect) {
        if (this.right <= intRect.left || intRect.right <= this.left || this.bottom <= intRect.top || intRect.bottom <= this.top) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }

    @Stable
    public final IntRect translate(int i8, int i9) {
        return new IntRect(this.left + i8, this.top + i9, this.right + i8, this.bottom + i9);
    }

    @Stable
    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m5309translategyyYBs(long j8) {
        return new IntRect(this.left + IntOffset.m5279getXimpl(j8), this.top + IntOffset.m5280getYimpl(j8), this.right + IntOffset.m5279getXimpl(j8), this.bottom + IntOffset.m5280getYimpl(j8));
    }
}
