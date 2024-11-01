package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class LiveDataKt {
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner owner, final Function1 onChanged) {
        AbstractC3292y.i(liveData, "<this>");
        AbstractC3292y.i(owner, "owner");
        AbstractC3292y.i(onChanged, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t8) {
                Function1.this.invoke(t8);
            }
        };
        liveData.observe(owner, observer);
        return observer;
    }
}
