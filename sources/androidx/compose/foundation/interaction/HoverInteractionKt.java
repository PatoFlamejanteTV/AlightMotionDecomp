package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class HoverInteractionKt {
    @Composable
    public static final State<Boolean> collectIsHoveredAsState(InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "<this>");
        composer.startReplaceableGroup(1206586544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206586544, i8, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i9 = i8 & 14;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new HoverInteractionKt$collectIsHoveredAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC2072n) rememberedValue2, composer, i9 | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
