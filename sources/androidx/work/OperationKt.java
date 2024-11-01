package androidx.work;

import Q5.I;
import U5.d;
import V5.b;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class OperationKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object await(androidx.work.Operation r4, U5.d r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt$await$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            z0.d r4 = (z0.InterfaceFutureC4260d) r4
            Q5.t.b(r5)
            goto L88
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Q5.t.b(r5)
            z0.d r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.AbstractC3292y.h(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L56
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4c
            goto L89
        L4c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L54
            goto L55
        L54:
            r4 = r5
        L55:
            throw r4
        L56:
            r0.L$0 = r4
            r0.label = r3
            n6.p r5 = new n6.p
            U5.d r2 = V5.b.c(r0)
            r5.<init>(r2, r3)
            r5.B()
            androidx.work.ListenableFutureKt$await$2$1 r2 = new androidx.work.ListenableFutureKt$await$2$1
            r2.<init>(r5, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r2, r3)
            androidx.work.ListenableFutureKt$await$2$2 r2 = new androidx.work.ListenableFutureKt$await$2$2
            r2.<init>(r4)
            r5.f(r2)
            java.lang.Object r5 = r5.y()
            java.lang.Object r4 = V5.b.e()
            if (r5 != r4) goto L85
            kotlin.coroutines.jvm.internal.h.c(r0)
        L85:
            if (r5 != r1) goto L88
            return r1
        L88:
            r4 = r5
        L89:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.AbstractC3292y.h(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, U5.d):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, d dVar) {
        Object obj;
        InterfaceFutureC4260d result = operation.getResult();
        AbstractC3292y.h(result, "result");
        if (result.isDone()) {
            try {
                obj = result.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e8;
            }
        } else {
            AbstractC3290w.c(0);
            C3472p c3472p = new C3472p(b.c(dVar), 1);
            c3472p.B();
            result.addListener(new ListenableFutureKt$await$2$1(c3472p, result), DirectExecutor.INSTANCE);
            c3472p.f(new ListenableFutureKt$await$2$2(result));
            I i8 = I.f8786a;
            obj = c3472p.y();
            if (obj == b.e()) {
                h.c(dVar);
            }
            AbstractC3290w.c(1);
        }
        AbstractC3292y.h(obj, "result.await()");
        return obj;
    }
}
