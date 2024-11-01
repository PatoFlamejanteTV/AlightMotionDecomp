package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    @Composable
    /* renamed from: flingBehavior-PfoAEA0, reason: not valid java name */
    public final SnapFlingBehavior m784flingBehaviorPfoAEA0(PagerState state, PagerSnapDistance pagerSnapDistance, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec2, float f8, float f9, Composer composer, int i8, int i9) {
        PagerSnapDistance pagerSnapDistance2;
        AnimationSpec<Float> animationSpec3;
        DecayAnimationSpec<Float> decayAnimationSpec2;
        AnimationSpec<Float> animationSpec4;
        float f10;
        float f11;
        SnapLayoutInfoProvider SnapLayoutInfoProvider;
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(-705378306);
        if ((i9 & 2) != 0) {
            pagerSnapDistance2 = PagerSnapDistance.Companion.atMost(1);
        } else {
            pagerSnapDistance2 = pagerSnapDistance;
        }
        if ((i9 & 4) != 0) {
            animationSpec3 = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);
        } else {
            animationSpec3 = animationSpec;
        }
        if ((i9 & 8) != 0) {
            decayAnimationSpec2 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        } else {
            decayAnimationSpec2 = decayAnimationSpec;
        }
        if ((i9 & 16) != 0) {
            animationSpec4 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        } else {
            animationSpec4 = animationSpec2;
        }
        if ((i9 & 32) != 0) {
            f10 = SnapFlingBehaviorKt.getMinFlingVelocityDp();
        } else {
            f10 = f8;
        }
        if ((i9 & 64) != 0) {
            f11 = 0.5f;
        } else {
            f11 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-705378306, i8, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:522)");
        }
        if (0.0f <= f11 && f11 <= 1.0f) {
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object[] objArr = {state, animationSpec3, decayAnimationSpec2, animationSpec4, pagerSnapDistance2, density};
            composer.startReplaceableGroup(-568225417);
            boolean z8 = false;
            for (int i10 = 0; i10 < 6; i10++) {
                z8 |= composer.changed(objArr[i10]);
            }
            Object rememberedValue = composer.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                SnapLayoutInfoProvider = PagerKt.SnapLayoutInfoProvider(state, pagerSnapDistance2, decayAnimationSpec2, f11);
                rememberedValue = new SnapFlingBehavior(SnapLayoutInfoProvider, animationSpec3, decayAnimationSpec2, animationSpec4, density, f10, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return snapFlingBehavior;
        }
        throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f11).toString());
    }

    public final NestedScrollConnection pageNestedScrollConnection(Orientation orientation) {
        ConsumeAllFlingOnDirection consumeAllFlingOnDirection;
        ConsumeAllFlingOnDirection consumeAllFlingOnDirection2;
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Horizontal) {
            consumeAllFlingOnDirection2 = PagerKt.ConsumeHorizontalFlingNestedScrollConnection;
            return consumeAllFlingOnDirection2;
        }
        consumeAllFlingOnDirection = PagerKt.ConsumeVerticalFlingNestedScrollConnection;
        return consumeAllFlingOnDirection;
    }
}
