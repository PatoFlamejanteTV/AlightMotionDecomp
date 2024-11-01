package androidx.datastore.core;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {360, 361}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$writeData$2 extends l implements InterfaceC2072n {
    final /* synthetic */ T $newData;
    final /* synthetic */ Q $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Q q8, DataStoreImpl<T> dataStoreImpl, T t8, boolean z8, d dVar) {
        super(2, dVar);
        this.$newVersion = q8;
        this.this$0 = dataStoreImpl;
        this.$newData = t8;
        this.$updateCache = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, dVar);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(WriteScope<T> writeScope, d dVar) {
        return ((DataStoreImpl$writeData$2) create(writeScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Q5.t.b(r7)
            goto L5d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Q r1 = (kotlin.jvm.internal.Q) r1
            java.lang.Object r3 = r6.L$0
            androidx.datastore.core.WriteScope r3 = (androidx.datastore.core.WriteScope) r3
            Q5.t.b(r7)
            goto L45
        L26:
            Q5.t.b(r7)
            java.lang.Object r7 = r6.L$0
            androidx.datastore.core.WriteScope r7 = (androidx.datastore.core.WriteScope) r7
            kotlin.jvm.internal.Q r1 = r6.$newVersion
            androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
            androidx.datastore.core.InterProcessCoordinator r4 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r4)
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r4.incrementAndGetVersion(r6)
            if (r3 != r0) goto L42
            return r0
        L42:
            r5 = r3
            r3 = r7
            r7 = r5
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.f34571a = r7
            T r7 = r6.$newData
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r3.writeData(r7, r6)
            if (r7 != r0) goto L5d
            return r0
        L5d:
            boolean r7 = r6.$updateCache
            if (r7 == 0) goto L7d
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.DataStoreInMemoryCache r7 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r7)
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            T r1 = r6.$newData
            if (r1 == 0) goto L72
            int r2 = r1.hashCode()
            goto L73
        L72:
            r2 = 0
        L73:
            kotlin.jvm.internal.Q r3 = r6.$newVersion
            int r3 = r3.f34571a
            r0.<init>(r1, r2, r3)
            r7.tryUpdate(r0)
        L7d:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
