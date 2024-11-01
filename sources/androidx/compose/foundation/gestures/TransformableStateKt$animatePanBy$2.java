package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.S;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$animatePanBy$2 extends l implements InterfaceC2072n {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ S $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ TransformScope $$this$transform;
        final /* synthetic */ S $previous;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(S s8, TransformScope transformScope) {
            super(1);
            this.$previous = s8;
            this.$$this$transform = transformScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope<Offset, AnimationVector2D>) obj);
            return I.f8786a;
        }

        public final void invoke(AnimationScope<Offset, AnimationVector2D> animateTo) {
            AbstractC3292y.i(animateTo, "$this$animateTo");
            d.a(this.$$this$transform, 0.0f, Offset.m2716minusMKHz9U(animateTo.getValue().m2722unboximpl(), this.$previous.f34572a), 0.0f, 5, null);
            this.$previous.f34572a = animateTo.getValue().m2722unboximpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(S s8, long j8, AnimationSpec<Offset> animationSpec, U5.d dVar) {
        super(2, dVar);
        this.$previous = s8;
        this.$offset = j8;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, dVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(TransformScope transformScope, U5.d dVar) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, dVar)).invokeSuspend(I.f8786a);
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
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m2701boximpl(this.$previous.f34572a), null, 0L, 0L, false, 60, null);
            Offset m2701boximpl = Offset.m2701boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previous, transformScope);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, m2701boximpl, animationSpec, false, anonymousClass1, this, 4, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
