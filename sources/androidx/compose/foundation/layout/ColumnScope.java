package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.jvm.functions.Function1;

@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface ColumnScope {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @Stable
    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    @Stable
    Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    @Stable
    Modifier alignBy(Modifier modifier, Function1 function1);

    @Stable
    Modifier weight(Modifier modifier, float f8, boolean z8);
}
