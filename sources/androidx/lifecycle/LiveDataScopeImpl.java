package androidx.lifecycle;

import Q5.I;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;

/* loaded from: classes3.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final U5.g coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> target, U5.g context) {
        AbstractC3292y.i(target, "target");
        AbstractC3292y.i(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(C3445b0.c().G());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t8, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t8, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, U5.d dVar) {
        return AbstractC3458i.g(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), dVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        AbstractC3292y.i(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
