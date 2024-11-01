package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class I extends M implements InterfaceC3081n2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33284c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33285d;

    static {
        EnumC3042f3 enumC3042f3 = EnumC3042f3.DOUBLE_VALUE;
        f33284c = new H(true, enumC3042f3, j$.util.C.a(), new C3083o(10), new C3068l(7));
        f33285d = new H(false, enumC3042f3, j$.util.C.a(), new C3083o(10), new C3068l(7));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        o(Double.valueOf(d8));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33310a) {
            return j$.util.C.d(((Double) this.f33311b).doubleValue());
        }
        return null;
    }
}
