package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;
    public static final LocalActivityResultRegistryOwner INSTANCE = new LocalActivityResultRegistryOwner();
    private static final ProvidableCompositionLocal<ActivityResultRegistryOwner> LocalComposition = CompositionLocalKt.compositionLocalOf$default(null, LocalActivityResultRegistryOwner$LocalComposition$1.INSTANCE, 1, null);

    private LocalActivityResultRegistryOwner() {
    }

    @Composable
    public final ActivityResultRegistryOwner getCurrent(Composer composer, int i8) {
        composer.startReplaceableGroup(1418020823);
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.consume(LocalComposition);
        if (activityResultRegistryOwner == null) {
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof ActivityResultRegistryOwner) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) obj;
        }
        composer.endReplaceableGroup();
        return activityResultRegistryOwner;
    }

    public final ProvidedValue<ActivityResultRegistryOwner> provides(ActivityResultRegistryOwner activityResultRegistryOwner) {
        return LocalComposition.provides(activityResultRegistryOwner);
    }
}
