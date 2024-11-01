package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SwipeableState$animateInternalToOffset$2 extends l implements InterfaceC2072n {
    final /* synthetic */ AnimationSpec<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SwipeableState$animateInternalToOffset$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ DragScope $$this$drag;
        final /* synthetic */ P $prevValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragScope dragScope, P p8) {
            super(1);
            this.$$this$drag = dragScope;
            this.$prevValue = p8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animatable<Float, AnimationVector1D>) obj);
            return I.f8786a;
        }

        public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
            AbstractC3292y.i(animateTo, "$this$animateTo");
            this.$$this$drag.dragBy(animateTo.getValue().floatValue() - this.$prevValue.f34570a);
            this.$prevValue.f34570a = animateTo.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f8, AnimationSpec<Float> animationSpec, d dVar) {
        super(2, dVar);
        this.this$0 = swipeableState;
        this.$target = f8;
        this.$spec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, dVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(DragScope dragScope, d dVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        MutableFloatState mutableFloatState;
        MutableState mutableState2;
        MutableState mutableState3;
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
                DragScope dragScope = (DragScope) this.L$0;
                P p8 = new P();
                mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
                p8.f34570a = mutableFloatState.getFloatValue();
                mutableState2 = ((SwipeableState) this.this$0).animationTarget;
                mutableState2.setValue(kotlin.coroutines.jvm.internal.b.b(this.$target));
                this.this$0.setAnimationRunning(true);
                Animatable Animatable$default = AnimatableKt.Animatable$default(p8.f34570a, 0.0f, 2, null);
                Float b9 = kotlin.coroutines.jvm.internal.b.b(this.$target);
                AnimationSpec<Float> animationSpec = this.$spec;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragScope, p8);
                this.label = 1;
                if (Animatable.animateTo$default(Animatable$default, b9, animationSpec, null, anonymousClass1, this, 4, null) == e8) {
                    return e8;
                }
            }
            mutableState3 = ((SwipeableState) this.this$0).animationTarget;
            mutableState3.setValue(null);
            this.this$0.setAnimationRunning(false);
            return I.f8786a;
        } catch (Throwable th) {
            mutableState = ((SwipeableState) this.this$0).animationTarget;
            mutableState.setValue(null);
            this.this$0.setAnimationRunning(false);
            throw th;
        }
    }
}
