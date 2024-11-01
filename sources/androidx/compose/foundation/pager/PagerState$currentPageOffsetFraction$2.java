package androidx.compose.foundation.pager;

import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerState$currentPageOffsetFraction$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$currentPageOffsetFraction$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        PageInfo pageInfo;
        int pageAvailableSpace;
        float j8;
        List<PageInfo> visiblePagesInfo = this.this$0.getLayoutInfo$foundation_release().getVisiblePagesInfo();
        PagerState pagerState = this.this$0;
        int size = visiblePagesInfo.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                pageInfo = null;
                break;
            }
            pageInfo = visiblePagesInfo.get(i8);
            if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                break;
            }
            i8++;
        }
        PageInfo pageInfo2 = pageInfo;
        int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
        pageAvailableSpace = this.this$0.getPageAvailableSpace();
        float f8 = pageAvailableSpace;
        if (f8 == 0.0f) {
            j8 = this.this$0.getInitialPageOffsetFraction();
        } else {
            j8 = m.j((-offset) / f8, -0.5f, 0.5f);
        }
        return Float.valueOf(j8);
    }
}
