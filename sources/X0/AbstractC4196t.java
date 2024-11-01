package x0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4196t extends u implements NavigableSet, O {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator f40924c;

    /* renamed from: d, reason: collision with root package name */
    transient AbstractC4196t f40925d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4196t(Comparator comparator) {
        this.f40924c = comparator;
    }

    static AbstractC4196t A(Comparator comparator, int i8, Object... objArr) {
        if (i8 == 0) {
            return F(comparator);
        }
        AbstractC4177F.c(objArr, i8);
        Arrays.sort(objArr, 0, i8, comparator);
        int i9 = 1;
        for (int i10 = 1; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (comparator.compare(obj, objArr[i9 - 1]) != 0) {
                objArr[i9] = obj;
                i9++;
            }
        }
        Arrays.fill(objArr, i9, i8, (Object) null);
        if (i9 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new L(AbstractC4192o.m(objArr, i9), comparator);
    }

    public static AbstractC4196t B(Comparator comparator, Iterable iterable) {
        w0.h.i(comparator);
        if (P.b(comparator, iterable) && (iterable instanceof AbstractC4196t)) {
            AbstractC4196t abstractC4196t = (AbstractC4196t) iterable;
            if (!abstractC4196t.j()) {
                return abstractC4196t;
            }
        }
        Object[] b9 = v.b(iterable);
        return A(comparator, b9.length, b9);
    }

    public static AbstractC4196t C(Comparator comparator, Collection collection) {
        return B(comparator, collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static L F(Comparator comparator) {
        if (G.c().equals(comparator)) {
            return L.f40850f;
        }
        return new L(AbstractC4192o.t(), comparator);
    }

    static int S(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC4196t D();

    @Override // java.util.NavigableSet
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t descendingSet() {
        AbstractC4196t abstractC4196t = this.f40925d;
        if (abstractC4196t == null) {
            AbstractC4196t D8 = D();
            this.f40925d = D8;
            D8.f40925d = this;
            return D8;
        }
        return abstractC4196t;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t headSet(Object obj, boolean z8) {
        return J(w0.h.i(obj), z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC4196t J(Object obj, boolean z8);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        boolean z10;
        w0.h.i(obj);
        w0.h.i(obj2);
        if (this.f40924c.compare(obj, obj2) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0.h.d(z10);
        return M(obj, z8, obj2, z9);
    }

    abstract AbstractC4196t M(Object obj, boolean z8, Object obj2, boolean z9);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC4196t tailSet(Object obj, boolean z8) {
        return P(w0.h.i(obj), z8);
    }

    abstract AbstractC4196t P(Object obj, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R(Object obj, Object obj2) {
        return S(this.f40924c, obj, obj2);
    }

    @Override // java.util.SortedSet, x0.O
    public Comparator comparator() {
        return this.f40924c;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
