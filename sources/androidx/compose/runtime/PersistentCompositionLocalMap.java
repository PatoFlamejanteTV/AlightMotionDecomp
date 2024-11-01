package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;

/* loaded from: classes.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, State<? extends Object>>, CompositionLocalMap {

    /* loaded from: classes.dex */
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        PersistentMap<CompositionLocal<Object>, State<? extends Object>> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder();

    PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, State<? extends Object> state);
}
