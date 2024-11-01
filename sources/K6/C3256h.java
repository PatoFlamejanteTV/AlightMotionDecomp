package k6;

import Q5.I;
import Q5.s;
import Q5.t;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3256h extends AbstractC3257i implements Iterator, U5.d, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private int f34531a;

    /* renamed from: b, reason: collision with root package name */
    private Object f34532b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f34533c;

    /* renamed from: d, reason: collision with root package name */
    private U5.d f34534d;

    private final Throwable h() {
        int i8 = this.f34531a;
        if (i8 != 4) {
            if (i8 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f34531a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // k6.AbstractC3257i
    public Object a(Object obj, U5.d dVar) {
        this.f34532b = obj;
        this.f34531a = 3;
        this.f34534d = dVar;
        Object e8 = V5.b.e();
        if (e8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // k6.AbstractC3257i
    public Object c(Iterator it, U5.d dVar) {
        if (!it.hasNext()) {
            return I.f8786a;
        }
        this.f34533c = it;
        this.f34531a = 2;
        this.f34534d = dVar;
        Object e8 = V5.b.e();
        if (e8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // U5.d
    public U5.g getContext() {
        return U5.h.f10149a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i8 = this.f34531a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator it = this.f34533c;
                AbstractC3292y.f(it);
                if (it.hasNext()) {
                    this.f34531a = 2;
                    return true;
                }
                this.f34533c = null;
            }
            this.f34531a = 5;
            U5.d dVar = this.f34534d;
            AbstractC3292y.f(dVar);
            this.f34534d = null;
            s.a aVar = s.f8810b;
            dVar.resumeWith(s.b(I.f8786a));
        }
    }

    public final void j(U5.d dVar) {
        this.f34534d = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.f34531a;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    this.f34531a = 0;
                    Object obj = this.f34532b;
                    this.f34532b = null;
                    return obj;
                }
                throw h();
            }
            this.f34531a = 1;
            Iterator it = this.f34533c;
            AbstractC3292y.f(it);
            return it.next();
        }
        return i();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        t.b(obj);
        this.f34531a = 4;
    }
}
