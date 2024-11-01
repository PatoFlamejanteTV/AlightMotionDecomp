package v;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4111g {

    /* renamed from: v.g$a */
    /* loaded from: classes3.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC4111g a() {
        return new C4106b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC4111g d() {
        return new C4106b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC4111g e(long j8) {
        return new C4106b(a.OK, j8);
    }

    public static AbstractC4111g f() {
        return new C4106b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
