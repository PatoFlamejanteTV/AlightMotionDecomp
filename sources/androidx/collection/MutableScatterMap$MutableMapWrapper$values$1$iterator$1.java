package androidx.collection;

import d6.InterfaceC2767a;
import java.util.Iterator;
import k6.AbstractC3258j;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements Iterator<V>, InterfaceC2767a {
    private int current = -1;
    private final Iterator<Integer> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = AbstractC3258j.a(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        int intValue = this.iterator.next().intValue();
        this.current = intValue;
        return (V) this.this$0.values[intValue];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i8 = this.current;
        if (i8 >= 0) {
            this.this$0.removeValueAt(i8);
            this.current = -1;
        }
    }
}
