package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class X2 extends Z2 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public void accept(long j8) {
        w();
        long[] jArr = (long[]) this.f33431e;
        int i8 = this.f33459b;
        this.f33459b = i8 + 1;
        jArr[i8] = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i8) {
        return new long[i8];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC2998d.c((W2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.u0.h(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final void r(Object obj, int i8, int i9, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i8 < i9) {
            longConsumer.accept(jArr[i8]);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final int s(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f33460c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f33460c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] v() {
        return new long[8];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.c0 spliterator() {
        return new W2(this, 0, this.f33460c, 0, this.f33459b);
    }
}
