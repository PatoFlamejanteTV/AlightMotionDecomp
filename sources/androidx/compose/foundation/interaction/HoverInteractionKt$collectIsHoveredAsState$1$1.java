package androidx.compose.foundation.interaction;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, d dVar) {
        super(2, dVar);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            final ArrayList arrayList = new ArrayList();
            InterfaceC3821f interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(Interaction interaction, d dVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(kotlin.coroutines.jvm.internal.b.a(!arrayList.isEmpty()));
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
