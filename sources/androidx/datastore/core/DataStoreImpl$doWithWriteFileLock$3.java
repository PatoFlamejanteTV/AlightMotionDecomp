package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$doWithWriteFileLock$3 extends l implements Function1 {
    final /* synthetic */ Function1 $block;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$doWithWriteFileLock$3(Function1 function1, d dVar) {
        super(1, dVar);
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataStoreImpl$doWithWriteFileLock$3(this.$block, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataStoreImpl$doWithWriteFileLock$3) create(dVar)).invokeSuspend(I.f8786a);
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
            Function1 function1 = this.$block;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
