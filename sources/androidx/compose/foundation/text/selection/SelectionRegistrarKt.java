package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;

/* loaded from: classes.dex */
public final class SelectionRegistrarKt {
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default(null, SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE, 1, null);

    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(SelectionRegistrar selectionRegistrar, long j8) {
        Map<Long, Selection> subselections;
        if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
            return subselections.containsKey(Long.valueOf(j8));
        }
        return false;
    }
}
