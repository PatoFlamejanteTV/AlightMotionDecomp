package androidx.compose.ui.layout;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class SlotIdsSet implements Collection<Object>, InterfaceC2767a, j$.util.Collection {
        public static final int $stable = 8;
        private final Set<Object> set;

        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.set.containsAll(collection);
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        public int getSize() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream<Object> parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.set.remove(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.set.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream<Object> stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC3283o.a(this);
        }

        public SlotIdsSet(Set<Object> set) {
            this.set = set;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        public final boolean removeAll(Function1 function1) {
            return AbstractC1435t.I(this.set, function1);
        }

        public final boolean retainAll(Function1 function1) {
            return AbstractC1435t.R(this.set, function1);
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return Collection.CC.$default$spliterator(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3283o.b(this, tArr);
        }

        public /* synthetic */ SlotIdsSet(Set set, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);
}
