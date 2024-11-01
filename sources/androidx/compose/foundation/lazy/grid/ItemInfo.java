package androidx.compose.foundation.lazy.grid;

/* loaded from: classes.dex */
final class ItemInfo {
    private int crossAxisOffset;
    private int crossAxisSize;

    public ItemInfo(int i8, int i9) {
        this.crossAxisSize = i8;
        this.crossAxisOffset = i9;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void setCrossAxisOffset(int i8) {
        this.crossAxisOffset = i8;
    }

    public final void setCrossAxisSize(int i8) {
        this.crossAxisSize = i8;
    }
}
