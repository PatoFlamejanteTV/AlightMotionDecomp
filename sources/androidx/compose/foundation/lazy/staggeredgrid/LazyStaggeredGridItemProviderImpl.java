package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemProviderImpl implements LazyStaggeredGridItemProvider {
    private final LazyStaggeredGridIntervalContent intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridItemProviderImpl(LazyStaggeredGridState state, LazyStaggeredGridIntervalContent intervalContent, LazyLayoutKeyIndexMap keyIndexMap) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(intervalContent, "intervalContent");
        AbstractC3292y.i(keyIndexMap, "keyIndexMap");
        this.state = state;
        this.intervalContent = intervalContent;
        this.keyIndexMap = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i8, Object key, Composer composer, int i9) {
        AbstractC3292y.i(key, "key");
        Composer startRestartGroup = composer.startRestartGroup(89098518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(89098518, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i8, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 608834466, true, new LazyStaggeredGridItemProviderImpl$Item$1(this, i8)), startRestartGroup, ((i9 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridItemProviderImpl$Item$2(this, i8, key, i9));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyStaggeredGridItemProviderImpl)) {
            return false;
        }
        return AbstractC3292y.d(this.intervalContent, ((LazyStaggeredGridItemProviderImpl) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i8) {
        return this.intervalContent.getContentType(i8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object key) {
        AbstractC3292y.i(key, "key");
        return getKeyIndexMap().getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i8) {
        Object key = getKeyIndexMap().getKey(i8);
        if (key == null) {
            return this.intervalContent.getKey(i8);
        }
        return key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.intervalContent.getSpanProvider();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
