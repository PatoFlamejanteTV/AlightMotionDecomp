package androidx.compose.foundation.lazy;

import Q5.I;
import U5.d;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final LazyListState state, final boolean z8) {
        AbstractC3292y.i(state, "state");
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object animateScrollBy(float f8, d dVar) {
                Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(LazyListState.this, f8, null, dVar, 2, null);
                if (animateScrollBy$default == V5.b.e()) {
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
                return LazyListState.this.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getCurrentPosition() {
                return LazyListState.this.getFirstVisibleItemIndex() + (LazyListState.this.getFirstVisibleItemScrollOffset() / 100000.0f);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i8, d dVar) {
                Object scrollToItem$default = LazyListState.scrollToItem$default(LazyListState.this, i8, 0, dVar, 2, null);
                if (scrollToItem$default == V5.b.e()) {
                    return scrollToItem$default;
                }
                return I.f8786a;
            }
        };
    }
}
