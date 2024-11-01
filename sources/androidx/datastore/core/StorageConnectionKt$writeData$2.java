package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StorageConnectionKt$writeData$2 extends l implements InterfaceC2072n {
    final /* synthetic */ T $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageConnectionKt$writeData$2(T t8, d dVar) {
        super(2, dVar);
        this.$value = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        StorageConnectionKt$writeData$2 storageConnectionKt$writeData$2 = new StorageConnectionKt$writeData$2(this.$value, dVar);
        storageConnectionKt$writeData$2.L$0 = obj;
        return storageConnectionKt$writeData$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(WriteScope<T> writeScope, d dVar) {
        return ((StorageConnectionKt$writeData$2) create(writeScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            WriteScope writeScope = (WriteScope) this.L$0;
            T t8 = this.$value;
            this.label = 1;
            if (writeScope.writeData(t8, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
