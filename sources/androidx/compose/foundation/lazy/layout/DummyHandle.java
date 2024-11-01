package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class DummyHandle implements LazyLayoutPrefetchState.PrefetchHandle {
    public static final DummyHandle INSTANCE = new DummyHandle();

    private DummyHandle() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public void cancel() {
    }
}
