package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class T3 implements Consumer, Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f33390a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f33391b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f33392c;

    /* renamed from: d, reason: collision with root package name */
    boolean f33393d;

    /* renamed from: e, reason: collision with root package name */
    int f33394e;

    /* renamed from: f, reason: collision with root package name */
    final Predicate f33395f;

    /* renamed from: g, reason: collision with root package name */
    Object f33396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33397h;

    public T3(Spliterator spliterator, T3 t32, int i8) {
        this.f33397h = i8;
        this.f33393d = true;
        this.f33390a = spliterator;
        this.f33391b = t32.f33391b;
        this.f33392c = t32.f33392c;
        this.f33395f = t32.f33395f;
    }

    public T3(Spliterator spliterator, Predicate predicate, int i8) {
        this.f33397h = i8;
        this.f33393d = true;
        this.f33390a = spliterator;
        this.f33391b = false;
        this.f33392c = new AtomicBoolean();
        this.f33395f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33394e = (this.f33394e + 1) & 63;
        this.f33396g = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    final Spliterator b(Spliterator spliterator) {
        switch (this.f33397h) {
            case 0:
                return new T3(spliterator, this, 0);
            default:
                return new T3(spliterator, this, 1);
        }
    }

    public final Spliterator c() {
        Spliterator trySplit = this.f33391b ? null : this.f33390a.trySplit();
        if (trySplit != null) {
            return b(trySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33390a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33390a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33390a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:            if (r0 == false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:            r3.set(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:            r8.accept(r7.f33396g);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:            return r2;     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryAdvance(java.util.function.Consumer r8) {
        /*
            r7 = this;
            int r0 = r7.f33397h
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            boolean r0 = r7.f33393d
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f33392c
            r2 = 1
            if (r0 == 0) goto L2e
            int r0 = r7.f33394e
            if (r0 != 0) goto L16
            boolean r0 = r1.get()
            if (r0 != 0) goto L2e
        L16:
            j$.util.Spliterator r0 = r7.f33390a
            boolean r0 = r0.tryAdvance(r7)
            if (r0 == 0) goto L2e
            java.util.function.Predicate r0 = r7.f33395f
            java.lang.Object r3 = r7.f33396g
            boolean r0 = r0.test(r3)
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r7.f33396g
            r8.accept(r0)
            goto L38
        L2e:
            r0 = 1
        L2f:
            r8 = 0
            r7.f33393d = r8
            if (r0 != 0) goto L37
            r1.set(r2)
        L37:
            r2 = 0
        L38:
            return r2
        L39:
            boolean r0 = r7.f33393d
            j$.util.Spliterator r1 = r7.f33390a
            if (r0 == 0) goto L6e
            r0 = 0
            r7.f33393d = r0
        L42:
            boolean r2 = r1.tryAdvance(r7)
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.f33392c
            r4 = 1
            if (r2 == 0) goto L61
            int r5 = r7.f33394e
            if (r5 != 0) goto L55
            boolean r5 = r3.get()
            if (r5 != 0) goto L61
        L55:
            java.util.function.Predicate r5 = r7.f33395f
            java.lang.Object r6 = r7.f33396g
            boolean r5 = r5.test(r6)
            if (r5 == 0) goto L61
            r0 = 1
            goto L42
        L61:
            if (r2 == 0) goto L72
            if (r0 == 0) goto L68
            r3.set(r4)
        L68:
            java.lang.Object r0 = r7.f33396g
            r8.accept(r0)
            goto L72
        L6e:
            boolean r2 = r1.tryAdvance(r8)
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.T3.tryAdvance(java.util.function.Consumer):boolean");
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f33397h) {
            case 1:
                if (this.f33392c.get()) {
                    return null;
                }
                return c();
            default:
                return c();
        }
    }
}
