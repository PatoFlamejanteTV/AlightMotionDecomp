package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    final long f33635a;

    /* renamed from: b, reason: collision with root package name */
    final long f33636b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f33637c;

    /* renamed from: d, reason: collision with root package name */
    long f33638d;

    /* renamed from: e, reason: collision with root package name */
    long f33639e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        this.f33637c = spliterator;
        this.f33635a = j8;
        this.f33636b = j9;
        this.f33638d = j10;
        this.f33639e = j11;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11);

    public final int characteristics() {
        return this.f33637c.characteristics();
    }

    public final long estimateSize() {
        long j8 = this.f33639e;
        long j9 = this.f33635a;
        if (j9 < j8) {
            return j8 - Math.max(j9, this.f33638d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j8 = this.f33639e;
        if (this.f33635a >= j8 || this.f33638d >= j8) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f33637c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f33638d;
            long min = Math.min(estimateSize, this.f33636b);
            long j9 = this.f33635a;
            if (j9 >= min) {
                this.f33638d = min;
            } else {
                long j10 = this.f33636b;
                if (min < j10) {
                    long j11 = this.f33638d;
                    if (j11 < j9 || estimateSize > j10) {
                        this.f33638d = min;
                        return a(trySplit, j9, j10, j11, min);
                    }
                    this.f33638d = min;
                    return trySplit;
                }
                this.f33637c = trySplit;
                this.f33639e = min;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m5545trySplit() {
        return (j$.util.W) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m5546trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m5547trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m5548trySplit() {
        return (j$.util.f0) trySplit();
    }
}
