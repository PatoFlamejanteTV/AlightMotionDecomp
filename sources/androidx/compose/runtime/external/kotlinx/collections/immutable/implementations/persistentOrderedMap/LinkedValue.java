package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LinkedValue<V> {
    public static final int $stable = 8;
    private final Object next;
    private final Object previous;
    private final V value;

    public LinkedValue(V v8, Object obj, Object obj2) {
        this.value = v8;
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        if (this.next != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    public final boolean getHasPrevious() {
        if (this.previous != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    public final LinkedValue<V> withNext(Object obj) {
        return new LinkedValue<>(this.value, this.previous, obj);
    }

    public final LinkedValue<V> withPrevious(Object obj) {
        return new LinkedValue<>(this.value, obj, this.next);
    }

    public final LinkedValue<V> withValue(V v8) {
        return new LinkedValue<>(v8, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LinkedValue(V r2) {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue.<init>(java.lang.Object):void");
    }

    public LinkedValue(V v8, Object obj) {
        this(v8, obj, EndOfChain.INSTANCE);
    }
}
