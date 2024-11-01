package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class d extends AbstractC2997a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f33130b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f33122b;
        Object obj2 = lVar.f33123c;
        this.f33110j = lVar;
        a();
        return new k(obj, obj2, this.f33109i);
    }
}
