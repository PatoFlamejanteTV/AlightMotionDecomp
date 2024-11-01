package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3082n3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f33546d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spliterator f33547a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f33548b;

    /* renamed from: c, reason: collision with root package name */
    private Object f33549c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3082n3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C3082n3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f33547a = spliterator;
        this.f33548b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33549c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Consumer consumer, Object obj) {
        if (this.f33548b.putIfAbsent(obj != null ? obj : f33546d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f33547a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33547a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f33547a.forEachRemaining(new C3073m(2, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33547a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2998d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f33547a.tryAdvance(this)) {
            Object obj = this.f33549c;
            if (obj == null) {
                obj = f33546d;
            }
            if (this.f33548b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f33549c);
                this.f33549c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f33547a.trySplit();
        if (trySplit != null) {
            return new C3082n3(trySplit, this.f33548b);
        }
        return null;
    }
}
