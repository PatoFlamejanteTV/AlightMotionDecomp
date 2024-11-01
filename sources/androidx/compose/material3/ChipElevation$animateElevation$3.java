package androidx.compose.material3;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.ChipElevation$animateElevation$3", f = "Chip.kt", l = {1569}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChipElevation$animateElevation$3 extends l implements InterfaceC2072n {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ChipElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$3(Animatable<Dp, AnimationVector1D> animatable, ChipElevation chipElevation, float f8, Interaction interaction, d dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.this$0 = chipElevation;
        this.$target = f8;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ChipElevation$animateElevation$3(this.$animatable, this.this$0, this.$target, this.$interaction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
        float f9;
        float f10;
        float f11;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            float m5169unboximpl = this.$animatable.getTargetValue().m5169unboximpl();
            f8 = this.this$0.pressedElevation;
            Interaction interaction = null;
            if (!Dp.m5160equalsimpl0(m5169unboximpl, f8)) {
                f9 = this.this$0.hoveredElevation;
                if (!Dp.m5160equalsimpl0(m5169unboximpl, f9)) {
                    f10 = this.this$0.focusedElevation;
                    if (!Dp.m5160equalsimpl0(m5169unboximpl, f10)) {
                        f11 = this.this$0.draggedElevation;
                        if (Dp.m5160equalsimpl0(m5169unboximpl, f11)) {
                            interaction = new DragInteraction.Start();
                        }
                    } else {
                        interaction = new FocusInteraction.Focus();
                    }
                } else {
                    interaction = new HoverInteraction.Enter();
                }
            } else {
                interaction = new PressInteraction.Press(Offset.Companion.m2728getZeroF1C5BW0(), null);
            }
            Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
            float f12 = this.$target;
            Interaction interaction2 = this.$interaction;
            this.label = 1;
            if (ElevationKt.m1593animateElevationrAjV9yQ(animatable, f12, interaction, interaction2, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((ChipElevation$animateElevation$3) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}