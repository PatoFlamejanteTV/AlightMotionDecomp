package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Modifier $endThumbSemantics;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ Modifier $startThumbSemantics;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ float $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2(boolean z8, float f8, float f9, float[] fArr, SliderColors sliderColors, float f10, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i8, int i9) {
        super(2);
        this.$enabled = z8;
        this.$positionFractionStart = f8;
        this.$positionFractionEnd = f9;
        this.$tickFractions = fArr;
        this.$colors = sliderColors;
        this.$width = f10;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$modifier = modifier;
        this.$startThumbSemantics = modifier2;
        this.$endThumbSemantics = modifier3;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.RangeSliderImpl(this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$colors, this.$width, this.$startInteractionSource, this.$endInteractionSource, this.$modifier, this.$startThumbSemantics, this.$endThumbSemantics, composer, this.$$changed | 1, this.$$changed1);
    }
}
