package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface BoxScope {
    @Stable
    Modifier align(Modifier modifier, Alignment alignment);

    @Stable
    Modifier matchParentSize(Modifier modifier);
}
