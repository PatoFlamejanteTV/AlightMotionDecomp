package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3265q implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3255g f34547a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f34548b;

    /* renamed from: k6.q$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f34549a;

        /* renamed from: b, reason: collision with root package name */
        private int f34550b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f34551c;

        a() {
            this.f34549a = C3265q.this.f34547a.iterator();
        }

        private final void a() {
            if (this.f34549a.hasNext()) {
                Object next = this.f34549a.next();
                if (((Boolean) C3265q.this.f34548b.invoke(next)).booleanValue()) {
                    this.f34550b = 1;
                    this.f34551c = next;
                    return;
                }
            }
            this.f34550b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34550b == -1) {
                a();
            }
            if (this.f34550b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f34550b == -1) {
                a();
            }
            if (this.f34550b != 0) {
                Object obj = this.f34551c;
                this.f34551c = null;
                this.f34550b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3265q(InterfaceC3255g sequence, Function1 predicate) {
        AbstractC3292y.i(sequence, "sequence");
        AbstractC3292y.i(predicate, "predicate");
        this.f34547a = sequence;
        this.f34548b = predicate;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
