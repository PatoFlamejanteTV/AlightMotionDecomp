package androidx.datastore.core;

import Q5.I;
import U5.d;
import V5.b;
import n6.AbstractC3491z;
import n6.InterfaceC3487x;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* loaded from: classes3.dex */
public abstract class RunOnce {
    private final InterfaceC4158a runMutex = AbstractC4160c.b(false, 1, null);
    private final InterfaceC3487x didRun = AbstractC3491z.b(null, 1, null);

    public final Object awaitComplete(d dVar) {
        Object h8 = this.didRun.h(dVar);
        if (h8 == b.e()) {
            return h8;
        }
        return I.f8786a;
    }

    protected abstract Object doRun(d dVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runIfNeeded(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            w6.a r1 = (w6.InterfaceC4158a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            Q5.t.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.L$1
            w6.a r2 = (w6.InterfaceC4158a) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            Q5.t.b(r7)
            r7 = r2
            goto L6a
        L4c:
            Q5.t.b(r7)
            n6.x r7 = r6.didRun
            boolean r7 = r7.b()
            if (r7 == 0) goto L5a
            Q5.I r7 = Q5.I.f8786a
            return r7
        L5a:
            w6.a r7 = r6.runMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.a(r5, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r6
        L6a:
            n6.x r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            Q5.I r0 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L78
            r7.d(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L78
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.doRun(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            n6.x r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            Q5.I r0 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L35
            r7.v(r0)     // Catch: java.lang.Throwable -> L35
            r1.d(r5)
            return r0
        L96:
            r1.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(U5.d):java.lang.Object");
    }
}
