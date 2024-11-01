package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {727}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractClickableNode$onKeyEvent$2$1 extends l implements InterfaceC2072n {
    final /* synthetic */ PressInteraction.Press $it;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$2$1(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, d dVar) {
        super(2, dVar);
        this.this$0 = abstractClickableNode;
        this.$it = press;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AbstractClickableNode$onKeyEvent$2$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableInteractionSource mutableInteractionSource;
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
            mutableInteractionSource = this.this$0.interactionSource;
            PressInteraction.Release release = new PressInteraction.Release(this.$it);
            this.label = 1;
            if (mutableInteractionSource.emit(release, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AbstractClickableNode$onKeyEvent$2$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
