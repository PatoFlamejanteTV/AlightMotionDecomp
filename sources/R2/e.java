package R2;

/* loaded from: classes4.dex */
public interface e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9198a = new a("RequiresSignUp", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f9199b = new a("RequiresVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f9200c = new a("Verified", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f9201d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f9202e;

        static {
            a[] a9 = a();
            f9201d = a9;
            f9202e = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f9198a, f9199b, f9200c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9201d.clone();
        }
    }

    void a(boolean z8);

    void b(boolean z8);

    void c();

    void d();

    void e(Throwable th);

    void f(a aVar);

    void g();

    void h(boolean z8, Throwable th);

    void i(Throwable th);

    void j();

    void k();

    void l();
}
