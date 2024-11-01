package x0;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class w {

    /* loaded from: classes3.dex */
    class a extends S {

        /* renamed from: a, reason: collision with root package name */
        boolean f40926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f40927b;

        a(Object obj) {
            this.f40927b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f40926a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f40926a) {
                this.f40926a = true;
                return this.f40927b;
            }
            throw new NoSuchElementException();
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        w0.h.i(collection);
        w0.h.i(it);
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= collection.add(it.next());
        }
        return z8;
    }

    public static boolean b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !w0.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static S c(Object obj) {
        return new a(obj);
    }
}
