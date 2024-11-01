package androidx.compose.ui.res;

import android.content.Context;
import android.os.Build;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class ColorResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final long colorResource(@ColorRes int i8, Composer composer, int i9) {
        long Color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i9, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (Build.VERSION.SDK_INT >= 23) {
            Color = ColorResourceHelper.INSTANCE.m4483getColorWaAFU9c(context, i8);
        } else {
            Color = ColorKt.Color(context.getResources().getColor(i8));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Color;
    }
}
