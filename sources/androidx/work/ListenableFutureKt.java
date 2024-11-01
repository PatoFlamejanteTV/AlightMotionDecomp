package androidx.work;

import Q5.I;
import U5.d;
import V5.b;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3290w;
import n6.C3472p;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object await(InterfaceFutureC4260d interfaceFutureC4260d, d dVar) {
        if (interfaceFutureC4260d.isDone()) {
            try {
                return interfaceFutureC4260d.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        }
        C3472p c3472p = new C3472p(b.c(dVar), 1);
        c3472p.B();
        interfaceFutureC4260d.addListener(new ListenableFutureKt$await$2$1(c3472p, interfaceFutureC4260d), DirectExecutor.INSTANCE);
        c3472p.f(new ListenableFutureKt$await$2$2(interfaceFutureC4260d));
        Object y8 = c3472p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        return y8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(InterfaceFutureC4260d interfaceFutureC4260d, d dVar) {
        if (interfaceFutureC4260d.isDone()) {
            try {
                return interfaceFutureC4260d.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e8;
            }
        }
        AbstractC3290w.c(0);
        C3472p c3472p = new C3472p(b.c(dVar), 1);
        c3472p.B();
        interfaceFutureC4260d.addListener(new ListenableFutureKt$await$2$1(c3472p, interfaceFutureC4260d), DirectExecutor.INSTANCE);
        c3472p.f(new ListenableFutureKt$await$2$2(interfaceFutureC4260d));
        I i8 = I.f8786a;
        Object y8 = c3472p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3290w.c(1);
        return y8;
    }
}
