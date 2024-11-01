package j$.util;

import java.util.function.IntConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3142y implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.count++;
        this.sum += i8;
        this.min = Math.min(this.min, i8);
        this.max = Math.max(this.max, i8);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    public final void b(C3142y c3142y) {
        this.count += c3142y.count;
        this.sum += c3142y.sum;
        this.min = Math.min(this.min, c3142y.min);
        this.max = Math.max(this.max, c3142y.max);
    }

    public final String toString() {
        String simpleName = C3142y.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j8 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j8 > 0 ? this.sum / j8 : 0.0d), Integer.valueOf(this.max));
    }
}
