package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyGridState lazyGridState, final SnapPositionInLayout positionInLayout) {
        AbstractC3292y.i(lazyGridState, "lazyGridState");
        AbstractC3292y.i(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final LazyGridLayoutInfo getLayoutInfo() {
                return LazyGridState.this.getLayoutInfo();
            }

            private final List<LazyGridItemInfo> getSingleAxisItems() {
                List<LazyGridItemInfo> visibleItemsInfo = LazyGridState.this.getLayoutInfo().getVisibleItemsInfo();
                LazyGridState lazyGridState2 = LazyGridState.this;
                ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                for (int i8 = 0; i8 < size; i8++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i8);
                    LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    if (lazyGridState2.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
                        if (lazyGridItemInfo2.getRow() != 0) {
                        }
                        arrayList.add(lazyGridItemInfo);
                    } else {
                        if (lazyGridItemInfo2.getColumn() != 0) {
                        }
                        arrayList.add(lazyGridItemInfo);
                    }
                }
                return arrayList;
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
                int i8;
                AbstractC3292y.i(density, "<this>");
                if (!getSingleAxisItems().isEmpty()) {
                    int i9 = 0;
                    if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
                        List<LazyGridItemInfo> singleAxisItems = getSingleAxisItems();
                        int size = singleAxisItems.size();
                        i8 = 0;
                        while (i9 < size) {
                            i8 += IntSize.m5320getHeightimpl(singleAxisItems.get(i9).mo708getSizeYbymL2g());
                            i9++;
                        }
                    } else {
                        List<LazyGridItemInfo> singleAxisItems2 = getSingleAxisItems();
                        int size2 = singleAxisItems2.size();
                        i8 = 0;
                        while (i9 < size2) {
                            i8 += IntSize.m5321getWidthimpl(singleAxisItems2.get(i9).mo708getSizeYbymL2g());
                            i9++;
                        }
                    }
                    return i8 / getSingleAxisItems().size();
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(Density density, float f8) {
                AbstractC3292y.i(density, "<this>");
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout = positionInLayout;
                int size = visibleItemsInfo.size();
                float f9 = Float.NEGATIVE_INFINITY;
                float f10 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size; i8++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i8);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout);
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

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPositionInLayout snapPositionInLayout, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.Companion.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        AbstractC3292y.i(lazyGridLayoutInfo, "<this>");
        if (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m5320getHeightimpl(lazyGridLayoutInfo.mo689getViewportSizeYbymL2g());
        }
        return IntSize.m5321getWidthimpl(lazyGridLayoutInfo.mo689getViewportSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        AbstractC3292y.i(lazyGridItemInfo, "<this>");
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return IntOffset.m5280getYimpl(lazyGridItemInfo.mo707getOffsetnOccac());
        }
        return IntOffset.m5279getXimpl(lazyGridItemInfo.mo707getOffsetnOccac());
    }

    public static final int sizeOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        AbstractC3292y.i(lazyGridItemInfo, "<this>");
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return IntSize.m5320getHeightimpl(lazyGridItemInfo.mo708getSizeYbymL2g());
        }
        return IntSize.m5321getWidthimpl(lazyGridItemInfo.mo708getSizeYbymL2g());
    }
}
