package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {226, 234}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readState$2 extends l implements InterfaceC2072n {
    final /* synthetic */ boolean $requireLock;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(DataStoreImpl<T> dataStoreImpl, boolean z8, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
        this.$requireLock = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DataStoreImpl$readState$2(this.this$0, this.$requireLock, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object readAndInitOrPropagateAndThrowFailure;
        Object e8 = b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return (State) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState() instanceof Final) {
                    return ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState();
                }
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                readAndInitOrPropagateAndThrowFailure = dataStoreImpl.readAndInitOrPropagateAndThrowFailure(this);
                if (readAndInitOrPropagateAndThrowFailure == e8) {
                    return e8;
                }
            }
            DataStoreImpl<T> dataStoreImpl2 = this.this$0;
            boolean z8 = this.$requireLock;
            this.label = 2;
            obj = dataStoreImpl2.readDataAndUpdateCache(z8, this);
            if (obj == e8) {
                return e8;
            }
            return (State) obj;
        } catch (Throwable th) {
            return new ReadException(th, -1);
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$readState$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
