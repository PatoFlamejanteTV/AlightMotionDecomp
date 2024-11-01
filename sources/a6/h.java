package A6;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class h {

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private int f279a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f280b;

        a(f fVar) {
            this.f280b = fVar;
            this.f279a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f280b;
            int e8 = fVar.e();
            int i8 = this.f279a;
            this.f279a = i8 - 1;
            return fVar.h(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f279a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private int f281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f282b;

        b(f fVar) {
            this.f282b = fVar;
            this.f281a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f282b;
            int e8 = fVar.e();
            int i8 = this.f281a;
            this.f281a = i8 - 1;
            return fVar.f(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f281a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Iterable, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f283a;

        public c(f fVar) {
            this.f283a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f283a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterable, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f284a;

        public d(f fVar) {
            this.f284a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f284a);
        }
    }

    public static final Iterable a(f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        return new d(fVar);
    }
}
