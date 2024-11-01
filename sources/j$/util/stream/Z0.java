package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Z0 extends Y0 implements A0 {
    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final F0 a() {
        int i8 = this.f33423b;
        double[] dArr = this.f33422a;
        if (i8 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33423b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ L0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        int i8 = this.f33423b;
        double[] dArr = this.f33422a;
        if (i8 >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f33423b = 1 + i8;
        dArr[i8] = d8;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = this.f33423b;
        double[] dArr = this.f33422a;
        if (i8 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33423b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        double[] dArr = this.f33422a;
        if (j8 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(dArr.length)));
        }
        this.f33423b = 0;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }

    @Override // j$.util.stream.Y0
    public final String toString() {
        double[] dArr = this.f33422a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f33423b), Arrays.toString(dArr));
    }
}
