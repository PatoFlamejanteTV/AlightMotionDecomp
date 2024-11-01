package androidx.fragment.app;

import Q5.InterfaceC1416k;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$7 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ InterfaceC1416k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$7(Function0 function0, InterfaceC1416k interfaceC1416k) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = interfaceC1416k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        ViewModelStoreOwner m5430viewModels$lambda1;
        CreationExtras creationExtras;
        Function0 function0 = this.$extrasProducer;
        if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
            return creationExtras;
        }
        m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
        return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }
}
