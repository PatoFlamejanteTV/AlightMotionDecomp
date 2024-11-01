package E2;

import m6.C3374a;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(d dVar, b bVar, boolean z8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    z8 = true;
                }
                dVar.a(bVar, z8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1553a = new b("Loading", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f1554b = new b("Checkout", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f1555c = new b("LinkSignup", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f1556d = new b("ConfirmButtonClicked", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f1557e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f1558f;

        static {
            b[] a9 = a();
            f1557e = a9;
            f1558f = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f1553a, f1554b, f1555c, f1556d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1557e.clone();
        }
    }

    void a(b bVar, boolean z8);

    C3374a b(b bVar);
}
