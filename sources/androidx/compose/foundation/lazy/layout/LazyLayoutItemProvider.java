package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i8, Object obj, Composer composer, int i9);

    Object getContentType(int i8);

    int getIndex(Object obj);

    int getItemCount();

    Object getKey(int i8);
}
