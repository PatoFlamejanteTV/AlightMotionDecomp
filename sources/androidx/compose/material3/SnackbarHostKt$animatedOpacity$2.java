package androidx.compose.material3;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import n6.M;

@f(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {434}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$animatedOpacity$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ Function0 $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2(Animatable<Float, AnimationVector1D> animatable, boolean z8, AnimationSpec<Float> animationSpec, Function0 function0, d dVar) {
        super(2, dVar);
        this.$alpha = animatable;
        this.$visible = z8;
        this.$animation = animationSpec;
        this.$onAnimationFinish = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
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
            Animatable<Float, AnimationVector1D> animatable = this.$alpha;
            if (this.$visible) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            Float b9 = kotlin.coroutines.jvm.internal.b.b(f8);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, b9, animationSpec, null, null, this, 12, null) == e8) {
                return e8;
            }
        }
        this.$onAnimationFinish.invoke();
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
