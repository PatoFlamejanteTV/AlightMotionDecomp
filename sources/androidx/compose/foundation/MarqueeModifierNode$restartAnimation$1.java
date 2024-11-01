package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {331}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MarqueeModifierNode$restartAnimation$1 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(MarqueeModifierNode marqueeModifierNode, d dVar) {
        super(2, dVar);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MarqueeModifierNode$restartAnimation$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object runAnimation;
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
            MarqueeModifierNode marqueeModifierNode = this.this$0;
            this.label = 1;
            runAnimation = marqueeModifierNode.runAnimation(this);
            if (runAnimation == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((MarqueeModifierNode$restartAnimation$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
