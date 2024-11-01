package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void LazySaveableStateHolderProvider(InterfaceC2073o content, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(674185128);
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
                ComposerKt.traceEventStart(674185128, i9, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.m2560rememberSaveable(new Object[]{saveableStateRegistry}, (Saver) LazySaveableStateHolder.Companion.saver(saveableStateRegistry), (String) null, (Function0) new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1(saveableStateRegistry), startRestartGroup, 72, 4);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1863926504, true, new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(lazySaveableStateHolder, content, i9)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2(content, i8));
        }
    }
}
