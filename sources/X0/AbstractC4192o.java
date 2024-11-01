package x0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x0.AbstractC4191n;

/* renamed from: x0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4192o extends AbstractC4191n implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final T f40899b = new b(I.f40826e, 0);

    /* renamed from: x0.o$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4191n.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public AbstractC4192o f() {
            this.f40898c = true;
            return AbstractC4192o.m(this.f40896a, this.f40897b);
        }

        a(int i8) {
            super(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.o$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC4178a {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC4192o f40900c;

        b(AbstractC4192o abstractC4192o, int i8) {
            super(abstractC4192o.size(), i8);
            this.f40900c = abstractC4192o;
        }

        @Override // x0.AbstractC4178a
        protected Object a(int i8) {
            return this.f40900c.get(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.o$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC4192o {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4192o f40901c;

        c(AbstractC4192o abstractC4192o) {
            this.f40901c = abstractC4192o;
        }

        private int D(int i8) {
            return (size() - 1) - i8;
        }

        private int E(int i8) {
            return size() - i8;
        }

        @Override // x0.AbstractC4192o, java.util.List
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public AbstractC4192o subList(int i8, int i9) {
            w0.h.m(i8, i9, size());
            return this.f40901c.subList(E(i9), E(i8)).z();
        }

        @Override // x0.AbstractC4192o, x0.AbstractC4191n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f40901c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, size());
            return this.f40901c.get(D(i8));
        }

        @Override // x0.AbstractC4192o, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f40901c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return D(lastIndexOf);
            }
            return -1;
        }

        @Override // x0.AbstractC4192o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public boolean j() {
            return this.f40901c.j();
        }

        @Override // x0.AbstractC4192o, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f40901c.indexOf(obj);
            if (indexOf >= 0) {
                return D(indexOf);
            }
            return -1;
        }

        @Override // x0.AbstractC4192o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40901c.size();
        }

        @Override // x0.AbstractC4192o
        public AbstractC4192o z() {
            return this.f40901c;
        }

        @Override // x0.AbstractC4192o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.o$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC4192o {

        /* renamed from: c, reason: collision with root package name */
        final transient int f40902c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f40903d;

        d(int i8, int i9) {
            this.f40902c = i8;
            this.f40903d = i9;
        }

        @Override // x0.AbstractC4192o, java.util.List
        /* renamed from: B */
        public AbstractC4192o subList(int i8, int i9) {
            w0.h.m(i8, i9, this.f40903d);
            AbstractC4192o abstractC4192o = AbstractC4192o.this;
            int i10 = this.f40902c;
            return abstractC4192o.subList(i8 + i10, i9 + i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public Object[] d() {
            return AbstractC4192o.this.d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public int e() {
            return AbstractC4192o.this.g() + this.f40902c + this.f40903d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public int g() {
            return AbstractC4192o.this.g() + this.f40902c;
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, this.f40903d);
            return AbstractC4192o.this.get(i8 + this.f40902c);
        }

        @Override // x0.AbstractC4192o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public boolean j() {
            return true;
        }

        @Override // x0.AbstractC4192o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40903d;
        }

        @Override // x0.AbstractC4192o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    public static AbstractC4192o A(Comparator comparator, Iterable iterable) {
        w0.h.i(comparator);
        Object[] b9 = v.b(iterable);
        AbstractC4177F.b(b9);
        Arrays.sort(b9, comparator);
        return k(b9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC4192o k(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC4192o m(Object[] objArr, int i8) {
        if (i8 == 0) {
            return t();
        }
        return new I(objArr, i8);
    }

    private static AbstractC4192o n(Object... objArr) {
        return k(AbstractC4177F.b(objArr));
    }

    public static AbstractC4192o t() {
        return I.f40826e;
    }

    public static AbstractC4192o u(Object obj, Object obj2) {
        return n(obj, obj2);
    }

    public static AbstractC4192o v(Object obj, Object obj2, Object obj3) {
        return n(obj, obj2, obj3);
    }

    public static AbstractC4192o y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return n(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // java.util.List
    /* renamed from: B */
    public AbstractC4192o subList(int i8, int i9) {
        w0.h.m(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == size()) {
            return this;
        }
        if (i10 == 0) {
            return t();
        }
        return C(i8, i9);
    }

    AbstractC4192o C(int i8, int i9) {
        return new d(i8, i9 - i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4191n
    public int c(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // x0.AbstractC4191n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = ~(~((i8 * 31) + get(i9).hashCode()));
        }
        return i8;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public T listIterator(int i8) {
        w0.h.k(i8, size());
        if (isEmpty()) {
            return f40899b;
        }
        return new b(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    public AbstractC4192o z() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }
}
