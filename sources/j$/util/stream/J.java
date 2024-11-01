package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class J extends M implements InterfaceC3086o2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33292c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33293d;

    static {
        EnumC3042f3 enumC3042f3 = EnumC3042f3.INT_VALUE;
        f33292c = new H(true, enumC3042f3, j$.util.D.a(), new C3083o(11), new C3068l(8));
        f33293d = new H(false, enumC3042f3, j$.util.D.a(), new C3083o(11), new C3068l(8));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        o(Integer.valueOf(i8));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33310a) {
            return j$.util.D.d(((Integer) this.f33311b).intValue());
        }
        return null;
    }
}
