package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;
    public static final LocalOnBackPressedDispatcherOwner INSTANCE = new LocalOnBackPressedDispatcherOwner();
    private static final ProvidableCompositionLocal<OnBackPressedDispatcherOwner> LocalOnBackPressedDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.INSTANCE, 1, null);

    private LocalOnBackPressedDispatcherOwner() {
    }

    @Composable
    public final OnBackPressedDispatcherOwner getCurrent(Composer composer, int i8) {
        composer.startReplaceableGroup(-2068013981);
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) composer.consume(LocalOnBackPressedDispatcherOwner);
        composer.startReplaceableGroup(1680121597);
        if (onBackPressedDispatcherOwner == null) {
            onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        composer.endReplaceableGroup();
        if (onBackPressedDispatcherOwner == null) {
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof OnBackPressedDispatcherOwner) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) obj;
        }
        composer.endReplaceableGroup();
        return onBackPressedDispatcherOwner;
    }

    public final ProvidedValue<OnBackPressedDispatcherOwner> provides(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.provides(onBackPressedDispatcherOwner);
    }
}
