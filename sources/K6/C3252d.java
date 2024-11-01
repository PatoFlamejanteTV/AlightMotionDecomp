package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3252d implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3255g f34512a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34513b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f34514c;

    /* renamed from: k6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f34515a;

        /* renamed from: b, reason: collision with root package name */
        private int f34516b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f34517c;

        a() {
            this.f34515a = C3252d.this.f34512a.iterator();
        }

        private final void a() {
            while (this.f34515a.hasNext()) {
                Object next = this.f34515a.next();
                if (((Boolean) C3252d.this.f34514c.invoke(next)).booleanValue() == C3252d.this.f34513b) {
                    this.f34517c = next;
                    this.f34516b = 1;
                    return;
                }
            }
            this.f34516b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34516b == -1) {
                a();
            }
            if (this.f34516b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f34516b == -1) {
                a();
            }
            if (this.f34516b != 0) {
                Object obj = this.f34517c;
                this.f34517c = null;
                this.f34516b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3252d(InterfaceC3255g sequence, boolean z8, Function1 predicate) {
        AbstractC3292y.i(sequence, "sequence");
        AbstractC3292y.i(predicate, "predicate");
        this.f34512a = sequence;
        this.f34513b = z8;
        this.f34514c = predicate;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
