package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3080n1 extends AbstractC3090p1 implements j$.util.f0 {
    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        if (this.f33557a == null) {
            return;
        }
        if (this.f33560d == null) {
            Spliterator spliterator = this.f33559c;
            if (spliterator != null) {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
            }
            ArrayDeque b9 = b();
            while (true) {
                K0 k02 = (K0) AbstractC3090p1.a(b9);
                if (k02 == null) {
                    this.f33557a = null;
                    return;
                }
                k02.e(obj);
            }
        }
        do {
        } while (tryAdvance(obj));
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        K0 k02;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.f0) this.f33560d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f33559c == null && (k02 = (K0) AbstractC3090p1.a(this.f33561e)) != null) {
                j$.util.f0 spliterator = k02.spliterator();
                this.f33560d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.f33557a = null;
        }
        return tryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
