package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class V2 extends Z2 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i8) {
        w();
        int[] iArr = (int[]) this.f33431e;
        int i9 = this.f33459b;
        this.f33459b = i9 + 1;
        iArr[i9] = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i8) {
        return new int[i8];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC2998d.b((U2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.u0.g(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final void r(Object obj, int i8, int i9, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i8 < i9) {
            intConsumer.accept(iArr[i8]);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final int s(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f33460c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f33460c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] v() {
        return new int[8];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.Z spliterator() {
        return new U2(this, 0, this.f33460c, 0, this.f33459b);
    }
}
