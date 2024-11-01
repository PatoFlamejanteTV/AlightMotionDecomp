package j$.util.stream;

/* loaded from: classes2.dex */
final class L extends M {

    /* renamed from: c, reason: collision with root package name */
    static final H f33303c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33304d;

    static {
        EnumC3042f3 enumC3042f3 = EnumC3042f3.REFERENCE;
        f33303c = new H(true, enumC3042f3, j$.util.B.a(), new C3083o(13), new C3068l(10));
        f33304d = new H(false, enumC3042f3, j$.util.B.a(), new C3083o(13), new C3068l(10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33310a) {
            return j$.util.B.d(this.f33311b);
        }
        return null;
    }
}
