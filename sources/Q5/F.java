package Q5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class F implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8781b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final short f8782a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ F(short s8) {
        this.f8782a = s8;
    }

    public static final /* synthetic */ F a(short s8) {
        return new F(s8);
    }

    public static boolean c(short s8, Object obj) {
        if (!(obj instanceof F) || s8 != ((F) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(short s8) {
        return String.valueOf(s8 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3292y.k(f() & 65535, ((F) obj).f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f8782a, obj);
    }

    public final /* synthetic */ short f() {
        return this.f8782a;
    }

    public int hashCode() {
        return d(this.f8782a);
    }

    public String toString() {
        return e(this.f8782a);
    }

    public static short b(short s8) {
        return s8;
    }

    public static int d(short s8) {
        return s8;
    }
}
