package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(SynchronizedObject lock, Function0 action) {
        T t8;
        AbstractC3292y.i(lock, "lock");
        AbstractC3292y.i(action, "action");
        synchronized (lock) {
            try {
                t8 = (T) action.invoke();
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
