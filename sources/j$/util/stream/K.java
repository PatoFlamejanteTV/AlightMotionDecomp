package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class K extends M implements InterfaceC3091p2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33298c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33299d;

    static {
        EnumC3042f3 enumC3042f3 = EnumC3042f3.LONG_VALUE;
        f33298c = new H(true, enumC3042f3, j$.util.E.a(), new C3083o(12), new C3068l(9));
        f33299d = new H(false, enumC3042f3, j$.util.E.a(), new C3083o(12), new C3068l(9));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        o(Long.valueOf(j8));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33310a) {
            return j$.util.E.d(((Long) this.f33311b).longValue());
        }
        return null;
    }
}
