package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3109t1 extends AbstractC3127x1 implements InterfaceC3081n2 {

    /* renamed from: h, reason: collision with root package name */
    private final double[] f33582h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3109t1(Spliterator spliterator, AbstractC3018b abstractC3018b, double[] dArr) {
        super(spliterator, abstractC3018b, dArr.length);
        this.f33582h = dArr;
    }

    C3109t1(C3109t1 c3109t1, Spliterator spliterator, long j8, long j9) {
        super(c3109t1, spliterator, j8, j9, c3109t1.f33582h.length);
        this.f33582h = c3109t1.f33582h;
    }

    @Override // j$.util.stream.AbstractC3127x1, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        int i8 = this.f33615f;
        if (i8 >= this.f33616g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33615f));
        }
        double[] dArr = this.f33582h;
        this.f33615f = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3127x1
    final AbstractC3127x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3109t1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
