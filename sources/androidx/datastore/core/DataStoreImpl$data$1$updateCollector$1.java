package androidx.datastore.core;

import Q5.C1413h;
import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.InterfaceC3802A;
import q6.InterfaceC3822g;

@f(c = "androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1", f = "DataStoreImpl.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$data$1$updateCollector$1 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1$updateCollector$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DataStoreImpl$data$1$updateCollector$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3802A interfaceC3802A;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            interfaceC3802A = ((DataStoreImpl) this.this$0).updateCollection;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(I i9, d dVar) {
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (interfaceC3802A.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        throw new C1413h();
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$data$1$updateCollector$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
