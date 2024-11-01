package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: R5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1418b implements Iterator, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private int f9320a;

    /* renamed from: b, reason: collision with root package name */
    private Object f9321b;

    private final boolean e() {
        this.f9320a = 3;
        a();
        if (this.f9320a == 1) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f9320a = 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Object obj) {
        this.f9321b = obj;
        this.f9320a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i8 = this.f9320a;
        if (i8 != 0) {
            if (i8 == 1) {
                return true;
            }
            if (i8 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return e();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.f9320a;
        if (i8 == 1) {
            this.f9320a = 0;
            return this.f9321b;
        }
        if (i8 != 2 && e()) {
            this.f9320a = 0;
            return this.f9321b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
