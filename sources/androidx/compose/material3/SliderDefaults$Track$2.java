package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderDefaults$Track$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SliderPositions $sliderPositions;
    final /* synthetic */ SliderDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$2(SliderDefaults sliderDefaults, SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z8, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = sliderDefaults;
        this.$sliderPositions = sliderPositions;
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.Track(this.$sliderPositions, this.$modifier, this.$colors, this.$enabled, composer, this.$$changed | 1, this.$$default);
    }
}
