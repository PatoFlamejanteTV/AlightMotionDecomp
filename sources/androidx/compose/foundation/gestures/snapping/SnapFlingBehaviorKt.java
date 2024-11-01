package androidx.compose.foundation.gestures.snapping;

import U5.d;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m5155constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    public static final /* synthetic */ Object access$animateDecay(ScrollScope scrollScope, float f8, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, Function1 function1, d dVar) {
        return animateDecay(scrollScope, f8, animationState, decayAnimationSpec, function1, dVar);
    }

    public static final /* synthetic */ Object access$animateSnap(ScrollScope scrollScope, float f8, float f9, AnimationState animationState, AnimationSpec animationSpec, Function1 function1, d dVar) {
        return animateSnap(scrollScope, f8, f9, animationState, animationSpec, function1, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateDecay(androidx.compose.foundation.gestures.ScrollScope r5, float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, kotlin.jvm.functions.Function1 r9, U5.d r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.P r5 = (kotlin.jvm.internal.P) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            Q5.t.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Q5.t.b(r10)
            kotlin.jvm.internal.P r10 = new kotlin.jvm.internal.P
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>(r6, r10, r5, r9)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f34570a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1 function1, float f8) {
        float scrollBy = scrollScope.scrollBy(f8);
        function1.invoke(Float.valueOf(scrollBy));
        if (Math.abs(f8 - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateSnap(androidx.compose.foundation.gestures.ScrollScope r12, float r13, float r14, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r16, kotlin.jvm.functions.Function1 r17, U5.d r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.P r3 = (kotlin.jvm.internal.P) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            Q5.t.b(r0)
            r10 = r2
            r0 = r4
            goto L90
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            Q5.t.b(r0)
            kotlin.jvm.internal.P r0 = new kotlin.jvm.internal.P
            r0.<init>()
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.b(r13)
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = 1
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r5 = r2 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.L$0 = r9
            r7.L$1 = r0
            r10 = r13
            r7.F$0 = r10
            r7.F$1 = r8
            r7.label = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r3 = r0
            r1 = r8
            r0 = r9
        L90:
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = coerceToTarget(r2, r1)
            androidx.compose.foundation.gestures.snapping.AnimationResult r11 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r1 = r3.f34570a
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.b(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object approach(androidx.compose.foundation.gestures.ScrollScope r7, float r8, float r9, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r10, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11, androidx.compose.ui.unit.Density r12, kotlin.jvm.functions.Function1 r13, U5.d r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r7 = r6.L$1
            r12 = r7
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            java.lang.Object r7 = r6.L$0
            r11 = r7
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11 = (androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) r11
            Q5.t.b(r14)
            goto L58
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            Q5.t.b(r14)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.b.b(r8)
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.b(r9)
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r1 = r10
            r2 = r7
            r5 = r13
            java.lang.Object r14 = r1.approachAnimation(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L58
            return r0
        L58:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            androidx.compose.animation.core.AnimationState r7 = r14.component2()
            java.lang.Object r8 = r7.getVelocity()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = r11.calculateSnappingOffset(r12, r8)
            androidx.compose.foundation.gestures.snapping.AnimationResult r9 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.b(r8)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.foundation.gestures.snapping.ApproachAnimation, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:            if (java.lang.Math.abs(r4) <= java.lang.Math.abs(r3)) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float calculateFinalOffset(float r2, float r3, float r4) {
        /*
            float r2 = java.lang.Math.signum(r2)
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 != 0) goto L16
            float r2 = java.lang.Math.abs(r4)
            float r1 = java.lang.Math.abs(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L26
            goto L1c
        L16:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
        L1c:
            r3 = r4
            goto L26
        L1e:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L26
        L25:
            r3 = 0
        L26:
            boolean r2 = calculateFinalOffset$isValidDistance(r3)
            if (r2 == 0) goto L2d
            r0 = r3
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.calculateFinalOffset(float, float, float):float");
    }

    private static final boolean calculateFinalOffset$isValidDistance(float f8) {
        return (f8 == Float.POSITIVE_INFINITY || f8 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public static final float coerceToTarget(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        if (f9 > 0.0f) {
            return m.f(f8, f9);
        }
        return m.c(f8, f9);
    }

    private static final <T extends Comparable<? super T>> T component1(InterfaceC2977e interfaceC2977e) {
        AbstractC3292y.i(interfaceC2977e, "<this>");
        return (T) interfaceC2977e.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(InterfaceC2977e interfaceC2977e) {
        AbstractC3292y.i(interfaceC2977e, "<this>");
        return (T) interfaceC2977e.getEndInclusive();
    }

    private static final void debugLog(Function0 function0) {
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final SnapFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i8) {
        AbstractC3292y.i(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i8, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:270)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(snapLayoutInfoProvider) | composer.changed(rememberSplineBasedDecay) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), rememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density, 0.0f, 32, null);
            composer.updateRememberedValue(snapFlingBehavior);
            rememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }
}
