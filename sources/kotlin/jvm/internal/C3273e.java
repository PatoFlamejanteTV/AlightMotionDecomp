package kotlin.jvm.internal;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3273e implements Iterator, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f34585a;

    /* renamed from: b, reason: collision with root package name */
    private int f34586b;

    public C3273e(Object[] array) {
        AbstractC3292y.i(array, "array");
        this.f34585a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34586b < this.f34585a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f34585a;
            int i8 = this.f34586b;
            this.f34586b = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34586b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
