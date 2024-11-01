package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LiveDataScopeImpl$emit$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t8, U5.d dVar) {
        super(2, dVar);
        this.this$0 = liveDataScopeImpl;
        this.$value = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            CoroutineLiveData target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            this.label = 1;
            if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == e8) {
                return e8;
            }
        }
        this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((LiveDataScopeImpl$emit$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
