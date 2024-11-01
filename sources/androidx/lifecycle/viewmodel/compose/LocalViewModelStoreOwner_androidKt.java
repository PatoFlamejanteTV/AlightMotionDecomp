package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* loaded from: classes3.dex */
public final class LocalViewModelStoreOwner_androidKt {
    @Composable
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(Composer composer, int i8) {
        composer.startReplaceableGroup(1382572291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1382572291, i8, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModelStoreOwner;
    }
}
