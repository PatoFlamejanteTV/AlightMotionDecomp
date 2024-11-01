package androidx.leanback.widget;

/* loaded from: classes3.dex */
public class SectionRow extends Row {
    public SectionRow(HeaderItem headerItem) {
        super(headerItem);
    }

    @Override // androidx.leanback.widget.Row
    public final boolean isRenderedAsRowView() {
        return false;
    }

    public SectionRow(long j8, String str) {
        super(new HeaderItem(j8, str));
    }

    public SectionRow(String str) {
        super(new HeaderItem(str));
    }
}
