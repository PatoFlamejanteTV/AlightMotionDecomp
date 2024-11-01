package androidx.compose.runtime.collection;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class IdentityArraySet$iterator$1<T> implements Iterator<T>, InterfaceC2767a {
    private int index;
    final /* synthetic */ IdentityArraySet<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArraySet$iterator$1(IdentityArraySet<T> identityArraySet) {
        this.this$0 = identityArraySet;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.this$0.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        Object[] values = this.this$0.getValues();
        int i8 = this.index;
        this.index = i8 + 1;
        T t8 = (T) values[i8];
        AbstractC3292y.g(t8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }
}
