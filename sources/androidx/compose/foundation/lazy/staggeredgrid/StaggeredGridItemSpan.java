package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private StaggeredGridItemSpan(int i8) {
        this.value = i8;
    }

    public final int getValue$foundation_release() {
        return this.value;
    }
}
