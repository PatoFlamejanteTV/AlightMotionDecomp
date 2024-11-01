package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 4)
/* loaded from: classes.dex */
public final class TrieNodeValuesIterator<K, V> extends TrieNodeBaseIterator<K, V, V> {
    public static final int $stable = 0;

    @Override // java.util.Iterator
    public V next() {
        CommonFunctionsKt.m2559assert(hasNextKey());
        setIndex(getIndex() + 2);
        return (V) getBuffer()[getIndex() - 1];
    }
}
