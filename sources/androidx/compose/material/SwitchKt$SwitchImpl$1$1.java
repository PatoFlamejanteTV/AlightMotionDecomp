package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, d dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SwitchKt$SwitchImpl$1$1(this.$interactionSource, this.$interactions, dVar);
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
            InterfaceC3821f interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$1$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(Interaction interaction, d dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList.remove(((DragInteraction.Cancel) interaction).getStart());
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
        return ((SwitchKt$SwitchImpl$1$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
