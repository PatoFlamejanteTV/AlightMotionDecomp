package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* loaded from: classes.dex */
public final class OverscrollConfigurationKt {
    private static final ProvidableCompositionLocal<OverscrollConfiguration> LocalOverscrollConfiguration = CompositionLocalKt.compositionLocalOf$default(null, OverscrollConfigurationKt$LocalOverscrollConfiguration$1.INSTANCE, 1, null);

    @ExperimentalFoundationApi
    public static final ProvidableCompositionLocal<OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return LocalOverscrollConfiguration;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }
}
