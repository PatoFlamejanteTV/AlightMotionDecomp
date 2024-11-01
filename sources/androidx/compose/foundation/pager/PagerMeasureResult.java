package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final PageInfo closestPageToSnapPosition;
    private final float consumedScroll;
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageOffset;
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final int pagesCount;
    private final boolean reverseLayout;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<PageInfo> visiblePagesInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerMeasureResult(List<? extends PageInfo> visiblePagesInfo, int i8, int i9, int i10, int i11, Orientation orientation, int i12, int i13, boolean z8, float f8, MeasuredPage measuredPage, PageInfo pageInfo, int i14, boolean z9, MeasureResult measureResult) {
        AbstractC3292y.i(visiblePagesInfo, "visiblePagesInfo");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(measureResult, "measureResult");
        this.visiblePagesInfo = visiblePagesInfo;
        this.pagesCount = i8;
        this.pageSize = i9;
        this.pageSpacing = i10;
        this.afterContentPadding = i11;
        this.orientation = orientation;
        this.viewportStartOffset = i12;
        this.viewportEndOffset = i13;
        this.reverseLayout = z8;
        this.consumedScroll = f8;
        this.firstVisiblePage = measuredPage;
        this.closestPageToSnapPosition = pageInfo;
        this.firstVisiblePageOffset = i14;
        this.canScrollForward = z9;
        this.$$delegate_0 = measureResult;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public PageInfo getClosestPageToSnapPosition() {
        return this.closestPageToSnapPosition;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPagesCount() {
        return this.pagesCount;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo789getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public List<PageInfo> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }
}
