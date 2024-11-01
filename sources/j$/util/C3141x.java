package j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3141x implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    private double f33658a;

    /* renamed from: b, reason: collision with root package name */
    private double f33659b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void c(double d8) {
        double d9 = d8 - this.f33658a;
        double d10 = this.sum;
        double d11 = d10 + d9;
        this.f33658a = (d11 - d10) - d9;
        this.sum = d11;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.count++;
        this.f33659b += d8;
        c(d8);
        this.min = Math.min(this.min, d8);
        this.max = Math.max(this.max, d8);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    public final void b(C3141x c3141x) {
        this.count += c3141x.count;
        this.f33659b += c3141x.f33659b;
        c(c3141x.sum);
        c(c3141x.f33658a);
        this.min = Math.min(this.min, c3141x.min);
        this.max = Math.max(this.max, c3141x.max);
    }

    public final String toString() {
        double d8;
        String simpleName = C3141x.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d9 = this.sum + this.f33658a;
        if (Double.isNaN(d9) && Double.isInfinite(this.f33659b)) {
            d9 = this.f33659b;
        }
        Double valueOf2 = Double.valueOf(d9);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d10 = this.sum + this.f33658a;
            if (Double.isNaN(d10) && Double.isInfinite(this.f33659b)) {
                d10 = this.f33659b;
            }
            d8 = d10 / this.count;
        } else {
            d8 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d8), Double.valueOf(this.max));
    }
}
