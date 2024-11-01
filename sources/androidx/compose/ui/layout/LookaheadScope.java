package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.Placeable;

/* loaded from: classes.dex */
public interface LookaheadScope {
    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    @ExperimentalComposeUiApi
    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    long mo4112localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    @ExperimentalComposeUiApi
    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);
}
