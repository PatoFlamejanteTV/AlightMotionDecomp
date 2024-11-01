package G2;

import g3.EnumC2906e;

/* loaded from: classes4.dex */
public interface b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2805a = new a("Add", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f2806b = new a("Edit", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f2807c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f2808d;

        static {
            a[] a9 = a();
            f2807c = a9;
            f2808d = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f2805a, f2806b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2807c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: G2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0047b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0047b f2809b = new EnumC0047b("AddPaymentMethod", 0, "add_payment_method");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0047b f2810c = new EnumC0047b("SelectPaymentMethod", 1, "select_payment_method");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0047b f2811d = new EnumC0047b("EditPaymentMethod", 2, "edit_payment_method");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumC0047b[] f2812e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f2813f;

        /* renamed from: a, reason: collision with root package name */
        private final String f2814a;

        static {
            EnumC0047b[] a9 = a();
            f2812e = a9;
            f2813f = W5.b.a(a9);
        }

        private EnumC0047b(String str, int i8, String str2) {
            this.f2814a = str2;
        }

        private static final /* synthetic */ EnumC0047b[] a() {
            return new EnumC0047b[]{f2809b, f2810c, f2811d};
        }

        public static EnumC0047b valueOf(String str) {
            return (EnumC0047b) Enum.valueOf(EnumC0047b.class, str);
        }

        public static EnumC0047b[] values() {
            return (EnumC0047b[]) f2812e.clone();
        }
    }

    void a();

    void b(EnumC2906e enumC2906e, Throwable th);

    void c(EnumC2906e enumC2906e);

    void d(a aVar, EnumC2906e enumC2906e);

    void e(String str);

    void f(F2.c cVar);

    void g(a aVar, EnumC2906e enumC2906e);

    void h(String str);

    void i();

    void j(EnumC0047b enumC0047b);

    void k(String str);

    void l();

    void m();

    void n();

    void o(EnumC0047b enumC0047b);
}
