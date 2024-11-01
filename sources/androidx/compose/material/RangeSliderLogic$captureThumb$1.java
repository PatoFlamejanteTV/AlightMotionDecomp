package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", l = {1067}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RangeSliderLogic$captureThumb$1 extends l implements InterfaceC2072n {
    final /* synthetic */ boolean $draggingStart;
    final /* synthetic */ Interaction $interaction;
    int label;
    final /* synthetic */ RangeSliderLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z8, Interaction interaction, d dVar) {
        super(2, dVar);
        this.this$0 = rangeSliderLogic;
        this.$draggingStart = z8;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new RangeSliderLogic$captureThumb$1(this.this$0, this.$draggingStart, this.$interaction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            MutableInteractionSource activeInteraction = this.this$0.activeInteraction(this.$draggingStart);
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (activeInteraction.emit(interaction, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((RangeSliderLogic$captureThumb$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
