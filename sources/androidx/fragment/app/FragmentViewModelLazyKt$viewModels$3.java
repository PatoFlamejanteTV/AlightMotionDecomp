package androidx.fragment.app;

import Q5.InterfaceC1416k;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$3 extends AbstractC3293z implements Function0 {
    final /* synthetic */ InterfaceC1416k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$3(InterfaceC1416k interfaceC1416k) {
        super(0);
        this.$owner$delegate = interfaceC1416k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        ViewModelStoreOwner m5429viewModels$lambda0;
        CreationExtras defaultViewModelCreationExtras;
        m5429viewModels$lambda0 = FragmentViewModelLazyKt.m5429viewModels$lambda0(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5429viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5429viewModels$lambda0 : null;
        return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
    }
}
