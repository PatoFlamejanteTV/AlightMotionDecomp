package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import n6.M;
import n6.X;

@f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {293, 296}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Function0 $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(Function0 function0, long j8, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, d dVar) {
        super(2, dVar);
        this.$delayPressInteraction = function0;
        this.$pressPoint = j8;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PressInteraction.Press press;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    press = (PressInteraction.Press) this.L$0;
                    t.b(obj);
                    this.$interactionData.setPressInteraction(press);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            if (((Boolean) this.$delayPressInteraction.invoke()).booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (X.b(tapIndicationDelay, this) == e8) {
                    return e8;
                }
            }
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) == e8) {
            return e8;
        }
        press = press2;
        this.$interactionData.setPressInteraction(press);
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
