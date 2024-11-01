package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return n.b(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(InterfaceC3214c modelClass, CreationExtras extras) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(AbstractC1989a.a(modelClass));
    }
}
