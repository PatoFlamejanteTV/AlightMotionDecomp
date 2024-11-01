package androidx.compose.runtime.snapshots;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, InterfaceC2767a {
    public StateMapMutableValuesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> next = getNext();
        if (next != null) {
            advance();
            return next.getValue();
        }
        throw new IllegalStateException();
    }
}
