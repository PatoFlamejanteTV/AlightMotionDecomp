package androidx.datastore.core;

import Q5.I;
import U5.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {445, 466, 554, 476}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends l implements Function1 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, d dVar) {
        super(1, dVar);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
