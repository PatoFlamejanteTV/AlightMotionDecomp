package s6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3978D {
    public static final AbstractC3977C b(Object obj) {
        if (obj != AbstractC3984d.f39189a) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (AbstractC3977C) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        if (obj == AbstractC3984d.f39189a) {
            return true;
        }
        return false;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
