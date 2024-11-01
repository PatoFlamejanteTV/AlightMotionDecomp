package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

@LazyScopeMarker
@Stable
/* loaded from: classes.dex */
public interface LazyItemScope {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @ExperimentalFoundationApi
    Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> finiteAnimationSpec);

    Modifier fillParentMaxHeight(Modifier modifier, float f8);

    Modifier fillParentMaxSize(Modifier modifier, float f8);

    Modifier fillParentMaxWidth(Modifier modifier, float f8);
}
