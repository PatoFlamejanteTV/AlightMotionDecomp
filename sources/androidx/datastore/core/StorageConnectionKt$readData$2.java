package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StorageConnectionKt$readData$2 extends l implements InterfaceC2073o {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StorageConnectionKt$readData$2(d dVar) {
        super(3, dVar);
    }

    public final Object invoke(ReadScope<T> readScope, boolean z8, d dVar) {
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(dVar);
        storageConnectionKt$readData$2.L$0 = readScope;
        return storageConnectionKt$readData$2.invokeSuspend(I.f8786a);
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
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            obj = readScope.readData(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (d) obj3);
    }
}
