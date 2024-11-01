package androidx.compose.ui.platform;

import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ p6.d $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(p6.d dVar, U5.d dVar2) {
        super(2, dVar2);
        this.$channel = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:7:0x0038, B:9:0x0040, B:10:0x002b, B:14:0x0054, B:21:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:7:0x0038, B:9:0x0040, B:10:0x002b, B:14:0x0054, B:21:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:7:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r5.L$1
            p6.f r1 = (p6.f) r1
            java.lang.Object r3 = r5.L$0
            p6.u r3 = (p6.u) r3
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L17
            goto L38
        L17:
            r6 = move-exception
            goto L5d
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L21:
            Q5.t.b(r6)
            p6.d r3 = r5.$channel
            p6.f r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
            r1 = r6
        L2b:
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L17
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L17
            r5.label = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r6 = r1.b(r5)     // Catch: java.lang.Throwable -> L17
            if (r6 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r6 == 0) goto L54
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
            Q5.I r6 = (Q5.I) r6     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L17
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L17
            androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> L17
            r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L17
            goto L2b
        L54:
            Q5.I r6 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L17
            r6 = 0
            p6.k.a(r3, r6)
            Q5.I r6 = Q5.I.f8786a
            return r6
        L5d:
            throw r6     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            p6.k.a(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(n6.M m8, U5.d dVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
