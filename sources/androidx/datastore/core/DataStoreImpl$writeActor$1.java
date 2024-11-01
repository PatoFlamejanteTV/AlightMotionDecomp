package androidx.datastore.core;

import Q5.I;
import Q5.InterfaceC1416k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DataStoreImpl$writeActor$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        InterfaceC1416k interfaceC1416k;
        if (th != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th));
        }
        interfaceC1416k = ((DataStoreImpl) this.this$0).storageConnectionDelegate;
        if (interfaceC1416k.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}
