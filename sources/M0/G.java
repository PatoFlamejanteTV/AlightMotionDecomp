package M0;

/* loaded from: classes3.dex */
public abstract class G {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i8, G0.f fVar) {
            return new C(str, str2, str3, str4, i8, fVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract G0.f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public static b c(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
            return new D(i8, str, i9, j8, j9, z8, i10, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public static c a(String str, String str2, boolean z8) {
            return new E(str, str2, z8);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static G b(a aVar, c cVar, b bVar) {
        return new B(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
