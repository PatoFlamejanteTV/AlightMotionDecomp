package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class AndroidScrollable_androidKt {
    @Composable
    public static final ScrollConfig platformScrollConfig(Composer composer, int i8) {
        composer.startReplaceableGroup(-1485272842);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485272842, i8, -1, "androidx.compose.foundation.gestures.platformScrollConfig (AndroidScrollable.android.kt:27)");
        }
        AndroidConfig androidConfig = AndroidConfig.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidConfig;
    }
}
