package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import b6.AbstractC1989a;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(298765658);
        if ((i9 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i9 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i9 & 4) != 0 ? null : factory;
        AbstractC3292y.n(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(U.b(ViewModel.class), viewModelStoreOwner2, str2, factory2, (CreationExtras) null, composer, (i8 << 3) & 8176, 16);
        composer.endReplaceableGroup();
        return vm;
    }

    @Composable
    public static final /* synthetic */ ViewModel viewModel(Class modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i8, int i9) {
        ViewModel viewModel;
        AbstractC3292y.i(modelClass, "modelClass");
        composer.startReplaceableGroup(-1252471378);
        if ((i9 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i9 & 4) != 0) {
            str = null;
        }
        ViewModelProvider.Factory factory2 = (i9 & 8) != 0 ? null : factory;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252471378, i8, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:85)");
        }
        viewModel = ViewModelKt__ViewModelKt.get$default(viewModelStoreOwner, AbstractC1989a.c(modelClass), str, factory2, null, 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModel;
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(Class<VM> modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        AbstractC3292y.i(modelClass, "modelClass");
        composer.startReplaceableGroup(-1566358618);
        if ((i9 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i9 & 4) != 0) {
            str = null;
        }
        if ((i9 & 8) != 0) {
            factory = null;
        }
        if ((i9 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1566358618, i8, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:123)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, AbstractC1989a.c(modelClass), str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm;
    }
}
