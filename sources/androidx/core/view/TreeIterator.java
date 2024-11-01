package androidx.core.view;

import R5.AbstractC1435t;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TreeIterator<T> implements Iterator<T>, InterfaceC2767a {
    private final Function1 getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, Function1 function1) {
        this.getChildIterator = function1;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t8) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t8);
        if (it != null && it.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = it;
        } else {
            while (!this.iterator.hasNext() && (!this.stack.isEmpty())) {
                this.iterator = (Iterator) AbstractC1435t.y0(this.stack);
                AbstractC1435t.P(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
