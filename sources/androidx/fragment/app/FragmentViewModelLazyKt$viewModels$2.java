package androidx.fragment.app;

import Q5.InterfaceC1416k;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ InterfaceC1416k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(InterfaceC1416k interfaceC1416k) {
        super(0);
        this.$owner$delegate = interfaceC1416k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStoreOwner m5429viewModels$lambda0;
        m5429viewModels$lambda0 = FragmentViewModelLazyKt.m5429viewModels$lambda0(this.$owner$delegate);
        return m5429viewModels$lambda0.getViewModelStore();
    }
}
