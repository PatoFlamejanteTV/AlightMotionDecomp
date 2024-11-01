package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f1090a;

    /* renamed from: b, reason: collision with root package name */
    private int f1091b;

    public r(double[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1090a = bufferWithData;
        this.f1091b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        double[] dArr = this.f1090a;
        if (dArr.length < i8) {
            double[] copyOf = Arrays.copyOf(dArr, i6.m.d(i8, dArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1090a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1091b;
    }

    public final void e(double d8) {
        h0.c(this, 0, 1, null);
        double[] dArr = this.f1090a;
        int d9 = d();
        this.f1091b = d9 + 1;
        dArr[d9] = d8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f1090a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
