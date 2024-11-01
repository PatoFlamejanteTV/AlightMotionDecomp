package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, Function0 function0) {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T t8 = (T) function0.invoke();
            AbstractC3290w.b(1);
            trace.endSection(beginSection);
            AbstractC3290w.a(1);
            return t8;
        } catch (Throwable th) {
            AbstractC3290w.b(1);
            Trace.INSTANCE.endSection(beginSection);
            AbstractC3290w.a(1);
            throw th;
        }
    }
}
