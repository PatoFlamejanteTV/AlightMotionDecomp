package androidx.leanback.widget;

/* loaded from: classes3.dex */
public class PageRow extends Row {
    public PageRow(HeaderItem headerItem) {
        super(headerItem);
    }

    @Override // androidx.leanback.widget.Row
    public final boolean isRenderedAsRowView() {
        return false;
    }
}
