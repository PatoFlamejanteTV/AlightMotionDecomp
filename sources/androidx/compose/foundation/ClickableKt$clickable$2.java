package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableKt$clickable$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$2(boolean z8, String str, Role role, Function0 function0) {
        super(3);
        this.$enabled = z8;
        this.$onClickLabel = str;
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
        composer.startReplaceableGroup(-756081143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-756081143, i8, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:97)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier m289clickableO2vRcR0 = ClickableKt.m289clickableO2vRcR0(companion, (MutableInteractionSource) rememberedValue, indication, this.$enabled, this.$onClickLabel, this.$role, this.$onClick);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m289clickableO2vRcR0;
    }
}
