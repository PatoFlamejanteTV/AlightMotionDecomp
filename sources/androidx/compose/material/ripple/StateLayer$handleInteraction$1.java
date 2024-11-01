package androidx.compose.material.ripple;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StateLayer$handleInteraction$1 extends l implements InterfaceC2072n {
    final /* synthetic */ AnimationSpec<Float> $incomingAnimationSpec;
    final /* synthetic */ float $targetAlpha;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(StateLayer stateLayer, float f8, AnimationSpec<Float> animationSpec, d dVar) {
        super(2, dVar);
        this.this$0 = stateLayer;
        this.$targetAlpha = f8;
        this.$incomingAnimationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new StateLayer$handleInteraction$1(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
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
            animatable = this.this$0.animatedAlpha;
            Float b9 = kotlin.coroutines.jvm.internal.b.b(this.$targetAlpha);
            AnimationSpec<Float> animationSpec = this.$incomingAnimationSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, b9, animationSpec, null, null, this, 12, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((StateLayer$handleInteraction$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
