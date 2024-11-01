package n6;

import s6.C3980F;

/* renamed from: n6.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3465l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3980F f35736a = new C3980F("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final C3980F f35737b = new C3980F("CLOSED_EMPTY");

    public static final long c(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j8;
    }
}
