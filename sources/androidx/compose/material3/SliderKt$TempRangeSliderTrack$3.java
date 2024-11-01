package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$TempRangeSliderTrack$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$TempRangeSliderTrack$3(Modifier modifier, SliderColors sliderColors, boolean z8, float f8, float f9, float[] fArr, float f10, float f11, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$positionFractionStart = f8;
        this.$positionFractionEnd = f9;
        this.$tickFractions = fArr;
        this.$thumbWidth = f10;
        this.$trackStrokeWidth = f11;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.m1737TempRangeSliderTrackau3_HiA(this.$modifier, this.$colors, this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$thumbWidth, this.$trackStrokeWidth, composer, this.$$changed | 1);
    }
}
