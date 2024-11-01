package androidx.compose.ui.text.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4925synchronized(SynchronizedObject synchronizedObject, Function0 function0) {
        R r8;
        synchronized (synchronizedObject) {
            try {
                r8 = (R) function0.invoke();
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        return r8;
    }
}
