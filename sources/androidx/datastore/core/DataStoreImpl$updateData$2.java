package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.datastore.core.Message;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.AbstractC3491z;
import n6.InterfaceC3487x;
import n6.M;

@f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$updateData$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$updateData$2(DataStoreImpl<T> dataStoreImpl, InterfaceC2072n interfaceC2072n, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
        this.$transform = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.this$0, this.$transform, dVar);
        dataStoreImpl$updateData$2.L$0 = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SimpleActor simpleActor;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            M m8 = (M) this.L$0;
            InterfaceC3487x b9 = AbstractC3491z.b(null, 1, null);
            Message.Update update = new Message.Update(this.$transform, b9, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), m8.getCoroutineContext());
            simpleActor = ((DataStoreImpl) this.this$0).writeActor;
            simpleActor.offer(update);
            this.label = 1;
            obj = b9.h(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$updateData$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
