package androidx.compose.foundation.text.selection;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ long $targetValue;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(Animatable<Offset, AnimationVector2D> animatable, long j8, d dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.$targetValue = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(this.$animatable, this.$targetValue, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SpringSpec springSpec;
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
            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            Offset m2701boximpl = Offset.m2701boximpl(this.$targetValue);
            springSpec = SelectionMagnifierKt.MagnifierSpringSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, m2701boximpl, springSpec, null, null, this, 12, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
