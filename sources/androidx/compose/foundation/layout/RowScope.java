package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;

@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface RowScope {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @Stable
    Modifier align(Modifier modifier, Alignment.Vertical vertical);

    @Stable
    Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine);

    @Stable
    Modifier alignBy(Modifier modifier, Function1 function1);

    @Stable
    Modifier alignByBaseline(Modifier modifier);

    @Stable
    Modifier weight(Modifier modifier, float f8, boolean z8);
}
