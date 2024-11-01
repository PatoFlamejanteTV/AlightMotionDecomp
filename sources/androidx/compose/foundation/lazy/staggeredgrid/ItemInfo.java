package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes.dex */
final class ItemInfo {
    private int crossAxisOffset;
    private int lane;
    private int span;

    public ItemInfo(int i8, int i9, int i10) {
        this.lane = i8;
        this.span = i9;
        this.crossAxisOffset = i10;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getSpan() {
        return this.span;
    }

    public final void setCrossAxisOffset(int i8) {
        this.crossAxisOffset = i8;
    }

    public final void setLane(int i8) {
        this.lane = i8;
    }

    public final void setSpan(int i8) {
        this.span = i8;
    }
}
