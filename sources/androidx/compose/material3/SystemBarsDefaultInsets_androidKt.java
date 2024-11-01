package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    @Composable
    public static final WindowInsets getSystemBarsForVisualComponents(WindowInsets.Companion companion, Composer composer, int i8) {
        AbstractC3292y.i(companion, "<this>");
        composer.startReplaceableGroup(1816710665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1816710665, i8, -1, "androidx.compose.material3.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:24)");
        }
        WindowInsets systemBars = WindowInsets_androidKt.getSystemBars(companion, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }
}
