package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m106synchronized(Lock lock, Function0 block) {
        T t8;
        AbstractC3292y.i(lock, "<this>");
        AbstractC3292y.i(block, "block");
        synchronized (lock) {
            try {
                t8 = (T) block.invoke();
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        return t8;
    }
}
