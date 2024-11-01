package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import java.util.List;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    List<Integer> getHeaderIndexes();

    LazyItemScopeImpl getItemScope();

    LazyLayoutKeyIndexMap getKeyIndexMap();
}
