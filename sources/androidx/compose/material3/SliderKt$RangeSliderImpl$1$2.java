package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$1$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ String $startContentDescription;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ Modifier $startThumbSemantics;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$1$2(String str, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z8, int i8) {
        super(3);
        this.$startContentDescription = str;
        this.$startInteractionSource = mutableInteractionSource;
        this.$startThumbSemantics = modifier;
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxScope TempRangeSliderThumb, Composer composer, int i8) {
        AbstractC3292y.i(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1592025586, i8, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:552)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        String str = this.$startContentDescription;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(str);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SliderKt$RangeSliderImpl$1$2$1$1(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), true, this.$startInteractionSource).then(this.$startThumbSemantics);
        MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
        SliderColors sliderColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        sliderDefaults.m1734Thumb9LiSoMs(mutableInteractionSource, then, sliderColors, z8, 0L, composer, ((i9 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i9 >> 6) & 896) | ((i9 << 9) & 7168), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
