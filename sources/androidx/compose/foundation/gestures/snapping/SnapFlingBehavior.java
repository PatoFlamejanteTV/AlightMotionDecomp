package androidx.compose.foundation.gestures.snapping;

import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.P;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final Density density;
    private final DecayAnimationSpec<Float> highVelocityAnimationSpec;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;
    private MotionDurationScale motionScaleDuration;
    private final float shortSnapVelocityThreshold;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;
    private final float velocityThreshold;

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f8, AbstractC3284p abstractC3284p) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, kotlin.jvm.functions.Function1 r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            Q5.t.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            Q5.t.b(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = n6.AbstractC3458i.g(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.b(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f8, float f9) {
        if (Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, f9)) >= Math.abs(f8) + this.snapLayoutInfoProvider.calculateSnapStepSize(this.density)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8 A[PHI: r0
  0x00d8: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v1 java.lang.Object) binds: [B:18:0x00d5, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object longSnap(androidx.compose.foundation.gestures.ScrollScope r26, float r27, kotlin.jvm.functions.Function1 r28, U5.d r29) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f8, float f9, Function1 function1, d dVar) {
        ApproachAnimation lowVelocityApproachAnimation;
        if (isDecayApproachPossible(f8, f9)) {
            lowVelocityApproachAnimation = new HighVelocityApproachAnimation(this.highVelocityAnimationSpec);
        } else {
            lowVelocityApproachAnimation = new LowVelocityApproachAnimation(this.lowVelocityAnimationSpec, this.snapLayoutInfoProvider, this.density);
        }
        return SnapFlingBehaviorKt.access$approach(scrollScope, f8, f9, lowVelocityApproachAnimation, this.snapLayoutInfoProvider, this.density, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f8, Function1 function1, d dVar) {
        float calculateSnappingOffset = this.snapLayoutInfoProvider.calculateSnappingOffset(this.density, 0.0f);
        P p8 = new P();
        p8.f34570a = calculateSnappingOffset;
        return SnapFlingBehaviorKt.access$animateSnap(scrollScope, calculateSnappingOffset, calculateSnappingOffset, AnimationStateKt.AnimationState$default(0.0f, f8, 0L, 0L, false, 28, null), this.snapAnimationSpec, new SnapFlingBehavior$shortSnap$3(p8, function1), dVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!AbstractC3292y.d(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) || !AbstractC3292y.d(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) || !AbstractC3292y.d(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) || !AbstractC3292y.d(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider) || !AbstractC3292y.d(snapFlingBehavior.density, this.density) || !Dp.m5160equalsimpl0(snapFlingBehavior.shortSnapVelocityThreshold, this.shortSnapVelocityThreshold)) {
            return false;
        }
        return true;
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return (((((((((this.snapAnimationSpec.hashCode() * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode()) * 31) + this.density.hashCode()) * 31) + Dp.m5161hashCodeimpl(this.shortSnapVelocityThreshold);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f8, d dVar) {
        return performFling(scrollScope, f8, SnapFlingBehavior$performFling$2.INSTANCE, dVar);
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        AbstractC3292y.i(motionDurationScale, "<set-?>");
        this.motionScaleDuration = motionDurationScale;
    }

    private SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec<Float> lowVelocityAnimationSpec, DecayAnimationSpec<Float> highVelocityAnimationSpec, AnimationSpec<Float> snapAnimationSpec, Density density, float f8) {
        AbstractC3292y.i(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        AbstractC3292y.i(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        AbstractC3292y.i(highVelocityAnimationSpec, "highVelocityAnimationSpec");
        AbstractC3292y.i(snapAnimationSpec, "snapAnimationSpec");
        AbstractC3292y.i(density, "density");
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.lowVelocityAnimationSpec = lowVelocityAnimationSpec;
        this.highVelocityAnimationSpec = highVelocityAnimationSpec;
        this.snapAnimationSpec = snapAnimationSpec;
        this.density = density;
        this.shortSnapVelocityThreshold = f8;
        this.velocityThreshold = density.mo425toPx0680j_4(f8);
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r5, float r6, kotlin.jvm.functions.Function1 r7, U5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Q5.t.b(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f8, int i8, AbstractC3284p abstractC3284p) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, (i8 & 32) != 0 ? SnapFlingBehaviorKt.getMinFlingVelocityDp() : f8, null);
    }
}
