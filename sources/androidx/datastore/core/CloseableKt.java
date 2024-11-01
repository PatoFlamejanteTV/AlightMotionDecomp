package androidx.datastore.core;

import Q5.AbstractC1410e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t8, Function1 block) {
        AbstractC3292y.i(t8, "<this>");
        AbstractC3292y.i(block, "block");
        try {
            R r8 = (R) block.invoke(t8);
            AbstractC3290w.b(1);
            try {
                t8.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                AbstractC3290w.a(1);
                return r8;
            }
            throw th;
        } catch (Throwable th2) {
            AbstractC3290w.b(1);
            try {
                t8.close();
            } catch (Throwable th3) {
                AbstractC1410e.a(th2, th3);
            }
            throw th2;
        }
    }
}
