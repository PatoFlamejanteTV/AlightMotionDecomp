package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ToggleableKt$triStateToggleable$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Role $role;
    final /* synthetic */ ToggleableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$triStateToggleable$2(ToggleableState toggleableState, boolean z8, Role role, Function0 function0) {
        super(3);
        this.$state = toggleableState;
        this.$enabled = z8;
        this.$role = role;
        this.$onClick = function0;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-1808118329);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1808118329, i8, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
        }
        Modifier.Companion companion = Modifier.Companion;
        ToggleableState toggleableState = this.$state;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier m807triStateToggleableO2vRcR0 = ToggleableKt.m807triStateToggleableO2vRcR0(companion, toggleableState, (MutableInteractionSource) rememberedValue, (Indication) composer.consume(IndicationKt.getLocalIndication()), this.$enabled, this.$role, this.$onClick);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m807triStateToggleableO2vRcR0;
    }
}
