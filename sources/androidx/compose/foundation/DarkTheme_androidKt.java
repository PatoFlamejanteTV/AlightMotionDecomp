package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class DarkTheme_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean _isSystemInDarkTheme(Composer composer, int i8) {
        boolean z8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-882615028, i8, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        if ((((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z8;
    }
}
