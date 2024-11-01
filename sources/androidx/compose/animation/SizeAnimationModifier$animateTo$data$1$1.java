package androidx.compose.animation;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.SizeAnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SizeAnimationModifier$animateTo$data$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifier.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.AnimData animData, long j8, SizeAnimationModifier sizeAnimationModifier, d dVar) {
        super(2, dVar);
        this.$this_apply = animData;
        this.$targetSize = j8;
        this.this$0 = sizeAnimationModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2072n listener;
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
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize m5313boximpl = IntSize.m5313boximpl(this.$targetSize);
            AnimationSpec<IntSize> animSpec = this.this$0.getAnimSpec();
            this.label = 1;
            obj = Animatable.animateTo$default(anim, m5313boximpl, animSpec, null, null, this, 12, null);
            if (obj == e8) {
                return e8;
            }
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = this.this$0.getListener()) != null) {
            listener.invoke(IntSize.m5313boximpl(this.$this_apply.m169getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
