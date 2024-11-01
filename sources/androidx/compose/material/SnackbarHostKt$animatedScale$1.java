package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnackbarHostKt$animatedScale$1 extends l implements InterfaceC2072n {
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1(Animatable<Float, AnimationVector1D> animatable, boolean z8, AnimationSpec<Float> animationSpec, d dVar) {
        super(2, dVar);
        this.$scale = animatable;
        this.$visible = z8;
        this.$animation = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SnackbarHostKt$animatedScale$1(this.$scale, this.$visible, this.$animation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
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
            Animatable<Float, AnimationVector1D> animatable = this.$scale;
            if (this.$visible) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            Float b9 = kotlin.coroutines.jvm.internal.b.b(f8);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, b9, animationSpec, null, null, this, 12, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SnackbarHostKt$animatedScale$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
