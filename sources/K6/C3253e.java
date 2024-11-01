package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3253e implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3255g f34519a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f34520b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f34521c;

    /* renamed from: k6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f34522a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f34523b;

        /* renamed from: c, reason: collision with root package name */
        private int f34524c;

        a() {
            this.f34522a = C3253e.this.f34519a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f34523b;
            if (it != null && it.hasNext()) {
                this.f34524c = 1;
                return true;
            }
            while (this.f34522a.hasNext()) {
                Iterator it2 = (Iterator) C3253e.this.f34521c.invoke(C3253e.this.f34520b.invoke(this.f34522a.next()));
                if (it2.hasNext()) {
                    this.f34523b = it2;
                    this.f34524c = 1;
                    return true;
                }
            }
            this.f34524c = 2;
            this.f34523b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i8 = this.f34524c;
            if (i8 == 1) {
                return true;
            }
            if (i8 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f34524c;
            if (i8 != 2) {
                if (i8 == 0 && !a()) {
                    throw new NoSuchElementException();
                }
                this.f34524c = 0;
                Iterator it = this.f34523b;
                AbstractC3292y.f(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3253e(InterfaceC3255g sequence, Function1 transformer, Function1 iterator) {
        AbstractC3292y.i(sequence, "sequence");
        AbstractC3292y.i(transformer, "transformer");
        AbstractC3292y.i(iterator, "iterator");
        this.f34519a = sequence;
        this.f34520b = transformer;
        this.f34521c = iterator;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
