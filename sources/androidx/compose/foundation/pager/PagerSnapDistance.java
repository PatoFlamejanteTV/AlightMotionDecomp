package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface PagerSnapDistance {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PagerSnapDistance atMost(int i8) {
            if (i8 >= 0) {
                return new PagerSnapDistanceMaxPages(i8);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i8 + '.').toString());
        }
    }

    int calculateTargetPage(int i8, int i9, float f8, int i10, int i11);
}
