package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {
    private final LazyLayoutIntervalContent<PagerIntervalContent> intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final PagerScopeImpl pagerScopeImpl;
    private final PagerState state;

    public PagerLazyLayoutItemProvider(PagerState state, LazyLayoutIntervalContent<PagerIntervalContent> intervalContent, LazyLayoutKeyIndexMap keyIndexMap) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(intervalContent, "intervalContent");
        AbstractC3292y.i(keyIndexMap, "keyIndexMap");
        this.state = state;
        this.intervalContent = intervalContent;
        this.keyIndexMap = keyIndexMap;
        this.pagerScopeImpl = PagerScopeImpl.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i8, Object key, Composer composer, int i9) {
        AbstractC3292y.i(key, "key");
        Composer startRestartGroup = composer.startRestartGroup(-1201380429);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201380429, i9, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:187)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i8, this.state.getPinnedPages$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1142237095, true, new PagerLazyLayoutItemProvider$Item$1(this, i8)), startRestartGroup, ((i9 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PagerLazyLayoutItemProvider$Item$2(this, i8, key, i9));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return AbstractC3292y.d(this.intervalContent, ((PagerLazyLayoutItemProvider) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public /* synthetic */ Object getContentType(int i8) {
        return b.a(this, i8);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object key) {
        AbstractC3292y.i(key, "key");
        return this.keyIndexMap.getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i8) {
        Object key = this.keyIndexMap.getKey(i8);
        if (key == null) {
            return this.intervalContent.getKey(i8);
        }
        return key;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
