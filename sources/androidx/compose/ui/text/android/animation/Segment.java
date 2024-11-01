package androidx.compose.ui.text.android.animation;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class Segment {
    public static final int $stable = 0;
    private final int bottom;
    private final int endOffset;
    private final int left;
    private final int right;
    private final int startOffset;
    private final int top;

    public Segment(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.startOffset = i8;
        this.endOffset = i9;
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public static /* synthetic */ Segment copy$default(Segment segment, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i8 = segment.startOffset;
        }
        if ((i14 & 2) != 0) {
            i9 = segment.endOffset;
        }
        int i15 = i9;
        if ((i14 & 4) != 0) {
            i10 = segment.left;
        }
        int i16 = i10;
        if ((i14 & 8) != 0) {
            i11 = segment.top;
        }
        int i17 = i11;
        if ((i14 & 16) != 0) {
            i12 = segment.right;
        }
        int i18 = i12;
        if ((i14 & 32) != 0) {
            i13 = segment.bottom;
        }
        return segment.copy(i8, i15, i16, i17, i18, i13);
    }

    public final int component1() {
        return this.startOffset;
    }

    public final int component2() {
        return this.endOffset;
    }

    public final int component3() {
        return this.left;
    }

    public final int component4() {
        return this.top;
    }

    public final int component5() {
        return this.right;
    }

    public final int component6() {
        return this.bottom;
    }

    public final Segment copy(int i8, int i9, int i10, int i11, int i12, int i13) {
        return new Segment(i8, i9, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((this.startOffset * 31) + this.endOffset) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "Segment(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
