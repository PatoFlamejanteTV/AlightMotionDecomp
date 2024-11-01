package Q5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8824b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f8825a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ y(byte b9) {
        this.f8825a = b9;
    }

    public static final /* synthetic */ y a(byte b9) {
        return new y(b9);
    }

    public static boolean c(byte b9, Object obj) {
        if (!(obj instanceof y) || b9 != ((y) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(byte b9) {
        return String.valueOf(b9 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3292y.k(f() & 255, ((y) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f8825a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f8825a;
    }

    public int hashCode() {
        return d(this.f8825a);
    }

    public String toString() {
        return e(this.f8825a);
    }

    public static byte b(byte b9) {
        return b9;
    }

    public static int d(byte b9) {
        return b9;
    }
}
