package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();
    private static final ProvidableCompositionLocal<ViewModelStoreOwner> LocalViewModelStoreOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalViewModelStoreOwner$LocalViewModelStoreOwner$1.INSTANCE, 1, null);

    private LocalViewModelStoreOwner() {
    }

    @Composable
    public final ViewModelStoreOwner getCurrent(Composer composer, int i8) {
        composer.startReplaceableGroup(-584162872);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584162872, i8, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) composer.consume(LocalViewModelStoreOwner);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = LocalViewModelStoreOwner_androidKt.findViewTreeViewModelStoreOwner(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModelStoreOwner;
    }

    public final ProvidedValue<ViewModelStoreOwner> provides(ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC3292y.i(viewModelStoreOwner, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner);
    }
}
