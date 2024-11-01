package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {295, 304, 312}, m = "readDataAndUpdateCache")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataAndUpdateCache$1 extends d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$1(DataStoreImpl<T> dataStoreImpl, U5.d dVar) {
        super(dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object readDataAndUpdateCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readDataAndUpdateCache = this.this$0.readDataAndUpdateCache(false, this);
        return readDataAndUpdateCache;
    }
}
