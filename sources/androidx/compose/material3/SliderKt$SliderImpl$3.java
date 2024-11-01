package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import i6.InterfaceC2977e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ InterfaceC2073o $thumb;
    final /* synthetic */ InterfaceC2073o $track;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$3(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Function1 function1, Function0 function0, int i8, float f8, InterfaceC2977e interfaceC2977e, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = function0;
        this.$steps = i8;
        this.$value = f8;
        this.$valueRange = interfaceC2977e;
        this.$thumb = interfaceC2073o;
        this.$track = interfaceC2073o2;
        this.$$changed = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.SliderImpl(this.$modifier, this.$enabled, this.$interactionSource, this.$onValueChange, this.$onValueChangeFinished, this.$steps, this.$value, this.$valueRange, this.$thumb, this.$track, composer, this.$$changed | 1);
    }
}
