package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* renamed from: R5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1434s implements Iterator, InterfaceC2767a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
