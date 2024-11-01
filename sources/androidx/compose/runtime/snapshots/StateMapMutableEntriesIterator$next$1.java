package androidx.compose.runtime.snapshots;

import d6.InterfaceC2770d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, InterfaceC2770d.a {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        AbstractC3292y.f(current);
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        AbstractC3292y.f(current2);
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v8) {
        this.value = v8;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v8) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() == ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            V value = getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), v8);
            setValue((StateMapMutableEntriesIterator$next$1<K, V>) v8);
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
