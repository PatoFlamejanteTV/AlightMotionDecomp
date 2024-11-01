package androidx.compose.foundation.pager;

import Q5.I;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final PagerState state, final boolean z8) {
        AbstractC3292y.i(state, "state");
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object animateScrollBy(float f8, d dVar) {
                Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(PagerState.this, f8, null, dVar, 2, null);
                if (animateScrollBy$default == b.e()) {
                    return animateScrollBy$default;
                }
                return I.f8786a;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                if (z8) {
                    return new CollectionInfo(-1, 1);
                }
                return new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return PagerState.this.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getCurrentPosition() {
                return PagerState.this.getFirstVisiblePage$foundation_release() + (PagerState.this.getFirstVisiblePageOffset$foundation_release() / 100000.0f);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i8, d dVar) {
                Object scrollToPage$default = PagerState.scrollToPage$default(PagerState.this, i8, 0.0f, dVar, 2, null);
                if (scrollToPage$default == b.e()) {
                    return scrollToPage$default;
                }
                return I.f8786a;
            }
        };
    }
}
