package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3264p implements InterfaceC3255g, InterfaceC3250b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3255g f34543a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34544b;

    /* renamed from: k6.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private int f34545a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f34546b;

        a(C3264p c3264p) {
            this.f34545a = c3264p.f34544b;
            this.f34546b = c3264p.f34543a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34545a > 0 && this.f34546b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f34545a;
            if (i8 != 0) {
                this.f34545a = i8 - 1;
                return this.f34546b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3264p(InterfaceC3255g sequence, int i8) {
        AbstractC3292y.i(sequence, "sequence");
        this.f34543a = sequence;
        this.f34544b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + '.').toString());
    }

    @Override // k6.InterfaceC3250b
    public InterfaceC3255g a(int i8) {
        if (i8 >= this.f34544b) {
            return this;
        }
        return new C3264p(this.f34543a, i8);
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a(this);
    }
}
