package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    @Composable
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer, int i8) {
        composer.startReplaceableGroup(15454635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i8, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) SaveableStateHolderImpl.Companion.getSaver(), (String) null, (Function0) SaveableStateHolderKt$rememberSaveableStateHolder$1.INSTANCE, composer, 3080, 4);
        saveableStateHolderImpl.setParentSaveableStateRegistry((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return saveableStateHolderImpl;
    }
}
