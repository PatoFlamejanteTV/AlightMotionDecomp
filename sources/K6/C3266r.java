package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3266r implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3255g f34553a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f34554b;

    /* renamed from: k6.r$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f34555a;

        a() {
            this.f34555a = C3266r.this.f34553a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34555a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C3266r.this.f34554b.invoke(this.f34555a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3266r(InterfaceC3255g sequence, Function1 transformer) {
        AbstractC3292y.i(sequence, "sequence");
        AbstractC3292y.i(transformer, "transformer");
        this.f34553a = sequence;
        this.f34554b = transformer;
    }

    public final InterfaceC3255g d(Function1 iterator) {
        AbstractC3292y.i(iterator, "iterator");
        return new C3253e(this.f34553a, this.f34554b, iterator);
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
