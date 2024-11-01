package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class J implements Iterator, InterfaceC2767a {
    public abstract float a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
