package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable = 0;
    public static final LocalFullyDrawnReporterOwner INSTANCE = new LocalFullyDrawnReporterOwner();
    private static final ProvidableCompositionLocal<FullyDrawnReporterOwner> LocalFullyDrawnReporterOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1.INSTANCE, 1, null);

    private LocalFullyDrawnReporterOwner() {
    }

    @Composable
    public final FullyDrawnReporterOwner getCurrent(Composer composer, int i8) {
        composer.startReplaceableGroup(540186968);
        FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composer.consume(LocalFullyDrawnReporterOwner);
        composer.startReplaceableGroup(1606493384);
        if (fullyDrawnReporterOwner == null) {
            fullyDrawnReporterOwner = ViewTreeFullyDrawnReporterOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        composer.endReplaceableGroup();
        if (fullyDrawnReporterOwner == null) {
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof FullyDrawnReporterOwner) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            fullyDrawnReporterOwner = (FullyDrawnReporterOwner) obj;
        }
        composer.endReplaceableGroup();
        return fullyDrawnReporterOwner;
    }

    public final ProvidedValue<FullyDrawnReporterOwner> provides(FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        return LocalFullyDrawnReporterOwner.provides(fullyDrawnReporterOwner);
    }
}
