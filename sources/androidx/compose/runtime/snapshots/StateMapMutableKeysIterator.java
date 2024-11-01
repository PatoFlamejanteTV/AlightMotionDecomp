package androidx.compose.runtime.snapshots;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateMapMutableKeysIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<K>, InterfaceC2767a {
    public StateMapMutableKeysIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> next = getNext();
        if (next != null) {
            advance();
            return next.getKey();
        }
        throw new IllegalStateException();
    }
}
