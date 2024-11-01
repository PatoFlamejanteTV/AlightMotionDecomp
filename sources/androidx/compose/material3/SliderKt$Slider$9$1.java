package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$9$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$9$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z8, int i8) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SliderPositions) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SliderPositions it, Composer composer, int i8) {
        AbstractC3292y.i(it, "it");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1647281944, i8, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        SliderColors sliderColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        sliderDefaults.m1734Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z8, 0L, composer, ((i9 >> 27) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i9 >> 18) & 896) | ((i9 >> 3) & 7168), 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
