package q6;

/* renamed from: q6.G */
/* loaded from: classes5.dex */
public interface InterfaceC3808G {

    /* renamed from: a */
    public static final a f37362a = a.f37363a;

    /* renamed from: q6.G$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f37363a = new a();

        /* renamed from: b */
        private static final InterfaceC3808G f37364b = new C3810I();

        /* renamed from: c */
        private static final InterfaceC3808G f37365c = new C3811J();

        private a() {
        }

        public static /* synthetic */ InterfaceC3808G b(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.a(j8, j9);
        }

        public final InterfaceC3808G a(long j8, long j9) {
            return new C3812K(j8, j9);
        }

        public final InterfaceC3808G c() {
            return f37364b;
        }

        public final InterfaceC3808G d() {
            return f37365c;
        }
    }

    InterfaceC3821f a(InterfaceC3813L interfaceC3813L);
}
