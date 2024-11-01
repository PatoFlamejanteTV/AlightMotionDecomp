package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {228, 229}, m = "emitSource$lifecycle_livedata_release")
/* loaded from: classes3.dex */
public final class CoroutineLiveData$emitSource$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, U5.d dVar) {
        super(dVar);
        this.this$0 = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_release(null, this);
    }
}
