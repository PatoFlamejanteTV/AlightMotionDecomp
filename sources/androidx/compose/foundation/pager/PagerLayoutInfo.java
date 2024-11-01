package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface PagerLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    PageInfo getClosestPageToSnapPosition();

    Orientation getOrientation();

    int getPageSize();

    int getPageSpacing();

    int getPagesCount();

    boolean getReverseLayout();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo789getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<PageInfo> getVisiblePagesInfo();
}
