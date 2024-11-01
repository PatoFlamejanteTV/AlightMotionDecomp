package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class M implements Iterator, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f9304a;

    /* renamed from: b, reason: collision with root package name */
    private int f9305b;

    public M(Iterator iterator) {
        AbstractC3292y.i(iterator, "iterator");
        this.f9304a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K next() {
        int i8 = this.f9305b;
        this.f9305b = i8 + 1;
        if (i8 < 0) {
            AbstractC1435t.w();
        }
        return new K(i8, this.f9304a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9304a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
