package androidx.compose.runtime.livedata;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LiveDataAdapterKt$observeAsState$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ MutableState<R> $state;
    final /* synthetic */ LiveData<T> $this_observeAsState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataAdapterKt$observeAsState$1(LiveData<T> liveData, LifecycleOwner lifecycleOwner, MutableState<R> mutableState) {
        super(1);
        this.$this_observeAsState = liveData;
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final MutableState<R> mutableState = this.$state;
        final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MutableState.this.setValue(obj);
            }
        };
        this.$this_observeAsState.observe(this.$lifecycleOwner, observer);
        final LiveData<T> liveData = this.$this_observeAsState;
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LiveData.this.removeObserver(observer);
            }
        };
    }
}
