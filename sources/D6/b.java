package D6;

import R5.AbstractC1435t;
import d6.InterfaceC2767a;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@y6.g(with = c.class)
/* loaded from: classes5.dex */
public final class b extends i implements List<i>, InterfaceC2767a, j$.util.List {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f1448a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final y6.b serializer() {
            return c.f1449a;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List content) {
        super(null);
        AbstractC3292y.i(content, "content");
        this.f1448a = content;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(i element) {
        AbstractC3292y.i(element, "element");
        return this.f1448a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return c((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        return this.f1448a.containsAll(elements);
    }

    @Override // java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public i get(int i8) {
        return (i) this.f1448a.get(i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return AbstractC3292y.d(this.f1448a, obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public int g() {
        return this.f1448a.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f1448a.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return j((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1448a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f1448a.iterator();
    }

    public int j(i element) {
        AbstractC3292y.i(element, "element");
        return this.f1448a.indexOf(element);
    }

    public int k(i element) {
        AbstractC3292y.i(element, "element");
        return this.f1448a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return k((i) obj);
    }

    @Override // java.util.List
    public ListIterator<i> listIterator() {
        return this.f1448a.listIterator();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i set(int i8, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public List<i> subList(int i8, int i9) {
        return this.f1448a.subList(i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    public String toString() {
        return AbstractC1435t.w0(this.f1448a, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<i> listIterator(int i8) {
        return this.f1448a.listIterator(i8);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        return AbstractC3283o.b(this, array);
    }
}
