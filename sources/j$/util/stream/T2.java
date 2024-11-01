package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class T2 extends Z2 implements DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public void accept(double d8) {
        w();
        double[] dArr = (double[]) this.f33431e;
        int i8 = this.f33459b;
        this.f33459b = i8 + 1;
        dArr[i8] = d8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i8) {
        return new double[i8];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC2998d.a((S2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.u0.f(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final void r(Object obj, int i8, int i9, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i8 < i9) {
            doubleConsumer.accept(dArr[i8]);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final int s(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f33460c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f33460c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] v() {
        return new double[8];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.W spliterator() {
        return new S2(this, 0, this.f33460c, 0, this.f33459b);
    }
}
