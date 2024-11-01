package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class E implements Iterator, InterfaceC2767a {
    public abstract double a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
