package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$1(SliderColors sliderColors, boolean z8, int i8) {
        super(3);
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
    public final void invoke(SliderPositions sliderPositions, Composer composer, int i8) {
        AbstractC3292y.i(sliderPositions, "sliderPositions");
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(sliderPositions) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1022381539, i8, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        SliderColors sliderColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        sliderDefaults.Track(sliderPositions, null, sliderColors, z8, composer, (i8 & 14) | 24576 | ((i9 >> 15) & 896) | (i9 & 7168), 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
