package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$SliderThumb$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_SliderThumb;
    final /* synthetic */ float $thumbSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(BoxScope boxScope, Modifier modifier, float f8, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z8, float f9, int i8) {
        super(2);
        this.$this_SliderThumb = boxScope;
        this.$modifier = modifier;
        this.$offset = f8;
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$thumbSize = f9;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.m1302SliderThumbPcYyNuk(this.$this_SliderThumb, this.$modifier, this.$offset, this.$interactionSource, this.$colors, this.$enabled, this.$thumbSize, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
