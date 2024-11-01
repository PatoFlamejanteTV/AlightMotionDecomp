package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* loaded from: classes.dex */
public interface LazyListLayoutInfo {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            int a9;
            a9 = c.a(lazyListLayoutInfo);
            return a9;
        }

        @Deprecated
        public static int getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            int b9;
            b9 = c.b(lazyListLayoutInfo);
            return b9;
        }

        @Deprecated
        public static int getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            int c8;
            c8 = c.c(lazyListLayoutInfo);
            return c8;
        }

        @Deprecated
        public static Orientation getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            Orientation d8;
            d8 = c.d(lazyListLayoutInfo);
            return d8;
        }

        @Deprecated
        public static boolean getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            boolean e8;
            e8 = c.e(lazyListLayoutInfo);
            return e8;
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m681getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            long f8;
            f8 = c.f(lazyListLayoutInfo);
            return f8;
        }
    }

    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g */
    long mo679getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();
}
