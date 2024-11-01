package androidx.datastore.core;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {378, 379}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataOrHandleCorruption$2 extends l implements InterfaceC2072n {
    final /* synthetic */ int $preLockVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$2(DataStoreImpl<T> dataStoreImpl, int i8, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
        this.$preLockVersion = i8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.this$0, this.$preLockVersion, dVar);
        dataStoreImpl$readDataOrHandleCorruption$2.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (d) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r5.L$0
            Q5.t.b(r6)
            goto L49
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            boolean r1 = r5.Z$0
            Q5.t.b(r6)
            goto L34
        L22:
            Q5.t.b(r6)
            boolean r1 = r5.Z$0
            androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
            r5.Z$0 = r1
            r5.label = r3
            java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            if (r1 == 0) goto L50
            androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
            androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r1 = r1.getVersion(r5)
            if (r1 != r0) goto L47
            return r0
        L47:
            r0 = r6
            r6 = r1
        L49:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L55
        L50:
            int r0 = r5.$preLockVersion
            r4 = r0
            r0 = r6
            r6 = r4
        L55:
            androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
            if (r0 == 0) goto L5e
            int r2 = r0.hashCode()
            goto L5f
        L5e:
            r2 = 0
        L5f:
            r1.<init>(r0, r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(boolean z8, d dVar) {
        return ((DataStoreImpl$readDataOrHandleCorruption$2) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
    }
}
