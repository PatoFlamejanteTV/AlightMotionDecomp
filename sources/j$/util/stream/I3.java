package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class I3 extends AbstractC3047g3 {
    @Override // j$.util.stream.AbstractC3047g3
    final void d() {
        C3017a3 c3017a3 = new C3017a3();
        this.f33512h = c3017a3;
        Objects.requireNonNull(c3017a3);
        this.f33509e = this.f33506b.S(new H3(c3017a3, 0));
        this.f33510f = new C3013a(6, this);
    }

    @Override // j$.util.stream.AbstractC3047g3
    final AbstractC3047g3 e(Spliterator spliterator) {
        return new AbstractC3047g3(this.f33506b, spliterator, this.f33505a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33512h != null || this.f33513i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        H3 h32 = new H3(consumer, 1);
        this.f33506b.R(this.f33508d, h32);
        this.f33513i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a9 = a();
        if (a9) {
            C3017a3 c3017a3 = (C3017a3) this.f33512h;
            long j8 = this.f33511g;
            if (c3017a3.f33460c != 0) {
                if (j8 >= c3017a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j8));
                }
                for (int i8 = 0; i8 <= c3017a3.f33460c; i8++) {
                    long j9 = c3017a3.f33461d[i8];
                    Object[] objArr = c3017a3.f33439f[i8];
                    if (j8 < objArr.length + j9) {
                        obj = objArr[(int) (j8 - j9)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            if (j8 >= c3017a3.f33459b) {
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            obj = c3017a3.f33438e[(int) j8];
            consumer.o(obj);
        }
        return a9;
    }
}
