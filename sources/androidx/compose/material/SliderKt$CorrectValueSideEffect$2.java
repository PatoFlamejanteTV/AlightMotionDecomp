package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import i6.InterfaceC2977e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$CorrectValueSideEffect$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1 $scaleToOffset;
    final /* synthetic */ InterfaceC2977e $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2977e $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$2(Function1 function1, InterfaceC2977e interfaceC2977e, InterfaceC2977e interfaceC2977e2, MutableState<Float> mutableState, float f8, int i8) {
        super(2);
        this.$scaleToOffset = function1;
        this.$valueRange = interfaceC2977e;
        this.$trackRange = interfaceC2977e2;
        this.$valueState = mutableState;
        this.$value = f8;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
