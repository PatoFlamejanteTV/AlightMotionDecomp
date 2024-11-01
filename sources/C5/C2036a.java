package c5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2036a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0374a f15718f = new C0374a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f15719a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15720b;

    /* renamed from: c, reason: collision with root package name */
    private int f15721c;

    /* renamed from: d, reason: collision with root package name */
    private int f15722d;

    /* renamed from: e, reason: collision with root package name */
    private b f15723e;

    /* renamed from: c5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0374a {
        private C0374a() {
        }

        public final b a(int i8) {
            b bVar = b.f15724a;
            if (i8 != bVar.ordinal()) {
                bVar = b.f15725b;
                if (i8 != bVar.ordinal()) {
                    throw new IllegalArgumentException();
                }
            }
            return bVar;
        }

        public /* synthetic */ C0374a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: c5.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15724a = new b("DOWNLOADED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f15725b = new b("INSTALLED", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f15726c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f15727d;

        static {
            b[] a9 = a();
            f15726c = a9;
            f15727d = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f15724a, f15725b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f15726c.clone();
        }
    }

    public C2036a(String packageName, long j8) {
        AbstractC3292y.i(packageName, "packageName");
        this.f15719a = packageName;
        this.f15720b = j8;
        this.f15721c = -1;
        this.f15722d = -1;
        this.f15723e = b.f15724a;
    }

    public final int a() {
        return this.f15722d;
    }

    public final int b() {
        return this.f15721c;
    }

    public final String c() {
        return this.f15719a;
    }

    public final b d() {
        return this.f15723e;
    }

    public final long e() {
        return this.f15720b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036a)) {
            return false;
        }
        C2036a c2036a = (C2036a) obj;
        if (AbstractC3292y.d(this.f15719a, c2036a.f15719a) && this.f15720b == c2036a.f15720b) {
            return true;
        }
        return false;
    }

    public final C2036a f(Context context) {
        C2036a P8;
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        int i8 = this.f15722d;
        if (i8 != -1) {
            P8 = a9.O(i8);
        } else {
            int i9 = this.f15721c;
            if (i9 != -1) {
                P8 = a9.Q(i9);
            } else {
                P8 = a9.P(this.f15719a, this.f15720b);
            }
        }
        a9.i();
        return P8;
    }

    public final void g(Context context) {
        C2036a P8;
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        int i8 = this.f15722d;
        if (i8 != -1) {
            P8 = a9.O(i8);
        } else {
            int i9 = this.f15721c;
            if (i9 != -1) {
                P8 = a9.Q(i9);
            } else {
                P8 = a9.P(this.f15719a, this.f15720b);
            }
        }
        if (P8 != null) {
            a9.j1(this);
        } else {
            a9.y0(this);
        }
        a9.i();
    }

    public final void h(int i8) {
        this.f15722d = i8;
    }

    public int hashCode() {
        return (this.f15719a.hashCode() * 31) + androidx.collection.a.a(this.f15720b);
    }

    public final void i(int i8) {
        this.f15721c = i8;
    }

    public final void j(b bVar) {
        AbstractC3292y.i(bVar, "<set-?>");
        this.f15723e = bVar;
    }

    public String toString() {
        return "ActiveNotification(packageName=" + this.f15719a + ", versionCode=" + this.f15720b + ')';
    }
}
