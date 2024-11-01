package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.datastore.core.Message;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$writeActor$3 extends l implements InterfaceC2072n {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$3(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this.this$0, dVar);
        dataStoreImpl$writeActor$3.L$0 = obj;
        return dataStoreImpl$writeActor$3;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Message.Update<T> update, d dVar) {
        return ((DataStoreImpl$writeActor$3) create(update, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object handleUpdate;
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
            Message.Update update = (Message.Update) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            handleUpdate = dataStoreImpl.handleUpdate(update, this);
            if (handleUpdate == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
