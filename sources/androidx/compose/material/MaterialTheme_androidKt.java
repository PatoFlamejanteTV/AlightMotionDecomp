package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MaterialTheme_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PlatformMaterialTheme(InterfaceC2072n content, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1322912246);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1322912246, i9, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            content.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MaterialTheme_androidKt$PlatformMaterialTheme$1(content, i8));
        }
    }
}
