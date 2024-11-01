package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f33339a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P0(Collection collection) {
        this.f33339a = collection;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.f33339a.size();
    }

    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f33339a, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.L0
    public final void h(Object[] objArr, int i8) {
        Iterator it = this.f33339a.iterator();
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
    }

    @Override // j$.util.stream.L0
    public final Object[] n(IntFunction intFunction) {
        java.util.Collection collection = this.f33339a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f33339a).spliterator();
    }

    public final String toString() {
        java.util.Collection collection = this.f33339a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
