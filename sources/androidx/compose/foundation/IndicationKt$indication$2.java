package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class IndicationKt$indication$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ Indication $indication;
    final /* synthetic */ InteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(Indication indication, InteractionSource interactionSource) {
        super(3);
        this.$indication = indication;
        this.$interactionSource = interactionSource;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-353972293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-353972293, i8, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
        }
        Indication indication = this.$indication;
        if (indication == null) {
            indication = NoIndication.INSTANCE;
        }
        IndicationInstance rememberUpdatedInstance = indication.rememberUpdatedInstance(this.$interactionSource, composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(rememberUpdatedInstance);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new IndicationModifier(rememberUpdatedInstance);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        IndicationModifier indicationModifier = (IndicationModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return indicationModifier;
    }
}
