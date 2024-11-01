package androidx.leanback.widget;

/* loaded from: classes3.dex */
public class ListRow extends Row {
    private final ObjectAdapter mAdapter;
    private CharSequence mContentDescription;

    public ListRow(HeaderItem headerItem, ObjectAdapter objectAdapter) {
        super(headerItem);
        this.mAdapter = objectAdapter;
        verify();
    }

    private void verify() {
        if (this.mAdapter != null) {
        } else {
            throw new IllegalArgumentException("ObjectAdapter cannot be null");
        }
    }

    public final ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    public CharSequence getContentDescription() {
        CharSequence charSequence = this.mContentDescription;
        if (charSequence != null) {
            return charSequence;
        }
        HeaderItem headerItem = getHeaderItem();
        if (headerItem != null) {
            CharSequence contentDescription = headerItem.getContentDescription();
            if (contentDescription != null) {
                return contentDescription;
            }
            return headerItem.getName();
        }
        return null;
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mContentDescription = charSequence;
    }

    public ListRow(long j8, HeaderItem headerItem, ObjectAdapter objectAdapter) {
        super(j8, headerItem);
        this.mAdapter = objectAdapter;
        verify();
    }

    public ListRow(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        verify();
    }
}
