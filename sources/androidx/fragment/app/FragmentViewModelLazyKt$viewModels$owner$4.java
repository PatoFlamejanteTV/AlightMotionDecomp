package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$4 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$owner$4(Function0 function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}
