package androidx.compose.ui.node;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import d6.InterfaceC2767a;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, InterfaceC2767a, j$.util.List {
    public static final int $stable = 8;
    private int size;
    private Object[] values = new Object[16];
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    /* loaded from: classes.dex */
    private final class HitTestResultIterator implements ListIterator<Modifier.Node>, InterfaceC2767a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i8, int i9, int i10) {
            this.index = i8;
            this.minIndex = i9;
            this.maxIndex = i10;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index < this.maxIndex) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index > this.minIndex) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i8) {
            this.index = i8;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            Object[] objArr = HitTestResult.this.values;
            int i8 = this.index;
            this.index = i8 + 1;
            Object obj = objArr[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.values;
            int i8 = this.index - 1;
            this.index = i8;
            Object obj = objArr[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i8, int i9, int i10, int i11, AbstractC3284p abstractC3284p) {
            this((i11 & 1) != 0 ? 0 : i8, (i11 & 2) != 0 ? 0 : i9, (i11 & 4) != 0 ? hitTestResult.size() : i10);
        }
    }

    /* loaded from: classes.dex */
    private final class SubList implements List<Modifier.Node>, InterfaceC2767a, j$.util.List {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i8, int i9) {
            this.minIndex = i8;
            this.maxIndex = i9;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i8, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i8 = this.minIndex;
            return new HitTestResultIterator(i8, i8, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i8 = this.minIndex;
            return new HitTestResultIterator(i8, i8, this.maxIndex);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i8, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List, j$.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
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
        public List<Modifier.Node> subList(int i8, int i9) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i10 = this.minIndex;
            return new SubList(i8 + i10, i10 + i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3283o.a(this);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i8, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node get(int i8) {
            Object obj = HitTestResult.this.values[i8 + this.minIndex];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        public int indexOf(Modifier.Node node) {
            int i8 = this.minIndex;
            int i9 = this.maxIndex;
            if (i8 > i9) {
                return -1;
            }
            while (!AbstractC3292y.d(HitTestResult.this.values[i8], node)) {
                if (i8 == i9) {
                    return -1;
                }
                i8++;
            }
            return i8 - this.minIndex;
        }

        public int lastIndexOf(Modifier.Node node) {
            int i8 = this.maxIndex;
            int i9 = this.minIndex;
            if (i9 > i8) {
                return -1;
            }
            while (!AbstractC3292y.d(HitTestResult.this.values[i8], node)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i8) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i9 = this.minIndex;
            return new HitTestResultIterator(i8 + i9, i9, this.maxIndex);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i8, Modifier.Node node) {
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

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3283o.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final void ensureContainerSize() {
        int i8 = this.hitDepth;
        Object[] objArr = this.values;
        if (i8 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    /* renamed from: findBestHitDistance-ptXAw2c, reason: not valid java name */
    private final long m4223findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i8 = this.hitDepth + 1;
        int o8 = AbstractC1435t.o(this);
        if (i8 <= o8) {
            while (true) {
                long m4215constructorimpl = DistanceAndInLayer.m4215constructorimpl(this.distanceFromEdgeAndInLayer[i8]);
                if (DistanceAndInLayer.m4214compareToS_HNhKs(m4215constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m4215constructorimpl;
                }
                if (DistanceAndInLayer.m4218getDistanceimpl(DistanceAndInLayer) < 0.0f && DistanceAndInLayer.m4220isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return DistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int i8 = this.hitDepth + 1;
        int o8 = AbstractC1435t.o(this);
        if (i8 <= o8) {
            while (true) {
                this.values[i8] = null;
                if (i8 == o8) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i8, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, java.util.Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long m4223findBestHitDistanceptXAw2c = m4223findBestHitDistanceptXAw2c();
        if (DistanceAndInLayer.m4218getDistanceimpl(m4223findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m4220isInLayerimpl(m4223findBestHitDistanceptXAw2c)) {
            return true;
        }
        return false;
    }

    public final void hit(Modifier.Node node, boolean z8, Function0 function0) {
        hitInMinimumTouchTarget(node, -1.0f, z8, function0);
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f8, boolean z8, Function0 function0) {
        long DistanceAndInLayer;
        int i8 = this.hitDepth;
        this.hitDepth = i8 + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i9 = this.hitDepth;
        objArr[i9] = node;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f8, z8);
        jArr[i9] = DistanceAndInLayer;
        resizeToHitDepth();
        function0.invoke();
        this.hitDepth = i8;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f8, boolean z8) {
        long DistanceAndInLayer;
        if (this.hitDepth != AbstractC1435t.o(this)) {
            DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f8, z8);
            if (DistanceAndInLayer.m4214compareToS_HNhKs(m4223findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i8, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(Function0 function0) {
        int i8 = this.hitDepth;
        function0.invoke();
        this.hitDepth = i8;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(Modifier.Node node, float f8, boolean z8, Function0 function0) {
        if (this.hitDepth == AbstractC1435t.o(this)) {
            hitInMinimumTouchTarget(node, f8, z8, function0);
            if (this.hitDepth + 1 == AbstractC1435t.o(this)) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m4223findBestHitDistanceptXAw2c = m4223findBestHitDistanceptXAw2c();
        int i8 = this.hitDepth;
        this.hitDepth = AbstractC1435t.o(this);
        hitInMinimumTouchTarget(node, f8, z8, function0);
        if (this.hitDepth + 1 < AbstractC1435t.o(this) && DistanceAndInLayer.m4214compareToS_HNhKs(m4223findBestHitDistanceptXAw2c, m4223findBestHitDistanceptXAw2c()) > 0) {
            int i9 = this.hitDepth + 1;
            int i10 = i8 + 1;
            Object[] objArr = this.values;
            AbstractC1428l.i(objArr, objArr, i10, i9, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            AbstractC1428l.h(jArr, jArr, i10, i9, size());
            this.hitDepth = ((size() + i8) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i8;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public java.util.List<Modifier.Node> subList(int i8, int i9) {
        return new SubList(i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i8) {
        Object obj = this.values[i8];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(Modifier.Node node) {
        int o8 = AbstractC1435t.o(this);
        if (o8 < 0) {
            return -1;
        }
        int i8 = 0;
        while (!AbstractC3292y.d(this.values[i8], node)) {
            if (i8 == o8) {
                return -1;
            }
            i8++;
        }
        return i8;
    }

    public int lastIndexOf(Modifier.Node node) {
        for (int o8 = AbstractC1435t.o(this); -1 < o8; o8--) {
            if (AbstractC3292y.d(this.values[o8], node)) {
                return o8;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i8) {
        return new HitTestResultIterator(this, i8, 0, 0, 6, null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i8, Modifier.Node node) {
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

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3283o.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
