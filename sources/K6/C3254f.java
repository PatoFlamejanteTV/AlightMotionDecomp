package k6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3254f implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f34526a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f34527b;

    /* renamed from: k6.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private Object f34528a;

        /* renamed from: b, reason: collision with root package name */
        private int f34529b = -2;

        a() {
        }

        private final void a() {
            Object invoke;
            int i8;
            if (this.f34529b != -2) {
                Function1 function1 = C3254f.this.f34527b;
                Object obj = this.f34528a;
                AbstractC3292y.f(obj);
                invoke = function1.invoke(obj);
            } else {
                invoke = C3254f.this.f34526a.invoke();
            }
            this.f34528a = invoke;
            if (invoke == null) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            this.f34529b = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34529b < 0) {
                a();
            }
            if (this.f34529b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f34529b < 0) {
                a();
            }
            if (this.f34529b != 0) {
                Object obj = this.f34528a;
                AbstractC3292y.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f34529b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3254f(Function0 getInitialValue, Function1 getNextValue) {
        AbstractC3292y.i(getInitialValue, "getInitialValue");
        AbstractC3292y.i(getNextValue, "getNextValue");
        this.f34526a = getInitialValue;
        this.f34527b = getNextValue;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
