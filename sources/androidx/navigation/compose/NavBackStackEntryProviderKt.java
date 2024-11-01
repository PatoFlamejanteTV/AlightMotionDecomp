package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2072n;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class NavBackStackEntryProviderKt {
    @Composable
    public static final void LocalOwnersProvider(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1579360880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1579360880, i8, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.composableLambda(startRestartGroup, -52928304, true, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(saveableStateHolder, interfaceC2072n, i8)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, saveableStateHolder, interfaceC2072n, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SaveableStateProvider(SaveableStateHolder saveableStateHolder, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        CreationExtras creationExtras;
        Composer startRestartGroup = composer.startRestartGroup(1211832233);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1211832233, i8, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
        }
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) BackStackEntryIdViewModel.class, current, (String) null, (ViewModelProvider.Factory) null, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
            backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), interfaceC2072n, startRestartGroup, (i8 & 112) | 520);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new NavBackStackEntryProviderKt$SaveableStateProvider$1(saveableStateHolder, interfaceC2072n, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
