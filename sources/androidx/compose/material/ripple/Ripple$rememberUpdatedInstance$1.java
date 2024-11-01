package androidx.compose.material.ripple;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends l implements InterfaceC2072n {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, d dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, dVar);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
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
            final M m8 = (M) this.L$0;
            InterfaceC3821f interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(Interaction interaction, d dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction, m8);
                    } else if (interaction instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        RippleIndicationInstance.this.updateStateLayer$material_ripple_release(interaction, m8);
                    }
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
