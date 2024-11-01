package androidx.compose.foundation.lazy.layout;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", f = "LazyLayoutAnimateItemModifierNode.kt", l = {97, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1 extends l implements InterfaceC2072n {
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ long $animationTarget;
        final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j8) {
            super(1);
            this.this$0 = lazyLayoutAnimateItemModifierNode;
            this.$animationTarget = j8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animatable<IntOffset, AnimationVector2D>) obj);
            return I.f8786a;
        }

        public final void invoke(Animatable<IntOffset, AnimationVector2D> animateTo) {
            AbstractC3292y.i(animateTo, "$this$animateTo");
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = this.this$0;
            long m5288unboximpl = animateTo.getValue().m5288unboximpl();
            long j8 = this.$animationTarget;
            lazyLayoutAnimateItemModifierNode.m718setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5288unboximpl) - IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(m5288unboximpl) - IntOffset.m5280getYimpl(j8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j8, d dVar) {
        super(2, dVar);
        this.this$0 = lazyLayoutAnimateItemModifierNode;
        this.$totalDelta = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this.this$0, this.$totalDelta, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        FiniteAnimationSpec<IntOffset> placementAnimationSpec;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    t.b(obj);
                    this.this$0.setAnimationInProgress(false);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
            t.b(obj);
        } else {
            t.b(obj);
            animatable = this.this$0.placementDeltaAnimation;
            if (animatable.isRunning()) {
                if (!(this.this$0.getPlacementAnimationSpec() instanceof SpringSpec)) {
                    placementAnimationSpec = LazyLayoutAnimateItemModifierNodeKt.InterruptionSpec;
                } else {
                    placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
                }
            } else {
                placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
            }
            finiteAnimationSpec = placementAnimationSpec;
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                IntOffset m5270boximpl = IntOffset.m5270boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable3.snapTo(m5270boximpl, this) == e8) {
                    return e8;
                }
            }
        }
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = finiteAnimationSpec;
        animatable4 = this.this$0.placementDeltaAnimation;
        long m5288unboximpl = ((IntOffset) animatable4.getValue()).m5288unboximpl();
        long j8 = this.$totalDelta;
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5288unboximpl) - IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(m5288unboximpl) - IntOffset.m5280getYimpl(j8));
        animatable5 = this.this$0.placementDeltaAnimation;
        IntOffset m5270boximpl2 = IntOffset.m5270boximpl(IntOffset);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, IntOffset);
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, m5270boximpl2, finiteAnimationSpec2, null, anonymousClass1, this, 4, null) == e8) {
            return e8;
        }
        this.this$0.setAnimationInProgress(false);
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
