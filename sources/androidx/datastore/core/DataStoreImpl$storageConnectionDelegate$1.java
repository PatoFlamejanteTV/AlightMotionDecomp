package androidx.datastore.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DataStoreImpl$storageConnectionDelegate$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StorageConnection<T> invoke() {
        Storage storage;
        storage = ((DataStoreImpl) this.this$0).storage;
        return storage.createConnection();
    }
}
