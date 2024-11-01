package androidx.leanback.widget;

/* loaded from: classes3.dex */
public class Row {
    private static final int FLAG_ID_USE_HEADER = 1;
    private static final int FLAG_ID_USE_ID = 0;
    private static final int FLAG_ID_USE_MASK = 1;
    private HeaderItem mHeaderItem;
    private int mFlags = 1;
    private long mId = -1;

    public Row(long j8, HeaderItem headerItem) {
        setId(j8);
        setHeaderItem(headerItem);
    }

    final int getFlags() {
        return this.mFlags;
    }

    public final HeaderItem getHeaderItem() {
        return this.mHeaderItem;
    }

    public final long getId() {
        if ((this.mFlags & 1) == 1) {
            HeaderItem headerItem = getHeaderItem();
            if (headerItem != null) {
                return headerItem.getId();
            }
            return -1L;
        }
        return this.mId;
    }

    public boolean isRenderedAsRowView() {
        return true;
    }

    final void setFlags(int i8, int i9) {
        this.mFlags = (i8 & i9) | (this.mFlags & (~i9));
    }

    public final void setHeaderItem(HeaderItem headerItem) {
        this.mHeaderItem = headerItem;
    }

    public final void setId(long j8) {
        this.mId = j8;
        setFlags(0, 1);
    }

    public Row(HeaderItem headerItem) {
        setHeaderItem(headerItem);
    }

    public Row() {
    }
}
