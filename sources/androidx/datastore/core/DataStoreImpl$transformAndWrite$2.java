package androidx.datastore.core;

import Q5.I;
import U5.d;
import U5.g;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {338, 339, 345}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$transformAndWrite$2 extends l implements Function1 {
    final /* synthetic */ g $callerContext;
    final /* synthetic */ InterfaceC2072n $transform;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl<T> dataStoreImpl, g gVar, InterfaceC2072n interfaceC2072n, d dVar) {
        super(1, dVar);
        this.this$0 = dataStoreImpl;
        this.$callerContext = gVar;
        this.$transform = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataStoreImpl$transformAndWrite$2) create(dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r8.L$0
            Q5.t.b(r9)
            goto L6c
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.L$0
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            Q5.t.b(r9)
            goto L51
        L27:
            Q5.t.b(r9)
            goto L39
        L2b:
            Q5.t.b(r9)
            androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
            r8.label = r4
            java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            r1 = r9
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            U5.g r9 = r8.$callerContext
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            c6.n r6 = r8.$transform
            r7 = 0
            r5.<init>(r6, r1, r7)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r5, r8)
            if (r9 != r0) goto L51
            return r0
        L51:
            r1.checkHashCode()
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.AbstractC3292y.d(r1, r9)
            if (r1 != 0) goto L6d
            androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
            if (r1 != r0) goto L6b
            return r0
        L6b:
            r0 = r9
        L6c:
            r9 = r0
        L6d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
