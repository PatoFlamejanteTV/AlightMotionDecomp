package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3085o1 extends AbstractC3090p1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33557a == null) {
            return;
        }
        if (this.f33560d == null) {
            Spliterator spliterator = this.f33559c;
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            ArrayDeque b9 = b();
            while (true) {
                L0 a9 = AbstractC3090p1.a(b9);
                if (a9 == null) {
                    this.f33557a = null;
                    return;
                }
                a9.forEach(consumer);
            }
        }
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        L0 a9;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f33560d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f33559c == null && (a9 = AbstractC3090p1.a(this.f33561e)) != null) {
                Spliterator spliterator = a9.spliterator();
                this.f33560d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f33557a = null;
        }
        return tryAdvance;
    }
}
