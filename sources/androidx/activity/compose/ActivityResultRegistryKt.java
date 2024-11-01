package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    @Composable
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(ActivityResultContract<I, O> activityResultContract, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1408504823);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, 8);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, (i8 >> 3) & 14);
        String str = (String) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.INSTANCE, composer, 3080, 6);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current != null) {
            ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ActivityResultLauncherHolder();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) rememberedValue;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) rememberedValue2;
            EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract, new ActivityResultRegistryKt$rememberLauncherForActivityResult$1(activityResultLauncherHolder, activityResultRegistry, str, activityResultContract, rememberUpdatedState2), composer, 520);
            composer.endReplaceableGroup();
            return managedActivityResultLauncher;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
