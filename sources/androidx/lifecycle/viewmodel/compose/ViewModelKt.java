package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, InterfaceC3214c interfaceC3214c, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (VM) ViewModelKt__ViewModelKt.get(viewModelStoreOwner, interfaceC3214c, str, factory, creationExtras);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i8, int i9) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, composer, i8, i9);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, composer, i8, i9);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Function1 function1, Composer composer, int i8, int i9) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, function1, composer, i8, i9);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(InterfaceC3214c interfaceC3214c, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(interfaceC3214c, viewModelStoreOwner, str, factory, creationExtras, composer, i8, i9);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i8, i9);
    }
}
