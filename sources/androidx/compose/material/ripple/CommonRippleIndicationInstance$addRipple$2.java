package androidx.compose.material.ripple;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CommonRippleIndicationInstance$addRipple$2 extends l implements InterfaceC2072n {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleIndicationInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, d dVar) {
        super(2, dVar);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleIndicationInstance;
        this.$interaction = press;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SnapshotStateMap snapshotStateMap;
        SnapshotStateMap snapshotStateMap2;
        Object e8 = V5.b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                RippleAnimation rippleAnimation = this.$rippleAnimation;
                this.label = 1;
                if (rippleAnimation.animate(this) == e8) {
                    return e8;
                }
            }
            snapshotStateMap2 = this.this$0.ripples;
            snapshotStateMap2.remove(this.$interaction);
            return I.f8786a;
        } catch (Throwable th) {
            snapshotStateMap = this.this$0.ripples;
            snapshotStateMap.remove(this.$interaction);
            throw th;
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
