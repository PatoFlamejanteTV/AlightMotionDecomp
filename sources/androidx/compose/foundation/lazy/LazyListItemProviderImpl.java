package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {
    private final LazyListIntervalContent intervalContent;
    private final LazyItemScopeImpl itemScope;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyListState state;

    public LazyListItemProviderImpl(LazyListState state, LazyListIntervalContent intervalContent, LazyItemScopeImpl itemScope, LazyLayoutKeyIndexMap keyIndexMap) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(intervalContent, "intervalContent");
        AbstractC3292y.i(itemScope, "itemScope");
        AbstractC3292y.i(keyIndexMap, "keyIndexMap");
        this.state = state;
        this.intervalContent = intervalContent;
        this.itemScope = itemScope;
        this.keyIndexMap = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i8, Object key, Composer composer, int i9) {
        AbstractC3292y.i(key, "key");
        Composer startRestartGroup = composer.startRestartGroup(-462424778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-462424778, i9, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i8, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, -824725566, true, new LazyListItemProviderImpl$Item$1(this, i8)), startRestartGroup, ((i9 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyListItemProviderImpl$Item$2(this, i8, key, i9));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return AbstractC3292y.d(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i8) {
        return this.intervalContent.getContentType(i8);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List<Integer> getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
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

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i8) {
        Object key = getKeyIndexMap().getKey(i8);
        if (key == null) {
            return this.intervalContent.getKey(i8);
        }
        return key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
