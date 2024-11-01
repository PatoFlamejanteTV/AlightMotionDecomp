package s6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3996p {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f39210a = new C3980F("CONDITION_FALSE");

    public static final Object a() {
        return f39210a;
    }

    public static final C3997q b(Object obj) {
        z zVar;
        C3997q c3997q;
        if (obj instanceof z) {
            zVar = (z) obj;
        } else {
            zVar = null;
        }
        if (zVar == null || (c3997q = zVar.f39231a) == null) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C3997q) obj;
        }
        return c3997q;
    }
}
