package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import i6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final SnapPositionInLayout positionInLayout) {
        AbstractC3292y.i(lazyListState, "lazyListState");
        AbstractC3292y.i(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final LazyListLayoutInfo getLayoutInfo() {
                return LazyListState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(Density density, float f8) {
                AbstractC3292y.i(density, "<this>");
                float c8 = m.c(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f8)) - calculateSnapStepSize(density), 0.0f);
                if (c8 != 0.0f) {
                    return c8 * Math.signum(f8);
                }
                return c8;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(Density density) {
                AbstractC3292y.i(density, "<this>");
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        i8 += visibleItemsInfo.get(i9).getSize();
                    }
                    return i8 / layoutInfo.getVisibleItemsInfo().size();
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(Density density, float f8) {
                AbstractC3292y.i(density, "<this>");
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout = positionInLayout;
                int size = visibleItemsInfo.size();
                float f9 = Float.NEGATIVE_INFINITY;
                float f10 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size; i8++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i8);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPositionInLayout);
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f9) {
                        f9 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f10) {
                        f10 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.calculateFinalOffset(f8, f9, f10);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPositionInLayout snapPositionInLayout, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.Companion.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyListState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        AbstractC3292y.i(lazyListLayoutInfo, "<this>");
        if (lazyListLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m5320getHeightimpl(lazyListLayoutInfo.mo679getViewportSizeYbymL2g());
        }
        return IntSize.m5321getWidthimpl(lazyListLayoutInfo.mo679getViewportSizeYbymL2g());
    }

    @Composable
    @ExperimentalFoundationApi
    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, Composer composer, int i8) {
        AbstractC3292y.i(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i8, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:114)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapFlingBehavior;
    }
}
