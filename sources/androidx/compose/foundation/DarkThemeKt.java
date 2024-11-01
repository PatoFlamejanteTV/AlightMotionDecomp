package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;

/* loaded from: classes.dex */
public final class DarkThemeKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean isSystemInDarkTheme(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1100791446, i8, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:40)");
        }
        boolean _isSystemInDarkTheme = DarkTheme_androidKt._isSystemInDarkTheme(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return _isSystemInDarkTheme;
    }
}
