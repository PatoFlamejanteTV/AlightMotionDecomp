package androidx.datastore.core;

import Q5.I;
import Q5.t;
import Q5.x;
import U5.d;
import V5.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {306, 308}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataAndUpdateCache$3 extends l implements Function1 {
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(1, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create(dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        State state;
        Object e8 = b.e();
        int i8 = this.label;
        try {
        } catch (Throwable th2) {
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = th2;
            this.label = 2;
            Object version = coordinator.getVersion(this);
            if (version == e8) {
                return e8;
            }
            th = th2;
            obj = version;
        }
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    th = (Throwable) this.L$0;
                    t.b(obj);
                    state = new ReadException(th, ((Number) obj).intValue());
                    return x.a(state, kotlin.coroutines.jvm.internal.b.a(true));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj == e8) {
                return e8;
            }
        }
        state = (State) obj;
        return x.a(state, kotlin.coroutines.jvm.internal.b.a(true));
    }
}
