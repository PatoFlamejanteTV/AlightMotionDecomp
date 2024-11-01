package androidx.datastore.core.okio;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {231, 137}, m = "writeScope")
/* loaded from: classes3.dex */
public final class OkioStorageConnection$writeScope$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioStorageConnection<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$writeScope$1(OkioStorageConnection<T> okioStorageConnection, U5.d dVar) {
        super(dVar);
        this.this$0 = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeScope(null, this);
    }
}
