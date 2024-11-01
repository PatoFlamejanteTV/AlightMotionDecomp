package j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class A implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        accept(i8);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.count++;
        this.sum += j8;
        this.min = Math.min(this.min, j8);
        this.max = Math.max(this.max, j8);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    public final void b(A a9) {
        this.count += a9.count;
        this.sum += a9.sum;
        this.min = Math.min(this.min, a9.min);
        this.max = Math.max(this.max, a9.max);
    }

    public final String toString() {
        String simpleName = A.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j8 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j8 > 0 ? this.sum / j8 : 0.0d), Long.valueOf(this.max));
    }
}
